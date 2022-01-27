package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./testResources/testData.xlsx");

		Workbook workbook=WorkbookFactory.create(fis);

		//To get data from the excelsheet
		//		String data=workbook.getSheet("Sheet1").getRow(6).getCell(0).toString();
		//		System.out.println(data);



		//to get date value 		
		//		LocalDateTime data = workbook.getSheet("Sheet1").getRow(2).getCell(2).getLocalDateTimeCellValue();
		//		 System.out.println(data);
		// System.out.println(data.getMonth().name());




		// to get boolean value
		//				boolean data = workbook.getSheet("Sheet1").getRow(5).getCell(3).getBooleanCellValue();
		//				System.out.println(data);



		
		
		
		Sheet sheetOne = workbook.getSheet("Sheet1");
		sheetOne.getRow(4).getCell(1);
		Row row = sheetOne.getRow(3);
		System.out.println(row.getCell(0));
		System.out.println(row.getCell(3));



	}


}
