package com.levelUP.Services;

import com.levelUP.Domains.PaymentDTO;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class PaymentService {

    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);

    public List<PaymentDTO> getAllPayments() {
        logger.info("Fetching all payments");
        try {
            List<PaymentDTO> payments = new ArrayList<>();
            logger.info("Successfully fetched {} payments", payments.size());
            return payments;
        } catch (Exception e) {
            logger.error("Error fetching all payments: {}", e.getMessage());
            throw e;
        }
    }

    public PaymentDTO getPaymentById(int id) {
        logger.info("Fetching payment with id: {}", id);
        try {
            PaymentDTO payment = new PaymentDTO();
            logger.info("Successfully fetched payment with id: {}", id);
            return payment;
        } catch (Exception e) {
            logger.error("Error fetching payment with id {}: {}", id, e.getMessage());
            throw e;
        }
    }

    public PaymentDTO createPayment(PaymentDTO payment) {
        logger.info("Creating new payment for booking id: {}", payment.getBookingId());
        try {
            logger.info("Successfully created payment for booking id: {}", payment.getBookingId());
            return payment;
        } catch (Exception e) {
            logger.error("Error creating payment: {}", e.getMessage());
            throw e;
        }
    }

    public void deletePayment(int id) {
        logger.info("Deleting payment with id: {}", id);
        try {
            logger.info("Successfully deleted payment with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting payment with id {}: {}", id, e.getMessage());
            throw e;
        }
    }
}