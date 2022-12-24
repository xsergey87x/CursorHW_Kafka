package com.cursor.cursor.sql.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@RequiredArgsConstructor
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    private String message;

}
