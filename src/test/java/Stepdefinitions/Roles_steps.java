
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		RO.validate_the_roles_page();
	}
	@Then("add the role {string} {string}")
	public void add_the_role(String RN, String PN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RO.add_the_role(RN, PN);
	}
	@Then("Validate the added role data {string}")
	public void validate_the_added_role_data(String RN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RO.validate_the_added_role_data(RN);
	
	}
	@Then("Update the role {string} {string}")
	public void update_the_role(String RN, String PN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RO.update_the_role(RN, PN);
	}
	@Then("Validate the Updated role data {string}")
	public void validate_the_updated_role_data(String RN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RO.validate_the_updated_role_data(RN);
	}
	@Then("Delete the role {string}")
	public void Delete_the_role(String RN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RO.Delete_the_role(RN);
	}
}

