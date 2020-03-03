package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testcase2 {
	
public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver78.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Software/Offline%20Website/pages/examples/dashboard.html");
	}
	
  @Test
  public void checkTitle() {
	  Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
  }
  
  @Test
  public void checkUsersTitle(){
	  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
	  Assert.assertEquals(driver.getTitle(), "");
  }
  
  @AfterSuite
  public void close(){
	  driver.close();
  }
}
