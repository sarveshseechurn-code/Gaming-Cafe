package com.levelUP.Services;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.ServiceDTO;

@Singleton
public class ServiceService {

    public List<ServiceDTO> getAllServices() {
        return new ArrayList<>();
    }

    public ServiceDTO getServiceById(int id) {
        return new ServiceDTO();
    }

    public ServiceDTO createService(ServiceDTO service) {
        return service;
    }

    public void deleteService(int id) {
    }
}