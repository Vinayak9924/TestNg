package Test.Test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inner_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://ui.vision/demo/webtest/frames/");
	    WebElement frame3 =	driver.findElement(By.xpath("//frame[src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		
		//inner frame-part of frame 3
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='i am human']")).click();
		*/
		driver.get("https://testautomationpractice.blogspot.com/");
	    WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text' and  @name='RESULT_TextField-0']")).sendKeys("dada");
		
	}

}
