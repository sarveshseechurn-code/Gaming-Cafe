package com.levelUP.Controllers;

import com.levelUP.Domains.ContactMessageDTO;
import com.levelUP.Services.ContactService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @Get("/")
    public HttpResponse<List<ContactMessageDTO>> getAllMessages() {
        try {
            List<ContactMessageDTO> messages = contactService.getAllMessages();
            return HttpResponse.ok(messages);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Get("/{id}")
    public HttpResponse<ContactMessageDTO> getMessageById(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            ContactMessageDTO message = contactService.getMessageById(id);
            if (message == null) {
                return HttpResponse.notFound();
            }
            return HttpResponse.ok(message);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Post("/")
    public HttpResponse<ContactMessageDTO> createMessage(@Body ContactMessageDTO message) {
        try {
            if (message.getFullName() == null || message.getFullName().isEmpty()) {
                return HttpResponse.badRequest();
            }
            if (message.getEmail() == null || message.getEmail().isEmpty()) {
                return HttpResponse.badRequest();
            }
            if (message.getMessage() == null || message.getMessage().isEmpty()) {
                return HttpResponse.badRequest();
            }
            ContactMessageDTO created = contactService.createMessage(message);
            return HttpResponse.created(created);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteMessage(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            contactService.deleteMessage(id);
            return HttpResponse.noContent();
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }
}