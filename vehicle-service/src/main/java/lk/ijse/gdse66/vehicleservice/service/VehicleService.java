package lk.ijse.gdse66.vehicleservice.service;

import lk.ijse.gdse66.vehicleservice.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    List<VehicleDTO> getAllVehicles();
    VehicleDTO saveVehicle(VehicleDTO vehicle);
    void updateVehicle(VehicleDTO vehicle);
    void deleteVehicle(VehicleDTO vehicle);
    VehicleDTO findVehicleByLicensePlate(String licensePlate);
}
