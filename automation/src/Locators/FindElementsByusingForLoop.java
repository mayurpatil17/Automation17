package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByusingForLoop {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bike");
		Thread.sleep(5000);
		 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(int i=0; i<suggestions.size();i++)
		{
			WebElement suggestion = suggestions.get(i);
			String textOfsuggestion = suggestion.getText();
			System.out.println(textOfsuggestion);
		}
				 driver.close();
}
}
