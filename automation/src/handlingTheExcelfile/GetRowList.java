package handlingTheExcelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowList{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");//the path of excel file which we want to read
		Workbook wb = WorkbookFactory.create(fis);//create() will make the excel file ready for read operation
		Sheet sh = wb.getSheet("ABC"); 
		Row row = sh.getRow(0);
		Cell cell = row.getCell(3);
		String lcn = cell.getStringCellValue();
		


		System.out.println(lcn);



	}
}
