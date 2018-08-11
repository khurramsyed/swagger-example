package com.leanmentors.api.controller;

import com.leanmentors.api.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toMap;

@RestController
@RequestMapping("/users")
@Api(value = "usermanagement", description = "Operations related to usermanagement of the application.")
public class UsersController {


    @ApiOperation(value = "Find a  user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "User Found"),
            @ApiResponse(code = 401, message = "Authorisation Failure finding the user"),
            @ApiResponse(code = 403, message = "Access to user details is forbidden"),
            @ApiResponse(code = 404, message = "User Does not exist")
    }
    )
    @GetMapping("/user/{userName}")
    public User findUser(@PathVariable(name = "userName") String userName) {
        return loadUsers().get(userName);
    }


    @ApiOperation(value = "Create a User")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "User Created"),
            @ApiResponse(code = 401, message = "Authorisation Failure finding the user"),
            @ApiResponse(code = 403, message = "Access to user details is forbidden")
    }
    )
    @PostMapping("/user/add")
    public ResponseEntity findUser(@RequestBody User user) {
        // some code goes here
        return new ResponseEntity("User Successfully created", HttpStatus.CREATED);
    }

    private Map<String, User> loadUsers() {
        return
                Arrays.asList(new User("khurram", "Khurram", "Mahmood"),
                        new User("alesha", "Alesha", "Khurram"))
                        .stream()
                        .collect(toMap(user -> user.getUserName(), user -> user));
    }



}
