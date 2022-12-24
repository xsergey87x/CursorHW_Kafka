package com.cursor.cursor.noSql.serviceMongo;


import com.cursor.cursor.noSql.model.MessageMongo;


import java.util.List;

public interface MessageServiceNoSql {

    MessageMongo saveMessage(MessageMongo message);
    void deleteMessage(MessageMongo message);
    List<MessageMongo> getAllMessage();
}
