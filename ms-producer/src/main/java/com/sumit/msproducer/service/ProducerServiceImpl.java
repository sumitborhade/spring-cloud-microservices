package com.sumit.msproducer.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sumit.msproducer.model.MessageInfo;

@Service
public class ProducerServiceImpl implements ProducerService {

	private Map<String, String> map = new HashMap<>();
	
	{
		map.put("Charvee", "Congratulations");
		map.put("Sushama", "Well Done");
		map.put("Sumit", "Good job");
	}
	
	@Override
	public MessageInfo producerMessage(String name) {
		String message = map.get(name);
		message = message != null ? message : "Hello";
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName(name);
		messageInfo.setMessage(message +"!");
		messageInfo.setMessageType("Producer");
		
		return messageInfo;
	}

}
