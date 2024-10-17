package testng;

import org.testng.annotations.Test;

public class login {

	@Test(priority=1,groups= {"sanity"})
	void loginByEmail() {
		System.out.println("this is login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("this is login by Facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("this is login by Twitter");
	}
}
