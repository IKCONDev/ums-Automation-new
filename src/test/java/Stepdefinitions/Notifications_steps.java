package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Notifications_object;
import io.cucumber.java.en.Then;

public class Notifications_steps {

	WebDriver driver = Driver.getDriver();

	Notifications_object NO = new Notifications_object(driver);

	@Then("Validate the Notifications page")
	public void Validate_the_Notifications_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		NO.validate_the_Notifications_page();

	}

}
