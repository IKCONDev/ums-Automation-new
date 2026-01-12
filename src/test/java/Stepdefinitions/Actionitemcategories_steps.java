package Stepdefinitions;
import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Actionitemcategories_object;
import io.cucumber.java.en.Then;

public class Actionitemcategories_steps {

	WebDriver driver = Driver.getDriver();

	Actionitemcategories_object AICO = new Actionitemcategories_object(driver);

	@Then("Validate the actionitem category page")
	public void validate_the_actionitem_category_page() {
		AICO.validate_the_actionitem_category_page();
	}

	@Then("add the actionitem category {string}")
	public void add_the_actionitemcategory(String ACN) throws InterruptedException {
		AICO.add_the_actionitem_category(ACN);
	}

	@Then("validate the added actionitem category {string}")
	public void validate_the_added_actionitemcategory(String ACN) throws InterruptedException {
		AICO.validate_the_added_actionitem_category(ACN);
	}

	@Then("update the actionitem category {string}")
	public void update_the__actionitemcategory(String ACN) throws InterruptedException {
		AICO.update_the_actionitem_category(ACN);
	}

	@Then("validate the updated actionitem category {string}")
	public void validate_the_updated_actionitem_category(String ACN) throws InterruptedException {
		AICO.validate_the_updated_actionitem_category(ACN);
	}

	@Then("Delete the actionitem category {string}")
	public void Delete_the_actionitem_category(String ACN) throws InterruptedException {
		AICO.Delete_the_actionitem_category(ACN);
		
	}
}
