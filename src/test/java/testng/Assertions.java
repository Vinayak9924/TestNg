package testng;

import org.testng.annotations.*;

import junit.framework.Assert;

public class Assertions {
    @Test
	void testTitle() {
		String exp_title="opencart";
		String act_title="openshop";
		
	/*	if(exp_title.equals(act_title)) {
			
			System.out.println("test passed");
		}
		else{
			System.out.println("test failed");
		}*/
		Assert.assertEquals(exp_title, act_title);
	}
}
