package Test.Test_01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
 	WebElement option 	=driver.findElement(By.xpath("//option[@value='red'] "));
	
 	//click to open the dropdown
 	option.click();
    //use robot class to select all options in the first dropdown
 	
 	Robot robot = new Robot();
 	//Hold the control key (for multiple selection )
 	robot.keyPress(KeyEvent.VK_CONTROL);
 	
 	//assuming there are 5 options in the drop-down ,navigate and select each
 	
 	for(int i=0; i<4; i++) {
 	//navigate down the drop-down options 
 		robot.keyPress(KeyEvent.VK_DOWN);
 		robot.keyRelease(KeyEvent.VK_DOWN);
 	//select the option 
 		robot.keyPress(KeyEvent.VK_SPACE);
 		robot.keyRelease(KeyEvent.VK_SPACE);
 		
 	}
 	//release the control key 
 	robot.keyRelease(KeyEvent.VK_CONTROL);
 	
 	//driver.quit();
 	
 	
	}

}
