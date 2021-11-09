package PageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConst{

	static WebDriver driver;
	//openBrowser method will execute before every  test script
	@SuppressWarnings("deprecation")
	public void openBrowser() throws IOException
	{

		Flib flib = new Flib();
		//read the browser value from property file
		String browserValue = flib.readPropertyData("./Data/config.properties", "browser");
		//read the url value from property file
		String url = flib.readPropertyData("./Data/config.properties", "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);

		}

		else
		{
			System.out.println("Invalid option");
		}

	}

	//this method will close the Browser
	public void closeBrowser()
	{
		driver.close();
	}

}
