package com.sauce.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {

	
	@Test
	public void ReadProperties() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\Sauce_Framework\\src\\main\\java\\CONFIG\\config.properties");
		
		prop.load(fis);
		
		String bname=prop.getProperty("Browser");
		
		System.out.println(bname);
		
		
		
	}

}
