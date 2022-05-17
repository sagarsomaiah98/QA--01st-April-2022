import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Annotations {

	
	
	
	
	
		@Test
		public void test1() {
			
			System.out.println("**********CALLING TEST 1 **********");
		}
		
		
		@Test
		public void test2() {
			
			System.out.println("**********CALLING TEST 2 **********");
			
		}
		
		@BeforeClass
		public void beforeclass() {
			System.out.println("   BEFORE CLASS    ");
			
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("  AFTER CLASS ");
		}
		
		@BeforeMethod
		public void before() {
			
			System.out.println("***********BEFORE METHOD*****************");
		}
		
		@Test
		public void test3() {
			
			System.out.println("**********CALLING TEST 3 **********");
			
		}
		
		@AfterMethod
		public void after() {
			
			System.out.println("**************AFTER METHOD**********************");;
		}
	}
		


