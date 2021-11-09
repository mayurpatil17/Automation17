package KeyDriverMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeValid extends BaseTest{

	public static void main(String[] args) throws IOException {
		BaseTest bs = new BaseTest();
		bs.OpenBrowser();
		Flib flib = new Flib();

		String usr = flib.readPropertyData("./Data/config.properties", "username");
		String psw = flib.readPropertyData("./Data/config.properties", "password");

		driver.findElement(By.name("username")).sendKeys(usr);
		driver.findElement(By.name("pwd")).sendKeys(psw);
		driver.findElement(By.id("loginButton")).click();


	}


}
