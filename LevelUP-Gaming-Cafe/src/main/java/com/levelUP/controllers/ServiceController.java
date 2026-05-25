package com.levelUP.controllers;

import com.levelUP.Services.ServiceService;
import com.levelUP.domains.ServiceDTO;

import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/services")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @Get
    public List<ServiceDTO> getAllServices() {
        return serviceService.getAllServices();
    }

    @Get("/{id}")
    public ServiceDTO getServiceById(@PathVariable int id) {
        return serviceService.getServiceById(id);
    }

    @Post
    public ServiceDTO createService(@Body ServiceDTO service) {
        return serviceService.createService(service);
    }

    @Delete("/{id}")
    public void deleteService(@PathVariable int id) {
        serviceService.deleteService(id);
    }
}