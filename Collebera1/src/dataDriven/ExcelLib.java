package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author PoojaRBangera
 *
 */

public class ExcelLib { //ExcelUtility
	static String excelpath="./testResources/testData.xlsx";
	/**
	 * This method is used to read string data from an excel file
	 * @param sheetName  provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have the test data
	 * @param cellNum provide the cell number which you want to read
	 * @return returns the data in that respective sheetName,rowNum,cellNum in the form of string
	 */

	public static String readStringData(String sheetName,int rowNum,int cellNum) {
		Workbook workbook=null;
		try {
			File absPath=new File(excelpath);
			FileInputStream fis=new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	
	
	/**
	 * This method is used to read Boolean data from the excel file
	 * @param sheetName  provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have the test data
	 * @param cellNum provide the cell number which you want to read
	 * @return returns the data in that respective sheetName,rowNum,cellNum in the form of Boolean
	 */
	
	public static boolean readBoolean(String sheetName,int rowNum,int cellNum) {
		Workbook workbook=null;
		try {
			File absPath=new File(excelpath);
			FileInputStream fis=new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}
	
	
	/**
	 This method is used to read Numeric value from the excel file
	 * @param sheetName  provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have the test data
	 * @param cellNum provide the cell number which you want to read
	 * @return returns the data in that respective sheetName,rowNum,cellNum in the form of Double
	 */
	
	public static double readNumeric(String sheetName,int rowNum,int cellNum) {
		Workbook workbook=null;
		try {
			File absPath=new File(excelpath);
			FileInputStream fis=new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}
	
	
	
	/**
	 This method is used to read Date data from the excel file
	 * @param sheetName  provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have the test data
	 * @param cellNum provide the cell number which you want to read
	 * @return returns the data in that respective sheet,row,cell in the form of LocalDateTime
	 */
	public static LocalDateTime readLocalTime(String sheetName,int rowNum,int cellNum) {
		Workbook workbook=null;
		try {
			File absPath=new File(excelpath);
			FileInputStream fis=new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();
	}

}
