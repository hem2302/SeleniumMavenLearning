package grouptestcases;

import org.testng.annotations.Test;
//comment
public class Class3 {
	@Test(groups = {"sanity","regression"},priority = 1)
	public void login() {
		System.out.println("login is successful");
	}
	
	@Test(groups = {"sanity","regression"},priority = 6)
	public void logout() {
		System.out.println("login is successful");
	}
	
	@Test(groups = {"sanity"},priority = 2)
	public void search() {
		System.out.println("search is successful");
	}
	
	@Test(groups = {"regression"})
	public void advancedsearch() {
		System.out.println("advanced search is successful");
	}
	
	@Test(groups = {"regression"})
	public void billpayment() {
		System.out.println("bill payment is successful");
	}
	
	@Test(groups = {"regression","sanity"})
	public void prepaidrecharge() {
		long id = Thread.currentThread().getId();
		System.out.println("prapaid recharge is successful");
	System.out.println("thread - " + id);
	}
}
