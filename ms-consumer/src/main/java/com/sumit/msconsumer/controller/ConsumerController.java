package com.sumit.msconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sumit.msconsumer.model.MessageInfo;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consumerMessage")
	public MessageInfo consumeMessage(@RequestParam(name = "name") String name) {
		String url = "http://ms-producer/generateMessage?name=" + name;
		MessageInfo messageInfo = restTemplate.getForObject(url, MessageInfo.class);
		messageInfo.setMessageType("Consumer");
		return messageInfo;
	}
}
