package com.levelUP.Mappers;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.UserDTO;

@Singleton
public class UserMapper {

    public List<UserDTO> findAll() {
        return new ArrayList<>();
    }

    public UserDTO findById(int id) {
        return new UserDTO();
    }

    public UserDTO save(UserDTO user) {
        return user;
    }

    public void delete(int id) {
    }
}