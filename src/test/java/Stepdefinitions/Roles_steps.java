//package Stepdefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Actionitem_object;
//import Objectclasses.Roles_object;
//import io.cucumber.java.en.Then;
//
//public class Roles_steps {
//
//	WebDriver driver = Driver.getDriver();
//
//	Roles_object RO = new Roles_object(driver);
//
//	@Then("user checks the roles page {string}")
//	public void user__check_the_roles_page(String str) throws Exception {
//		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		RO.user_check_the_roles_page(str);
//
//	}
//	@Then("user update the roles page {string}")
//	public void user__update_the_roles_page(String str1) throws Exception {
//		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		RO.user_update_the_roles_page(str1);
//
//	}
//
//	@Then("user delete the roles page {string}")
//	public void user__delete_the_roles_page(String str2) throws Exception {
//		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		RO.user_delete_the_roles_page(str2);
//
//	}
//}



package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Actionitem_object;
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

