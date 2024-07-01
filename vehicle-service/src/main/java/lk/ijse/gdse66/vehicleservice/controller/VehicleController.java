package lk.ijse.gdse66.vehicleservice.controller;

import lk.ijse.gdse66.vehicleservice.dto.VehicleDTO;
import lk.ijse.gdse66.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v0/vehicle")
public class VehicleController {
    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<VehicleDTO> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PostMapping
    public VehicleDTO saveVehicle(@RequestBody VehicleDTO vehicleDTO) {
        return vehicleService.saveVehicle(vehicleDTO);
    }

    @PutMapping
    public void updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.updateVehicle(vehicleDTO);
    }

    @DeleteMapping
    public void deleteVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.deleteVehicle(vehicleDTO);
    }

    @GetMapping("/licensePlate/{licensePlate}")
    public VehicleDTO findVehicleByLicensePlate(@PathVariable String licensePlate) {
        return vehicleService.findVehicleByLicensePlate(licensePlate);
    }

}
