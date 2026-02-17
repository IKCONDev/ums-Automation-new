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
		RO.user_validates_risk_page();
	}	
	@Then("user add risks page {string} {string}")

	public void user__add_the_riskpage(String RT, String RD) throws Exception {
		RO.user_add_risk_page(RT, RD);	

	}

	@Then("user validate the added risk {string}")

	public void Validate_the_addedRisk(String RT) throws Exception {
		RO.Validate_the_addedRisk(RT);	

	}
	@Then("user update risks page {string} {string}")


	public void user__update_the_riskpage(String RT, String RD) throws Exception {

		RO.user_update_risk_page(RT,RD);	
	}

	@Then("user validate the updated risk in risks page {string} {string}")
	public void user__validate_the_updated_risk_in_riskspage(String RT, String RD) throws Exception {

		RO.user_validate_the_updated_risk_in_Risks_page(RT,RD);	
	}

	@Then("user delete risks page {string}")


	public void user__delete_the_riskpage(String RT) throws Exception {

		RO.user_delete_risk_page(RT);	


	}

	@Then("user checks the risk filters {string}")

	public void user__checks_the_filters_in_riskpage(String RT) throws Exception {
		RO.user_checks_filters_in_risk_page(RT);	

	}

	@Then("user checks the risk details {string} {string}")

	public void user_checks_risk_details(String RT, String RD) throws Exception {
		RO.user_checks_risk_details(RT,RD);	
	}

	@Then("user checks edit columns in risk page")
	public void user_checks_Editcolumn_in_risk_page() throws Exception {
		RO.user_checks_Editcolumn_in_risk_page();	
	}

	@Then("user navigates to all risks page")
	public void user_clicks_Allrisks_in_risk_page() throws Exception {
		RO.user_clicks_on_All_risks_dropdown();	
	}

	@Then("user navigates to my risks page")
	public void user_clicks_Myrisks_in_risk_page() throws Exception {
		RO.user_clicks_on_My_risks_dropdown();	
	}

	@Then("user navigates to Assignedto risks page")
	public void user_clicks_Assignedtorisks_in_risk_page() throws Exception {
		RO.user_clicks_on_Assignedto_risks_dropdown();	
	}
}
