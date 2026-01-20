package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Changepassword_object;
import io.cucumber.java.en.Then;

public class Changepassword_steps {

	WebDriver driver = Driver.getDriver();

	Changepassword_object  CO = new Changepassword_object (driver);

	@Then("Validate the Change Password page {string} {string} {string}")
	public void Validate_the_Changepassword_page(String Oldpass, String Newpass, String ConfirmNewpass) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		CO.validate_the_Changepassword_page(Oldpass,Newpass, ConfirmNewpass);

	}

}


