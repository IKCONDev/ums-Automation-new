//package Objectclasses;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import Drivemanager.Driver;
//import hooks.Baseclass;
//
//
//public class Permission_object extends Baseclass {
//	WebDriver driver = Driver.getDriver();
//	public Permission_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//
//	@FindBy(xpath = "//a[normalize-space()='Permissions']")
//	public WebElement Permissionsclick;
//
//	@FindBy(xpath = "//div[@class='edit-column']")
//	public WebElement Permissionaddbtn;
//
//	@FindBy(xpath = "//h5[@id='xlModalLabel']")
//	public WebElement valPermission;
//
//	@FindBy(xpath = "//input[@id='categoryName']")
//	public WebElement valPermissionvalueplaceholder;
//
//	@FindBy(xpath = "//textarea[@id='categoryDesc']")
//	public WebElement valPermissiondescriptionplaceholder;
//
//	@FindBy(xpath = "//button[normalize-space()='Save']")
//	public WebElement valsavebtn;
//
//	@FindBy(xpath = "//button[@id='closeModal']")
//	public WebElement valcancelbtn;
//
//	@FindBy(xpath = "//input[@id='categoryName']")
//	public WebElement Permissionvalue;
//
//	@FindBy(xpath = "//textarea[@id='categoryDesc']")
//	public WebElement Permissiondescription;
//
//	@FindBy(xpath = "//button[normalize-space()='Save']")
//	public WebElement Permissionsavebtn;
//
//	public void user_check_the_Permission_page(String str1, String str2) throws InterruptedException {
//		Thread.sleep(3000);
//
//		Clickelement(Settingssidemenu);
//		Thread.sleep(30000);
//
//		Clickelement(Permissionsclick);
//		Thread.sleep(3000);
//
//		Clickelement(Permissionaddbtn);
//		Thread.sleep(3000);
//
//		validatetext(valPermission, "Permission");
//		Thread.sleep(3000);
//
//		validateattribute(valPermissionvalueplaceholder, "placeholder", "Permission Value");
//		Thread.sleep(3000);
//
//		validateattribute(valPermissiondescriptionplaceholder, "placeholder", "Permission Description");
//		Thread.sleep(3000);
//		
//		validatetext(valsavebtn, "Save");
//		Thread.sleep(3000);
//		
//		validatetext(valcancelbtn, "Cancel");
//		Thread.sleep(3000);
//
//		sendkeyweb(Permissionvalue, str1);
//		Thread.sleep(3000);
//
//		sendkeyweb(Permissiondescription, str2);
//		Thread.sleep(3000);
//
//
//		Clickelement(Permissionsavebtn);
//		Thread.sleep(3000);
//
//
//	}
//
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement Permissionsearch;
//
//	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
//	public WebElement Permissiondelete;
//
//	public void user_delete_the_Permission_page(String str) throws InterruptedException {
//		Thread.sleep(3000);
//		sendkeyweb(Permissionsearch, str);
//		Thread.sleep(3000);
//
//		Clickelement(Permissiondelete);
//		Thread.sleep(3000);
//
//		driver.switchTo().alert().accept();
//
//	}
//}
package Objectclasses;

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


public class Permission_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Permission_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath="//div[normalize-space()='Setup']")
	public WebElement Settings;

	@FindBy(xpath="//a[normalize-space()='Permissions']")
	public WebElement Permissions;

	@FindBy(xpath="//h3[@class='title']")
	public WebElement Title;
	@FindBy(xpath="//thead//tr//th")
	public List<WebElement> Table;
	@FindBy(xpath="//div[@class='edit-column']")
	public WebElement Add;

	//	@FindBy(xpath="//button[contains(@id,'delete')]")
	//	public WebElement Delete_button;
	//	@FindBy(xpath="//div[@class='edit-column']")
	//	public WebElement Edit_col;

	public void validate_the_permissions_page() throws InterruptedException {
		Clickelement(Settings);

		Clickelement(Permissions);

		validatetext(Title, "Permissions");
		String s = "ID,Permission Value,Permission Description,Permission Status,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i < 6; i++) {
			validatetext(Table.get(i), list.get(i));
		}
		validatetext(Add, "Add");
		//		validatetext(Delete_button, "Delete");
		//		validatetext(Edit_col, "Edit Column");

	}
	@FindBy(xpath="//h5[@id='xlModalLabel']")
	public WebElement Permission;
	@FindBy(xpath="//label[normalize-space()='Permission Value*']")
	public WebElement Permission_value;
	@FindBy(xpath="//input[@id='categoryName']")
	public WebElement Cat_name;
	@FindBy(xpath="//label[normalize-space()='Permission Description*']")
	public WebElement Desc_text;
	@FindBy(xpath="//textarea[@id='categoryDesc']")
	public WebElement Desc;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Save;
	@FindBy(xpath="//button[@id='closeModal']")
	public WebElement Cancel;
	public void Add_the_Permissions(String s1) throws InterruptedException {
		driver.navigate().refresh();
		Clickelement(Add);
		Thread.sleep(4000);
		validatetext(Permission, "Permission");
		Thread.sleep(4000);

		validatetext(Permission_value, "Permission Value*");
		validateattribute(Cat_name,"placeholder", "Permission Value");
		validatetext(Desc_text, "Permission Description*");
		validateattribute(Desc,"placeholder", "Permission Description");
		validatetext(Save, "Save");
		validatetext(Cancel, "Cancel");
		sendkeyweb(Cat_name, s1);
		sendkeyweb(Desc, "Access permissions to "+s1);
		Clickelement(Save);
	}


	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Search;
	//	@FindBy(xpath="//td[contains(.,'')]/following-sibling::td")
	//	public List<WebElement> Table_data1;
	@FindBy(xpath="//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Edit_icon;
	@FindBy(xpath="//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Delete_icon;

	public void validate_the_added_permission_data(String s1) throws InterruptedException {
		Thread.sleep(4000);

		sendkeyweb(Search, s1);
		Thread.sleep(2000);

		//		List<WebElement> Table_data1=driver.findElements(By.xpath("//td[contains(.,'" + s1 + "')]/following-sibling::td"));

		List<WebElement> Table_data1=driver.findElements(By.xpath("//table//tbody//tr//td"));

		dispalyedattribute(Table_data1.get(0), "ID");

		validatetext(Table_data1.get(1), s1);
		validatetext(Table_data1.get(2), "Access permissions to " +s1);
		validatetext(Table_data1.get(3), "Active");
		dispalyedattribute(Edit_icon, "Edit Icon");
		dispalyedattribute(Delete_icon, "Delete Icon");

	}


	public void Update_the_Permissions(String s1) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Search, s1);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='editIcon']")));

		//		Cat_name.clear();
		Thread.sleep(3000);
		sendkeyweb(Cat_name, s1);
		sendkeyweb(Desc,"Access permissions to " + s1);
		Clickelement(Save);

	}

	public void validate_the_updated_permission_data(String s1) throws InterruptedException {

		Thread.sleep(3000);	
		driver.navigate().refresh();

		sendkeyweb(Search, s1);
		//		List<WebElement> Table_data1=driver.findElements(By.xpath("//td[contains(.,'" + s1 + "')]/following-sibling::td"));

		List<WebElement> Table_data1=driver.findElements(By.xpath("//table//tbody//tr//td"));

		dispalyedattribute(Table_data1.get(0), "ID");
		validatetext(Table_data1.get(1), s1);
		validatetext(Table_data1.get(2), "Access permissions to " +s1);
		validatetext(Table_data1.get(3), "Active");
		dispalyedattribute(Edit_icon, "Edit Icon");
		dispalyedattribute(Delete_icon, "Delete Icon");

	}

	@FindBy(xpath="//button[@id='trashIcon']")
	public WebElement del_btn;

	public void Delete_the_Permissions(String s1) throws InterruptedException {


		driver.navigate().refresh();
		Thread.sleep(3000);

		sendkeyweb(Search, s1);
		Thread.sleep(3000);
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='trashIcon']")));

		//		Clickelement(del_btn);
		//		Thread.sleep(3000);
		//
		//		validatealert("Are you sure, you really want to delete selected permission ?");
		//		Thread.sleep(3000);
		//
		//		driver.switchTo().alert().dismiss();
		//		Thread.sleep(3000);


		//		Search.clear();
		//		Thread.sleep(3000);
		//
		//		
		//		sendkeyweb(Search, s1);
		//		Thread.sleep(3000);

		//		Thread.sleep(3000);

		Clickelement(del_btn);
		Thread.sleep(3000);



		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='trashIcon']")));
		//		validatealert("Are you sure, you really want to delete selected permission ?");
		//		Thread.sleep(3000);
		//		driver.switchTo().alert().accept();


		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		Clickelement(del_btn);
		Thread.sleep(3000);

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept(); // or alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

	}
}