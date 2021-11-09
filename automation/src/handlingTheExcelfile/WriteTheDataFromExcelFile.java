package handlingTheExcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//Create() will make the excel file.
		Sheet sh = wb.getSheet("City");//specify sheetname
		Row ro = sh.getRow(1);//specify which row
		
		Cell cell = ro.createCell(1);//specify create cell
		cell.setCellValue("U-Mumba");//store the data
		
		FileOutputStream fos = new FileOutputStream("./Data/Testdata.xlsx");
		wb.write(fos);//write the data
		wb.close();//Close the heavy resource
		
		
		
		
		
	}

}
