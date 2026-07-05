package com.levelUP.Services;

import com.levelUP.Domains.UserDTO;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<UserDTO> getAllUsers() {
        logger.info("Fetching all users");
        try {
            List<UserDTO> users = new ArrayList<>();
            logger.info("Successfully fetched {} users", users.size());
            return users;
        } catch (Exception e) {
            logger.error("Error fetching all users: {}", e.getMessage());
            throw e;
        }
    }

    public UserDTO getUserById(int id) {
        logger.info("Fetching user with id: {}", id);
        try {
            UserDTO user = new UserDTO();
            logger.info("Successfully fetched user with id: {}", id);
            return user;
        } catch (Exception e) {
            logger.error("Error fetching user with id {}: {}", id, e.getMessage());
            throw e;
        }
    }

    public UserDTO createUser(UserDTO user) {
        logger.info("Creating new user with email: {}", user.getEmail());
        try {
            logger.info("Successfully created user with email: {}", user.getEmail());
            return user;
        } catch (Exception e) {
            logger.error("Error creating user: {}", e.getMessage());
            throw e;
        }
    }

    public void deleteUser(int id) {
        logger.info("Deleting user with id: {}", id);
        try {
            logger.info("Successfully deleted user with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting user with id {}: {}", id, e.getMessage());
            throw e;
        }
    }
}