package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 Thread.sleep(3000);
		 Dimension targetSize = new Dimension(200,300);
		 driver.manage().window().setSize(targetSize);
}
}
