package com.example.mwe;

import org.junit.Test;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class AppTest 
{
	protected static Logger logger;
	@Test
	public void testLogging() {
		logger = (Logger) LoggerFactory.getLogger(App.class);
		logger.info("test");
	}
}
