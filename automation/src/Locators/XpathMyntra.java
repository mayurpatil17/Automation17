package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMyntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jackets");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		driver.findElement(By.xpath("//label[text()='Puma']")).click();
		/*driver.findElement(By.xpath("//label[text()='Black']")).click();
		String Price = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println(Price);
		driver.close();*/
	}
}
