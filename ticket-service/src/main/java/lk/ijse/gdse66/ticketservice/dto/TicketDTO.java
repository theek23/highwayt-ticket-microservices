package lk.ijse.gdse66.ticketservice.dto;

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
public class TicketDTO {
    private String id;
    private String userId;
    private String vehicleId;
    private String issueDate;
    private String status;
}
