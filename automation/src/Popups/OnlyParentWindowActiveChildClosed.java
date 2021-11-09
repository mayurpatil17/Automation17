package Popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyParentWindowActiveChildClosed{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close();
				
				
			}
			else
			{
				
			}
		}
	}

}
