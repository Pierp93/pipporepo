package com.example.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest {

		private static final Logger l = LogManager.getLogger(MyTest.class);
		
		public  void MyTest() {
			
			
			l.trace("Trace msg");
			l.debug("Debug msg");
			l.info("Info msg");
			l.warn("Warn msg");
			l.error("Error msg");
			l.fatal("Fatal msg");
			
			
			l.trace("VOGLIO AGGIORNARE LA REPO");
			
			
		}
}
