package Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	WebDriver driver;
	
	@Given("Bstack website should be opened in default browser")
	public void bstack_website_should_be_opened_in_default_browser() {
	   driver=new ChromeDriver();
	   driver.get("https://bstackdemo.com/");
	   driver.manage().window().maximize();
	}

	@Given("Click on signin link and add username and password")
	public void click_on_signin_link_and_add_username_and_password() {
		Pageclass pg=new Pageclass(driver);
		pg.login();  
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    System.out.println("Login Successful");
	    driver.close();
	}
}