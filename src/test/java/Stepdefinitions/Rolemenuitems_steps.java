//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Rolemenuitems_object;
//import Objectclasses.Users_object;
//import io.cucumber.java.en.Then;
//
//public class Rolemenuitems_steps {
//
//
//	WebDriver driver = Driver.getDriver();
//
//	Rolemenuitems_object RO = new Rolemenuitems_object(driver);
//
//	@Then("user checks the Rolemenuitems page {string}")
//	public void user_check_the_Rolemenuitems_page(String str) throws Exception {
//		RO.user_checks_Rolemenuitems_page(str);
//
//		
//	}
//
//}

package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Rolemenuitems_object;
import Objectclasses.Users_object;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Rolemenuitems_steps {


	WebDriver driver = Driver.getDriver();

	Rolemenuitems_object RO = new Rolemenuitems_object(driver);
	
	@Then("Validate Role Menu Items")
	public void Validate_Role_Menu_Items() throws InterruptedException {
			RO.Validate_Role_Menu_Items();
	
	}
	
	@And("add the Role Menu Items {string}")
	public void add_the_Role_Menu_Items(String Role) throws InterruptedException {
		RO.add_the_Role_Menu_Items(Role);
	
	}
}
