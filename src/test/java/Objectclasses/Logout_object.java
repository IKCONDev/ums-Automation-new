package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Logout_object extends Baseclass{
	
	WebDriver driver = Driver.getDriver();
	public Logout_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	
	@FindBy(xpath = "//div[@id='profile-icon']//img[@alt='profile pic']")
	public WebElement Profile;

	@FindBy(xpath = "//button[@id='logoutRef']")
	public WebElement Logout;



	public void user_validating_logout_page() throws InterruptedException {
		Clickelement(Profile);
		Thread.sleep(3000);
		validatetext(Logout, "Logout");
		Thread.sleep(3000);
		Clickelement(Logout);
		Thread.sleep(3000);


	
	}
}
