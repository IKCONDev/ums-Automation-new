
package Objectclasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class Users_object extends Baseclass  {


	WebDriver driver = Driver.getDriver();
	public Users_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Users']")
	public WebElement Users;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement User_page;

	@FindBy(xpath = "//div[@class='edit-column']")
	public WebElement add_button;

	@FindBy(xpath="//tr//th")
	public List<WebElement> Table;


	public void validate_the_users_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Clickelement(Setup);
		Thread.sleep(3000);
		Clickelement(Users);
		Thread.sleep(3000);

		validatetext(User_page, "Users");
		Thread.sleep(3000);

		validatetext(add_button, "Add");
		Thread.sleep(3000);

		//		String s = "null,User ID / Mail ID,Role,User Status,Account Status,Enable / Disable,Edit";
		//		List<WebElement> list=driver.findElements(By.xpath("//thead[@id='UserThead']//tr//th"));
		//		Table_prop(list, s);
		String s= "User ID / Mail ID,Role,User Status,Account Status,Enable/Disable,Edit";

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i < 6; i++) {
			validatetext(Table.get(i), list.get(i));
		}




	}
	@FindBy(xpath = "//h5[normalize-space()='Add User']")
	public WebElement add_user;
	@FindBy(xpath = "//form[@id='formId']//label[contains(text(),'Email')]")
	public WebElement add_Email;
	//	@FindBy(xpath = "//select[@id='userEmail']")
	//	public WebElement add_sel;

	@FindBy(xpath = "//ng-select[@id='userEmail']//input[@type='text']")
	public WebElement add_sel;

	@FindBy(xpath = "//span[normalize-space()='manikumar@ikcontech.com']")
	public WebElement email_sel;

	@FindBy(xpath = "//form[@id='formId']//label[contains(text(),'Role')]")
	public WebElement add_Role;
	//	@FindBy(xpath = "//select[@id='userRole']")
	//	public WebElement role;

	@FindBy(xpath = "//ng-select[@id='userRole']//input[@type='text']")
	public WebElement role;

	@FindBy(xpath = "//span[normalize-space()='ADMIN']")
	public WebElement role_sel;
	@FindBy(xpath = "//form[@id='formId']//button[@type='button'][normalize-space()='Save']")
	public WebElement add_save;
	@FindBy(xpath = "//button[@id='closeAddModal']")
	public WebElement add_cancel;

	public void add_the_user(String RN, String Email) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		Thread.sleep(3000);

		Clickelement(add_button);
		Thread.sleep(3000);

		validatetext(add_user, "Add User");
		Thread.sleep(3000);

		validatetext(add_Email, "Email");
		Thread.sleep(3000);

		Clickelement(add_sel);
		Thread.sleep(3000);

		Clickelement(email_sel);
		Thread.sleep(3000);

		validatetext(add_Role, "Role");
		Thread.sleep(3000);

		//		Selectdropdown(role, RN);
		Clickelement(role);
		Thread.sleep(3000);

		Clickelement(role_sel);
		Thread.sleep(3000);


		validatetext(add_save, "Save");
		Thread.sleep(3000);

		validatetext(add_cancel, "Cancel");
		Clickelement(add_save);

	}
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	//	@FindBy(xpath = "//td[contains(@class,'thUser')]")
	//	public List<WebElement> Table_data;

	@FindBy(xpath = "//td")
	public List<WebElement> Table_data;
	//	@FindBy(xpath = "//button[@class='edit-icon']//*[name()='svg']")
	//	public WebElement Edit_icon;

	@FindBy(xpath = "//button[@class='edit-icon ng-star-inserted']//*[name()='svg']")
	public WebElement Edit_icon;

	public void validate_the_added_user(String RN, String Email) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		Thread.sleep(3000);

		sendkeyweb(Search, Email);
		Thread.sleep(3000);

		validatetext(Table_data.get(0), Email);
		Thread.sleep(3000);

		validatetext(Table_data.get(1), "ADMIN");
		Thread.sleep(3000);

		validatetext(Table_data.get(2), "Active");
		Thread.sleep(3000);

		validatetext(Table_data.get(3), "Login Enabled");
		Thread.sleep(3000);

		if(driver.findElement(By.xpath("//span[@class='slider round']")).isEnabled()) {
			System.out.println("User is enabled");
		}
		else {

			System.out.println("User is not enabled");
		}
		dispalyedattribute(Edit_icon, "Edit icon");

	}

	@FindBy(xpath = "//h5[@id='xlModalLabel']")
	public WebElement User_details;
	@FindBy(xpath = "//h4[normalize-space()='User Details']")
	public WebElement User_details1;
	@FindBy(xpath = "//div[@class='card col-sm-4']//h4[contains(text(),'User Access')]")
	public WebElement User_access;
	@FindBy(xpath = "//div[contains(text(),'Email ID')]")
	public WebElement Email1;
	//	@FindBy(xpath = "//b[normalize-space()='User ID']")
	//	public WebElement User_ID;
	@FindBy(xpath = "//div[contains(text(),'First Name')]")
	public WebElement First_name;
	@FindBy(xpath = "//div[contains(text(),'Last Name')]")
	public WebElement Last_name;
	@FindBy(xpath = "//div[@class='col-sm-6']//b[contains(text(),'Role')]")
	public WebElement Role_text;
	@FindBy(xpath = "//div[@class='col-sm-6']//b[contains(text(),'Action')]")
	public WebElement Action_text;
	@FindBy(xpath = "//div[@class='card col-sm-11']//h4[contains(text(),'User Access')]")
	public WebElement User_Access;
	//	@FindBy(xpath = "//h5[normalize-space()='User Details and Roles']/following::button[normalize-space()='×']")
	//	public WebElement Close_modal;

	@FindBy(xpath = "//div[@class='modal-dialog modal-xl']//span[@aria-hidden='true'][normalize-space()='×']")
	public WebElement Close_modal;
	public void update_the_user(String URN, String Email) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		sendkeyweb(Search, Email);
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + Email + "']/following-sibling::td//button[@class='edit-icon']")));

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + Email + "']/following-sibling::td//button[@class='edit-icon ng-star-inserted']")));
		Thread.sleep(3000);

		validatetext(User_details1, "User Details");
		Thread.sleep(3000);

		validatetext(User_access, "User Access");
		Thread.sleep(3000);

		validatetext(Email1, "Email ID");
		Thread.sleep(3000);

		//		validatetext(User_ID, "User ID");
		validatetext(First_name, "First Name");
		Thread.sleep(3000);

		validatetext(Last_name, "Last Name");
		Thread.sleep(3000);

		validatetext(Role_text, "Role");
		Thread.sleep(3000);

		validatetext(Action_text, "Action");
		Thread.sleep(3000);

		validatetext(User_Access, "User Access");
		Thread.sleep(3000);

		Clickelement(driver.findElement(By.xpath("//div[normalize-space()='"+URN+"']/following-sibling::div//button[@class='btn-success']")));
		//		validatealert(Email);
		//		driver.switchTo().alert().accept();
		//		Clickelement(Close_modal);

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


	}
	public void validate_the_updated_user(String URN, String Email) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Search, Email);
		validatetext(Table_data.get(0), Email);
		Thread.sleep(3000);

		validatetext(Table_data.get(1), "MEMBER");
		Thread.sleep(3000);

		validatetext(Table_data.get(2), "Active");
		Thread.sleep(3000);

		validatetext(Table_data.get(3), "Login Enabled");
		Thread.sleep(3000);

		if(driver.findElement(By.xpath("//span[@class='slider round']")).isEnabled()) {
			System.out.println("User is enabled");
		}
		else {

			System.out.println("User is not enabled");
		}
		dispalyedattribute(Edit_icon, "Edit icon");
	}
}

