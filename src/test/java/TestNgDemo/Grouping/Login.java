package TestNgDemo.Grouping;

import org.testng.annotations.Test;

public class Login {
	@Test(priority = 1,groups = "sanity")
	void loginGmail() {
		System.out.println(" login with gmail");
	}
	@Test(priority = 2,groups = "sanity")
	void loginByFb() {
		System.out.println("login with fb");
	}
	@Test(priority = 3,groups = "sanity")
	void loginByTwitter() {
		System.out.println("login with twitter");
	}
}

