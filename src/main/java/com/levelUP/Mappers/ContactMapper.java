package com.levelUP.Mappers;

import com.levelUP.Domains.ContactMessageDTO;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

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