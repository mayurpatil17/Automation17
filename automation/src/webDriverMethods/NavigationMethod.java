package webDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		
		Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(3000);
		
		nav.forward();
		Thread.sleep(3000);
		
		nav.refresh();
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
