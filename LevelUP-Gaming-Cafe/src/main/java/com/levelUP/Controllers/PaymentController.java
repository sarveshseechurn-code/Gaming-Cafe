package com.levelUP.Controllers;

import com.levelUP.Domains.PaymentDTO;
import com.levelUP.Services.PaymentService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Get("/")
    public HttpResponse<List<PaymentDTO>> getAllPayments() {
        try {
            List<PaymentDTO> payments = paymentService.getAllPayments();
            return HttpResponse.ok(payments);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Get("/{id}")
    public HttpResponse<PaymentDTO> getPaymentById(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            PaymentDTO payment = paymentService.getPaymentById(id);
            if (payment == null) {
                return HttpResponse.notFound();
            }
            return HttpResponse.ok(payment);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Post("/")
    public HttpResponse<PaymentDTO> createPayment(@Body PaymentDTO payment) {
        try {
            if (payment.getBookingId() <= 0) {
                return HttpResponse.badRequest();
            }
            if (payment.getAmount() <= 0) {
                return HttpResponse.badRequest();
            }
            if (payment.getMethod() == null || payment.getMethod().isEmpty()) {
                return HttpResponse.badRequest();
            }
            PaymentDTO created = paymentService.createPayment(payment);
            return HttpResponse.created(created);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Delete("/{id}")
    public HttpResponse<Void> deletePayment(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            paymentService.deletePayment(id);
            return HttpResponse.noContent();
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }
}