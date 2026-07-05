package com.levelUP.Controllers;

import com.levelUP.Domains.UserDTO;
import com.levelUP.Services.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get("/")
    public HttpResponse<List<UserDTO>> getAllUsers() {
        try {
            List<UserDTO> users = userService.getAllUsers();
            return HttpResponse.ok(users);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Get("/{id}")
    public HttpResponse<UserDTO> getUserById(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            UserDTO user = userService.getUserById(id);
            if (user == null) {
                return HttpResponse.notFound();
            }
            return HttpResponse.ok(user);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Post("/")
    public HttpResponse<UserDTO> createUser(@Body UserDTO user) {
        try {
            if (user.getFullName() == null || user.getFullName().isEmpty()) {
                return HttpResponse.badRequest();
            }
            if (user.getEmail() == null || user.getEmail().isEmpty()) {
                return HttpResponse.badRequest();
            }
            if (user.getPassword() == null || user.getPassword().isEmpty()) {
                return HttpResponse.badRequest();
            }
            UserDTO created = userService.createUser(user);
            return HttpResponse.created(created);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteUser(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            userService.deleteUser(id);
            return HttpResponse.noContent();
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }
}