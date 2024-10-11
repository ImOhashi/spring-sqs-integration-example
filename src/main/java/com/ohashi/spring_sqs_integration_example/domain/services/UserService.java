package com.ohashi.spring_sqs_integration_example.domain.services;

import com.ohashi.spring_sqs_integration_example.application.controllers.dtos.UserDto;

public interface UserService {
    void sendUserInformation(UserDto userDto);
}
