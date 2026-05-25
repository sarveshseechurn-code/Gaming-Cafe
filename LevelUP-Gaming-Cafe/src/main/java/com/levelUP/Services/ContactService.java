package com.levelUP.Services;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.ContactMessageDTO;

@Singleton
public class ContactService {

    public List<ContactMessageDTO> getAllMessages() {
        return new ArrayList<>();
    }

    public ContactMessageDTO getMessageById(int id) {
        return new ContactMessageDTO();
    }

    public ContactMessageDTO createMessage(ContactMessageDTO message) {
        return message;
    }

    public void deleteMessage(int id) {
    }
}