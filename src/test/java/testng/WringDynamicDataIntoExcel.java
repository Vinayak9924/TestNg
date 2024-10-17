package testng;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WringDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("E:\\vm\\Test_01\\testdata\\myfile_Dynamic.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet Sheet = workbook.createSheet("DynamicData");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows");

		int NoOfRows = sc.nextInt();
		System.out.println("Enter how many cells");

		int NoOfcells = sc.nextInt();

		for (int r = 0; r <= NoOfRows; r++) {

			XSSFRow currentrow = Sheet.createRow(r);
			for (int c = 0; c < NoOfcells; c++) {
				XSSFCell cell = currentrow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}

		workbook.write(file);
		workbook.close();

		System.out.println("File is created");
	}

}
