package com.sel.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\geckodriver.exe");
		
		//WebDriver driver= new FirefoxDriver();
		
		WebDriver d= new EdgeDriver();
		WebDriver d1= new OperaDriver();
		WebDriver d2= new SafariDriver();

	}

}
