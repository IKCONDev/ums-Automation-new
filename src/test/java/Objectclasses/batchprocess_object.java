package Objectclasses;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class batchprocess_object  extends Baseclass{

	WebDriver driver = Driver.getDriver();
	public batchprocess_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath="//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath="//a[normalize-space()='Batch Process Time']")
	public WebElement Batchprocesstime;

	@FindBy(xpath="//div[@id='modalHeader']/h5[@class='modal-title']")
	public WebElement Batch_Process_Time;

	@FindBy(xpath="//label[normalize-space()='Choose Integrated Meeting Tool']")
	public WebElement Choosetool;

	@FindBy(xpath="//div[@class='ng-select-container ng-has-value']//span[@class='ng-arrow-wrapper']")
	public WebElement Meetingtoolselectdrpdwn;

	@FindBy(xpath="//span[normalize-space()='Microsoft Teams']")
	public WebElement Microsoftteams;

	@FindBy(xpath="//span[normalize-space()='Zoom']")
	public WebElement Zoom;

	@FindBy(xpath="//span[normalize-space()='Cisco Webex']")
	public WebElement Webex;

	@FindBy(xpath="//span[normalize-space()='Google Meet']")
	public WebElement Googlemeet;

	@FindBy(xpath="//label[normalize-space()='Choose Time']")
	public WebElement Choose_Time;

	@FindBy(xpath="//select[@id='batchMinute']")
	public WebElement  timesetup;

	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Savebtn;


	@FindBy(xpath="//button[@id='closeUpdateModal']")
	public WebElement Cancel;
	public void Validate_the_Batch_process_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Clickelement(Setup);
		Clickelement(Batchprocesstime);

		validatetext(Batch_Process_Time,"Batch Process Time");
		validatetext(Choosetool, "Choose Integrated Meeting Tool");
		Clickelement(Meetingtoolselectdrpdwn);

		Clickelement(Microsoftteams);
		validatetext(Microsoftteams, "Microsoft Teams");
		validatetext(Choose_Time,"Choose Time");
		Selectdropdown(timesetup,"25");
		validatetext(Savebtn, "Save");
		validatetext(Cancel, "Cancel");
		Clickelement(Savebtn);
		Thread.sleep(3000);

		Clickelement(Batchprocesstime);

		validatetext(Batch_Process_Time,"Batch Process Time");
		validatetext(Choosetool, "Choose Integrated Meeting Tool");
		Clickelement(Meetingtoolselectdrpdwn);

		Clickelement(Zoom);
		validatetext(Zoom, "Zoom");

		validatetext(Choose_Time,"Choose Time");
		Thread.sleep(3000);

		Selectdropdown(timesetup,"25");
		Thread.sleep(3000);

		validatetext(Savebtn, "Save");
		validatetext(Cancel, "Cancel");
		Clickelement(Savebtn);

		Thread.sleep(3000);

		Clickelement(Batchprocesstime);

		validatetext(Batch_Process_Time,"Batch Process Time");
		validatetext(Choosetool, "Choose Integrated Meeting Tool");
		Clickelement(Meetingtoolselectdrpdwn);

		Clickelement(Webex);
		validatetext(Webex, "Cisco Webex");

		validatetext(Choose_Time,"Choose Time");
		Thread.sleep(3000);
		Selectdropdown(timesetup,"25");
		Thread.sleep(3000);

		validatetext(Savebtn, "Save");
		validatetext(Cancel, "Cancel");
		Clickelement(Savebtn);

		Thread.sleep(3000);

		Clickelement(Batchprocesstime);

		validatetext(Batch_Process_Time,"Batch Process Time");
		validatetext(Choosetool, "Choose Integrated Meeting Tool");
		Clickelement(Meetingtoolselectdrpdwn);

		Clickelement(Googlemeet);
		validatetext(Googlemeet, "Google Meet");
		validatetext(Choose_Time,"Choose Time");
		Thread.sleep(3000);

		Selectdropdown(timesetup,"25");
		Thread.sleep(3000);

		validatetext(Savebtn, "Save");
		validatetext(Cancel, "Cancel");
		Clickelement(Savebtn);


	}
}
//System.out.println(vc.findElement(By.xpath("//div[@id='modalHeader']/h5[@class='modal-title']")).getText().equals("Batch Process Time") 
//? "Batch process title is matched" 
//: "Batch process title is not matched");


