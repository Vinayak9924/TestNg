package Test.Test_01;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavgationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);
		
		URL myurl= new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myurl);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
