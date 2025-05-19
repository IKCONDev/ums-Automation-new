//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.department_object;
//import Objectclasses.designation_object;
//import io.cucumber.java.en.Then;
//
//public class Departments_steps {
//		
//		
//		WebDriver driver = Driver.getDriver();
//		
//		department_object DO = new department_object(driver);
//		
//		@Then("user checks the departments page {string} {string} {string}")
//		public void user_check_the_departments_page(String str1, String str2, String str3) throws Exception {
//		DO.user_check_the_departments_page(str1, str2, str3);
//
//}
//		
//		@Then("user delete the departments page {string}")
//		public void user_delete_the_departments_page(String str) throws Exception {
//		DO.user_delete_the_departments_page(str);
//
//		
//}
//
//}

package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.department_object;
import Objectclasses.designation_object;
import io.cucumber.java.en.Then;

public class Departments_steps {
		
		
		WebDriver driver = Driver.getDriver();
		
		department_object DO = new department_object(driver);
	@Then("Validate the departments page")
	public void validate_the_departments_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.validate_the_departments_page();
	}

	@Then("add the department {string} {string} {string} {string}")
	public void add_the_department(String DN, String FN, String DC, String DL) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.add_the_department(DN, FN, DC, DL);
	}
	@Then("validate the added department  {string} {string} {string} {string}")
	public void validate_the_added_department(String DN, String FN, String DC, String DL) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.validate_the_added_department(DN, FN, DC, DL);
	}

	@Then("update the department {string} {string} {string} {string}")
	public void update_the_department(String DN, String FN, String DC, String DL) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.update_the_department(DN, FN, DC, DL);
	}
	@Then("validate the updated department  {string} {string} {string} {string}")
	public void validate_the_updated_department(String DN, String FN, String DC, String DL) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DO.validate_the_updated_department(DN, FN, DC, DL);
	}

	@Then("delete the department {string}")
	public void delete_the_department(String DN) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		DO.delete_the_department(DN);
	
	}

}

