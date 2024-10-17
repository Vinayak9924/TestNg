package Test.Test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/");

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("demo");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {

			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}

		driver.findElement(By.xpath("//a[@class='parent']")).click();
		driver.findElement(By.xpath("//ul/li/a[text()='Customers']")).click();

		String txt = driver.findElement(By.xpath("//div[contains(text(),'Showing ')]")).getText();

		int total_pages = Integer.parseInt(txt.substring(txt.indexOf("(") + 1, txt.indexOf("Pages") - 1));

		// repeating pages
		for (int p = 1; p < total_pages; p++) {

			if (p > 1) {
				WebElement activepages = driver
						.findElement(By.xpath("//ul[@class='pagination']/li/a[text()=[" + p + "]"));
				activepages.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		//reading data
		
	int noofrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
		
	for(int i=1;i<noofrows;i++)
	{
		String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+i+"]/td[2]")).getText();
	   System.out.println(customername+"\t");
	}
		
		}
	
	
	}
}