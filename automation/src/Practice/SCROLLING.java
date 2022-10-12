package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLLING {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev");
		WebElement target = driver.findElement(By.xpath("//h2[.='Support the Selenium Project']"));
		Thread.sleep(3000);
		Point a = target.getLocation();
		int x = a.getX();
		int y = a.getY();
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+(y+500)+")");
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy("+x+","+(y-2000)+")");

	}

}
