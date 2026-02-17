
package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Roles_object;
import io.cucumber.java.en.Then;

public class Roles_steps {

	WebDriver driver = Driver.getDriver();
	Roles_object RO = new Roles_object(driver);

	@Then("validate the roles page")
	public void validate_the_roles_page() throws InterruptedException {
		RO.validate_the_roles_page();
	}
	@Then("add the role {string} {string}")
	public void add_the_role(String RN, String PN) throws InterruptedException {
		RO.add_the_role(RN, PN);
	}
	@Then("Validate the added role data {string} {string}")
	public void validate_the_added_role_data(String RN, String CB) throws InterruptedException {
		RO.validate_the_added_role_data(RN,CB);
	}
	@Then("Update the role {string} {string}")
	public void update_the_role(String RN, String PN) throws InterruptedException {
		RO.update_the_role(RN, PN);
	}
	@Then("Validate the Updated role data {string} {string}")
	public void validate_the_updated_role_data(String RN, String CB) throws InterruptedException {
		RO.validate_the_updated_role_data(RN,CB);
	}
	@Then("Delete the role {string}")
	public void Delete_the_role(String RN) throws InterruptedException {
		RO.Delete_the_role(RN);
		
	}
}

