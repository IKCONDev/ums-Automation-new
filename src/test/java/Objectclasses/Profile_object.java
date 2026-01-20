package Objectclasses;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class Profile_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Profile_object (WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath = "//div[@data-target='#profileModal']")
	public WebElement Profile;

	@FindBy(xpath = "(//h5[@class='font-weight-bold'][normalize-space()='Profile'])[1]")
	public WebElement Profiletext;

	@FindBy(xpath = "//button[@id='profileButton']")
	public WebElement MyProfile;

//	@FindBy(xpath = "//div[@class='icon']//div[@id='profileModal']//div[@role='document']//div[@class='modal-content']//div//div[@class='modal-body']//div[@class='ng-star-inserted']//div//p[@id='userid']")
//	public WebElement employeeid;
//
//	@FindBy(xpath = "//div[@class='icon']//div[@id='profileModal']//div[@role='document']//div[@class='modal-content']//div//div[@class='modal-body']//div[@class='ng-star-inserted']//div//p[@id='fullname']")
//	public WebElement actname;
//
//	@FindBy(xpath = "//div[@class='icon']//div[@id='profileModal']//div[@role='document']//div[@class='modal-content']//div//div[@class='modal-body']//div[@class='ng-star-inserted']//div//p[@id='username']")
//	public WebElement actmailid;
//
//	@FindBy(xpath = "//div[@class='icon']//div[@id='profileModal']//div[@role='document']//div[@class='modal-content']//div//div[@class='modal-body']//div[@class='ng-star-inserted']//div//p[@id='designation']")
//	public WebElement designation;

//	@FindBy(xpath = "//button[@id='logoutRef']")
//	public WebElement logout;
//
//	@FindBy(xpath = "(//p[contains(text(),'Role')])[1]")
//	public WebElement Roletext;
//
//	@FindBy(xpath = "(//p[contains(text(),'CEO')])[1]")
//	public WebElement CEOtext;

//	@FindBy(xpath = "(//p[contains(text(),'Department')])[1]")
//	public WebElement Departmenttext;
//
//	@FindBy(xpath = "(//p[contains(text(),'Information Technology')])[1]")
//	public WebElement Informationtechnologytext;
//
//	@FindBy(xpath = "(//p[contains(text(),'Reporting Manager')])[1]")
//	public WebElement Reportingmanagertext;
//
//	@FindBy(xpath = "//p[normalize-space()='NA']")
//	public WebElement NAtext;
//
//	@FindBy(xpath = "//p[normalize-space()='Two Factor Authentication']")
//	public WebElement Twofactortext;
//
//	@FindBy(xpath = "//div[@class='prof-name']")
//	public WebElement profilename;

//	@FindBy(xpath = "//div[@class='prof-mail']")
//	public WebElement profilemail;
//
//	@FindBy(xpath = "//label[normalize-space()='Full Name']")
//	public WebElement Fullname;
//
//	@FindBy(xpath = "//label[@for='firstName'][contains(text(),'Ums')]")
//	public WebElement Fullnametext;
//
//	@FindBy(xpath = "//label[normalize-space()='Display Name']")
//	public WebElement Displayname;
//
//	@FindBy(xpath = "//label[@for='DisplayName']")
//	public WebElement Displaynametext;
//
//	@FindBy(xpath = "//label[normalize-space()='Gender']")
//	public WebElement Gender;
//
//	@FindBy(xpath = "//label[normalize-space()='Male']")
//	public WebElement Male;

//	@FindBy(xpath = "//label[normalize-space()='Date of Joining']")
//	public WebElement DOJ;
//
//	@FindBy(xpath = "//label[normalize-space()='Jun 5, 2024']")
//	public WebElement DOJtext;
//
//	@FindBy(xpath = "//label[normalize-space()='Role']")
//	public WebElement Role;
//
//	@FindBy(xpath = "//label[normalize-space()='CEO']")
//	public WebElement Roletxt;

//	@FindBy(xpath = "//label[normalize-space()='Designation']")
//	public WebElement Designation;
//
//	@FindBy(xpath = "//label[normalize-space()='Chief Executive Officer']")
//	public WebElement Designationtxt;
//
//	@FindBy(xpath = "//label[normalize-space()='Department']")
//	public WebElement Department;
//
//	@FindBy(xpath = "//label[normalize-space()='Information Technology']")
//	public WebElement Departmenttxt;
//
//	@FindBy(xpath = "//label[normalize-space()='Reporting Manager']")
//	public WebElement Reportingmanager;
//
//	@FindBy(xpath = "//label[normalize-space()='Team']")
//	public WebElement Team;
//
//	@FindBy(xpath = "//label[normalize-space()='Help Desk']")
//	public WebElement Teamtxt;

	@FindBy(xpath = "(//*[name()='svg'][@id='profile-icon'])[12]")
	public WebElement profilepic;




	public void validate_the_Profile_page() throws InterruptedException, AWTException {
		Clickelement(Profile);
//		validatetext(Profiletext, "Profile");
//		validatetext(MyProfile, "My Profile");
//		validatetext(employeeid, "Employee ID: UMS02");
//		validatetext(actname, "Ums Support");
//		validatetext(actmailid, "ums-support@ikcontech.com");
//
//		validatetext(designation, "Chief Executive Officer");
//		validatetext(logout, "Logout");
//		validatetext(Roletext, "Role");
//		validatetext(CEOtext, "CEO");
//		validatetext(Departmenttext, "Department");
//
//		validatetext(Informationtechnologytext, "Information Technology");
//		validatetext(Reportingmanagertext, "Reporting Manager");
//		validatetext(NAtext, "NA");
//		validatetext(Twofactortext, "Two Factor Authentication");
		Clickelement(MyProfile);


//
//		if(driver.findElement(By.xpath("//div[@class='icon']//div[@class='slider-handle']")).isEnabled()) {
//			System.out.println("Two factor Authentication is enabled");
//		}
//		else {
//
//			System.out.println("Two factor Authentication is not enabled");
//		}

//		validatetext(profilename, "Ums Test");
//		validatetext(profilemail, "ums-support@ikcontech.com");
//		validatetext(Fullname, "Full Name");C:\Users\PraveenReddyGurram\Desktop\tigerimg
		
//		validatetext(Fullnametext, "Ums Support");
//		validatetext(Displayname, "Display Name");
//		validatetext(Displaynametext, "Ums Support");
//		validatetext(Gender, "Gender");
//		validatetext(Male, "Male");
//		validatetext(DOJ, "Date of Joining");
//		validatetext(DOJtext, "Jun 5, 2024");
//		validatetext(Role, "Role");
//		validatetext(Roletxt, "CEO");
//		validatetext(Designation, "Designation");
//		validatetext(Designationtxt, "Chief Executive Officer");
//		validatetext(Department, "Department");
//		validatetext(Departmenttxt, "Information Technology");
//		validatetext(Reportingmanager, "Reporting Manager");
//		validatetext(Team, "Team");
//		validatetext(Teamtxt, "Help Desk");

		Clickelement(profilepic);

		Thread.sleep(2000);

		//String Filepath = "C:\\Users\\PraveenReddyGurram\\Desktop";

		// Copy the file path to clipboard


		// Use Robot to paste and press Enter
		Robot R=new Robot();

		StringSelection ss=new StringSelection("C:\\Users\\PraveenReddyGurram\\Desktop\\tigerimg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//R.setAutoDelay(2000);


		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);

		R.keyRelease(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);


		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);


		// Optional: wait to ensure upload completes
		Thread.sleep(3000);


	}
}
