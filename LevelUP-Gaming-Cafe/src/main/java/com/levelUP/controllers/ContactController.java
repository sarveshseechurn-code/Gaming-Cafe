package com.levelUP.controllers;

import com.levelUP.Services.ContactService;
import com.levelUP.domains.ContactMessageDTO;

import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @Get("/")
    public List<ContactMessageDTO> getAllMessages() {
        return contactService.getAllMessages();
    }

    @Get("/{id}")
    public ContactMessageDTO getMessageById(@PathVariable int id) {
        return contactService.getMessageById(id);
    }

    @Post("/")
    public ContactMessageDTO createMessage(@Body ContactMessageDTO message) {
        return contactService.createMessage(message);
    }

    @Delete("/{id}")
    public void deleteMessage(@PathVariable int id) {
        contactService.deleteMessage(id);
    }
}
