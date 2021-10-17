package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://laptop-o7brkd6n/login.do");          //actiTime
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.id("loginButton"));
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform(); //perform is must,without it we can't perform any action on webElement.
	}

}
