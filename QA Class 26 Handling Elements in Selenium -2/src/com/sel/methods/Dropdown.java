package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		

		 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
			
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			
			d.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
			
		   WebElement dropdown=	d.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
			
		   
		   
			Select s = new Select(dropdown);
			Thread.sleep(2000);
		//	s.selectByIndex(13);
			//s.selectByValue("CUB");
			//s.selectByVisibleText("Cook Islands");
			
		
			int i=0;
			boolean flag=true;
			try {
			while(flag)
			{
				s.selectByIndex(i);
				i++;
				
			}
			}
			catch(Exception e) {
				
				System.out.println("total drop down values is "+i);
			}

	}

}
