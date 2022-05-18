package com.sauce.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sauce.testbase.TestBase;

public class LoginTest extends TestBase {
	


	@Test
	public void valid_login() throws IOException {
		
		
		intialize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		boolean actual=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		
		assertEquals(actual, true);
		
		
	}
	
	
	
	
	@Test
	public void in_valid_login() throws IOException {
		
		
	     intialize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("username1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		boolean actual=driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
		assertEquals(actual, true);
		
		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
		
	}
	
	

}
