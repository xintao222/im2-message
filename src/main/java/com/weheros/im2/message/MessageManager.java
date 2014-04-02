package com.weheros.im2.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.weheros.im2.message.domain.Message;
import com.weheros.im2.message.handler.HandlerFactory;
import com.weheros.im2.message.handler.IMessageHandler;


/**
 * @author Yang
 * @version 1.0
 * @created 27-03-2014 18:55:20
 */
@Service("messageManager")
public class MessageManager implements IMessageManager {


	
	@Override
	public void handleMessage(Message newMessage) {
		// TODO One day maybe support the other protocol of message.
		//      And then should use parser.<code>ParserFactory</code>
		
		// send to Signal server immediately or push it into queue first.
		// store the content of message
		IMessageHandler handler=HandlerFactory.getInstance(newMessage);
		handler.handle(newMessage);
	}

}