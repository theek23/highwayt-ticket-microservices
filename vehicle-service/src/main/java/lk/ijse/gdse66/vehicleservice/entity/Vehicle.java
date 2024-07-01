package lk.ijse.gdse66.vehicleservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {
    @Id
    private Long vehicleId;
    private String licensePlate;
    private String make;
    private String model;
}
