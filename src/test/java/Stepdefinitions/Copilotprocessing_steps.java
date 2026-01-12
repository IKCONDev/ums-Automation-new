package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Copilotprocessing_object;
import io.cucumber.java.en.Then;

public class Copilotprocessing_steps {


	WebDriver driver = Driver.getDriver();

	Copilotprocessing_object CPO = new Copilotprocessing_object(driver);

	@Then("validate the copilot processing page")
	public void user_validates_the_Copilot_Processing_page() throws InterruptedException {
		CPO.user_validates_the_Copilot_Processing_page();
	}

}
