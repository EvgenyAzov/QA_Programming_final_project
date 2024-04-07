package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;

public class TestPass {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver.exe");
		      browser = new FirefoxDriver();
		      
		      
		  	  browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		      browser.get(url);
		
	  } 
	 
	 @Test
	 public void CorrectPassword() {
		 
		 
		 browser.findElement(By.name("characters")).sendKeys("Evgeny1");
		 browser.findElement(By.name("validate")).click();
		 
		 
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 String Expected= "Valid Value";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	 
	 @Test
	 public void ShortPassword() {
		 
		 
		 browser.findElement(By.name("characters")).sendKeys("Nikitasovi1");
		 browser.findElement(By.name("validate")).click();
		 
		 
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 String Expected= "Invalid Value";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void LongPassword() {
		 
		 
		 browser.findElement(By.name("characters")).sendKeys("AviZakai1");
		 browser.findElement(By.name("validate")).click();
		 
		 
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 String Expected= "Invalid Value";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void WrongChar() {
		 
		 
		 
		 browser.findElement(By.name("characters")).sendKeys("P@ssW0rd");
		 browser.findElement(By.name("validate")).click();
		 
		 
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 String Expected= "Invalid Value";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void WrongChar2() {
		 
		 
		 browser.findElement(By.name("characters")).sendKeys("P@ssW0rd1");
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 String Expected= "Invalid Value";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void WrongChar3() {
		 
		 browser.findElement(By.name("characters")).sendKeys("P@ssW0rd2");
		 
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 String Expected= "Invalid Value";
		 assertEquals(Expected,result);
		 browser.close();
		 
		 
		 
		 
		 
	 }
	 
}