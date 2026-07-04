package com.levelUP.Controllers;

import com.levelUP.Domains.UserDTO;
import com.levelUP.Services.UserService;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get("/")
    public List<UserDTO> getAllUsers() {
        return userService.getALLUsers();
    } 

    @Get("/{id}")
    public UserDTO getUserbyId(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @Post("/")
    public UserDTO createUser(@Body UserDTO user) {
        return userService.createUser(user);
    }

    @Delete("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
