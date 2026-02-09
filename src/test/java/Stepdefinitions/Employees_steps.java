
package Stepdefinitions;

import org.openqa.selenium.WebDriver;


import Drivemanager.Driver;
import Objectclasses.Employee_object;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Employees_steps {
	WebDriver driver = Driver.getDriver();

	Employee_object EO = new Employee_object(driver);

	@And("validate the employee profile page")
	public void validate_the_employee_profiles_page() throws InterruptedException {
		EO.validate_the_employee_profiles_page();
	}


	@And("add the employee profile {string} {string} {string} {string} {string} {string} {string} {string}")
	public void add_the_employee_profile(String FN, String LN, String EID, String Email, String DN, String DSN,
			String FNs, String GN) throws InterruptedException {
		EO.add_the_employee_profile(FN, LN, EID, Email, DN, DSN, FNs, GN);
	}
	@Then("validate the added employees {string} {string} {string} {string} {string} {string} {string} {string}")
	public void validate_the_added_employees(String FN, String LN, String EID, String Email, String DN, String DSN,
			String FNs, String GN) throws InterruptedException {
		EO.validate_the_added_employees(FN, LN, EID, Email, DN, DSN, FNs, GN);
	}

	@Then("update the employee profile {string} {string} {string} {string} {string} {string} {string} {string}")
	public void update_the_employee_profile(String FN, String LN, String EID,String Email, String DN, String DSN, String FNs, String GN) throws InterruptedException {
		EO.update_the_employee_profile(FN, LN, EID, Email, DN, DSN, FNs, GN);
	}

	@Then("validate the updated employees {string} {string} {string} {string} {string} {string} {string} {string}")
	public void validate_the_updated_employess(String FN, String LN, String EID, String Email, String DN, String DSN,
			String FNs, String GN) throws InterruptedException {
		EO.validate_the_updated_employees(FN, LN, EID, Email, DN, DSN, FNs, GN);
	}

	@Then("delete the employee {string}")
	public void delete_the_employee(String Email) throws InterruptedException {

		EO.delete_the_employee(Email);	
	}

}

