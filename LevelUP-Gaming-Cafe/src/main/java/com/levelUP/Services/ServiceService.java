package com.levelUP.Services;

import com.levelUP.Domains.ServicesDTO;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class ServiceService {

    private static final Logger logger = LoggerFactory.getLogger(ServiceService.class);

    public List<ServicesDTO> getAllServices() {
        logger.info("Fetching all services");
        try {
            List<ServicesDTO> services = new ArrayList<>();
            logger.info("Successfully fetched {} services", services.size());
            return services;
        } catch (Exception e) {
            logger.error("Error fetching all services: {}", e.getMessage());
            throw e;
        }
    }

    public ServicesDTO getServiceById(int id) {
        logger.info("Fetching service with id: {}", id);
        try {
            ServicesDTO service = new ServicesDTO();
            logger.info("Successfully fetched service with id: {}", id);
            return service;
        } catch (Exception e) {
            logger.error("Error fetching service with id {}: {}", id, e.getMessage());
            throw e;
        }
    }

    public ServicesDTO createService(ServicesDTO service) {
        logger.info("Creating new service with name: {}", service.getName());
        try {
            logger.info("Successfully created service with name: {}", service.getName());
            return service;
        } catch (Exception e) {
            logger.error("Error creating service: {}", e.getMessage());
            throw e;
        }
    }

    public void deleteService(int id) {
        logger.info("Deleting service with id: {}", id);
        try {
            logger.info("Successfully deleted service with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting service with id {}: {}", id, e.getMessage());
            throw e;
        }
    }
}