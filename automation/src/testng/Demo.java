package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void login() {
	  Reporter.log("login", true);
  }
  
  @Test
  public void action() {
	  Reporter.log("perform the action", true);
  }
  
  @Test
  public void logout() {
	  Reporter.log("logout", true);
  }
  
  
}
