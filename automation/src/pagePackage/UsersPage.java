package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	@FindBy(xpath = "//a[@class='content users']") private WebElement users;
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement newuser;
	@FindBy(name="username") private WebElement user;
	@FindBy(name="passwordText") private WebElement passtext;
	@FindBy(name="passwordTextRetype") private WebElement retypepass;
	@FindBy(xpath = "//input[@name='firstName']") private WebElement fn;
	@FindBy(xpath = "//input[@name='lastName']") private WebElement ln;
	@FindBy(xpath = "//input[@type='submit']") private WebElement sub;
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsers() {
		return users;
	}
	public WebElement getNewuser() {
		return newuser;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPasstext() {
		return passtext;
	}
	public WebElement getRetypepass() {
		return retypepass;
	}
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getSub() {
		return sub;
	}
}
