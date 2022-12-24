package com.cursor.cursor.sql.repository;

import com.cursor.cursor.sql.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
