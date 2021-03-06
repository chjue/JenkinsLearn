package com.maven.learning.JenkinsLearn.test;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.maven.learning.JenkinsLearn.utils.Constants;
import com.maven.learning.JenkinsLearn.utils.Log;
import com.maven.learning.JenkinsLearn.utils.Util;

public class TestUpload extends ChromeCase{

	@Test
	public void test() throws InterruptedException {
		Log.info("打开网页");
		driver.get("file:///C:/selenium/SeleniumJavaExample/upload.html");
		Thread.sleep(2000);

	  	  //1.点击“浏览”按钮---使用JS点击，可保证点击后鼠标的焦点在弹框中
	  	  WebElement element=driver.findElement(By.xpath("//input[@type='file']"));
	  	  element.click();
	  //	  ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
	  	  Thread.sleep(2000);
	  	  //2.运行tedu.exe---方式三：AutoIt生成的exe
	  	  try{
	  		  Runtime.getRuntime().exec("C:\\selenium\\tedu222.exe");
	  		}catch(IOException e){
	  		  e.printStackTrace();
	  		}
	  	  Thread.sleep(4000);
	  	  Util.takeScreenshot("上传附件");
	    }
	
		
		
	}

