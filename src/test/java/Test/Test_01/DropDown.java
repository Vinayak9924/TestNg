package Test.Test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement select=driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(select);
		s.selectByValue("germany");
        s.selectByVisibleText("Japan");
        s.selectByIndex(2);
        List <WebElement> option  =s.getOptions();
       /* for(int i=0;i<option.size();i++) {
        	
        	System.out.println(option.get(i).getText());
        }*/
        for(WebElement op:option) {
        	System.out.println(op.getText());
        }
        
        
	}

}
