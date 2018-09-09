package com.maven.learning.JenkinsLearn.utils;


import org.apache.log4j.Logger;

public class Log {
	public static Logger Log = Logger.getLogger(Log.class.getName());

	public static void info(String message) {
		System.out.println(message);   //日志输出到控制台
		Log.info(message);             //日志写到Log实例里面，级别是info
	}

	public static void warn(String message) {
		System.out.println(message);
		Log.warn(message);
	}

	public static void error(String message) {
		System.out.println(message);
		Log.error(message);
	}

	public static void debug(String message) {
		System.out.println(message);
		Log.debug(message);
	}

	public static void fatal(String message) {
		System.out.println(message);
		Log.fatal(message);
	}

}
