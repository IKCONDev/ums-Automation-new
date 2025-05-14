package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Meeting_object;
import Objectclasses.dashboard_object;
import io.cucumber.java.en.Then;

public class dashboard_steps {
	
	WebDriver driver = Driver.getDriver();

	dashboard_object DO = new dashboard_object(driver);

	@Then("user clicks the dashboard page")
	public void user__clicks_the_dashboardpage() throws Exception {
		DO.user_check_dashboard_page();

	}

}
