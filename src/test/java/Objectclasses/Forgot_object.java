package Objectclasses;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;


public class Forgot_object extends Baseclass  {


	WebDriver driver = Driver.getDriver();
	Dateformatter D=new Dateformatter();

	public Forgot_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	
	@FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
	public WebElement Forgotpassword;

	@FindBy(xpath = "//label[@id='loginHeading']")
	public WebElement Forgotpasswordheading;

	@FindBy(xpath = "(//label[normalize-space()=\"No worries, we'll send you reset instruction.\"])[1]")
	public WebElement Resetmsg;

	@FindBy(xpath = "//button[normalize-space()='Get OTP']")
	public WebElement GetOTPbtn;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailid;

	@FindBy(xpath = "//label[@id='loginHeading']")
	public WebElement checkyouremail;

	@FindBy(xpath = "//input[@id='otp']")
	public WebElement EnterOTP;

	@FindBy(xpath = "//label[contains(text(),'We have sent an OTP for email verification and pas')]")
	public WebElement emailmsg;

	@FindBy(xpath = "//label[@id='emailLabel']")
	public WebElement enterotptext;

	@FindBy(xpath = "//a[@id='resendOtpLink']")
	public WebElement resendotptext;

	@FindBy(xpath = "//button[normalize-space()='Verify']")
	public WebElement Verifybtn;

	@FindBy(xpath = "//label[@id='passwordHeading']")
	public WebElement Setnewpasswordheading;

	@FindBy(xpath = "//input[@id='newPassword']")
	public WebElement Newpassword;

	@FindBy(xpath = "//input[@id='confirmPassword']")
	public WebElement Confirmpassword;

	@FindBy(xpath = "//button[normalize-space()='Reset Password']")
	public WebElement Resetpassword;

	public void validate_the_Forgotpassword_page() throws InterruptedException {
		Thread.sleep(3000);
		validatetext(Forgotpassword, "Forgot Password?");
		Clickelement(Forgotpassword);
		validatetext(Forgotpasswordheading, "Forgot Password?");
		validatetext(Resetmsg, "No worries, we'll send you reset instruction.");
		validatetext(GetOTPbtn, "Get OTP");
		validateattribute(emailid, "placeholder", "Email ID");
		Thread.sleep(3000);
		sendkeyweb(emailid, "praveenreddy.g@ikcontech.com" + " ");
		Thread.sleep(8000);

		Clickelement(GetOTPbtn);
		Thread.sleep(3000);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter OTP received: ");
		String otp = scanner.next();

		sendkeyweb(EnterOTP, otp);

		Thread.sleep(3000);
		Clickelement(Verifybtn);

		validatetext(checkyouremail, "Check your email");
		validatetext(emailmsg, "We have sent an OTP for email verification and password reset.");
		validatetext(enterotptext, "Enter OTP");
		validatetext(resendotptext, "Resend OTP");
		validateattribute(EnterOTP, "placeholder", "Enter OTP");

		//		Thread.sleep(3000);
		//		Clickelement(Verifybtn);   

		scanner.close();
		Thread.sleep(3000);
		validateattribute(Newpassword, "placeholder", "New Password");
		Thread.sleep(3000);

		sendkeyweb(Newpassword, "Test@1234567");
		Thread.sleep(3000);


		validateattribute(Confirmpassword, "placeholder", "Confirm Password");
		Thread.sleep(3000);

		sendkeyweb(Confirmpassword, "Test@1234567");
		Thread.sleep(3000);


		Clickelement(Resetpassword);
	}
}
