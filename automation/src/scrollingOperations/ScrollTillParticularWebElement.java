
package scrollingOperations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev");
		WebElement target = driver.findElement(By.xpath("//h2[@class=\"selenium text-center\"]"));
		Point loc = target.getLocation();
		int Xaxis = loc.getX();
		int Yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+Xaxis+","+(Yaxis-200)+")");
		jse.executeScript("window.scrollBy("+Xaxis+","+(Yaxis-500)+")");
		
		
	}

}
