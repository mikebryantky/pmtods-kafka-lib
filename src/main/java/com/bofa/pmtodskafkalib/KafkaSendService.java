package com.bofa.pmtodskafkalib;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class KafkaSendService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSendService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public ListenableFuture<SendResult<String, String>> sendMessage(String topicName, String message) {
        return kafkaTemplate.send(topicName, message);
    }
}
