package handlingTheExcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./Data/Testdata.xlsx");//the path of excel file which we want to read
		Workbook wb = WorkbookFactory.create(fis);//create() will make the excel file ready for read operation
		Sheet sh = wb.getSheet("City");// specify the sheet name
		Row row = sh.getRow(5);//specified which row
		Cell cell = row.getCell(0);//specified which columns
		String data = cell.getStringCellValue();//read the data from the cell
		System.out.println(data);
		
		
	}

}
