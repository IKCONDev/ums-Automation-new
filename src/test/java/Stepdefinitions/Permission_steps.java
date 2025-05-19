//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Permission_object;
//import Objectclasses.Roles_object;
//import io.cucumber.java.en.Then;
//
//public class Permission_steps {
//	
//		
//		WebDriver driver = Driver.getDriver();
//		
//		Permission_object PO = new Permission_object(driver);
//		
//		@Then("user checks the permissions page {string} {string}")
//		public void user__check_the_Permission_page(String str1, String str2) throws Exception {
////			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		PO.user_check_the_Permission_page(str1, str2);
//
//}
//		@Then("user delete the permissions page {string}")
//	
//		public void user__delete_the_Permission_page(String str) throws Exception {
////			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		PO.user_delete_the_Permission_page(str);
//		
//}		
//}

package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Permission_object;
import Objectclasses.Roles_object;
import io.cucumber.java.en.Then;

public class Permission_steps {


	WebDriver driver = Driver.getDriver();

	Permission_object PO = new Permission_object(driver);

	@Then("Validate the Permissions page")
	public void validate_the_permissions_page() throws InterruptedException {
		PO.validate_the_permissions_page();
	}
	@Then("Add the Permissions {string}")
	public void Add_the_Permissions(String s1) throws InterruptedException {
		PO.Add_the_Permissions(s1);	
	}


	@Then("Validate the added permission data {string}")
	public void validate_the_added_permission_data(String s1) throws InterruptedException {
		PO.validate_the_added_permission_data(s1);

	}
	@Then("Update the Permissions {string}")
	public void Update_the_Permissions(String s1) throws InterruptedException {
		PO.Update_the_Permissions(s1);
	}

	@Then("Validate the Updated permission data {string}")
	public void validate_the_updated_permission_data(String s1) throws InterruptedException {
		PO.validate_the_updated_permission_data(s1);
	}

	@Then("Delete the Permissions {string}")
	public void Delete_the_Permissions(String s1) throws InterruptedException {
		PO.Delete_the_Permissions(s1);
		
	}
}