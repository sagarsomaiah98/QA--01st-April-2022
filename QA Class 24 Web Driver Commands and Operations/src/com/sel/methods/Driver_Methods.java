package com.sel.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Methods {
	
	public  static void  main(String[] args) throws InterruptedException {
		
		
      System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		

	//	System.setProperty("webdriver.gecko.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\geckodriver.exe");
		
	//	WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();// maximize the browser window
		
	
		//driver.get("https://www.saucedemo.com/"); // navigate to the url
		
        driver.navigate().to("https://www.saucedemo.com/");// navigate to the url
		
        Thread.sleep(2000);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
       // driver.close();
        driver.quit();
		
		
		
	}

}
