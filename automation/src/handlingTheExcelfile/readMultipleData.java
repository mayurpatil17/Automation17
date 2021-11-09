package handlingTheExcelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readMultipleData{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");//the path of excel file which we want to read
		Workbook wb = WorkbookFactory.create(fis);//create() will make the excel file ready for read operation
		Sheet sh = wb.getSheet("City");
		int lastrownum = sh.getLastRowNum();    
		for(int i=1;i<=lastrownum;i++)
		{
			Row row = sh.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			System.out.println(data);
		}
		
		
		
		
		
		
		
	
		
	}

}
