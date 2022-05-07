package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.saucedemo.com/");
		
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		try {
	     d.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	     System.out.println("Login passed");
		}
		catch(Exception e)
		{
			
		String error_msg=	d.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
	     System.out.println(error_msg);
		System.out.println("Login Failed");	
			
			
		}
	
        d.quit();
	}

}
