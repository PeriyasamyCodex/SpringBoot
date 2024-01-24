package com.spboot.tryouts.util;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyJMSTemplateClient{
	
	@Autowired
	private JmsMessagingTemplate jmsMessageTemplate; 
	
	@Autowired
	private Queue queue;

	
	public void sendJMSMessage() throws Exception {
		System.out.println("Sending message to MQ");
		
		jmsMessageTemplate.convertAndSend(this.queue, "Hi..This is Joan");
		
	}

	
	
	
}
