package Test.Test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drananddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions a = new Actions(driver);
		WebElement SRC=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TGT=driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(SRC,TGT).build().perform();

	}

}
