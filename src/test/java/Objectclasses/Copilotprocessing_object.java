package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Copilotprocessing_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Copilotprocessing_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Copilot Processing']")
	public WebElement CopilotProcessing;

	@FindBy(xpath = "//h5[normalize-space()='Configure Copilot to Parse Transcript']")
	public WebElement Copilotheadertxt;

	@FindBy(xpath = "//div[@id='Copilot-Modal']//label[1]")
	public WebElement transcript;

	@FindBy(xpath = "//strong[normalize-space()='Automatic Processing On']")
	public WebElement Processing;

	@FindBy(xpath = "//p[contains(text(),'Copilot automatically processes transcripts for al')]")
	public WebElement Processingtxt;

	@FindBy(xpath = "//div[@id='Copilot-Modal']//button[@type='button'][normalize-space()='Update']")
	public WebElement Updatebtn;

	@FindBy(xpath = "//button[@id='UpdateModal']")
	public WebElement Cancelbtn;

	@FindBy(xpath = "//ng-select[@id='batchtime']//span[@class='ng-arrow-wrapper']")
	public WebElement copilotdropdown;

	@FindBy(xpath = "//span[normalize-space()='NO']")
	public WebElement copilotselect;

	public void user_validates_the_Copilot_Processing_page() throws InterruptedException {
		Clickelement(Setup);
		validatetext(CopilotProcessing, "Copilot Processing");
		Clickelement(CopilotProcessing);
		validatetext(Copilotheadertxt, "Configure Copilot to Parse Transcript");
		validatetext(transcript, "Choose option to process Transcript");
		validatetext(Processing, "Automatic Processing On");
		validatetext(Processingtxt, "Copilot automatically processes transcripts for all meetings and generates the outcomes. No manual action required");
		validatetext(Updatebtn, "Update");
		validatetext(Cancelbtn, "Cancel");
		Clickelement(copilotdropdown);
		Clickelement(copilotselect);
		Clickelement(Updatebtn);
	}
}
