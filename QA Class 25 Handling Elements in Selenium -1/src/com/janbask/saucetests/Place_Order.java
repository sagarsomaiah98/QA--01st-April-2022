package com.janbask.saucetests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Place_Order {
	public static WebDriver d;
	
	public static  void click(String xpath) 
	{
		
	d.findElement(By.xpath(xpath)).click();	
		
	}
	
	public static void type(String xpath, String value)
	{
		
		d.findElement(By.xpath(xpath)).sendKeys(value)	;	
		
	}
	
	public void placeOrder() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		 d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.saucedemo.com/");
		type("//input[@id='user-name']","standard_user");
		type("//input[@id='password']","secret_sauce");
		click("//input[@id='login-button']");
		click("//button[@id='add-to-cart-sauce-labs-backpack']");
		click("//a[@class='shopping_cart_link']");
		click("//button[@id='checkout']");
		type("//input[@id='first-name']","John");
		type("//input[@id='last-name']","Win");
		type("//input[@id='postal-code']","2145");
		click("//input[@id='continue']");
		click("//button[@id='finish']");
	String confirmation=d.findElement(By.xpath("//div[@class='complete-text']")).getText();
	System.out.println(confirmation);
	Thread.sleep(2000);
	d.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
	
	
			
				
			
		
		

	}

}
