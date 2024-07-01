package lk.ijse.gdse66.paymentservice.controller;

import lk.ijse.gdse66.paymentservice.dto.PaymentDTO;
import lk.ijse.gdse66.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v0/payment")
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<PaymentDTO> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PostMapping
    public PaymentDTO savePayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.savePayment(paymentDTO);
    }

    @PutMapping
    public void updatePayment(@RequestBody PaymentDTO paymentDTO) {
        paymentService.updatePayment(paymentDTO);
    }

    @DeleteMapping
    public void deletePayment(@RequestBody PaymentDTO paymentDTO) {
        paymentService.deletePayment(paymentDTO);
    }

    @GetMapping("/{id}")
    public PaymentDTO findPaymentById(@PathVariable String id) {
        return paymentService.findPaymentById(id);
    }
}
