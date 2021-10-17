package Practice;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vn {
	public static void main(String[] args, Object m) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/HP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/multiSelectDropdown.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement element = driver.findElement(By.id("menu"));
	Select sel = new Select(element);
	List<WebElement> optionsOfDropdown = sel.getOptions();
	
	TreeSet<String>s=new TreeSet<String>();
	
      for(int i=0;i<=optionsOfDropdown.size();i++)
	{
		String textofTheOptions = optionsOfDropdown.get(i).getText();
		s.add(textofTheOptions);
	}
	
      for(String mayur:s)
      {
    	  System.out.println(mayur);
      }
	
	
		driver.close();	
	}
}
