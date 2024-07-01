package lk.ijse.gdse66.vehicleservice.repo;

import lk.ijse.gdse66.vehicleservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, String> {
    Vehicle findByLicensePlate(String licensePlate);
}
