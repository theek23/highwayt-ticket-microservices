package lk.ijse.gdse66.vehicleservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: Theekshana De Silva,
 * @Runtime version: 11.0.11+9-b1341.60amd64
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private Long vehicleId;
    private String licensePlate;
    private String make;
    private String model;
}
