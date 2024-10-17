package testng;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("E:\\vm\\Test_01\\testdata\\myfile_Random.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet Sheet = workbook.createSheet("RandomData");

		XSSFRow row = Sheet.createRow(3);
		XSSFCell cell = row.createCell(4);
		cell.setCellValue("Welcome");
		workbook.write(file);
		workbook.close();

		System.out.println("File is created");
	}

}
