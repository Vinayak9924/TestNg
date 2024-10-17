package testng1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test
	void pqr() 
	{
		System.out.println("this is pqr from C3");
	}
	@AfterSuite
	void as()
	{
	System.out.println("this is aftersuite method");	
	}
	
	@BeforeSuite
	void bs() 
	{
		System.out.println("this is beforesuite method");
	}
}
