package Test.Test_01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//option[@value='red']
		driver.findElement(By.xpath("//option[@value='red']")).click();
	
	
	   Robot key = new Robot();
	   
	   key.keyPress(KeyEvent.VK_CONTROL);
	   
	   
	   for(int i=0;i<4;i++) {
		   key.keyPress(KeyEvent.VK_DOWN);
		   key.keyRelease(KeyEvent.VK_DOWN);
		   key.keyPress(KeyEvent.VK_SPACE);
		   key.keyRelease(KeyEvent.VK_SPACE);
	   }
	   key.keyRelease(KeyEvent.VK_CONTROL);
	
	}

}
