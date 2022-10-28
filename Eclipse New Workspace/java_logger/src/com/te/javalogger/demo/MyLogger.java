package com.te.javalogger.demo;

import java.security.AllPermission;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

	private final static Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args) {
//		LOGGER.info("hi");
		
		ConsoleHandler consoleHandler=new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		
		
		
		
		LOGGER.addHandler(consoleHandler);
		LOGGER.setLevel(Level.ALL);
		
		
		
		LOGGER.severe("severe");
		
		LOGGER.warning("warning");
		
		LOGGER.info("info");
		
		LOGGER.config("config");
		
		LOGGER.fine("fine");
		
		LOGGER.finer("finer");
		
		LOGGER.finest("finest");
		
		
		
		
		
		
	}
}
