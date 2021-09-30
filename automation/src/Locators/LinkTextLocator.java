package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/HP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/link.html");
		driver.findElement(By.linkText("Google")).click();
		driver.close();
		
	}

}
