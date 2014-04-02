package com.weheros.im2.message.domain;

import java.util.Set;

/**
 * Short message definition.
 * 
 * @author Yang
 * @version 1.0
 * @created 27-03-2014 18:55:20
 */
public class Message {
	/**
	 * such as text,picture,audio and so on.
	 */
	private String type;
	/**
	 * phone code of sender.
	 */
	private String sender;
	/**
	 * phone code of receiver. could be mutiple.
	 */
	private Set<String> receiver;
	/**
	 * it is text. or it is a url of audio,video,file.
	 */
	private String content;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Set<String> getReceiver() {
		return receiver;
	}

	public void setReceiver(Set<String> receiver) {
		this.receiver = receiver;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}