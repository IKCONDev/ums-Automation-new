package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Logout_object;
import io.cucumber.java.en.Then;

public class Logout_steps {

	WebDriver driver = Driver.getDriver();
	Logout_object LO = new Logout_object(driver);

	@Then("validate the Logout page")
	public void validate_the_Logout_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		LO.user_validating_logout_page();
	}

}

