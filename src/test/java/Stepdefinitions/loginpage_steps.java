package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Login_object;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginpage_steps {
	WebDriver driver = Driver.getDriver();

	Login_object LO = new Login_object(driver);

	@Given("user is Navigate Login page")
	public void user_is_Navigates_loginpage() {
		//		driver.get("http://132.145.186.188:4200/#/login");	
		driver.get("https://129.80.90.99/#/login");	
		driver.manage().window().maximize();
	}

	@When("user is validate Login page {string} {string}")
	public void user_is_validates_loginpage(String Username,String Password ) throws Exception {
		LO.user_validating_login_page();
		LO.user_clicks_login_page(Username,Password);	
		
	}
}
