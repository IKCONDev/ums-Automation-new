
package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Login_object;
import Objectclasses.Riskcategories_object;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Riskcategories_steps {

	WebDriver driver = Driver.getDriver();

	Riskcategories_object RO = new Riskcategories_object(driver);

	@Then("Validate the risk category page")
	public void validate_the_risk_category_page() throws InterruptedException {
		RO.validate_the_risk_category_page();
	
	}

	@Then("Add the Riskcategory {string}")
	public void add_the_riskcategory(String s1) throws InterruptedException {
		RO.add_the_riskcategory(s1);

	}

	@Then("Validate the added risk category {string}")
	public void validate_the_added_risk_category(String s1) throws InterruptedException {
		RO.validate_the_added_risk_category(s1);
	}

	@Then("Update the risk cateory {string}")
	public void update_the_risk_cateory(String s1) throws InterruptedException {
		RO.update_the_risk_cateory(s1);
	}

	@Then("Validate the updated risk category {string}")
	public void validate_the_updated_risk_category(String s1) throws InterruptedException {
		RO.validate_the_updated_risk_category(s1);
	}

	@Then("Delete the Risk categories {string}")
	public void delete_the_risk_categories(String s1) throws InterruptedException {
		RO.delete_the_risk_categories(s1);
		
	}
}

