package lk.ijse.gdse66.paymentservice.repo;

import lk.ijse.gdse66.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepo extends JpaRepository<Payment, String> {
}
