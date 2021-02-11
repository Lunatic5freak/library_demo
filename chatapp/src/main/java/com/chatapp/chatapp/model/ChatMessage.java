package com.chatapp.chatapp.model;

public class ChatMessage {
	
	private String content;
	private String sender;
	private MessegeType type;
	
	public enum MessegeType{CHAT,JOIN,LEAVE}
	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessegeType getType() {
		return type;
	}

	public void setType(MessegeType type) {
		this.type = type;
	};

}
