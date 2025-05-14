package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Companydetails_object;
import io.cucumber.java.en.Then;


public class Company_details {

	WebDriver driver = Driver.getDriver();

	Companydetails_object CO = new Companydetails_object(driver);
		
		@Then("validate the company details page")
		public void validate_the_company_details_page() {
			CO.validate_the_company_details_page();
		}
		

		@Then("add the company details")
		public void add_the_company_details() throws InterruptedException {
			CO.add_the_company_details();

		}

		@Then("update the company details")
		public void update_the_company_details() throws InterruptedException {
			add_the_company_details();
		}
}



