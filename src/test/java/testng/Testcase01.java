package testng;

import org.testng.annotations.Test;

/*
 * open app
 * login
 * logout
 */
public class Testcase01 {
  
	@Test(priority=1)
	void openapp() {
		System.out.println("opening application");
	}
	@Test(priority=2)
	void login() {
		System.out.println("login with credentials");
	}
	@Test(priority=3)
	void logout() {
		System.out.println("logout from application");
	}
}
