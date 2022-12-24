package com.cursor.cursor.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerSQL {
    @KafkaListener(id = "test_group", topics = "news")
    public void listen(String data) {
        System.out.println(data);
    }
}
