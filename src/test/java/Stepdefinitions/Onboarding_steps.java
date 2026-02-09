package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Onboarding_object;
import io.cucumber.java.en.Then;

public class Onboarding_steps {
	

		WebDriver driver = Driver.getDriver();

		Onboarding_object ON = new Onboarding_object(driver);

		@Then("Validate the Onboarding page {string} {string} {string} {string} {string} {string}")
		public void validate_the_actionitem_category_page(String url, String email,String Mobile, String Fullname, String Password, String ConfirmPassword) throws InterruptedException {
			driver.get(url);	
			driver.manage().window().maximize();
			ON.validate_the_Onboarding_page(email, Mobile, Fullname, Password, ConfirmPassword);
		}


}
