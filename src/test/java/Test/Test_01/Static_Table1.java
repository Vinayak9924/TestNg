package Test.Test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Table1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
	    WebElement select=	driver.findElement(By.xpath("//select[@name='fromPort']"));
	    Select s = new Select(select);
		s.selectByVisibleText("Paris");
		 WebElement select1 =	driver.findElement(By.xpath("//select[@name='toPort']"));
		 Select s1 = new Select(select1);
			
		 s1.selectByVisibleText("London");
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println(rows);
		int Column = driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println(Column);
		 
		for(int r = 1; r < rows; r++){
		String Price=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
		//System.out.println(Price);
		
		List <WebElement> Prices=driver.findElements(By.xpath("//table[@class='table']//tr["+r+"]//td[6]"));
		
		 for(int i=0;i<Prices.size();i++) {
			 Prices.get(i).getText();
			// System.out.println(Prices);
		 }
		
		Prices.sort(null);
		System.out.println(Prices);
		}
		
	}

}
