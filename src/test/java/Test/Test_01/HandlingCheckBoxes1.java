package Test.Test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	
		List <WebElement> checkbox =  driver.findElements(By.xpath("//td/input[@type='checkbox']"));
		
		for(int i=0;i<checkbox.size();i++)
		{
       	 checkbox.get(i).click();
        }
        
	}

}
