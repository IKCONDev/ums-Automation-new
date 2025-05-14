package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Helpcenter_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Helpcenter_object (WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Help Center']")
	public WebElement Helpcenter;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Helpcenterheader;

	@FindBy(xpath = "//b[normalize-space()='FAQs']")
	public WebElement Faqs;

	@FindBy(xpath = "//div[contains(text(),'1. How to send MOM Email directly for the created ')]")
	public WebElement Faq1;

	@FindBy(xpath = "//div[contains(text(),'2. How to view action items related to a particula')]")
	public WebElement Faq2;

	@FindBy(xpath = "//div[contains(text(),'3. How to submit an action item and view it in the')]")
	public WebElement Faq3;

	@FindBy(xpath = "//div[contains(text(),'4. How to create a meeting entry into UMS for an o')]")
	public WebElement Faq4;

	@FindBy(xpath = "//div[contains(text(),'5. How to delete multiple tasks?')]")
	public WebElement Faq5;

	@FindBy(xpath = "//div[contains(text(),'6. How to add a filter for meeting and task data?')]")
	public WebElement Faq6;

	@FindBy(xpath = "//div[contains(text(),'7. How to view reports on a weekly or monthly basi')]")
	public WebElement Faq7;

	@FindBy(xpath = "//div[contains(text(),'8. How to add designation in UMS application?')]")
	public WebElement Faq8;

	@FindBy(xpath = "(//div[contains(text(),\"9. How to switch to reportee's account in Lead/dep\")])[1]")
	public WebElement Faq9;

	@FindBy(xpath = "//div[contains(text(),'10. How to add reportees under a user?')]")
	public WebElement Faq10;

	@FindBy(xpath = "//div[contains(text(),'11. How to add role in UMS application?')]")
	public WebElement Faq11;

	@FindBy(xpath = "//div[contains(text(),'12. How to add department in UMS application?')]")
	public WebElement Faq12;

	@FindBy(xpath = "//div[contains(text(),'13. Difference between organized meeting and Atten')]")
	public WebElement Faq13;

	@FindBy(xpath = "//div[contains(text(),'14. How to view tasks related to a particular acti')]")
	public WebElement Faq14;

	@FindBy(xpath = "//div[contains(text(),'15. How to add a task for an action item?')]")
	public WebElement Faq15;

	public void validate_the_Helpcenter_page() throws InterruptedException {
		Clickelement(Helpcenter);
		validatetext(Helpcenterheader, "Help Center");
		validatetext(Faqs, "FAQs");
		validatetext(Faq1, "How to send MOM Email directly for the created meeting?");
		Clickelement(Faq1);
		validatetext(Faq2, "How to view action items related to a particular meeting?");
		Clickelement(Faq2);
		validatetext(Faq3, "How to submit an action item and view it in the action items page before adding tasks to it?");
		Clickelement(Faq3);
		validatetext(Faq4, "How to create a meeting entry into UMS for an offline meeting?");
		Clickelement(Faq4);
		validatetext(Faq5, "How to delete multiple tasks?");
		Clickelement(Faq5);
		validatetext(Faq6, "How to add a filter for meeting and task data?");
		Clickelement(Faq6);
		validatetext(Faq7, "How to view reports on a weekly or monthly basis?");
		Clickelement(Faq7);
		validatetext(Faq8, "How to add designation in UMS application?");
		Clickelement(Faq8);
		validatetext(Faq9, "How to switch to reportee's account in Lead/department head account?");
		Clickelement(Faq9);
		validatetext(Faq10, "How to add reportees under a user?");
		Clickelement(Faq10);
		validatetext(Faq11, "How to add role in UMS application?");
		Clickelement(Faq11);
		validatetext(Faq12, "How to add department in UMS application?");
		Clickelement(Faq12);
		validatetext(Faq13, "Difference between organized meeting and Attended meetings?");
		Clickelement(Faq13);
		validatetext(Faq14, "How to view tasks related to a particular action item?");
		Clickelement(Faq14);
		validatetext(Faq15, "How to add a task for an action item?");
		Clickelement(Faq15);
	}

}
