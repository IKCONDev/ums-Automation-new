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

	@FindBy(xpath = "//select[@id='jiraConfig']")
	public WebElement Jiraconfigurationdrpdwn;

	@FindBy(xpath = "//div[@id='Jira-Modal']//button[@type='button'][normalize-space()='Update']")
	public WebElement Jiraconfigurationupdatebtn;

	@FindBy(xpath = "//button[@id='jiraModalClose']")
	public WebElement Jiraconfigurationcancelbtn;

	public void user_validates_the_Jira_integration_page() throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Setup);
		validatetext(Jiraconfiguration, "Jira Configuration");
		Clickelement(Jiraconfiguration);
		validatetext(Jiraconfigurationheader, "Configure Jira Integration");

		validatetext(Jiraconfigurationupdatebtn, "Update");
		validatetext(Jiraconfigurationcancelbtn, "Cancel");
		Selectdropdown(Jiraconfigurationdrpdwn, "NO");
		Clickelement(Jiraconfigurationupdatebtn);

		Thread.sleep(3000);

	}
}
