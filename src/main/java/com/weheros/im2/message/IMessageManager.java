package com.weheros.im2.message;

import com.weheros.im2.message.domain.Message;


/**
 * @author Yang
 * @version 1.0
 * @created 27-03-2014 18:55:19
 */
public interface IMessageManager {

	public void handleMessage(Message newMessage);

}