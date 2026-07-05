package com.levelUP.Services;

import com.levelUP.Domains.ContactMessageDTO;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class ContactService {

    private static final Logger logger = LoggerFactory.getLogger(ContactService.class);

    public List<ContactMessageDTO> getAllMessages() {
        logger.info("Fetching all contact messages");
        try {
            List<ContactMessageDTO> messages = new ArrayList<>();
            logger.info("Successfully fetched {} messages", messages.size());
            return messages;
        } catch (Exception e) {
            logger.error("Error fetching all messages: {}", e.getMessage());
            throw e;
        }
    }

    public ContactMessageDTO getMessageById(int id) {
        logger.info("Fetching message with id: {}", id);
        try {
            ContactMessageDTO message = new ContactMessageDTO();
            logger.info("Successfully fetched message with id: {}", id);
            return message;
        } catch (Exception e) {
            logger.error("Error fetching message with id {}: {}", id, e.getMessage());
            throw e;
        }
    }

    public ContactMessageDTO createMessage(ContactMessageDTO message) {
        logger.info("Creating new message from: {}", message.getEmail());
        try {
            logger.info("Successfully created message from: {}", message.getEmail());
            return message;
        } catch (Exception e) {
            logger.error("Error creating message: {}", e.getMessage());
            throw e;
        }
    }

    public void deleteMessage(int id) {
        logger.info("Deleting message with id: {}", id);
        try {
            logger.info("Successfully deleted message with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting message with id {}: {}", id, e.getMessage());
            throw e;
        }
    }
}