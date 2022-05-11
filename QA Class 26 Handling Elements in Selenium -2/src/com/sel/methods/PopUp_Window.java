package com.sel.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
			
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			
			d.get("https://mail.rediff.com/cgi-bin/login.cgi");
			d.findElement(By.xpath("//input[@title='Sign in']")).click();
			
			Alert al =d.switchTo().alert();
			Thread.sleep(2000);
			
			System.out.println(al.getText());
			//al.accept();
			al.dismiss();

	}

}
