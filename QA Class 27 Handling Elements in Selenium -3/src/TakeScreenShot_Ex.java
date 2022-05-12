import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot_Ex {
	
	
	public static void Screenshot(WebDriver driver,String fileName) throws IOException 
	
	{
		 TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	         File DestFile=new File("S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\QA Class 27 Handling Elements in Selenium -3\\src\\SCREENSHOTS\\"+fileName);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);	
		
		
	}

	
	public static void main(String[] args)
	
	{
		
	
		
	}
}
