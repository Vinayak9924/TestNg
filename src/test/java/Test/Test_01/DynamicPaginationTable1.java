package Test.Test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
        for(int p = 1; p<4; p++) {
        	
        	if(p>1) {
        WebElement activepages=	driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()="+p+"]"));
        activepages.click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	}
        	int noofrows=driver.findElements(By.xpath("//div[@class='table-container']//tbody/tr")).size();
        for(int r=1;r<noofrows; r++) {
        	
        	String id = driver.findElement(By.xpath("//div[@class='table-container']//tbody/tr["+r+"]/td[1]")).getText();
        	System.out.println(id);
        }

        }
	}

}
