package com.cursor.cursor.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerSQL {
    @KafkaListener(topics = "fresh-news", groupId = "groupId")
    public void listen(String data) {
        System.out.println(data);
    }
}
