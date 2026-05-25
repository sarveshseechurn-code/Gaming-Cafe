package com.levelUP.mappers;

import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.ContactMessageDTO;

import jakarta.inject.Singleton;

@Singleton
public class ContactMapper {

    public List<ContactMessageDTO> findAll() {
        return new ArrayList<>();
    }

    public ContactMessageDTO findById(int id) {
        return new ContactMessageDTO();
    }

    public ContactMessageDTO save(ContactMessageDTO message) {
        return message;
    }

    public void delete(int id) {
    }
}