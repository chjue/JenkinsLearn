package com.maven.learning.JenkinsLearn.utils;

public class Constants {
	//IE驱动文件
	public static final String IE_DRIVER = "C:\\selenium\\IEDriverServer.exe";
	//Chrome驱动文件
	public static final String CHROME_DRIVER = "C:\\selenium\\chromedriver.exe";
	//隐式等待默认超时时间
	public static final long IMPLICITLY_WAIT=60;
	
	//显式等待默认超时时间
	public static final int EXPLICIT_WAIT = 60;
	//截图文件路径
	//public static final String SCREENSHOT = System.getProperty("user.dir")+ "\\screenshots";
	public static final String SCREENSHOT = "C:\\selenium\\screenshoot";
}
