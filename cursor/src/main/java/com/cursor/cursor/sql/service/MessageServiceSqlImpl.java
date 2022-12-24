package com.cursor.cursor.sql.service;

import com.cursor.cursor.sql.entity.Message;
import com.cursor.cursor.sql.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceSqlImpl implements MessageServiceSql{

    private final MessageRepository messageRepository;

    public MessageServiceSqlImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Message message) {
              messageRepository.delete(message);
    }

    @Override
    public List<Message> getAllMessage() {
        return messageRepository.findAll();
    }
}

