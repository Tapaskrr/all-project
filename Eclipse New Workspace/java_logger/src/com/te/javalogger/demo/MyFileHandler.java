package com.te.javalogger.demo;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyFileHandler {

	private final static Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
//		LOGGER.info("hi");
		
		FileHandler fileHandler=new FileHandler("C:\\desktop123\\testyantra\\LoggerFiles\\Logger.text");
		fileHandler.setLevel(Level.ALL);
		
		SimpleFormatter formatter=new SimpleFormatter();
		//fileHandler.setFormatter(formatter);
		RecordStyle myFormatter=new RecordStyle();
		fileHandler.setFormatter(myFormatter);
		
		LOGGER.addHandler(fileHandler);
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
