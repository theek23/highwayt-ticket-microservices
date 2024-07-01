package lk.ijse.gdse66.vehicleservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: Theekshana De Silva,
 * @Runtime version: 11.0.11+9-b1341.60amd64
 **/
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
