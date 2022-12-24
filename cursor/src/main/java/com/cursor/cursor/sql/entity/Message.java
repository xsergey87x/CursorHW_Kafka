package com.cursor.cursor.sql.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    private String message;

    public Message(String message) {
        this.message = message;
    }
}
