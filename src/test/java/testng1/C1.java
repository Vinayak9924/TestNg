package testng1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C1 {
  
	@Test
	void abc() 
	{
		System.out.println("this is abc from C1");
	}
	@BeforeMethod
	void bt()
	{
	System.out.println("this is beforetest method");	
	}
}
