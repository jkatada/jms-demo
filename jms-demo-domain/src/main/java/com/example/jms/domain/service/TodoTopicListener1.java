package com.example.jms.domain.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TodoTopicListener1 {

	@JmsListener(destination = "jms/topics/TodoMessageTopic", containerFactory="jmsTopicListenerContainerFactory")
	public void receive(String todo) {
		System.out.println("Recive topic1!: " + todo);
	}
	
}
