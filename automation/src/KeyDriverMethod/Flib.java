package KeyDriverMethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readPropertyData(String PropPath,String key) throws IOException

	{
		FileInputStream fis = new FileInputStream(PropPath);	
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}



	public String readExcelData(String excelpath, String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();

		return data;


	}
	public int rowcount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//the path of excel file which we want to read
		Workbook wb = WorkbookFactory.create(fis);//create() will make the excel file ready for read operation
		Sheet sh = wb.getSheet(sheetName);// specify the sheet name
		int rowcount = sh.getLastRowNum();
		return rowcount;
	}

	public void WriteData(String excelpath, String sheetname, int rowcount,int cellcount,String setcellvalue) throws EncryptedDocumentException, IOException
	{

		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet gs = wb.getSheet(sheetname);
		Row row = gs.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(setcellvalue);

		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();

	}
}
