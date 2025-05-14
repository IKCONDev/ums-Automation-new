package Objectclasses;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//
//import Drivemanager.Driver;
//import hooks.Baseclass;
//
//
//public class Roles_object extends Baseclass {
//	WebDriver driver = Driver.getDriver();
//	public Roles_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//
//	@FindBy(xpath = "//a[normalize-space()='Roles']")
//	public WebElement Rolespageclick;
//
//
//	@FindBy(xpath = "//div[contains(text(),'Add')]")
//	public WebElement RolespageAddbtn;
//
//	@FindBy(xpath = "//h5[normalize-space()='Add Role']")
//	public WebElement valaddrole;
//
//	@FindBy(xpath = "//div[@id='createModal']//div[@class='modal-content']//div[1]//label[1]")
//	public WebElement valrolename;
//
//	@FindBy(xpath = "//input[@id='addRoleName']")
//	public WebElement valrolenameplaceholder;
//
//	@FindBy(xpath = "//div[@id='createModal']//div[@class='modal-content']//div[1]//label[1]")
//	public WebElement valassignpermission;
//
//	@FindBy(xpath = "//div[@id='createModal']//button[@type='button'][normalize-space()='Save']")
//	public WebElement valsavebtn;
//
//	@FindBy(xpath = "//button[@id='closeAddModal']")
//	public WebElement valcancelbtn;
//
//	@FindBy(xpath = "//input[@id='addRoleName']")
//	public WebElement Rolename;
//	@FindBy(xpath = "//select[@id='addPermissions']")
//	public WebElement Assignpermission;
//
//	@FindBy(xpath = "//div[@id='createModal']//button[@type='button'][normalize-space()='Save']")
//	public WebElement Addrolesavebtn;
//
//	public void user_check_the_roles_page(String str) throws InterruptedException {
//		Thread.sleep(3000);
//		Clickelement(Settingssidemenu);
//		Thread.sleep(20000);
//
//		Clickelement(Rolespageclick);
//		Thread.sleep(3000);
//
//		Clickelement(RolespageAddbtn);
//		Thread.sleep(3000);
//		validatetext(valaddrole, "Add Role");
//		Thread.sleep(3000);
//
//		validatetext(valrolename, "Role Name*");
//		Thread.sleep(3000);
//
//		validateattribute(valrolenameplaceholder, "placeholder", "ROLE NAME");
//		Thread.sleep(3000);
//
//		validatetext(valassignpermission, "Assign Permission*");
//		Thread.sleep(3000);
//
//		validatetext(valsavebtn, "Save");
//		Thread.sleep(3000);
//
//		validatetext(valcancelbtn, "Cancel");
//		Thread.sleep(3000);
//		
//
//		sendkeyweb(Rolename, str);
//		Thread.sleep(3000);
//
//		Selectdropdown(Assignpermission,"View");
//		Thread.sleep(3000);
//
//
//		Clickelement(Addrolesavebtn);
//		Thread.sleep(3000);
//
//
//	}
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement Addedrolesearch;
//
//	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
//	public WebElement Addedroledupdateclick;
//
//
//	@FindBy(xpath = "//select[@id='permissions']")
//	public WebElement updatepermission;
//
//	@FindBy(xpath = "//div[@id='updateModal']//button[@type='button'][normalize-space()='Save']")
//	public WebElement updatesavebutton;
//
//
//	public void user_update_the_roles_page(String str1) throws InterruptedException {
//
//		sendkeyweb(Addedrolesearch, str1);
//		Thread.sleep(3000);
//
//		Clickelement(Addedroledupdateclick);
//		Thread.sleep(3000);
//
//		Selectdropdown(updatepermission, "View,Create");
//		Thread.sleep(3000);
//
//		Clickelement(updatesavebutton);
//
//	}
//
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement updatedrolesearch;
//
//	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
//	public WebElement deleterolebtn;
//
//
//
//	public void user_delete_the_roles_page(String str2) throws InterruptedException {
//
//		sendkeyweb(updatedrolesearch, str2);
//		Thread.sleep(3000);
//
//		Clickelement(deleterolebtn);
//		Thread.sleep(3000);
//
//
//		driver.switchTo().alert().dismiss();
//	}
//}
//
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


public class Roles_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Roles_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Roles']")
	public WebElement Roles;

	@FindBy(xpath = "//h3[contains(normalize-space(),'Roles')]")
	public WebElement Header;

	@FindBy(xpath = "//div[@id='createBtnDiv']")
	public WebElement Add;
	@FindBy(xpath = "//div[contains(@id,'deleteDesgBtn')]")
	public WebElement Delete;

	public void validate_the_roles_page() throws InterruptedException {

		Clickelement(Setup);

		Clickelement(Roles);

		validatetext(Header, "Roles");
		String s = "null,checkbox,ID,Role Name,Permissions,Created By,Created Date & Time,Modified By,Modified Date & Time,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 2; i <= 10; i++) {
			validatetext(driver.findElement(By.xpath("(//thead//tr//th)[" + i + "]")),list.get(i));
		}
		validatetext(Add, "Add");
		validatetext(Delete, "Delete");
	}
	@FindBy(xpath = "//h5[normalize-space()='Add Role']")
	public WebElement Add_Role;

	@FindBy(xpath = "//div[@id='createModal']//div[@class='modal-content']//div[1]//label[1]")
	public WebElement name_Role;

	@FindBy(xpath = "//input[@placeholder='Role Name']")
	public WebElement Role_in;

	@FindBy(xpath = "//div[@id='createModal']//div[@class='modal-body']//div[2]//label[1]")

	public WebElement Assign_per;
	@FindBy(xpath = "//select[contains(@id,'Permissions')]")
	public List<WebElement> choose_per;

	@FindBy(xpath = "//div[@id='createModal']//button[@type='button'][normalize-space()='Save']")
	public WebElement Save;
	@FindBy(xpath = "//button[contains(@id,'closeAddModal')]")
	public WebElement Cancel;

	public void add_the_role(String RN, String PN) throws InterruptedException {
		driver.navigate().refresh();
		Clickelement(Add);
		validatetext(Add_Role, "Add Role");
		validatetext(name_Role, "Role Name*");
		sendkeyweb(Role_in, RN);
		validatetext(Assign_per, "Assign Permission*");
		selectdropindexmultipleweb(choose_per, PN);
		validatetext(Cancel, "Cancel");
		validatetext(Save, "Save");
		Clickelement(Save);
		Thread.sleep(4000);

	}
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	@FindBy(xpath = "//tbody//td")
	public List<WebElement> Table_data;
	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement Edit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Delete_icon;
	public void validate_the_added_role_data(String RN) throws InterruptedException {

		sendkeyweb(Search, RN);

		attributeselected(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), RN);
		validatetext(Table_data.get(3), "View");
		validatetext(Table_data.get(4), "UMS SUPPORT");
		validatetext(Table_data.get(5), "May 16, 2024, 4:38 PM");
		Thread.sleep(3000);
		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);

	}
	@FindBy(xpath = "//h5[normalize-space()='Update Role']")
	public WebElement U_Role;
	//	@FindBy(xpath = "//div[@id='updateModal']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body']//div//b[contains(text(),'Role Name')]")
	//	public WebElement UR_name;
	@FindBy(xpath = "//div[@id='updateModal']//div[@class='modal-content']//div[1]//label[1]")
	public WebElement U_Rolename;
	@FindBy(xpath = "//div[@id='updateModal']//div[@class='modal-content']//div[1]//label[1]")
	public WebElement UASP;
	@FindBy(xpath = "//div[@id='updateModal']//button[@type='button'][normalize-space()='Save']")
	public WebElement USave;
	@FindBy(xpath = "//button[@id='closeUpdateModal']")
	public WebElement UCancel;
	@FindBy(xpath = "//div[@id='updateModal']//input[@id='roleName']")
	public WebElement RN_in;
	//	@FindBy(xpath = "//select[@id='permissions']")
	//	public WebElement RPer;

	@FindBy(xpath = "//select[@id='permissions']")
	public List<WebElement> U_Rper;

	public void update_the_role(String RN, String PN) throws InterruptedException {
		sendkeyweb(Search, RN);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RN + "']/following-sibling::td//button[@id='editIcon']")));
		//		add_the_role(RN, PN);

		Clickelement(Add);
		validatetext(U_Role, "Update Role");
		validatetext(U_Rolename, "Role Name*");
		sendkeyweb(RN_in, RN);
		validatetext(UASP, "Assign Permission*");
		selectdropindexmultipleweb(U_Rper, PN);
		validatetext(UCancel, "Cancel");
		validatetext(USave, "Save");
		Clickelement(USave);
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement updateSearch;
	@FindBy(xpath = "//tbody//td")
	public List<WebElement> Table_data1;
	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement UEdit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement UDelete_icon;

	public void validate_the_updated_role_data(String RN) throws InterruptedException {
		sendkeyweb(updateSearch, RN);
		attributeselected(Table_data1.get(1), "ID");
		validatetext(Table_data1.get(2), RN);
		validatetext(Table_data1.get(3), "View");
		validatetext(Table_data1.get(4), "UMS SUPPORT");
		validatetext(Table_data1.get(5), "May 16, 2024, 4:38 PM");
		validatetext(Table_data1.get(6), "UMS SUPPORT");
		validatetext(Table_data1.get(7), "May 16, 2024, 4:38 PM");
		attributeselected(UEdit_icon, "Edit icon");
		attributeselected(UDelete_icon, "Delete icon");

	}

	public void Delete_the_role(String RN) throws InterruptedException {
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RN + "']/following-sibling::td//button[@id='trashIcon']")));
		//		validatealert("Are you sure you want to delete this role ?");
		//		driver.switchTo().alert().dismiss();
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RN + "']/preceding-sibling::td//input[@type='checkbox']")));
//		driver.findElement(By.xpath("//div[@class='edit-column'][normalize-space()='Delete']")).click();
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RN + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		//		driver.findElement(By.xpath("//div[@class='edit-column'][normalize-space()='Delete']")).click();
		//		validatealert("Are you sure you want to delete this role ?");
		//		driver.switchTo().alert().dismiss();

	}
}

