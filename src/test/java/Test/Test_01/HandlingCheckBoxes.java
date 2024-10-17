package Test.Test_01;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1)select specific checkbox 
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2)select all the checkboxes
		List<WebElement> checkboxes  =  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
        for(int i=0;i<checkboxes.size();i++) {
        	 checkboxes.get(i).click();
         }
         
      //input[@class='form-check-input' and @type='checkbox']
	}

}
