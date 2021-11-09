package handlingTheExcelfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://laptop-o7brkd6n/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement usn = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./Data/Testdata.xlsx", "valid", 1, 0);
		String password = flib.readExcelData("./Data/Testdata.xlsx", "valid", 1, 1);
		


		usn.sendKeys(username);
		Thread.sleep(2000);
		pass.sendKeys(password);
		Thread.sleep(2000);
		loginBtn.click();

	}

}
