package com.hamida.message.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hamida.message.service.model.Message;

@Repository
public interface MessageRepo extends MongoRepository<Message, Integer> {

}
