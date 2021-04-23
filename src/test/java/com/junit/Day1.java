package com.junit;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Day1 {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips Workspace\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws InterruptedException {
		
		driver.findElement(By.id("select_box_sign")).click();
		driver.findElement(By.id("signInLink")).click();

	}
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(6000);
		WebElement txtnum = driver.findElement(By.xpath("//input[@type='number']"));
		txtnum.sendKeys("9876543210");
		Assert.assertEquals("9876543210",txtnum.getAttribute("value"));
		

	}
	


}