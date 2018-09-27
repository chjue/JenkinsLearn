package com.maven.learning.JenkinsLearn.test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.maven.learning.JenkinsLearn.utils.Log;
import com.maven.learning.JenkinsLearn.utils.Util;

public class ChromeCase {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver=Util.openBrowser("chrome");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Log.info("关闭浏览器");
		driver.quit();
		Log.info("浏览器关闭了");
	}
	

}
