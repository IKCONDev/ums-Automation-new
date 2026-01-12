package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Jiraintegration_object;
import io.cucumber.java.en.Then;

public class Jiraconfiguration_steps {
	
		WebDriver driver = Driver.getDriver();

		Jiraintegration_object JI = new Jiraintegration_object(driver);

		@Then("validate the Jira Integration page")
		public void user_validates_the_Jira_integration_page() throws InterruptedException {
			JI.user_validates_the_Jira_integration_page();
		}


}
