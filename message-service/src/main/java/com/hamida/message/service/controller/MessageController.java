package com.hamida.message.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hamida.message.service.model.Message;
import com.hamida.message.service.services.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService service;

	@PostMapping("/message")
	public Message saveMessage(@RequestBody Message message) {
		return service.saveMessage(message);
	}

	@GetMapping("/message")
	public List<Message> getAllMessages() {
		return service.getAllMessages();
	}

	@GetMapping("/message/{msgId}")
	public Message getOneMessage(@PathVariable Integer msgId) {
		return service.getOneMessage(msgId);
	}
}
