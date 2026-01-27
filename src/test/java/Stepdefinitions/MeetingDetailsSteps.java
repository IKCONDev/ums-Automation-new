package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import Drivemanager.Driver;
import Objectclasses.MeetingDetailsPage;
import io.cucumber.java.en.*;

public class MeetingDetailsSteps {
	
	WebDriver driver = Driver.getDriver();

	MeetingDetailsPage page = new MeetingDetailsPage(driver);
	@Given("the user navigate to meeting details page")
	public void the_user_navigate_to_meeting_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate the Meeting details page")
	public void validate_the_meeting_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("add action items")
	public void add_action_items() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("add the task from action item")
	public void add_the_task_from_action_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Add the risk")
	public void add_the_risk() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	   
}
