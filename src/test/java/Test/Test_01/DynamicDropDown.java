package Test.Test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List  <WebElement >	options  = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
       
		
        for(int i=0;i<options.size();i++) {
        	
        	System.out.println(options.get(i).getText());
        	
        	if(options.get(i).getText().equals("selenium")) {
        		options.get(i).click();
        		break;
        	}
        }

	}

}
