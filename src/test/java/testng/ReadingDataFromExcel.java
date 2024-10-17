package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file--workbook---sheets----rows---cells
public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("E:\\vm\\Test_01\\testdata\\Automation_Data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Sheet1");
		int totalrows = Sheet.getLastRowNum();
		int TotalNoCells = Sheet.getRow(1).getLastCellNum();

		System.out.println("number of rows" + totalrows);
		System.out.println("number of cells" + TotalNoCells);

		for (int r = 0; r <= totalrows; r++) {
			XSSFRow currentRow = Sheet.getRow(r);
			for (int c = 0; c < TotalNoCells; c++) {
				XSSFCell cell = currentRow.getCell(c);
				cell.toString();
				System.out.print (cell.toString() + "\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
