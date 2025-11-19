//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Assignmenuitems_object;
//import Objectclasses.Team_object;
//import io.cucumber.java.en.Then;
//
//public class Assignmenuitemspermissions_steps {
//
//
//
//	WebDriver driver = Driver.getDriver();
//
//	Assignmenuitems_object TO = new Assignmenuitems_object(driver);
//
//	@Then("user checks the Assignmenuitems page")
//	public void user_check_the_Assignmenuitems_page() throws Exception {
//		TO.user_checks_Assignmenuitems_page();
//
//	}
//
//}

package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Assignmenuitems_object;
import Objectclasses.Team_object;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Assignmenuitemspermissions_steps {


	WebDriver driver = Driver.getDriver();

	Assignmenuitems_object TO = new Assignmenuitems_object(driver);
	
	@And("Validate the Assign MenuItems Permisisons page")
	public void Validate_the_Assign_MenuItems_Permisisons_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TO.Validate_the_Assign_MenuItems_Permisisons_page();	
	}
	@Then("add the Assign MenuItems Permisisons")
	public void add_the_Assign_MenuItems_Permisisons() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TO.add_the_Assign_MenuItems_Permisisons();

	}

	@Then("Update the Assign MenuItems Permisisons")
	public void Update_the_Assign_MenuItems_Permisisons() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TO.Update_the_Assign_MenuItems_Permisisons();
		
	}
}

