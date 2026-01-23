package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Programs_object;
import io.cucumber.java.en.Then;

public class Programs_steps {

	WebDriver driver = Driver.getDriver();

	Programs_object PO = new Programs_object(driver);

	@Then("user Validates the Programs page")
	public void user__Validates_the_Programs_page() throws Exception {
		PO.Validate_the_programs_page();
	}

	@Then("user Add Programs in the Programs page {string} {string} {string}")
	public void user__Add_Programs_in_Programs_page(String PN, String PC, String PD) throws Exception {
		PO.AddPrograms_in_programs_page(PN,PC,PD);

	}

	@Then("user Validate the AddedPrograms in programs page {string} {string} {string}")
	public void Validate_the_AddedPrograms_in_programs_page(String PN, String PC, String PD) throws Exception {
		PO.Validate_the_AddedPrograms_in_programs_page(PN,PC,PD);

	}

	@Then("user Update the Programs in programs page {string} {string} {string}")
	public void Update_the_Programs_in_programs_page(String PN, String PC, String PD) throws Exception {
		PO.Update_the_Programs_in_programs_page(PN,PC,PD);

	}

	@Then("user Validate the Updated Program in programs page {string} {string} {string}")
	public void Validate_the_Updated_Program_in_programs_page(String PN, String PC, String PD) throws Exception {
		PO.Validate_the_Updated_Program_in_programs_page(PN,PC,PD);

	}

	@Then("user delete the Program in programs page {string}")
	public void delete_the_Program_in_programs_page(String PN) throws Exception {
		PO.delete_the_Program_in_programs_page(PN);
	}

}
