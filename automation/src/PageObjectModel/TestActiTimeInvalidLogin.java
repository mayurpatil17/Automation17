package PageObjectModel;

import java.io.IOException;

public class TestActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		int rc = flib.rowcount(EXCEL_PATH, "invalid");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalid", i, 0);
			String password=flib.readExcelData(EXCEL_PATH, "invalid", i, 1);


			lp.invalidLoginActiTime(username,password);
		}

	}

}
