/**
 * Copyright (c) 2013-2014 HZCW Technology Inc,All Rights Reserved.
 */
	
package com.weheros.im2.message.queue;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.weheros.im2.message.domain.Message;


/**
 * Handle messeage queue.
 * want to store message and queue into redis.
 * @ClassName: RedisMessageQueue
 * @author Yang
 * @date 2014年3月27日 下午7:26:12
 */
public class RedisMessageQueue extends Thread {
	private static final Lock lock = new ReentrantLock();
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
	}
	
	public static void push(Message message) {
		// TODO Auto-generated method stub
		
	}


	public static void pop(Message message) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// 
	}

}
