package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Actionitem_object;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Actionitem_steps {

	WebDriver driver = Driver.getDriver();

	Actionitem_object AO = new Actionitem_object(driver);

	@When("user navigates to action items page")
	public void user__navigates_the_Actionitemsspage() throws Exception {
		AO.user_navigates_to_Actionitem_page();	
	}

	@Then("user validates the action items page")
	public void user__validates_the_Actionitemsspage() throws Exception {
		AO.user_validates_the_Actionitem_page();	
	}

	@Then("user adds actionitem in action items page {string} {string}")
	public void user__adds_actionitem_in_the_Actionitemsspage(String AT, String AD) throws Exception {
		AO.user_adds_actioinitem_in_Actionitem_page(AT, AD);	
	}

	@Then("user validates the added actionitem in action items page {string}")
	public void user__validate_the_added_actionitem_in_the_Actionitemsspage(String AT) throws Exception {
		AO.user_validate_the_added_actionitem_in_Actionitems_page(AT);	
	}

	@Then("user update the action items page {string}")
	public void user__update_the_Actionitemsspage(String AT) throws Exception {
		AO.user_Update_Actionitem_page(AT);
	}
	@Then("user validates the updated actionitem in action items page {string}")
	public void user__validate_the_updated_actionitem_in_the_Actionitemsspage(String AT) throws Exception {
		AO.user_validate_the_Updated_actionitem_in_Actionitems_page(AT);	
	}


	@Then("user delete the action items page {string}")
	public void user__delete_the_Actionitemsspage(String AT) throws Exception {
		AO.user_delete_Actionitem_page(AT);
	}

	@Then("user create task in action items page {string} {string} {string}")
	public void user__create_task_in_Actionitemsspage(String AT, String TT, String TD) throws Exception {
		AO.user_create_task_in_Actionitem_page(AT, TT,TD);

	}
	
	@Then("user update task in action items page {string} {string} {string}")
	public void user__update_task_in_Actionitemsspage(String AT, String TT, String TD) throws Exception {
		AO. user_update_task_in_Actionitem_page(AT, TT,TD);

	}
	
	@Then("user delete task in action items page {string} {string} {string}")
	public void user__delete_task_in_Actionitemsspage(String AT, String TT, String TD) throws Exception {
		AO. user_delete_task_in_Actionitem_page(AT, TT,TD);

	}
	
	@Then("user click on editcolumn in action items page")
	public void user__click_on_editcolumn_in_Actionitemsspage() throws Exception {
		AO. user_click_editcolumn_in_Actionitem_page();
	}

	@Then("user click on filter in action items page {string}")
	public void user__click_on_filter_in_Actionitemsspage(String AT) throws Exception {
		AO. user_click_filter_in_Actionitem_page(AT);	

	}

	@Then("user navigates to all action items page")
	public void user__navigates_to_All_Actionitemsspage() throws Exception {
		AO. user_navigates__to_All_Actionitem_page();	

	}

	@Then("user navigates to my action items page")
	public void user__navigates_to_My_Actionitemsspage() throws Exception {
		AO. user_navigates__to_My_Actionitem_page();	

	}

	@Then("user navigates to assignedto action items page")
	public void user__navigates_to_Assignedto_Actionitemsspage() throws Exception {
		AO. user_navigates__to_Assignedto_Actionitem_page();	
		
	}
}