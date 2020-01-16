package com.maven.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookLogin 
{
	WebDriver driver;
	 @Test
	  public void LogIn() 
	  {
		  System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khai.ruls.165@facebook.com");
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sayed55@");
		  driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	  }

}
