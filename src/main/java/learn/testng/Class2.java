package learn.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {

	/*@BeforeClass
	public void login() {
		System.out.println("login successful");
	}*/
	
	@Test (priority=4)
	public void deletevendor() {
		System.out.println("delete vendor is successful");
	}

	@Test(priority = 5)
	public void deleteproduct() {
		System.out.println("delete product successful");
	}
	
	@Test(priority = 6)
	public void deletecurrency() {
		System.out.println("delete currency is successful");
	}
	
	/*@AfterClass
	public void logout() {
		System.out.println("logout successful");
	}*/

}
