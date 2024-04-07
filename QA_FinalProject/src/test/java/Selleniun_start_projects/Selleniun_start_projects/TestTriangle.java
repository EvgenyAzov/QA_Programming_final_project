package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestTriangle {
	
	static WebDriver browser;
	
	@Before
	  public void setup() {
		 
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver.exe");
		      browser = new FirefoxDriver();
		      
		  	  browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");

 } 
	@Test
	 public void NotTriangle1() {
		 browser.findElement(By.name("side1")).sendKeys("1");
		 browser.findElement(By.name("side2")).sendKeys("1");
		 browser.findElement(By.name("side3")).sendKeys("2");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Not a Triangle";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void NotTriangle2() {
		 browser.findElement(By.name("side1")).sendKeys("7");
		 browser.findElement(By.name("side2")).sendKeys("2");
		 browser.findElement(By.name("side3")).sendKeys("2");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Not a Triangle";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void NotTriangle3() {
		 browser.findElement(By.name("side1")).sendKeys("3");
		 browser.findElement(By.name("side2")).sendKeys("7");
		 browser.findElement(By.name("side3")).sendKeys("3");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Not a Triangle";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void NotTriangle4() {
		 browser.findElement(By.name("side1")).sendKeys("1");
		 browser.findElement(By.name("side2")).sendKeys("1");
		 browser.findElement(By.name("side3")).sendKeys("2");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Not a Triangle";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void EquilateralTriangle() {
		 browser.findElement(By.name("side1")).sendKeys("7");
		 browser.findElement(By.name("side2")).sendKeys("7");
		 browser.findElement(By.name("side3")).sendKeys("7");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Equilateral";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	@Test
	 public void IsoscelesTriangle3() {
		 browser.findElement(By.name("side1")).sendKeys("4");
		 browser.findElement(By.name("side2")).sendKeys("2");
		 browser.findElement(By.name("side3")).sendKeys("4");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Isosceles";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	
	@Test
	 public void IsoscelesTriangle1() {
		 browser.findElement(By.name("side1")).sendKeys("10");
		 browser.findElement(By.name("side2")).sendKeys("10");
		 browser.findElement(By.name("side3")).sendKeys("2");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Isosceles";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void IsoscelesTriangle2() {
		 browser.findElement(By.name("side1")).sendKeys("2");
		 browser.findElement(By.name("side2")).sendKeys("3");
		 browser.findElement(By.name("side3")).sendKeys("3");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Isosceles";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	
	
	@Test
	 public void ScaleneTriangle() {
		 browser.findElement(By.name("side1")).sendKeys("4");
		 browser.findElement(By.name("side2")).sendKeys("2");
		 browser.findElement(By.name("side3")).sendKeys("3");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Scalene";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	
	
	
	@Test
	 public void Side1NotNumber() {
		 browser.findElement(By.name("side1")).sendKeys("r");
		 browser.findElement(By.name("side2")).sendKeys("2");
		 browser.findElement(By.name("side3")).sendKeys("9");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Side 1 is not a Number";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	
	
	
	
	@Test
	 public void Side2NotNumber() {
		 browser.findElement(By.name("side1")).sendKeys("8");
		 browser.findElement(By.name("side2")).sendKeys("j");
		 browser.findElement(By.name("side3")).sendKeys("4");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Side 2 is not a Number";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	
	
	
	@Test
	 public void Side3NotNumber() {
		 browser.findElement(By.name("side1")).sendKeys("66");
		 browser.findElement(By.name("side2")).sendKeys("4");
		 browser.findElement(By.name("side3")).sendKeys("z");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Side 3 is not a Number";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
}