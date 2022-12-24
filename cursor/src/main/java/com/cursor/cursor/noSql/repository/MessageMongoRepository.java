package com.cursor.cursor.noSql.repository;

import com.cursor.cursor.noSql.model.MessageMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageMongoRepository extends MongoRepository<MessageMongo,String> {
}
