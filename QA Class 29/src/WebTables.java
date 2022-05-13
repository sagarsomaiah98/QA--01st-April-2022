import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
	String col1=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[1]")).getText();
	String col2=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[2]")).getText();
	String col3=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[3]")).getText();
	System.out.println(col1+"  "+col2+"  "+col3);
	System.out.println("****************************");
	String row1=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText();
	String row2=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]")).getText();
	String row3=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]")).getText();
	String row4=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[1]")).getText();
	String row5=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[1]")).getText();
	String row6=	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[1]")).getText();
	System.out.println(row1+"  "+row2+"  "+row3+" "+row4+" "+row5+" "+row6);
	
	
		
	}

}
