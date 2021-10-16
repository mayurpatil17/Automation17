package DropdownDuplicateRemove;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingLinkedHashSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/multiSelectDropdown.html");
		
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		List<WebElement> optionsOfDropdown = sel.getOptions();
		
		//avoid  duplicates using LinkedHashSet ,the order of insertion will  be maintained
		LinkedHashSet<String>s=new LinkedHashSet<String>();
		
		//we are getting the text of webelements from list and adding them to LinkedHashSet
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
