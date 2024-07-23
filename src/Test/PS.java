package Test;

import org.testng.annotations.BeforeMethod;

public class PS {
	@BeforeMethod
	public void beforeMe() {
		
		System.out.println("Execute me first.");
	}
	
	public void DoThis()
	{
		System.out.println("Hi i'm here");
		
	}

}
