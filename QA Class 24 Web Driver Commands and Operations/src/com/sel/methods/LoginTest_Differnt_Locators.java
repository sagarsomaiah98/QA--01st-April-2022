package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Differnt_Locators {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.saucedemo.com/");
		
		d.findElement(By.name("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.cssSelector("#login-button")).click();
		d.quit();

	}

}
