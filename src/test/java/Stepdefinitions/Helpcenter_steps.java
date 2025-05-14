package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Helpcenter_object;
import io.cucumber.java.en.Then;

public class Helpcenter_steps {
	
	WebDriver driver = Driver.getDriver();

	Helpcenter_object HO = new Helpcenter_object(driver);
	
	@Then("Validate the helpcenter page")
	public void Validate_the_helpcenter_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		HO.validate_the_Helpcenter_page();

	}

}
