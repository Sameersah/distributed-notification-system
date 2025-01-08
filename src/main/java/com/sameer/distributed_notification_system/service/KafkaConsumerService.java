package com.sameer.distributed_notification_system.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "your-topic", groupId = "your-group-id")
    public void listen(String message) {
        // Process the message
    }
}
