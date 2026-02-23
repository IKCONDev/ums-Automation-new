package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Jiraintegration_object extends Baseclass{

	WebDriver driver = Driver.getDriver();
	public Jiraintegration_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Jira Configuration']")
	public WebElement Jiraconfiguration;

	@FindBy(xpath = "//h5[normalize-space()='Configure Jira Integration']")
	public WebElement Jiraconfigurationheader;

	@FindBy(xpath = "//input[@name='jiraEnabled']")
	public WebElement Jiraconfigurationcheckbox;
	
	@FindBy(xpath = "//button[@class='btn btn-primary equal-btn ng-star-inserted']")
	public WebElement Jiraconfigurationsavebtn;


	public void user_validates_the_Jira_integration_page() throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Setup);
		validatetext(Jiraconfiguration, "Jira Configuration");
		Clickelement(Jiraconfiguration);
		validatetext(Jiraconfigurationheader, "Configure Jira Integration");
		Clickelement(Jiraconfigurationcheckbox);
		validatetext(Jiraconfigurationsavebtn, "Save");
		Clickelement(Jiraconfigurationsavebtn);

		Thread.sleep(3000);
		popupvalidate("Jira enabled and configured", "");

	}
}
