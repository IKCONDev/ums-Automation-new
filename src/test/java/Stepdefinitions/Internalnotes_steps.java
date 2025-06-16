package Stepdefinitions;

import java.awt.AWTException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Internalnotes_object;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Internalnotes_steps {

	WebDriver driver = Driver.getDriver();

	Internalnotes_object IO = new Internalnotes_object(driver);

	@Then("Validate the Internal notes page")
	public void Validate_the_Internalnotes_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.validate_the_Internalnotes_page();

	}
	@Then("add the Internalnotes page {string}")
	public void add_the_Internalnotes_page(String IN) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.add_the_Internalnotes_page(IN);


	}
	@Then("Validate the added internal notes {string}")
	public void validate_the_added_Internalnotes(String IN) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.Validate_the_Added_Internalnotes(IN);

	}

	@Then("Validate the Updated internal notes {string}")
	public void Validate_the_Updated__Internalnotes(String IN) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.validate_the_updated_Internalnotes_page(IN);

	}

	@Then("Update the internal notes {string}")
	public void Update_the__Internalnotes(String IN) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.update_the_Internalnotes_page(IN);

	}

	@Then("Delete the internal notes {string}")
	public void Delete_the__Internalnotes(String IN) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.Delete_the_Internalnotes(IN);
	}
}
