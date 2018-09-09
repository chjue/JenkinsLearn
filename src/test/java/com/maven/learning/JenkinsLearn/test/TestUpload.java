package com.maven.learning.JenkinsLearn.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.maven.learning.JenkinsLearn.utils.Constants;
import com.maven.learning.JenkinsLearn.utils.Log;
import com.maven.learning.JenkinsLearn.utils.Util;

public class TestUpload {

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
	

	@Test
	public void test() throws InterruptedException {
		Log.info("打开网页");
		driver.get("file:///C:/selenium/SeleniumJavaExample/upload.html");
		Thread.sleep(2000);

	  	  //1.点击“浏览”按钮---使用JS点击，可保证点击后鼠标的焦点在弹框中
	  	  WebElement element=driver.findElement(By.id("inFile"));
	  	  ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
	  	  Thread.sleep(2000);
	  	  //2.运行tedu.exe---方式三：AutoIt生成的exe
	  	  try{
	  		  Runtime.getRuntime().exec("C:\\selenium\\tedu222.exe");
	  		}catch(IOException e){
	  		  e.printStackTrace();
	  		}
	  	  Thread.sleep(2000);
	    }
	
		
		
	}

