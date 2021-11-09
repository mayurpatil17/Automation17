package PageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class xyz {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Flib flib = new Flib();

		flib.readPropertyData("./Data/config.properties", "password");
	}
}
