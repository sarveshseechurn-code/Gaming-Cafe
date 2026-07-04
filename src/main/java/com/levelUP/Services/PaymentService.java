package com.levelUP.Services;

import com.levelUP.Domains.PaymentDTO;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class PaymentService {

    public List<PaymentDTO> getAllPayments() {
        return new ArrayList<>();
    }

    public PaymentDTO getPaymentById(int id) {
        return new PaymentDTO();
    }

    public PaymentDTO createPayment(PaymentDTO payment) {
        return payment;
    }

    public void deletePayment(int id) {
    }
}