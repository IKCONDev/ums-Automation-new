package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Login_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Login_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	@FindBy(xpath = "//label[@id='loginHeading']")
	public WebElement logintxtval;


	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailidplaceholdertxtval;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordplaceholdertxtval;

	@FindBy(xpath = "//button[@id='loginButton']")
	public WebElement loginbuttontxtval;

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	public WebElement forgotpasstxtval;

	public void user_validating_login_page() throws InterruptedException {
		validatetext(logintxtval, "Login to UMS");
		validateattribute(emailidplaceholdertxtval, "placeholder", "Email ID");
		validateattribute(passwordplaceholdertxtval, "placeholder", "Password");
		validatetext(loginbuttontxtval, "Login");
		validatetext(forgotpasstxtval, "Forgot Password?");

	}
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailidtextbox;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordtextbox;

	@FindBy(xpath = "//button[@id='loginButton']")
	public WebElement loginbuttonclick;


	public void user_clicks_login_page(String Username,String Password ) throws InterruptedException {
		sendkeyweb(emailidtextbox, Username);
		sendkeyweb(passwordtextbox, Password);
		Clickelement(loginbuttonclick);
		Thread.sleep(3000);

	}

}
