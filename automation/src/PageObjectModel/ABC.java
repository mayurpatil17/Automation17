package PageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ABC {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Flib flib = new Flib();

		String usn = flib.readPropertyData("Data/config.properties", "username");
		System.out.println(usn);
		
	}
}

