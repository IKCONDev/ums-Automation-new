package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Forgot_object;
import io.cucumber.java.en.Then;

public class Forgotpassword_steps {		
	
	WebDriver driver = Driver.getDriver();

	Forgot_object FO = new Forgot_object(driver);

	@Then("Validate the Forgot Password page")
	public void Validate_the_Forgotpassword_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://132.145.186.188:4200/#/login");
		driver.manage().window().maximize();
		FO.validate_the_Forgotpassword_page();

		
	}
}



