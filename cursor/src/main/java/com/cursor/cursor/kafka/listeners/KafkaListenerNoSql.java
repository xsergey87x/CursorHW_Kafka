package com.cursor.cursor.kafka.listeners;

import com.cursor.cursor.noSql.serviceMongo.MessageServiceNoSql;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerNoSql {

    public KafkaListenerNoSql(MessageServiceNoSql messageServiceNoSql) {
        this.messageServiceNoSql = messageServiceNoSql;
    }

    private  final MessageServiceNoSql messageServiceNoSql;

    @KafkaListener(topics = "fresh-news", groupId = "groupId")
    public void listen(String data) {
        System.out.println(data);
    }

}
