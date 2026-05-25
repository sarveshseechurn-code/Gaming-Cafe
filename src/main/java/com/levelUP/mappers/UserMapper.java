package com.levelUP.mappers;

import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.UserDTO;

import jakarta.inject.Singleton;

@Singleton
public class UserMapper {

    public List<UserDTO> findAll() {
        return new ArrayList<>();
    }

    public UserDTO findById(int id) {
        return new UserDTO(1 ,"Manav Boodhowa", "Manavb@gmail.com","123", "Supervisor");
    }

    public UserDTO save(UserDTO user) {
        return user;
    }

    public void delete(int id) {
    }
}