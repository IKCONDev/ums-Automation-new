package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.integration_object;
import io.cucumber.java.en.Then;

public class Integrationn_steps {

	WebDriver driver = Driver.getDriver();

	integration_object IO = new integration_object(driver);

	@Then("Validate the Integration page")
	public void Validate_the_integration_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.validate_the_Meeting_tools_integration_page();

	}

	@Then("Configure the Microsoft teams in teams tool Integration page {string} {string} {string}")
	public void Configure_the_Microsoft_teams_in_tool_integration_page(String MSTenantID, String MSClientID, String MSClientsecret) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.Configure_the_Microsoft_teams_in_tool_integration_page(MSTenantID,MSClientID,MSClientsecret);
	}
	
	@Then("Configure the Googlemeet in tool Integration page {string} {string} {string}")
	public void Configure_the_Google_meet_in_tool_integration_page(String GmeetClientID, String GmeetClientsecret, String GmeetRefreshtoken) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.Configure_the_Google_meet_in_tool_integration_page(GmeetClientID,GmeetClientsecret,GmeetRefreshtoken);
	}
	
	@Then("Configure the Zoom in tool Integration page {string} {string} {string}")
	public void Configure_the_zoom_in_tool_integration_page(String ZoomAccountID, String ZoomClientID, String ZoomClientsecret) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.Configure_the_zoom_in_tool_integration_page(ZoomAccountID,ZoomClientID,ZoomClientsecret);
	}
	
	@Then("Configure the webex in tool Integration page {string} {string} {string} {string} {string}")
	public void Configure_the_webex_in_tool_integration_page(String WebexClientID, String WebexClientSecret, String Webextoken, String WebexRefreshtoken, String webexrefreshtokenexpire) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		IO.Configure_the_webex_in_tool_integration_page(WebexClientID,WebexClientSecret,Webextoken,WebexRefreshtoken,webexrefreshtokenexpire);
	}
}
