package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Projects_object;
import io.cucumber.java.en.Then;

public class Projects_steps {

	WebDriver driver = Driver.getDriver();

	Projects_object PO = new Projects_object(driver);

	@Then("user Validate the projects page")
	public void user_Validate_the_projects_page() throws Exception {
		PO.Validate_the_projects_page();

	}

	@Then("user Add project in the projects page {string} {string} {string} {string} {string}")
	public void AddProjects_in_projects_page(String PN, String PC, String PD, String PROGNAME, String PROJOWN) throws Exception {
		PO.Add_Projects_in_projects_page(PN,PC,PD, PROGNAME, PROJOWN);

	}

	@Then("user validate the added project in projects page {string} {string} {string} {string} {string} {string}")
	public void Validate_the_Added_Project_in_projects_page(String PN, String PC, String PD, String PROGNAME, String PROJOWN, String CB) throws Exception {
		PO.Validate_the_Added_Project_in_projects_page(PN,PC,PD,PROJOWN,PROGNAME,CB);

	}

	@Then("user update the project in projects page {string} {string} {string}")
	public void Update_the_Project_in_projects_page(String PN, String PC, String PD) throws Exception {
		PO.Update_the_Project_in_projects_page(PN,PC,PD);

	}

	@Then("user validate the updated project in projects page {string} {string} {string} {string} {string} {string}")
	public void Validate_the_Updated_Project_in_projects_page(String PN, String PC, String PD, String PROGNAME, String PROJOWN, String CB) throws Exception {
		PO.Validate_the_Updated_Project_in_projects_page(PN,PC,PD,PROGNAME,PROJOWN,CB);

	}

	@Then("user delete the project in projects page {string}")
	public void delete_the_Project_in_projects_page(String PN) throws Exception {
		PO.delete_the_Project_in_projects_page(PN);

	}

}
