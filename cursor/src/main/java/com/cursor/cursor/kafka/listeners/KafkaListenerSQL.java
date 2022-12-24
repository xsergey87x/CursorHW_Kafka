package com.cursor.cursor.kafka.listeners;

import com.cursor.cursor.sql.entity.Message;
import com.cursor.cursor.sql.service.MessageServiceSql;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerSQL {

    private final MessageServiceSql messageServiceSql;

    public KafkaListenerSQL(MessageServiceSql messageServiceSql) {
        this.messageServiceSql = messageServiceSql;
    }

    @KafkaListener(topics = "fresh-news", groupId = "groupId")
    public void listen(String data) {
        Message message = new Message(data);
        messageServiceSql.saveMessage(message);
    }
}
