package com.fpg.ec;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyLog {

	public static void main(String[] args) {
		Log logger = LogFactory.getLog(MyLog.class.getName());
		System.out.println("testtest2222");
		System.err.println("testtest");
		logger.info("test");
		logger.info("test2");
	}

}
