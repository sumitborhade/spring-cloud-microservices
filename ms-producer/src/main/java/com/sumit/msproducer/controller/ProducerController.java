package com.sumit.msproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.msproducer.model.MessageInfo;
import com.sumit.msproducer.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService producerService; 
	
	@GetMapping(value="/generateMessage")
	public MessageInfo generateMessage(@RequestParam(value="name") String name) {
		return producerService.producerMessage(name);
	}

}