//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Menuitems_object;
//import Objectclasses.designation_object;
//import io.cucumber.java.en.Then;
//
//public class designation_steps {
//	
//		
//		WebDriver driver = Driver.getDriver();
//		
//		designation_object DO = new designation_object(driver);
//		
//		@Then("user checks the designation page {string}")
//		public void user_check_the_designation_page(String str1) throws Exception {
//		DO.user_check_the_designation_page(str1);
//
//
//}
//		
//		@Then("user delete the designation page {string}")
//		public void user_delete_the_designation_page(String str2) throws Exception {
//		DO.user_delete_the_designation_page(str2);
//		
//}
//}

package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Menuitems_object;
import Objectclasses.designation_object;
import io.cucumber.java.en.Then;

public class designation_steps {
	
		
		WebDriver driver = Driver.getDriver();
		
		designation_object DO = new designation_object(driver);
	@Then("validate the designations page")
	public void validate_the_designations_page() throws InterruptedException {
		DO.validate_the_designations_page();
	}
	@Then("add the designation {string}")
	public void add_the_designation(String DSN) throws InterruptedException {
		DO.add_the_designation(DSN);
	}
	@Then("validate the added designation {string}")
	public void validate_the_added_designation(String DSN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.validate_the_added_designation(DSN);
	}
	@Then("update the designation {string}")
	public void update_the_designation(String DSN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.update_the_designation(DSN);
	}

	@Then("validate the updated designation {string}")
	public void validate_the_updated_designation(String DSN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.validate_the_updated_designation(DSN);
	}
	@Then("delete the designation {string}")
	public void delete_the_designation(String DSN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.delete_the_designation(DSN);
		

}

}

