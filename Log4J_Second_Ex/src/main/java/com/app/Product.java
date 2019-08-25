package com.app;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;

public class Product {
	private static Logger log=Logger.getLogger(Product.class);
	public static void main(String[] args) {
		Layout layout=new XMLLayout();
		Appender ap=new ConsoleAppender(layout);
		log.addAppender(ap);
		log.debug("THIS IS DEBUGGING");
		log.info("THIS IS INFORMATION");
		log.warn("THIS IS WARNING");
		log.fatal("THIS IS 	FATAL");
		log.error("THIS IS 	ERROR");
		System.out.println("Done");
	}

}
