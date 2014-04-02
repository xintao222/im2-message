package com.weheros.im2.message.handler;

import org.springframework.data.redis.core.RedisTemplate;

import com.weheros.im2.message.domain.Message;

/**
 * 处理消息内容定义接口
 * @author Yang
 * @version 1.0
 * @created 27-??-2014 18:55:19
 */
public interface IMessageHandler {

	/**
	 * 处理消息，存储，发送
	 * @param message
	 */
	public void handle(Message message);

}