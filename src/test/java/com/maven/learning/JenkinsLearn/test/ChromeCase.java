package com.maven.learning.JenkinsLearn.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.maven.learning.JenkinsLearn.utils.Log;
import com.maven.learning.JenkinsLearn.utils.Util;

public class ChromeCase {
	WebDriver driver;
	
	
	@Before
	public void setUp() throws Exception {
		driver=Util.openBrowser("chrome");
	}

	@After
	public void tearDown() throws Exception {
		Log.info("关闭浏览器");
		driver.quit();
		Log.info("浏览器关闭了");
	}
	

}
