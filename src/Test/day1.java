package Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {
       
	
	@AfterTest
	public void AfterLoan()
	{
		
		System.out.println("I'll execute at last..");
	}
	
	
	@Test (groups={"Smoke"})
	public void personalLoan()
	{
		
		System.out.println("This is personal Loan");
	}
        
	@Test (enabled = false)
	public void personalLoanwebLogin()
	{
		
		System.out.println("This is personal loan web login");
	}
	
	@Test(dataProvider= "getdata")
	public void personalLoanMobLogin(String username, String password)
	{
		
		System.out.println("This is personal loan Mob login");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0]= "firstusername";
		data[0][1]= "password";
		
		//2nd set
		data[1][0]= "secondusername";
		data[1][1]= "password";
		
		//3rd set
		data[2][0]= "thirdusername";
		data[2][1]= "password";
		
		return data;
	}
}   
