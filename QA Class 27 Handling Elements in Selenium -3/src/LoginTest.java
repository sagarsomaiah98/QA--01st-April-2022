

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public void login(String uname, String pwd) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
			
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			
			d.get("https://www.saucedemo.com/");
			
			d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			d.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='login-button']")).click();
			
			TakeScreenShot_Ex.Screenshot( d,uname+".jpeg");
			
			d.quit();
			
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
  
		
     LoginTest l= new LoginTest();	
     l.login("standard_user","secret_sauce");
     l.login("locked_out_user","secret_sauce");
     l.login("problem_user","secret_sauce");
     l.login("performance_glitch_user","secret_sauce");
    
    
		
	}

}
