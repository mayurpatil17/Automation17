package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverByMoveToElementMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");  // BluestoneLink
	Thread.sleep(2000);
	
	WebElement  target = driver.findElement(By.xpath("//a[contains(.,'Rings ') and @title='Rings' ]"));
	
	Actions act = new Actions(driver);
	act.moveToElement(target).perform(); //perform is must
}
}
