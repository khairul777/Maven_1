package com.maven.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FacebookHome 
{
	 WebDriver driver;
	  @Test
	  public void HomePage() throws Exception
	  { 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[@class='_1vp5']")).click(); 
	  }

}
