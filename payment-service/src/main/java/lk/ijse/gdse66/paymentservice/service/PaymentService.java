package lk.ijse.gdse66.paymentservice.service;

import lk.ijse.gdse66.paymentservice.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    List<PaymentDTO> getAllPayments();
    PaymentDTO savePayment(PaymentDTO paymentDTO);
    void updatePayment(PaymentDTO paymentDTO);
    void deletePayment(PaymentDTO paymentDTO);
    PaymentDTO findPaymentById(String id);
}
