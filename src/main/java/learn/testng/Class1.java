package learn.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@BeforeTest
	public void login() {
		System.out.println("login successful");
	}
	
	@Test (priority=1)
	public void addvendor() {
		System.out.println("add vendor is successful");
	}

	@Test(priority = 2)
	public void addproduct() {
		System.out.println("add product successful");
	}
	
	@Test(priority = 3)
	public void addcurrency() {
		System.out.println("add currency is successful");
	}
	
	@AfterTest
	public void logout() {
		
		System.out.println("logout successful");
		
	}
}
