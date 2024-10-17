package testng;

import org.testng.annotations.Test;

public class SignupTest {
	@Test(priority=1,groups= {"regression"})
	void signupnByEmail() {
		System.out.println("this is signup by email");
	}
	@Test(priority=2,groups= {"regression"})
	void signupByFacebook() {
		System.out.println("this is signup by Facebook");
	}
	@Test(priority=3,groups= {"regression"})
	void signupByTwitter() {
		System.out.println("this is signup by Twitter");
	}
}
