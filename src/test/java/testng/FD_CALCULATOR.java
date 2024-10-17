package testng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Excel.ExcelUtils;

public class FD_CALCULATOR {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("button[class='No thanks']")).click();		
		 String Filepath = System.getProperty("user.dir") + "\\testdata\\Fixed_Deposit.xlsx";
		int rows = ExcelUtils.getRowCount(Filepath, "Sheet1");
		for (int i = 1; i < rows; i++) {
			// read the data from excel
			String pric = ExcelUtils.geCellData(Filepath, Filepath, rows, 0);
			String RateOfInt = ExcelUtils.geCellData(Filepath, Filepath, rows, 1);
			String Period = ExcelUtils.geCellData(Filepath, Filepath, rows, 2);
			String Frequency = ExcelUtils.geCellData(Filepath, Filepath, rows, 3);
			String Maturityvalue = ExcelUtils.geCellData(Filepath, Filepath, rows, 4);
			String exp_mvalue = ExcelUtils.geCellData(Filepath, Filepath, rows, 5);

			// pass above data into application
			driver.findElement(By.xpath("//*[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("//*[@id=\"interest\"]")).sendKeys(RateOfInt);
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[1]/div[5]")).sendKeys(Period);
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[1]/div[7]")).sendKeys(Frequency);
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			// validation
			String Actual_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if (Double.parseDouble(exp_mvalue) == Double.parseDouble(Actual_value)) {
				System.out.println("Test Passed");
				ExcelUtils.SetCellData(Filepath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColour(Filepath, "Sheet1", i, 7);
			} else {
				System.out.println("Test Failed");
				ExcelUtils.SetCellData(Filepath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColour(Filepath, Filepath, rows, rows);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).clear();
		}
		driver.quit();
	}

}
