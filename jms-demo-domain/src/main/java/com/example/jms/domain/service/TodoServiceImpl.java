package com.example.jms.domain.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

	@Inject
	@Named("jmsMessagingTemplate")
	JmsMessagingTemplate jmsMessagingTemplate;

	@Inject
	@Named("jmsTopicMessagingTemplate")
	JmsMessagingTemplate jmsTopicMessagingTemplate;

	@Override
	public void sendMessage(String todo) {
//		Todo todo = new Todo();
//		todo.setTitle("hoge");
//		todo.setDescription(message);
//		todo.setFinished(false);
//		
		jmsMessagingTemplate.convertAndSend("jms/queue/TodoMessageQueue", todo);
		jmsTopicMessagingTemplate.convertAndSend("jms/topics/TodoMessageTopic", todo);
		
	}

}
