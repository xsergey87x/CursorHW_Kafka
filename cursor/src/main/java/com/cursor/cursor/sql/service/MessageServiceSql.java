package com.cursor.cursor.sql.service;

import com.cursor.cursor.sql.entity.Message;

import java.util.List;

public interface MessageServiceSql {

    Message saveMessage(Message message);
    void deleteMessage(Message message);
    List<Message> getAllMessage();
}
