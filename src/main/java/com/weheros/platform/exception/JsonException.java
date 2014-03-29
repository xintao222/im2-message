/**
 * Copyright (c) 2013-2014 HZCW Technology Inc,All Rights Reserved.
 */
	
package com.weheros.platform.exception;

/**
 * @ClassName: JsonException
 * @author Administrator
 * @date 2014年3月28日 下午3:20:30
 */
public class JsonException extends RuntimeException {

	/**
	  * @Fields serialVersionUID 
	  */		
	private static final long serialVersionUID = -5603951811237491338L;

	public JsonException(String message) {
		super(message);
	}

	public JsonException(String message, Throwable cause) {
		super(message, cause);
	}

	public JsonException(Throwable cause) {
		super(cause);
	}
}
