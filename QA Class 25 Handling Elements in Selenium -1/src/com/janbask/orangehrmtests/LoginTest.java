package com.janbask.orangehrmtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	
	public void login(String uname, String pwd) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
			
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			
			d.get("https://opensource-demo.orangehrmlive.com/");
			
			d.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
			d.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
			d.quit();
			
	}

	public static void main(String[] args) throws InterruptedException {
		
		LoginTest l = new LoginTest();
		l.login("Admin", "admin123");
		

	}

}
