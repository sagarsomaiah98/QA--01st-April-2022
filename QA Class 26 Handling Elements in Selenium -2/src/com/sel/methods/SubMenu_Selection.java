package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SubMenu_Selection {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
			
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			
			d.get("https://www.globalsqa.com/");
			Thread.sleep(2000);
			
			
	WebElement main	 =d.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
	
//	WebElement main1=  d.findElement(By.xpath("(//a[@class='no_border'][contains(text(),'Tester’s Hub')])[1]"));
	
	Actions act = new Actions(d);
	act.moveToElement(main).build().perform();
	
	
	Thread.sleep(2000);
			
	d.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();

	}

}
