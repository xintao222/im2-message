package com.weheros.im2.message.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.weheros.im2.message.domain.Message;
import com.weheros.im2.message.queue.RedisMessageQueue;

/**
 * @author Yang
 * @version 1.0
 * @created 27-03-2014 18:55:23
 */
@Service("textHandler")
public class TextHandler extends DefaultHandler {

	@Override
	public void handle(Message message) {
		RedisMessageQueue.push(message);
	}

}