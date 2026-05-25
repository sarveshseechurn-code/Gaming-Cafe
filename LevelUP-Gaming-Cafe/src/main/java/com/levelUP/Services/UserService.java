package com.levelUP.Services;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.UserDTO;

@Singleton
public class UserService {

    public List<UserDTO> getAllUsers() {
        return new ArrayList<>();
    }

    public UserDTO getUserById(int id) {
        return new UserDTO();
    }

    public UserDTO createUser(UserDTO user) {
        return user;
    }

    public void deleteUser(int id) {
    }
}