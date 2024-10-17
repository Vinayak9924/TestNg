package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() {

		// it will compare two values,string,numbers

		// Assert.assertEquals("xyz", "xyz1");
		// Assert.assertNotEquals("xyz", "xyz1");

		// bollean return

		// Assert.assertTrue(true);
		// Assert.assertFalse(1==2);

		// fail the test method

		Assert.fail();
	}

}
