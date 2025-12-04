package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Actionitem_object;
import io.cucumber.java.en.Then;

public class Actionitem_steps {

	WebDriver driver = Driver.getDriver();

	Actionitem_object AO = new Actionitem_object(driver);

	@Then("user checks the action items page {string} {string}")
	public void user__check_the_Actionitemsspage(String AT, String AD) throws Exception {
		AO.user_check_Actionitem_page(AT, AD);	
	}

	@Then("user update the action items page {string}")
	public void user__update_the_Actionitemsspage(String AT) throws Exception {
		AO.user_Update_Actionitem_page(AT);
	}


	@Then("user delete the action items page {string}")
	public void user__delete_the_Actionitemsspage(String AT) throws Exception {
		AO.user_delete_Actionitem_page(AT);
	}
	
	@Then("user create task in action items page {string} {string} {string}")
	public void user__create_task_in_Actionitemsspage(String AT, String TT, String TD) throws Exception {
		AO.user_create_task_in_Actionitem_page(AT, TT,TD);

	}

	@Then("user click on editcolumn in action items page")
	public void user__click_on_editcolumn_in_Actionitemsspage() throws Exception {
		AO. user_click_editcolumn_in_Actionitem_page();
	}
	
	@Then("user click on filter in action items page {string}")
	public void user__click_on_filter_in_Actionitemsspage(String AT) throws Exception {
		AO. user_click_filter_in_Actionitem_page(AT);	

	}
}