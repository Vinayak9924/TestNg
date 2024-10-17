package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Allannotations {

	@Test
	void abc() {
		System.out.println("this is abc from C1");
	}

	@BeforeMethod
	void bt() {
		System.out.println("this is beforetest method");
	}

	@Test
	void xyz() {
		System.out.println("this is xyz from C2");
	}

	@AfterMethod
	void at() {
		System.out.println("this is aftertest method");
	}

	@AfterSuite
	void as() {
		System.out.println("this is aftersuite method");
	}

	@BeforeSuite
	void bs() {
		System.out.println("this is beforesuite method");
	}

	@BeforeClass
	void bc() {
		System.out.println("this is before class method");
	}
	@AfterClass
	void ac() {
		System.out.println("this is after class method");
	}
}
