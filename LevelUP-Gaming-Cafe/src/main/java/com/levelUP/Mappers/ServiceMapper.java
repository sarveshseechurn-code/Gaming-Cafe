package com.levelUP.Mappers;

import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.ServiceDTO;

import jakarta.inject.Singleton;


@Singleton
public class ServiceMapper {

    public List<ServiceDTO> findAll() {
        return new ArrayList<>();
    }

    public ServiceDTO findById(int id) {
        return new ServiceDTO();
    }

    public ServiceDTO save(ServiceDTO service) {
        return service;
    }

    public void delete(int id) {
    }
}