/**
 * Copyright (c) 2013-2014 HZCW Technology Inc,All Rights Reserved.
 */
	
package com.weheros.im2.message.queue;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.weheros.im2.message.domain.Message;


/**
 * Handle messeage queue.
 * want to store message and queue into redis.
 * @ClassName: RedisMessageQueue
 * @author Yang
 * @date 2014年3月27日 下午7:26:12
 */
public class RedisMessageQueue{
	@Autowired
	private RedisTemplate<String, Message> redisTemplate;
	/*private static final Lock lock = new ReentrantLock();
    private static RedisMessageQueue messageQueue=null;
    
	public static RedisMessageQueue getInstance(){
		lock.lock();
		if(null==messageQueue){
			messageQueue=new RedisMessageQueue("redis-message-queue-thread");
		}
		lock.unlock();
		return messageQueue;
	}
	private RedisMessageQueue(String name){
		super(name);
	}*/
	
	
	public void push(Message message) {
		// TODO Auto-generated method stub
		redisTemplate.boundListOps("common-message-queue").leftPush(message);
	}


	public static void pop(Message message) {
		// TODO Auto-generated method stub
		
	}
	
	

}
