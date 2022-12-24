package com.cursor.cursor.noSql.serviceMongo;

import com.cursor.cursor.noSql.model.MessageMongo;
import com.cursor.cursor.noSql.repository.MessageMongoRepository;
import com.cursor.cursor.sql.entity.Message;
import com.cursor.cursor.sql.repository.MessageRepository;

import java.util.List;

public class MessageServiceNoSqlImpl implements MessageServiceNoSql{

    private final MessageMongoRepository messageMongoRepository;

    public MessageServiceNoSqlImpl(MessageMongoRepository messageMongoRepository) {
        this.messageMongoRepository = messageMongoRepository;
    }

    @Override
    public MessageMongo saveMessage(MessageMongo message) {
        return messageMongoRepository.save(message);
    }

    @Override
    public void deleteMessage(MessageMongo message) {
            messageMongoRepository.delete(message);
    }

    @Override
    public List<MessageMongo> getAllMessage() {
        return messageMongoRepository.findAll();
    }
}
