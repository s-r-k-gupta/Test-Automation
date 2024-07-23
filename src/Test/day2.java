package Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void carLoan()
	{
		
		System.out.println("This is car Loan");
	}
    
	@Test(groups={"Smoke"})
	public void carLoanwebLogin()
	{
		
		System.out.println("This is car loan web login");
	}
	
	@BeforeSuite
	public void firstmost()
	{
		
		System.out.println("i'm the no.1");
	}
	
	@AfterSuite
	public void lastmost()
	{
		
		System.out.println("i'm the no.1 from the last.");
	}
	@Parameters({"URL2"})
	@Test 
	public void carLoanMobLogin(String baseurl)
	{
		
		System.out.println("This is car loan Mob login");
		System.out.println(baseurl);
	}
	
	@BeforeTest
	public void carLoanModule()
	{
		
		System.out.println("I'll execute first...");
	}

}
