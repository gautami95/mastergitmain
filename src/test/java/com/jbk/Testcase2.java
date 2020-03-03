package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.get("https://www.facebook.com/");
	}
	
  @Test(priority=1)
  public void checkTitle() {
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gaubhadane@gmail.com");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  Assert.assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
  }
  
  @Test(priority=0)
  public void checkUsersTitle(){
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='_5iyx']")).getText(), "");
  }
  
  @AfterSuite
  public void close(){
	  driver.close();
  }
}
