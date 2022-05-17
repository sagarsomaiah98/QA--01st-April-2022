package com.janbask.read.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Sauce_Test {



	public static void main(String[] args) throws InterruptedException {
		
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\DataParameterization\\src\\main\\java\\TestData\\SAUCE_LOGIN.xlsx");
		int rowCount=xls.getRowCount("SAUCE");
		for(int i=2;i<=rowCount;i++) 
		{
	String uname=	xls.getCellData("SAUCE", "USERNAME", i);
	String pwd=	xls.getCellData("SAUCE", "PASSWORD", i);
	System.out.println(uname+" | "+pwd);
			
		
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys( pwd); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  driver.quit();
	 
	
			
		}
		
		
		
		 
		
		
	}

}
