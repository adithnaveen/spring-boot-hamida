package com.hamida.message.service.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.hamida.message.service.model.Message;
import com.hamida.message.service.repo.MessageRepo;

@Configuration
@EnableMongoRepositories(basePackageClasses = MessageRepo.class)
public class MongoConfig {
	@Bean
	public CommandLineRunner commandLineRunner(MessageRepo messageRepo) {
//		return string -> messageRepo.insert(new Message(101, "Hi how are you", "Hamida"));
		return null;
	}
}
