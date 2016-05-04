package com.app;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {

	static Logger logger = LoggerFactory.getLogger(MyApp.class);
	
	public static void main(String[] args) {

		logger.info("before print");
		logger.error("error");
		
		System.out.println("Hello World");
		
		logger.info("after print");
	}

}
