package testng1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void xyz() 
	{
		System.out.println("this is xyz from C2");
	}
	@AfterMethod
	void at()
	{
	System.out.println("this is aftertest method");	
	}
	
	
	
}
