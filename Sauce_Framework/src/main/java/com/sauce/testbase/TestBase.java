package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	Properties prop;
	public static WebDriver driver;

	
	public void intialize() throws IOException {
		
      prop = new Properties();
		
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\Sauce_Framework\\src\\main\\java\\CONFIG\\config.properties");
		
		prop.load(fis);
		
		String bname=prop.getProperty("BROWSER");
		
		System.out.println(bname);
		
		if(bname.equals("CHROME"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if(bname.equals("FIREFOX"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			}
		
		else if(bname.equals("EDGE")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		
		String url =prop.getProperty("URL");
		driver.get(url);
	}

}
