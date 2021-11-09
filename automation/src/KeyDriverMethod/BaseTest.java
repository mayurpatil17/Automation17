package KeyDriverMethod;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static WebDriver driver;
	public void OpenBrowser() throws IOException
	{

		Flib flib = new Flib();
		String browservalue = flib.readPropertyData("./Data/config.properties", "browser");
		String Url=flib.readPropertyData("./Data/config.properties", "url");
		
		if (browservalue.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(Url);
		}
		


	}
	public void CloseBrowser()
	{
		driver.quit();
	}
}
