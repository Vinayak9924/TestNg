package testng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file--workbook---sheets----rows---cells
public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("E:\\vm\\Test_01\\testdata\\myfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet Sheet = workbook.createSheet("Data");

		XSSFRow row1 = Sheet.createRow(0);
		row1.createCell(0).setCellValue("Players");

		row1.createCell(1).setCellValue("Sachin");
		row1.createCell(2).setCellValue("Virat");
		row1.createCell(3).setCellValue("Ponting");
		row1.createCell(4).setCellValue("Sangakara");
		XSSFRow row2 = Sheet.createRow(2);
		row2.createCell(0).setCellValue("Matches");
		row2.createCell(1).setCellValue("624");
		row2.createCell(2).setCellValue("598");
		row2.createCell(3).setCellValue("654");
		row2.createCell(4).setCellValue("690");
		workbook.write(file);
		workbook.close();

		System.out.println("File is created");
	}

}
