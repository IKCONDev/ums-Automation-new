package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Changepassword_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Changepassword_object (WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[@data-target='#profileModal']")
	public WebElement Profile;


	@FindBy(xpath = "//a[@id='changePassword']")
	public WebElement ChangePassword;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Changepassheader;


	@FindBy(xpath = "//input[@id='oldPassword']")
	public WebElement Currentpassplaceholder;


	@FindBy(xpath = "//input[@id='newPassword']")
	public WebElement newpassplaceholder;

	@FindBy(xpath = "//input[@id='confirmPassword']")
	public WebElement confirmnewpassplaceholder;

	@FindBy(xpath = "//div[@class='content-area']//div[@class='row']//div[1]")
	public WebElement Updatebtn;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	public WebElement Cancelbtn;

	public void validate_the_Changepassword_page(String Oldpass, String Newpass, String ConfirmNewpass) throws InterruptedException{
		Clickelement(Profile);
		Clickelement(ChangePassword);
		validatetext(Changepassheader, "Change Password");
		validateattribute(Currentpassplaceholder, "placeholder", "Enter Current Password ");
		sendkeyweb(Currentpassplaceholder, Oldpass);

		validateattribute(newpassplaceholder, "placeholder", "Enter New Password ");

		sendkeyweb(newpassplaceholder, Newpass);


		validateattribute(confirmnewpassplaceholder, "placeholder", "Confirm New Password ");

		sendkeyweb(confirmnewpassplaceholder, ConfirmNewpass);


		validatetext(Updatebtn, "Update");
		Clickelement(Updatebtn);
		validatetext(Cancelbtn, "Cancel");
		Clickelement(Cancelbtn);


	}
}
