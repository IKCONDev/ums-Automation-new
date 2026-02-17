//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Taskcategories_object;
//import Objectclasses.Team_object;
//import io.cucumber.java.en.Then;
//
//public class Taskcategories_steps {
//	
//
//
//
//		WebDriver driver = Driver.getDriver();
//
//		Taskcategories_object TO = new Taskcategories_object(driver);
//
//		@Then("user checks the taskcategory page {string} {string}")
//		public void user_check_the_taskcategory_page(String str1, String str2) throws Exception {
//			TO.user_check_Taskcategory_page(str1, str2);
//
//			
//		}
//		
//		@Then("user delete the taskcategory page {string}")
//		public void user_delete_the_taskcategory_page(String str) throws Exception {
//			TO.user_delete_Taskcategory_page(str);
//		
//		}
//
//}

package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Taskcategories_object;
import Objectclasses.Team_object;
import io.cucumber.java.en.Then;

public class Taskcategories_steps {

	WebDriver driver = Driver.getDriver();

	Taskcategories_object TO = new Taskcategories_object(driver);

	@Then("Validate the task category page")
	public void validate_the_task_category_page() {
		TO.validate_the_task_category_page();
	}

	@Then("add the category {string} {string}")
	public void add_the_category(String CN, String Dept) throws InterruptedException {
		TO.add_the_category(CN,Dept);
	}


	@Then("validate the added task category {string} {string} {string}")
	public void validate_the_added_task_category(String CN, String Dept, String CB) throws InterruptedException {
		TO.validate_the_added_task_category(CN,Dept,CB);
	}

	@Then("update the category {string} {string}")
	public void update_the_category(String CN, String Dept) throws InterruptedException {
		TO.update_the_category(CN,Dept);	
	}


	@Then("validate the updated task category {string} {string} {string}")
	public void validate_the_updated_task_category(String CN, String Dept, String CB) throws InterruptedException {
		TO.validate_the_updated_task_category(CN,Dept,CB);
	}

	@Then("Delete the category {string}")
	public void Delete_the_category(String CN) throws InterruptedException {
		TO.Delete_the_category(CN);

	}
}

