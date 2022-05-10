package com.janbask.saucetests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut_Test {
	
	public void logout() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.saucedemo.com/");
		
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		d.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(1000);
		d.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		


	}

}
