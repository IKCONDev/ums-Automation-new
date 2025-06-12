package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;




import Drivemanager.Driver;
import Objectclasses.Login_object;
import Objectclasses.Meeting_object;
//import Objectclasses.on;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Meeting_steps {
	WebDriver driver = Driver.getDriver();

	Meeting_object MO = new Meeting_object(driver);

	@Then("user clicks and validates the meetings page")
	public void user__clicks_the_Meetingspage() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		MO. ValidatingcreateMeetingFields();

	}

	@Then("user enters the meeting details in create meeting {string} {string}")
	public void user__enter_the_details_in_Meetingspage(String MT, String UN) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		MO. Enter_the_details(MT, UN);

	}

	@Then("user enters Actionitems tasks and risks undermeeting {string} {string} {string} {string} {string}")
	public void user__enter_Actionitems_Tasks_Risks_in_Meetingspage(String MT, String AT, String AD, String TT, String TD) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		MO. Creating_Actionitems_Tasks_Risks_Undermeeting(MT,AT,AD,TT,TD);

	}


	//	@And("user validates the create meeting {string} {string}")
	//	public void user__validates_the_create meeting(String MT, String UN) throws Exception {
	//		MO. validate_Create_Meeting(MT, UN);
	//		
	//	}

	//	@Then("user clicks edit column in meetings page")
	//	public void user_clicks_editcolumn_in_Meetingspage() throws Exception {
	//		MO. click_on_edit_column();
	//		
	//	
	//}
	//	@Then("user clicks filter in meetings page {string}")
	//	public void user_clicks_filter_in_Meetingspage(String MID) throws Exception {
	//		MO. click_on_filter_in_meetingspage(MID);
	//}
	//
	//	@Then("user check the meeting details page {string}")
	//	public void user_check_meetingdetails_page(String MT) throws Exception {
	//		MO. check_the_meeting_details_page(MT);



}

