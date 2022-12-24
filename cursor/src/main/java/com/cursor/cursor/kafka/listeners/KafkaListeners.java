package com.cursor.cursor.kafka.listeners;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "fresh-news", groupId = "groupId")
    void listener(String data)
    {
        System.out.println("Listener catch -------" + data);
    }
}
