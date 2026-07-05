package com.levelUP.Mappers;

import com.levelUP.Domains.ServicesDTO;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class ServiceMapper {

    public List<ServicesDTO> findAll() {
        return new ArrayList<>();
    }

    public ServicesDTO findById(int id) {
        return new ServicesDTO();
    }

    public ServicesDTO save(ServicesDTO service) {
        return service;
    }

    public void delete(int id) {
    }
}