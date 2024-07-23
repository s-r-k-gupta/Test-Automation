package Test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	
	@Test(dependsOnMethods = {"homeLoanwebLogin","homeLoanMobLogin"})
	public void homeLoan()
	{
		
		System.out.println("This is home Loan");
	}
    
	@Parameters({"URL","APIKey"})
	@Test
	public void homeLoanwebLogin(String urlname, String APIKey)
	{
		
		System.out.println("This is home loan web login");
		System.out.println(urlname);
		System.out.println(APIKey);
	}
	
	@Test(groups={"Smoke"})
	public void homeLoanMobLogin()
	{
		
		System.out.println("This is home loan Mob login");
		Assert.assertTrue(false);
	}
	
	@Test (timeOut= 4000)
	public void homeloansection()
	{
		
		System.out.println("This is home loan section to execute...");
	}
}   
