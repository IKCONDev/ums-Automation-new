//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Employee_object;
//import Objectclasses.Users_object;
//import io.cucumber.java.en.Then;
//
//public class Users_steps {
//
//
//	WebDriver driver = Driver.getDriver();
//
//	Users_object UO = new Users_object(driver);
//
//	@Then("user checks the Users page")
//	public void user_check_the_users_page() throws Exception {
//		UO.user_checks_Users_page();
//
//
//	}
//
//}

package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Users_object;
import io.cucumber.java.en.Then;

public class Users_steps {


	WebDriver driver = Driver.getDriver();

	Users_object UO = new Users_object(driver);

	@Then("validate the users page")
	public void validate_the_users_page() throws InterruptedException {
		UO.validate_the_users_page();
	
	}

	@Then("add the user {string} {string}")
	public void add_the_user(String RN, String Email) throws InterruptedException {
		UO.add_the_user(RN, Email);

	}
	@Then("validate the added user {string} {string}")
	public void validate_the_added_user(String RN, String Email) throws InterruptedException {
		UO.validate_the_added_user(RN, Email);
	}

	@Then("update the user {string} {string}")
	public void update_the_user(String URN, String Email) throws InterruptedException {
		UO.update_the_user(URN, Email);

	}
	@Then("validate the updated user {string} {string}")
	public void validate_the_updated_user(String URN, String Email) throws InterruptedException {
		UO.validate_the_updated_user(URN, Email);

	}
}
