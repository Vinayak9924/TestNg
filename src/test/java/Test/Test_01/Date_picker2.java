package Test.Test_01;

import java.time.Duration;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_picker2 {
	
	//user defined Method for converting month from string---->month
	
	static Month convertMonth(String month) {
		return null;
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//span[@class='icon_calendar']//iframe[@id='frame-one796456169']
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame-one796456169']")));
		String month ="june";
		String year ="2021";
		String date="15";
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
	WebElement yeardropdown =	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select a =new Select(yeardropdown);
	a.selectByVisibleText(year);
	
	//Select month
	while(true) {
	String displaymonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	
	//convert requiremonth and displaymonth in to objects
    Month expectedMonth=convertMonth(month);
    Month currentmonth=convertMonth(displaymonth);
    
	//compare month
    int  result=  expectedMonth.compareTo(currentmonth);
	
    //0 months are equal
    //>0 future month
    //<0 past month
    if(result<0) {
    	//<0 past month
    	driver.findElement(By.xpath("//span[text()='Prev']")).click();
    	
    	
    }else if(result>0) {
    	
    	 //>0 future month
    	driver.findElement(By.xpath("//span[text()='Next']")).click();
    }else {
    	
    	break;
    	
    }
    }
	
	//Pick the date //table[@class='ui-datepicker-calendar']//tbody/tr/td
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
	for(WebElement dt:dates) {
		if(dt.getText().equals(date)) {
			dt.click();
		}
		
	}
	}

}
//dummy-tickets.com/buyticket
