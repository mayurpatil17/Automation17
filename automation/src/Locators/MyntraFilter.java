package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraFilter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(// label[@class='common-customRadio gender-label'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(// label[@class='common-customCheckbox vertical-filters-label'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(// label[@class='vertical-filters-label common-customCheckbox'])[1]")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//h3[text()='Puma' and@class='product-brand']/ancestor::a[@style='display: block;']/descendant::span[text()='1399']")).getText();
		System.out.println(price);
	}

}
