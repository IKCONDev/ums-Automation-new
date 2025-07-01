package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Meeting_object;
import Objectclasses.dashboard_object;
import io.cucumber.java.en.Then;

public class dashboard_steps {

	WebDriver driver = Driver.getDriver();

	dashboard_object DO = new dashboard_object(driver);

	@Then("user checks the My dashboard page")
	public void user__checks_the_Mydashboardpage() throws Exception {
		DO.My_Dashboard();
	}

	@Then("user checks the Team Dashboard page")
	public void user__checks_the_Teamdashboardpage() throws Exception {
		DO.Team_Dashboard();
	}

	@Then("user checks the Department Dashboard page")
	public void user__checks_the_Departmentdashboardpage() throws Exception {
		DO.Department_Dashboard();
	}

	@Then("user checks the Exective Dashboard page")
	public void user__checks_the_Executivedashboardpage() throws Exception {
		DO.Executive_Dashboard();

	}
}
