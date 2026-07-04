package com.levelUP.Mappers;

import com.levelUP.Domains.PaymentDTO;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

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