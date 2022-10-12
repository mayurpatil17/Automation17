package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	//Declaration

	
	


	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;


	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//Utilization
	public WebElement getUsn() {
		return usn;
	}



	public WebElement getPass() {
		return pass;
	}



	public WebElement getLoginButton() {
		return loginButton;
	}



	public WebElement getLogo() {
		return logo;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}

	//operational methods
	public void sendUsername()
	{
		usn.sendKeys("admin");
	}

	public void sendPassword()
	{
		pass.sendKeys("manager");
	}

	public void clickOnLoginButton()
	{
		loginButton.click();
	}

	public void clickOnCheckbox()
	{
		checkBox.click();
	}
	public void validLoginActiTime(String validusername,String validpassword)
	{
		usn.sendKeys(validusername);
		pass.sendKeys(validpassword);
		loginButton.click();

	}


	public void invalidLoginActiTime(String invalidusername,String invalidpassword) throws InterruptedException
	{
		usn.sendKeys(invalidusername);
		pass.sendKeys(invalidpassword);
		loginButton.click();
		Thread.sleep(3000);
		usn.clear();

	}

}
