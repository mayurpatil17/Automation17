package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag43 {
	
	
	@Test(priority = 3)
	public void c()
	{
		Reporter.log("I am from method c",true);
	}
	
	@Test(priority = 2)
	public void d()
	{
		Reporter.log("I am from method d",true);
	}
	
	@Test(priority = 2)
	public void a()
	{
		Reporter.log("I am from method a",true);
	}	
	@Test
	public void b()
	{
		Reporter.log("I am from method b",true);
	}
	@Test(priority = 0)
	public void e()
	{
		Reporter.log("I am from method e",true);
	}
	
	@Test(priority = 2)
	public void f()
	{
		Reporter.log("I am from method f",true);
	}
	
	@Test
	public void g()
	{
		Reporter.log("I am from method g",true);
	}

}
