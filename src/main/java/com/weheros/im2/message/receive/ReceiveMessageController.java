package com.weheros.im2.message.receive;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weheros.im2.message.IMessageManager;
import com.weheros.im2.message.domain.Message;
import com.weheros.platform.front.AbstractController;


/**
 * receive message from client.
 * @author Yang
 * @version 1.0
 * @created 27-03-2014 18:55:22
 */
@Controller
@RequestMapping("/message/*")
public class ReceiveMessageController extends AbstractController {
    
	@Autowired
	IMessageManager messageManager;
	
	@RequestMapping(value="receiveMessage",method = RequestMethod.POST)
	@ResponseBody
	public void receive(HttpServletRequest request,HttpServletResponse response,@RequestBody Message newMessage){
		//TODO
		messageManager.handleMessage(newMessage);   
	}



}