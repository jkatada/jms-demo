package com.example.jms.domain.service;

import javax.inject.Inject;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

	@Inject
	JmsMessagingTemplate jmsMessagingTemplate;
	
	@Override
	public void sendMessage(String todo) {
//		Todo todo = new Todo();
//		todo.setTitle("hoge");
//		todo.setDescription(message);
//		todo.setFinished(false);
//		
//		jmsMessagingTemplate.convertAndSend("jms/queue/TodoMessageQueue", todo);
		jmsMessagingTemplate.convertAndSend("jms/queue/TodoMessageQueue", todo);

		
	}

}
