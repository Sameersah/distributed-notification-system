package com.sameer.distributed_notification_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    public KafkaProducerService(){
    }

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
