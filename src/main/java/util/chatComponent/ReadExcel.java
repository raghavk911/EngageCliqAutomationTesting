package util.chatComponent;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


/**
 * @methodname          readExcelValuesSheets
 * @TestClass           ReadExcel
 * @author              Raghavendra Kadam
 * @description         This class performs Template creation activity.
 *                      It includes excel sheet reading functionality.
 * @createddate        	09-Oct-2023
 * * @modificationlog
 */
public class ReadExcel {
	
	/**
	   * @methodname            readExcelValuesSheets
	   * @author                Raghavendra Kadam
	   * @params                excelFileName, sheetName, column, row
	   * @description           This method reads values from excel file which used as sendKeys
	   * @return                name as sheet content
	   */
	public static String readExcelValuesSheets(String excelFileName,String sheetName,int col,int row) throws BiffException, IOException{
		FileInputStream fis=new FileInputStream("D:\\Raghav\\Eclipse\\EngageCliq\\TestData.xls");
		Workbook workbook=Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("TestCaseData");
		Cell cell=sheet.getCell(col,row);
		String name=cell.getContents();
		return name;
	}

}
