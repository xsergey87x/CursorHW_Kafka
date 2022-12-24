package com.cursor.cursor.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumerNoSql {
    @KafkaListener(id = "test_group", topics = "news")
    public void listen(String data) {
        System.out.println(data);
    }

}
