import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Test {
	
	
	public static String user_name()
	{
		int v= (int) (Math.random()*10000);
		//System.out.println(v);
		
		String uname= String.valueOf(v);// converts integer to string
		return uname;
		
		
		
		
	}
	

	public void register() 
	{
System.setProperty("webdriver.chrome.driver","S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\JARS &  DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		String username= "Henry"+user_name();// Henry2030

		 //Navigate to the demo site
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();	
        
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Henry");
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Win");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("21 baker street");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Sydney");
        
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("NSW");
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2145");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("0412345678");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("568978");
       
        
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
		
        String title=driver.findElement(By.xpath("//h1[@class='title']")).getText();
        System.out.println(title);
		
	}

	public static void main(String[] args) {
		
		Form_Test f = new Form_Test();
		f.register();
		

	}

}
