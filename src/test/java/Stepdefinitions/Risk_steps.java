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

}
