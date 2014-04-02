/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.im2.message;



/**
 * @ClassName: LogService
 * @author Administrator
 * @date 2014年4月2日 上午12:07:16
 */
public class LogService {
	
    public static void debug(Class<?> aclass,String info,Throwable e){
    	org.apache.log4j.Logger log4 = org.apache.log4j.Logger.getLogger(aclass);
    	log4.debug(info, e);
    }
    public static void info(Class<?> aclass,String info,Throwable e){
    	org.apache.log4j.Logger log4 = org.apache.log4j.Logger.getLogger(aclass);
    	log4.info(info, e);
    }
    public static void error(Class<?> aclass,String info,Throwable e){
    	org.apache.log4j.Logger log4 = org.apache.log4j.Logger.getLogger(aclass);
    	log4.error(info, e);
    }
    public static void warn(Class<?> aclass,String info,Throwable e){
    	org.apache.log4j.Logger log4 = org.apache.log4j.Logger.getLogger(aclass);
    	log4.warn(info, e);
    }
    
}
