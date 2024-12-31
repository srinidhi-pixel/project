package TestNgDemo.Grouping;

import org.testng.annotations.Test;

public class SignUp {
	@Test(priority = 1,groups = "regressiom")
	void  SignUpGmail() {
		System.out.println(" login with gmail");
	}
	@Test(priority = 2,groups = "regressiom")

	void  SignUpByFb() {
		System.out.println("login with fb");
	}
	@Test(priority = 3,groups = "regressiom")
	void  SignUpTwitter() {
		System.out.println("login with twitter");
	}
}
