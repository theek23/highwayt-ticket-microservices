package lk.ijse.gdse66.vehicleservice.service.impl;

import lk.ijse.gdse66.vehicleservice.dto.VehicleDTO;
import lk.ijse.gdse66.vehicleservice.entity.Vehicle;
import lk.ijse.gdse66.vehicleservice.repo.VehicleRepo;
import lk.ijse.gdse66.vehicleservice.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepo vehicleRepo;
    private final ModelMapper modelMapper;

    public VehicleServiceImpl(VehicleRepo vehicleRepo, ModelMapper modelMapper) {
        this.vehicleRepo = vehicleRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        List<Vehicle> vehicles = vehicleRepo.findAll();
        return vehicles.stream()
                .map(vehicle -> modelMapper.map(vehicle, VehicleDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO) {
        Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);
        Vehicle savedVehicle = vehicleRepo.save(vehicle);
        return modelMapper.map(savedVehicle, VehicleDTO.class);
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);
        vehicleRepo.save(vehicle);
    }

    @Override
    public void deleteVehicle(VehicleDTO vehicleDTO) {
        Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);
        vehicleRepo.delete(vehicle);
    }

    @Override
    public VehicleDTO findVehicleByLicensePlate(String licensePlate) {
        Vehicle vehicle = vehicleRepo.findByLicensePlate(licensePlate);
        if (vehicle != null) {
            return modelMapper.map(vehicle, VehicleDTO.class);
        }
        return null;
    }
}
