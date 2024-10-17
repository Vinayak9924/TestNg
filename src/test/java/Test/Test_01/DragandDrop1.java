package Test.Test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		
		/*WebElement SRC =driver.findElement(By.id("box1"));
		WebElement TGT =driver.findElement(By.id("dropBox"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(SRC, TGT).build().perform();*/
		WebElement SRC =driver.findElement(By.xpath("//div[@class='dragableBox']"));
		WebElement TGT =driver.findElement(By.id("dropBox"));
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("//div[@class='dragableBox']"));
		
	}
}
