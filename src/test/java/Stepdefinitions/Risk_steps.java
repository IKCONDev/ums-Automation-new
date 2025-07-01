package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Actionitem_object;
import Objectclasses.Risk_object;
import io.cucumber.java.en.Then;

public class Risk_steps {

	WebDriver driver = Driver.getDriver();

	Risk_object RO = new Risk_object(driver);

	@Then("user validates risks page")
	public void user__validates_the_riskpage() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.user_validates_risk_page();
	}	
	@Then("user add risks page {string} {string}")

	public void user__add_the_riskpage(String RT, String RD) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.user_add_risk_page(RT, RD);	


	}

	@Then("user validate the added risk {string}")

	public void Validate_the_addedRisk(String RT) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.Validate_the_addedRisk(RT);	


	}
	@Then("user update risks page {string} {string}")


	public void user__update_the_riskpage(String RT, String RD) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.user_update_risk_page(RT,RD);	


	}

	@Then("user delete risks page {string}")


	public void user__delete_the_riskpage(String RT) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.user_delete_risk_page(RT);	


	}

	@Then("user checks the risk filters {string}")

	public void user__checks_the_filters_in_riskpage(String RT) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.user_checks_filters_in_risk_page(RT);	

	}

	@Then("user checks the risk details {string} {string}")

	public void user_checks_risk_details(String RT, String RD) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.user_checks_risk_details(RT,RD);	

	}

	@Then("user checks edit columns in risk page")

	public void user_checks_Editcolumn_in_risk_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		RO.user_checks_Editcolumn_in_risk_page();	
		
	}

}
