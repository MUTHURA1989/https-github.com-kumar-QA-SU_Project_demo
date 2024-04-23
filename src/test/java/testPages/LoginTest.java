package testPages;

import java.io.IOException;

import org.testng.annotations.Test;
import base.BaseTest;
import logicalPages.LoginPage;

public class LoginTest extends BaseTest {
   LoginPage lp;
   
	@Test
	public void VerifyLoginFunction() throws IOException, InterruptedException {
		 lp=new LoginPage(driver);
		 System.out.println("bye");
		lp.login();
	}
}
