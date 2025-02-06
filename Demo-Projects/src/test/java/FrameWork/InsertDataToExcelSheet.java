package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelSheet {

	public static void main(String[] args) throws Throwable 
	{
		
		//step1:-path connection
				//	
					FileInputStream fis = new FileInputStream("./src/test/resources/ExcelData.xlsx");
					//step2:- ExcelFile in read mode
					Workbook book = WorkbookFactory.create(fis);

					//step3:-getting control on sheet
				   
		
					org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet("Sheet1");
					
					Row row = sheet.createRow(5);
					
					Cell cel = row.createCell(5);
					
					cel.setCellValue("Nirmala");
					
					FileOutputStream fos = new FileOutputStream("./src/test/resources/ExcelData.xlsx");
					
					book.write(fos);
					book.close();
					
					
		
		
		

	}

}
