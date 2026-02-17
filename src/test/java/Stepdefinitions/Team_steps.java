
package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Team_object;
import Objectclasses.department_object;
import io.cucumber.java.en.Then;

public class Team_steps {



	WebDriver driver = Driver.getDriver();

	Team_object TO = new Team_object(driver);
	@Then("validate the teams page")
	public void validate_the_teams_page() throws InterruptedException {
		TO.Validate_Teams_page();

	}
	@Then("add the team {string} {string} {string} {string}")
	public void add_the_designation(String Team, String Teamlead, String Teamhead, String Teamdept) throws InterruptedException {
		TO.Add_the_Team(Team,Teamdept,Teamhead, Teamlead);
	}
	@Then("validate the added team {string}")
	public void validate_the_added_team(String Team) throws InterruptedException {
		TO.validate_the_Team(Team);
	}
	@Then("update the team {string}")
	public void update_the_team(String Team) throws InterruptedException {
		TO.Update_the_Team(Team);
	}

	@Then("validate the updated team {string}")
	public void validate_the_Updated_Team(String Team) throws InterruptedException {
		TO.Update_the_Team(Team);
	}

	@Then("delete the team {string}")
	public void delete_the_team(String Team) throws InterruptedException {
		TO.Delete_the_Team(Team);		
	}

}


