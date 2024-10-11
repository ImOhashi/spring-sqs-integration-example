package com.ohashi.spring_sqs_integration_example.application.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "queue.url")
public class EventQueuesProperties {
    private String sqsExampleQueue;

    public String getSqsExampleQueue() {
        return sqsExampleQueue;
    }

    public void setSqsExampleQueue(String sqsExampleQueue) {
        this.sqsExampleQueue = sqsExampleQueue;
    }
}
