package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotUsingDowncating {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		RemoteWebDriver rwd = (RemoteWebDriver) driver;
		driver.get("https://www.instagram.com");
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/instagram.jpeg");
		Files.copy(src, dest);
		driver.close();
		

	}

}
