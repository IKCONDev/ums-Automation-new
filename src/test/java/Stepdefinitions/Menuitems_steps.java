//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Menuitems_object;
//import Objectclasses.Permission_object;
//import io.cucumber.java.en.Then;
//
//public class Menuitems_steps {	
//		
//		WebDriver driver = Driver.getDriver();
//		
//		Menuitems_object MO = new Menuitems_object(driver);
//		
//		@Then("user checks the menuitems page {string} {string} {string}")
//		public void user__check_the_menuitems_page(String str1, String str2, String str3) throws Exception {
//		MO.user_check_the_Menuitems_page(str1, str2, str3);
//
//}
//		
//		@Then("user delete the menuitems page {string}")
//		public void user_delete_the_Menuitems_page(String str) throws Exception {
//		MO.user_delete_the_Menuitems_page(str);		
//		
//}
//}


package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Menuitems_object;
import Objectclasses.Permission_object;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Menuitems_steps {	

	WebDriver driver = Driver.getDriver();

	Menuitems_object MO = new Menuitems_object(driver);
	@Then("Validate the menu items page")
	public void validate_the_menu_items_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MO.validate_the_menu_items_page();
	}
	@And("Add menu items {string}")
	public void Add_menu_items(String s1) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MO.Add_menu_items(s1);
	}
	@Then("validate the added menu items {string}")
	public void validate_the_added_menu_items(String s1) throws InterruptedException {
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MO.validate_the_added_menu_items(s1);
	}
	@Then("Update the menu item {string}")
	public void Update_the_menu_item(String s1) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MO.Update_the_menu_item(s1);
	}
	@Then("validate the updated menu items {string}")
	public void validate_the_updated_menu_items(String s1) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MO.validate_the_updated_menu_items(s1);
	}
	@Then("Delete the Menu item {string}")
	public void Delete_the_Menu_item(String s1) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MO.Delete_the_Menu_item(s1);
		
	}
}
