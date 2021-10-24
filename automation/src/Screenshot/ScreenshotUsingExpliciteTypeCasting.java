package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotUsingExpliciteTypeCasting {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		driver.get("https://www.flipkart.com");
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/flipkart.jpeg");
		Files.copy(src, dest);
		driver.close();

	}

}
