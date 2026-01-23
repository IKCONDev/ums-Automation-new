package Stepdefinitions;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Notifications_object;
import Objectclasses.Profile_object;
import io.cucumber.java.en.Then;

public class Profile_steps {


	WebDriver driver = Driver.getDriver();

	Profile_object PO = new Profile_object(driver);

	@Then("Validate the Profile page")
	public void Validate_the_Profile_page() throws InterruptedException, AWTException {
		PO.validate_the_Profile_page();

	}
}
