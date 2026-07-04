package com.levelUP.Controllers;

import com.levelUP.Domains.PaymentDTO;
import com.levelUP.Services.PaymentService;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Get("/")
    public List<PaymentDTO> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @Get("/{id}")
    public PaymentDTO getPaymentById(@PathVariable int id) {
        return paymentService.getPaymentById(id);
    }

    @Post("/")
    public PaymentDTO createPayment(@Body PaymentDTO payment) {
        return paymentService.createPayment(payment);
    }

    @Delete("/{id}")
    public void deletePayment(@PathVariable int id) {
        paymentService.deletePayment(id);
    }
}