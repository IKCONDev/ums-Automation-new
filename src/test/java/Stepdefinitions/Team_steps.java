//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Team_object;
//import Objectclasses.department_object;
//import io.cucumber.java.en.Then;
//
//public class Team_steps {
//
//
//
//	WebDriver driver = Driver.getDriver();
//
//	Team_object TO = new Team_object(driver);
//
//	@Then("user checks the teams page {string} {string}")
//	public void user_check_the_teams_page(String str1, String str2) throws Exception {
//		TO.user_check_Team_page(str1, str2);
//
//		
//	}
//	
//	@Then("user delete the teams page {string}")
//	public void user_delete_the_teams_page(String str) throws Exception {
//		TO.user_delete_Team_page(str);
//
//		
//	}
//
//}
//package Stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import Drivemanager.Driver;
//import Objectclasses.Menuitems_object;
//import Objectclasses.designation_object;
//import io.cucumber.java.en.Then;
//
//public class designation_steps {
//	
//		
//		WebDriver driver = Driver.getDriver();
//		
//		designation_object DO = new designation_object(driver);
//		
//		@Then("user checks the designation page {string}")
//		public void user_check_the_designation_page(String str1) throws Exception {
//		DO.user_check_the_designation_page(str1);
//
//
//}
//		
//		@Then("user delete the designation page {string}")
//		public void user_delete_the_designation_page(String str2) throws Exception {
//		DO.user_delete_the_designation_page(str2);
//		
//}
//}

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
	@Then("add the team {string}")
	public void add_the_designation(String Team) throws InterruptedException {
		TO.Add_the_Team(Team);
	}
	@Then("validate the added team {string}")
	public void validate_the_added_team(String Team) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TO.validate_the_Team(Team);
	}
	@Then("update the team {string}")
	public void update_the_team(String Team) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TO.Update_the_Team(Team);
	}
	
	@Then("validate the updated team {string}")
	public void validate_the_Updated_Team(String Team) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TO.Update_the_Team(Team);
	}

	@Then("delete the team {string}")
	public void delete_the_team(String Team) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TO.Delete_the_Team(Team);	
		
}

}


