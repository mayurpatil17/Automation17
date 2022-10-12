package TakeScreenshotDynamically;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseTest {
static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void Initialization() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
	}
	public void failed(String methodName)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots/"+methodName+".png");
			Files.copy(src,dest);
		}
		catch(Exception e) {
			
		}
		
	}

}
