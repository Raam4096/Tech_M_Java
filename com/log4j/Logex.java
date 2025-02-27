package com.log4j;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class Logex {
				public static void main(String[] args)
				{
					System.out.println("--------- App Starts ---------");
					
					PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/com/log4j/application.properties");
					
					Logger logger = Logger.getLogger("Main");
					
					logger.fatal("This is fatal message");
					logger.error("This is error message");
					logger.warn("This is warn message");
					logger.info("This is info message");
					
					System.out.println("--------- App Stops ---------");
				}
			}
