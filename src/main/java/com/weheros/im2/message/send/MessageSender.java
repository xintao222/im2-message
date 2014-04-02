/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.im2.message.send;

import com.weheros.im2.message.LogService;

/**
 * @ClassName: MessageSender
 * @author Administrator
 * @date 2014年4月2日 上午12:00:38
 */
public class MessageSender extends Thread {
	
	@Override
	public void run() {
		// pop the message from redis
		// many message one time
		// TODO
		
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			LogService.error(MessageSender.class, "--------messagesender sleep error----------------", e);
		}
		
		
	}
}
