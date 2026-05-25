package com.levelUP.mappers;

import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.PaymentDTO;

import jakarta.inject.Singleton;

@Singleton
public class PaymentMapper {

    public List<PaymentDTO> findAll() {
        return new ArrayList<>();
    }

    public PaymentDTO findById(int id) {
        return new PaymentDTO();
    }

    public PaymentDTO save(PaymentDTO payment) {
        return payment;
    }

    public void delete(int id) {
    }
}