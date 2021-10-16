package DropdownDuplicateRemove;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingHashSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/multiSelectDropdown.html");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		List<WebElement> optionsOfDropdown = sel.getOptions();
		
		//avoid  duplicates using HashSet ,the order of insertion will not be maintained
		HashSet<String>s=new HashSet<String>();
		
		//we are getting the text of webelements from list and adding them to HashSet
		for(int i=0;i<optionsOfDropdown.size();i++)
		{
			String textOfTheOptions = optionsOfDropdown.get(i).getText();
			s.add(textOfTheOptions);
		}
		
		//reading the set
		for(String suraj:s)
		{
			System.out.println(suraj);
		}
			
		
	}

}
