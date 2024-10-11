package com.ohashi.spring_sqs_integration_example.application.controllers;

import com.ohashi.spring_sqs_integration_example.application.controllers.dtos.UserDto;
import com.ohashi.spring_sqs_integration_example.domain.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> sendUserInformation(@RequestBody UserDto userDto) {
        userService.sendUserInformation(userDto);
        return ResponseEntity.ok(userDto);
    }
}
