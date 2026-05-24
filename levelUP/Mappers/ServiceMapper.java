package com.levelUP.Mappers;

import com.levelUP.Domains.ServiceDTO;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

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