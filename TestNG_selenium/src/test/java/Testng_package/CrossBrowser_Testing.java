package Testng_package;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CrossBrowser_Testing {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(3000);
      driver.manage().window().maximize();

  }
	@Test
	public void firefoxbrowser() throws InterruptedException{
	  driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);
	}

	@Test
	public void edgebrowser() throws InterruptedException{
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\ASUS\\Desktop\\Wipro\\Selenium_Jar\\edgedriver_win64\\msedgedriver.exe\"");
	  driver = new EdgeDriver();
	  driver.get("https://www.flipkart.com/"); 
	  driver.manage().window().maximize();
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);
	}
 
	@AfterClass
	public void afterClass() 
	{
	  driver.quit();  
	}
}
