package com.chatapp.chatapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chatapp.chatapp.model.ChatMessage;

@Controller
public class MessegeController {
	
//	@GetMapping("/")
//	public String home() {
//		return "index";
//	}
	
	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/public")
	public ChatMessage sendMessege(@Payload ChatMessage message) {
		return message;
	}
	
	@MessageMapping("/chat.addUser")
	@SendTo("/topic/public")
	public ChatMessage addUser(@Payload ChatMessage message,SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("user",message.getSender());
		return message;
	}
}
