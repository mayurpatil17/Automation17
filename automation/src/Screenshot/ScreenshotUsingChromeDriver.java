
package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUsingChromeDriver {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/myntra.jpeg");
		Files.copy(src, dest);
		driver.close();
	}

}
