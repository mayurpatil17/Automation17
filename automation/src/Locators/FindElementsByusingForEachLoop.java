package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByusingForEachLoop {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bike");
		Thread.sleep(5000);
		 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(WebElement we:suggestions)
		{
			String textOfSuggestions = we.getText();
			System.out.println(textOfSuggestions);
		}
				 driver.close();
}
}
