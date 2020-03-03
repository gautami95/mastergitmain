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
		driver.get("https://www.facebook.com/");
	}
	
  @Test
  public void checktitle() {
	  Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
  }
  
  @Test
  public void checklogIn(){ 
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']//child::span")).getText(), "error");
  }
  
  @AfterSuite
  public void close(){
	  driver.close();
  }
}
