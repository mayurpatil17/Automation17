package handlingTheExcelfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class writePassAndFailStatus {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("http://laptop-o7brkd6n/login.do");


		Flib flib = new Flib();
		int rc = flib.rowcount("./Data/Testdata.xlsx", "Invalid");


		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./Data/Testdata.xlsx", "Invalid", i, 0);
			String password = flib.readExcelData("./Data/Testdata.xlsx", "Invalid", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();

			WebElement error = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
			if(error.isEnabled())
			{
				
				flib.WriteData("./Data/Testdata.xlsx", "Invalid",i, 2, "Fail");
			}


			
			
			else
			{
				flib.WriteData("./Data/Testdata.xlsx", "Invalid",i, 2, "Pass");
				driver.findElement(By.xpath("//a[@class='logout']")).click();
			}



			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);


		}
	}


}


