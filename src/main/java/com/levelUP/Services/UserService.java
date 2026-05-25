package com.levelUP.Services;

import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.UserDTO;

import jakarta.inject.Singleton;

@Singleton
public class UserService {

    private final List<UserDTO> currentUsers= new  ArrayList<>(List.of(
        new UserDTO(1 ,"Manav Boodhowa", "Manavb@gmail.com","123", "Supervisor" )
    ));

    public List<UserDTO> getAllUsers() {
        return currentUsers;
    }

    public UserDTO getUserById(int id) {
        return new UserDTO(1 ,"Manav Boodhowa", "Manavb@gmail.com","123", "Supervisor");
    }

    public UserDTO createUser(UserDTO user) {
        return user;
    }

    public void deleteUser(int id) {
    }

    public List<UserDTO> getCurrentUsers() {
        return currentUsers;
    }
}