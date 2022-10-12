package handlingTheExcelfile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WritingWithHelpOfFLib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  Flib flib = new Flib();
		  flib.WriteData("./Data/Testdata.xlsx", "City", 1, 2, "INDIA");
	}

}


