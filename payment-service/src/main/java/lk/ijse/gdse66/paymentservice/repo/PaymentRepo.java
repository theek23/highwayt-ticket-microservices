package lk.ijse.gdse66.paymentservice.repo;

import lk.ijse.gdse66.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Theekshana De Silva,
 * @Runtime version: 11.0.11+9-b1341.60amd64
 **/

public interface PaymentRepo extends JpaRepository<Payment, String> {
}
