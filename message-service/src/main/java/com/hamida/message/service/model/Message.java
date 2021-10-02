package com.hamida.message.service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Message {
	
	@Id
	
	private int messageId;
	private String message;
	private String author;
	
	
	public Message() {}
	
	
	public Message(int messageId, String message, String author) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.author = author;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
