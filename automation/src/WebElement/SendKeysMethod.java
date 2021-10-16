package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			 WebElement loginBtn = driver.findElement(By.xpath("//input[@name='q']"));
			loginBtn.sendKeys("Shoes");

	}

}
