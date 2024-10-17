package Test.Test_01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertspopups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//alert with ok button
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Alert myalrt= driver.switchTo().alert();
		System.out.println(myalrt.getText());
		myalrt.accept();
		
		
		//Confirmation alert with ok and cancel button 
		
		/*driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
		*/
		
		//3)promt Alert inputbox 

      /* driver.findElement(By.xpath("//button[text()='Prompt']")).click();
       try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Alert myPromptAlert=driver.switchTo().alert();
		myPromptAlert.sendKeys("Vinayak");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myPromptAlert.accept();
		*/
 // without using swiching command handle alert using explicit wait
		
		//alert with ok button
		
				/*driver.findElement(By.xpath("//button[text()='Alert']")).click();
			  Alert	myalrt=	mywait.until(ExpectedConditions.alertIsPresent());
				System.out.println(myalrt.getText());
				myalrt.accept();
			*/	
	}

}
