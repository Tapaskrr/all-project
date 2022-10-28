package com.te.javalogger.demo;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class RecordStyle extends Formatter {

	@Override
	public String format(LogRecord record) {
		return record.getThreadID()+"::"+record.getLevel();
	}

}
