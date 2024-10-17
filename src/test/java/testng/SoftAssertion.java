package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SoftAssertion {

	// @Test
	void hardassert() {

		System.out.println("testing");
		System.out.println("testing");

		Assert.assertEquals(1, 2);

		System.out.println("testing cpmpleted");
	}

	@Test
	void softassert() {

		System.out.println("testing");
		System.out.println("testing");

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);

		System.out.println("testing cpmpleted");
		sa.assertAll();	}
}
