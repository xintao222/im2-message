package com.weheros.im2.message.handler;

import com.weheros.im2.message.domain.Message;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-??-2014 18:55:19
 */
public interface IMessageHandler {

	/**
	 * 
	 * @param message
	 */
	public void handle(Message message);

}