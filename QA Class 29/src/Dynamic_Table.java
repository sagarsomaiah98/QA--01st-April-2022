import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		String first="//table[@id='customers']/tbody/tr[1]/th[";
		String second="]";
		
		
		
		/*
		 * for(int i=1;i<=3;i++) { String xpath=first+i+second;
		 * 
		 * String col= driver.findElement(By.xpath(xpath)).getText();
		 * 
		 * //System.out.print(col); }
		 */
		
		System.out.println("");
		String f="//table[@id='customers']/tbody/tr[";
		String s="]/td[1]";
		
		for(int i=2;i<=7;i++) {
			
			String xpath= f+i+s;
			String row=driver.findElement(By.xpath(xpath)).getText();
			System.out.println(row);
		}
		

	}

}
