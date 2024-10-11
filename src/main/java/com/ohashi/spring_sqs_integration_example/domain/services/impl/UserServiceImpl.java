package com.ohashi.spring_sqs_integration_example.domain.services.impl;

import com.ohashi.spring_sqs_integration_example.application.controllers.dtos.UserDto;
import com.ohashi.spring_sqs_integration_example.domain.entities.User;
import com.ohashi.spring_sqs_integration_example.domain.services.UserService;
import com.ohashi.spring_sqs_integration_example.resources.producer.EventProducer;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final EventProducer eventProducer;

    UserServiceImpl(EventProducer eventProducer) {
        this.eventProducer = eventProducer;
    }

    @Override
    public void sendUserInformation(UserDto userDto) {
        eventProducer.sendMessage(new User(userDto.id(), userDto.name(), userDto.email()));
    }
}
