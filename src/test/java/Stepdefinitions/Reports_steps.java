package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Reports_object;
import io.cucumber.java.en.Then;

public class Reports_steps {


	WebDriver driver = Driver.getDriver();

	Reports_object RO = new Reports_object(driver);

	@Then("user checks the Meeting Reports page")
	public void user__check_the_Meeting_Reports_page() throws Exception {
		RO.user_check_Meeting_Reports_page();	

	}


	@Then("user checks the Actionitem Reports page")
	public void user__check_the_Actionitem_Reports_page() throws Exception {
		RO.user_check_Actionitem_Reports_page();	

	}

	@Then("user checks the Task Reports page")
	public void user__check_the_Task_Reports_page() throws Exception {
		RO.user_check_Task_Reports_page();	

	}

	@Then("user checks the Risk Reports page")
	public void user__check_the_Risk_Reports_page() throws Exception {
		RO.user_check_Risk_Reports_page();	

	}
}
