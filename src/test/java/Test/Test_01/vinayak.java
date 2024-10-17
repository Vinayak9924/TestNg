package Test.Test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class vinayak {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vm");

		driver.findElement(By.xpath("//input[@name='firstname']")).clear();

		WebElement txt = driver.findElement(By.xpath("//input[@name='firstname']"));

		txt.sendKeys("vm");
		String text = txt.getAttribute("value");

		System.out.println(text);
		driver.close();

	}

}
