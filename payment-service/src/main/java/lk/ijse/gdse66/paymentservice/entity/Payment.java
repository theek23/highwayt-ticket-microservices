package lk.ijse.gdse66.paymentservice.entity;

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
public class Payment {
    @Id
    private String id;
    private String ticketId;
    private String userId;
    private double amount;
    private String paymentDate;
    private String status;
}
