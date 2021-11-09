package PageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "username");
		String password = flib.readPropertyData(PROP_PATH, "password");
		lp.validLoginActiTime(username, password);
		
		bt.closeBrowser();
		
		
		
	}

}