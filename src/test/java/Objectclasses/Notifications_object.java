package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Notifications_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Notifications_object (WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath = "//*[name()='path' and @id='notification-icon']")
	public WebElement Notifications;

	@FindBy(xpath = "//h5[normalize-space()='Notifications']")
	public WebElement Notificationsheader;

	@FindBy(xpath = "//p[normalize-space()='No Unread Notifications !']")
	public WebElement Notificationspage;

	@FindBy(xpath = "//div[@class='modal-header']//div//button[@aria-label='Close']")
	public WebElement crossmark;

	public void validate_the_Notifications_page() throws InterruptedException {

		Clickelement(Notifications);
		Thread.sleep(3000);
	
		validatetext(Notificationsheader, "Notifications");
		Thread.sleep(3000);

		validatetext(Notificationspage, "No Unread Notifications !");
		Thread.sleep(3000);

		Clickelement(crossmark);	
		Thread.sleep(3000);


	}
}
