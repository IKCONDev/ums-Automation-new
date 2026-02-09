package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Onboarding_object extends Baseclass{
	

		WebDriver driver = Driver.getDriver();
		public Onboarding_object (WebDriver RC) {
			driver = RC;
			PageFactory.initElements(RC, this);
		}
		
		@FindBy(xpath = "//a[normalize-space()='Register']")
		public WebElement Register;

		@FindBy(xpath = "//div[@class='loginMsg']")
		public WebElement Registerheader;
		
		@FindBy(xpath = "//input[@id='email']")
		public WebElement Emailid;
		
		@FindBy(xpath = "//span[@class='get-otp']")
		public WebElement SendOTP;
		
		@FindBy(xpath = "//h5[@id='exampleModalLabel']")
		public WebElement Emailtxt;
		
		@FindBy(xpath = "//p[normalize-space()='Enter the OTP to validate the email']")
		public WebElement OTPtxt;
		
		@FindBy(xpath = "//p[normalize-space()='Resend OTP']")
		public WebElement ResendOTPtxt;
		
		@FindBy(xpath = "//input[@placeholder='Enter your OTP']")
		public WebElement EnterOTP;
		
		@FindBy(xpath = "//button[normalize-space()='Verify']")
		public WebElement Verifybtn;
		
		@FindBy(xpath = "//input[@placeholder='Mobile Number']")
		public WebElement Mobilenumber;
		
		@FindBy(xpath = "//input[@id='name']")
		public WebElement name;
		
		@FindBy(xpath = "//select[@id='gender']")
		public WebElement Genderdrpdwn;
		
		@FindBy(xpath = "//input[@placeholder='Password']")
		public WebElement Pass;
		
		@FindBy(xpath = "//input[@placeholder='Confirm Password']")
		public WebElement ConfirmPass;
		
		@FindBy(xpath = "//button[normalize-space()='Register']")
		public WebElement Registerbtn;

		public void validate_the_Onboarding_page(String email, String Mobile, String Fullname, String Password, String ConfirmPassword) throws InterruptedException {

			Clickelement(Register);
			validatetext(Registerheader, "Register using official email ID");
			
			sendkeyweb(Emailid, email);
			
			Clickelement(SendOTP);
			
			validatetext(Emailtxt, "Email Verification");
			validatetext(OTPtxt, "Enter the OTP to validate the email");
			validatetext(ResendOTPtxt, "Resend OTP");
			validateattribute(EnterOTP, "placeholder", "Enter your OTP");
			sendkeyweb(EnterOTP, "457656");
			
			validatetext(Verifybtn, "Verify");
			Clickelement(Verifybtn);
			validateattribute(Mobilenumber, "placeholder", "Mobile Number");
			sendkeyweb(Mobilenumber, Mobile);
			validateattribute(name, "placeholder", "Full Name");
			sendkeyweb(name, Fullname);
			
			Selectdropdown(Genderdrpdwn, "Male");
			validateattribute(Pass, "placeholder", "Password");
			sendkeyweb(Pass, Password);
			validateattribute(ConfirmPass, "placeholder", "Confirm Password");
			sendkeyweb(ConfirmPass, ConfirmPassword);
			Clickelement(Registerbtn);
		
		}
}
