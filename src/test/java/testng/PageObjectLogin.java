package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectLogin {

	WebDriver driver;

	// constructor-initiate the driver
	PageObjectLogin(WebDriver driver) {
		this.driver = driver;

	}

	// Locators
	By loc = By.xpath("//input[@placeholder='Username']");

	By password = By.xpath("//input[@placeholder='Password']");
	
	By btn_login = By.xpath("//button[@type='submit']");
	
	/*
	(By.xpath("//input[@placeholder='Password']")
	(By.xpath("//button[normalize-space()='Login']")
	(By.xpath("//input[@placeholder='Username']")
	(By.xpath("//div[@class='orangehrm-login-slot-wrapper']")
	*/
	
	// Action methods
	public void setUserName(String user) {
		driver.findElement(loc).sendKeys(user);
	}
	public void setpassword(String pwd) {
		driver.findElement(loc).sendKeys(pwd);
	}
	public void ClickonLogin() {
		driver.findElement(btn_login).click();
}
}
