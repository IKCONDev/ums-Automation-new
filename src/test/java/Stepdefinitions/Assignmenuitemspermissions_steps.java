
package Stepdefinitions;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Assignmenuitems_object;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Assignmenuitemspermissions_steps {


	WebDriver driver = Driver.getDriver();

	Assignmenuitems_object TO = new Assignmenuitems_object(driver);
	
	@And("Validate the Assign MenuItems Permisisons page")
	public void Validate_the_Assign_MenuItems_Permisisons_page() throws InterruptedException {
		TO.Validate_the_Assign_MenuItems_Permisisons_page();	
	}
	@Then("add the Assign MenuItems Permisisons")
	public void add_the_Assign_MenuItems_Permisisons() throws InterruptedException {
		TO.add_the_Assign_MenuItems_Permisisons();

	}

	@Then("Update the Assign MenuItems Permisisons")
	public void Update_the_Assign_MenuItems_Permisisons() throws InterruptedException {
		TO.Update_the_Assign_MenuItems_Permisisons();
		
	}
}

