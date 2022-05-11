package com.sel.methods;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			

			 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
				
				WebDriver d= new ChromeDriver();
				d.manage().window().maximize();
				
				d.get("https://login.salesforce.com/?locale=in");
				Thread.sleep(2000);

				d.findElement(By.linkText("Privacy")).click();
				
				Thread.sleep(2000);
				
             Set<String> wind =d.getWindowHandles();
             
             
             Iterator<String> it = wind.iterator();
             
             String parent= it.next();
             String child=it.next();
             
             System.out.println(parent);
             System.out.println(child);
             
             d.switchTo().window(child);
				
				System.out.println("windows opened -> "+wind.size());
				
			d.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
			wind =d.getWindowHandles();
				
			System.out.println("windows opened -> "+wind.size());
				
				
	}

}
