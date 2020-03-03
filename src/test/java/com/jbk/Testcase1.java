package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testcase1 {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver78.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Software/Offline%20Website/index.html");
	}
	
  @Test
  public void checktitle() {
	  Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
  }
  
  @Test
  public void checklogIn(){
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gautami");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9403578788");
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@id='email_error']")).getText(), "error");
  }
  
  @AfterSuite
  public void close(){
	  driver.close();
  }
}
