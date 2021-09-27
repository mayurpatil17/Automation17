package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads");
		Thread.sleep(2000);
		String titleOfSeleniumWebPage = driver.getTitle();
		System.out.println(titleOfSeleniumWebPage);
		driver.close();
		
	}

}
