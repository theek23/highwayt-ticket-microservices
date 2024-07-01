package lk.ijse.gdse66.paymentservice.entity;

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
public class Payment {
    @Id
    private String id;
    private String ticketId;
    private String userId;
    private double amount;
    private String paymentDate;
    private String status;
}
