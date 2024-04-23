package logicalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "log")
	WebElement usernameField;
	@FindBy(name = "pwd")
	WebElement passwordField;
	@FindBy(name = "submit")
	WebElement loginbtn;
	
  public void getUrl() {
		driver.get("https://shopusa.stgdevserver.com/login/");
	}
  
  public void login() throws InterruptedException {
	  Thread.sleep(2000);
	  usernameField.sendKeys("12344");
	  Thread.sleep(2000);
	  passwordField.sendKeys("12345678");
	  Thread.sleep(2000);
	  loginbtn.click();
  }
	
}
