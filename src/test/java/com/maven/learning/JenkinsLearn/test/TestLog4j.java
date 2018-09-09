package com.maven.learning.JenkinsLearn.test;

import static org.junit.Assert.*;

//import org.eclipse.jetty.util.log.Log;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.maven.learning.JenkinsLearn.utils.Constants;
import com.maven.learning.JenkinsLearn.utils.Log;

public class TestLog4j {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		Log.info("打开浏览器");          //把信息"打开浏览器"写到 Log类定义的Log变量里面
      	System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
	    driver=new ChromeDriver();
		Log.info("浏览器已经打开");
		
	}

	@After
	public void tearDown() throws Exception {
		Log.info("关闭浏览器");
		driver.quit();
		Log.info("浏览器关闭了");
	}

	@Test
	public void test() {
		driver.get("https://www.baidu.com/");
		Log.info("百度打开好了");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}