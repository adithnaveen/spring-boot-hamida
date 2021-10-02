package com.hamida.message.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamida.message.service.model.Message;
import com.hamida.message.service.repo.MessageRepo;

@Service
public class MessageService {
	@Autowired
	private MessageRepo repo;

	// CRUD METHODS

	public Message saveMessage(Message message) {
		return repo.insert(message);
	}

	public List<Message> getAllMessages() {
		return repo.findAll();
	}

	public Message getOneMessage(Integer msgId) {
		return repo.findById(msgId).get();
	}
}
