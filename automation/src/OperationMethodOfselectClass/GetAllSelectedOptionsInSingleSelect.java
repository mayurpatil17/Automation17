package OperationMethodOfselectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsInSingleSelect {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/multiSelectDropdown.html");
		Thread.sleep(8000);
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		
		for(int i=3;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		
		
		List<WebElement> options = sel.getAllSelectedOptions();
		
		for(WebElement we:options)
		{
			String textofSelectedOption = we.getText();
			System.out.println(textofSelectedOption);
		}
	
	}

}