package com.example.jms.domain.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TodoListener {

	@JmsListener(destination = "jms/queue/TodoMessageQueue")
	public void receive(String todo) {
		System.out.println("Recive!: " + todo);
	}
	
}
