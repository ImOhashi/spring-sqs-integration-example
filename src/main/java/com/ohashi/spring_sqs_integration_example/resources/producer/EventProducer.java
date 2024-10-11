package com.ohashi.spring_sqs_integration_example.resources.producer;

import com.ohashi.spring_sqs_integration_example.application.config.EventQueuesProperties;
import com.ohashi.spring_sqs_integration_example.domain.entities.User;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventProducer {

    private final EventQueuesProperties eventQueuesProperties;

    private final SqsTemplate sqsTemplate;

    EventProducer(EventQueuesProperties eventQueuesProperties, SqsTemplate sqsTemplate) {
        this.eventQueuesProperties = eventQueuesProperties;
        this.sqsTemplate = sqsTemplate;
    }

    public void sendMessage(User message) {
        this.sqsTemplate.send(this.eventQueuesProperties.getSqsExampleQueue(), message);
    }
}
