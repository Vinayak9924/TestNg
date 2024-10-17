package Test.Test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		//1)Select single option 
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//input[@value='CSS']")).click();

	    //2)capture all the options  and find out size
		List <WebElement> options=  driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	
		System.out.println(options.size());
	
	   //3)printing options from drop-down 
	for(WebElement op:options) {
	
	   System.out.println(op.getText());
		String option =op.getText();
	   
		//4)Select multiple options
	
	
	if(option.equals("Java") || option.equals("Python" ))
		{
		
		op.click();
		}
	}
	
}
}
