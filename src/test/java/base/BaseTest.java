 package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import logicalPages.LoginPage;

public class BaseTest {
  
   Properties p;
   public WebDriver driver;
        public WebDriver driverinitlization() throws IOException {
        	FileInputStream f=new FileInputStream("C:\\Users\\mpras\\eclipse-workspace\\ShopUSA\\resources\\Config.properties");
        	 p=new Properties();
        	 p.load(f);
        	 String browsername=p.getProperty("browser");
        	 System.out.println(browsername);
        	 if(browsername.equals("chrome")) {
        		 driver=new ChromeDriver();
        	 }else if (browsername.endsWith("firefox")) {
        		 driver=new FirefoxDriver();
			}else {
				driver=new EdgeDriver();
			}
        	 return driver;
        }  
        
        @BeforeMethod(alwaysRun = true)
        public void Launch() throws IOException {
        	driver=driverinitlization();
    		LoginPage lp=new LoginPage(driver);
    		System.out.println("hi");
    		lp.getUrl();
        }
}
