package Test.Test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vm\\Test_01\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		int Column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(Column);

		// Read the data from specific row and coloumn(ex: 5th row and 1st column)

		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();

		System.out.println(bookname);

		// Read the data from all the row and coloumn

		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= Column; c++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print(data + "\t");
			}
			System.out.println();

		}
		// print book names whose author is mukesh

		for (int r = 2; r <= rows; r++) {
			String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
					.getText();
			// System.out.println(authorname);
			if (authorname.equals("Mukesh")) {
				String booknames = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(booknames + "\t" + authorname);
			}
		}

		//find the total price of all the books
		
		int total=0;
		for (int r = 2; r <= rows; r++) {
			String Price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]"))
					.getText();
			//System.out.println(Price);
			total=total+Integer.parseInt(Price);
		}
		System.out.println(total);

	//assignment 
		//https://blazedemo.com/
	}

}
