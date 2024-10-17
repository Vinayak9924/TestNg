package Test.Test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Pickers {
	
	static void selectmonthandyear(WebDriver driver,String month,String year) {
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
	}
	static void selectthedate(WebDriver driver,String date) {
		
		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		// switch to Frame
		WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(Frame);

		// Method1 through sendkeys
		// driver.findElement(By.id("datepicker")).sendKeys("22/2/2024");

		// Method2 Date_Pickers element
		String year = "2025";
		String date = "22";
		String month = "May";

		driver.findElement(By.id("datepicker")).click();
		selectmonthandyear( driver, month, year);
		selectthedate(driver,date);
	}

}
