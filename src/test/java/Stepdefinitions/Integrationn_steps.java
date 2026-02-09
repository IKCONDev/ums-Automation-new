package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.integration_object;
import io.cucumber.java.en.Then;

public class Integrationn_steps {

	WebDriver driver = Driver.getDriver();

	integration_object IO = new integration_object(driver);

	@Then("Validate the Integration page")
	public void Validate_the_integration_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.validate_the_Meeting_tools_integration_page();

	}
}
