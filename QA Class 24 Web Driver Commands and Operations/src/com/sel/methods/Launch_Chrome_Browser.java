package com.sel.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
	}

}
