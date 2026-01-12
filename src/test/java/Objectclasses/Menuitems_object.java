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
//public class Menuitems_object extends Baseclass {
//
//	WebDriver driver = Driver.getDriver();
//	public Menuitems_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//
//	@FindBy(xpath = "//a[normalize-space()='Menu Items']")
//	public WebElement Menuitemsclick;
//
//	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Add']")
//	public WebElement Menuitemsadd;
//	
//	@FindBy(xpath = "//h5[@id='xlModalLabel']")
//	public WebElement valmenuitem;
//
//	@FindBy(xpath = "//div[@id='addModal']//label[1]")
//	public WebElement valmenuitemname;
//	
//	@FindBy(xpath = "//input[@id='categoryName']")
//	public WebElement valmenuitemnameplaceholder;
//	
//	@FindBy(xpath = "//div[@id='addModal']//label[1]")
//	public WebElement valmenuitempath;
//	
//	@FindBy(xpath = "//input[@id='categoryPath']")
//	public WebElement valmenuitempathplaceholder;
//	
//	@FindBy(xpath = "//div[@id='addModal']//label[1]")
//	public WebElement valmenuitemdescription;
//	
//	@FindBy(xpath = "//textarea[@id='menuDesc']")
//	public WebElement valmenuitemdescriptionplaceholder;
//	
//	@FindBy(xpath = "//button[@id='saveButton']")
//	public WebElement valsavebtn;
//	
//	@FindBy(xpath = "//button[@id='closeModal']")
//	public WebElement valcancelbtn;
//	
//	@FindBy(xpath = "//input[@id='categoryName']")
//	public WebElement Menuitemname;
//
//	@FindBy(xpath = "//input[@id='categoryPath']")
//	public WebElement Menuitempath;
//
//	@FindBy(xpath = "//textarea[@id='menuDesc']")
//	public WebElement Menuitemdescription;
//
//	@FindBy(xpath = "//button[@id='saveButton']")
//	public WebElement Menuitemsavebtn;
//
//	public void user_check_the_Menuitems_page(String str1, String str2, String str3) throws InterruptedException {
//		Thread.sleep(3000);
//
//		Clickelement(Settingssidemenu);
//		Thread.sleep(3000);
//		Clickelement(Menuitemsclick);
//		Thread.sleep(3000);
//
//		Clickelement(Menuitemsadd);
//		Thread.sleep(3000);
//		
//		validatetext(valmenuitem, "Menu Item");
//		Thread.sleep(3000);
//		
//		validatetext(valmenuitemname, "Menu Item Name*");
//		Thread.sleep(3000);
//		
//		validateattribute(valmenuitemnameplaceholder, "placeholder", "Menu Item Name");
//		Thread.sleep(3000);
//
//		
//		validatetext(valmenuitempath, "Menu Item Path*");
//		Thread.sleep(3000);
//		
//		validateattribute(valmenuitempathplaceholder, "placeholder", "Menu Item Path");
//		Thread.sleep(3000);
//		
//		validatetext(valmenuitemdescription, "Menu Item Description*");
//		Thread.sleep(3000);
//		
//		validateattribute(valmenuitemdescriptionplaceholder, "placeholder", "Menu Item Description");
//		Thread.sleep(3000);
//		
//		validatetext(valsavebtn, "Save");
//		Thread.sleep(3000);
//		
//		validatetext(valcancelbtn, "Cancel");
//		Thread.sleep(3000);
//
//		sendkeyweb(Menuitemname, str1);	
//		Thread.sleep(3000);
//
//		sendkeyweb(Menuitempath, str2);	
//		Thread.sleep(3000);
//
//
//		sendkeyweb(Menuitemdescription, str3);	
//		Thread.sleep(3000);
//
//
//		Clickelement(Menuitemsavebtn);
//		Thread.sleep(3000);
//
//
//	}
//	
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement menuitemsearch;
//
//	@FindBy(xpath = "//button[@id='trashmenuIcon']//*[name()='svg']")
//	public WebElement Menuitemdelete;
//	
//	public void user_delete_the_Menuitems_page(String str) throws InterruptedException {
//		Thread.sleep(3000);
//		sendkeyweb(menuitemsearch, str);
//		Thread.sleep(3000);
//
//		Clickelement(Menuitemdelete);	
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//
//		
//}
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

public class Menuitems_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Menuitems_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath="//div[normalize-space()='Setup']")
	public WebElement Settings;

	@FindBy(xpath="//a[normalize-space()='Menu Items']")
	public WebElement menuitem;

	@FindBy(xpath="//h3[contains(normalize-space(),'Menu Items')]")
	public WebElement Title;
	@FindBy(xpath="//div[@id='createBtnDiv']")
	public WebElement Add;
	@FindBy(xpath="//div[contains(@id,'deleteDesgBtn')]")
	public WebElement Delete_button;
	//	@FindBy(xpath="//thead//th")
	//	public List<WebElement> Table;

	@FindBy(xpath="//table//tr[1]/th")
	public List<WebElement> Table;

	public void validate_the_menu_items_page() throws InterruptedException {
		Clickelement(Settings);

		Clickelement(menuitem);


		validatetext(Title, "Menu Items");
		validatetext(Add, "Add");
		validatetext(Delete_button, "Delete");
		String s = ",MenuItem ID,MenuItem Name,Menu Path,Menu Description,Created By,Created Date & Time,Modified By,Modified Date & Time,Edit,Delete";

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i < 11; i++) {
			validatetext(Table.get(i), list.get(i));
		}
	}
	@FindBy(xpath="//h5[@id='xlModalLabel']")
	public WebElement Menu_Item;
	@FindBy(xpath="//label[text()='Menu Item Name']")
	public WebElement Menu_Item_name;
	@FindBy(xpath="//input[@id='categoryName']")
	public WebElement Cat_name;
	@FindBy(xpath="//label[text()='Menu Item Path']")
	public WebElement Path;
	@FindBy(xpath="//input[@placeholder='Menu Item Path']")
	public WebElement Path_in;
	@FindBy(xpath="//label[text()='Menu Item Description']")
	public WebElement Desc;
	@FindBy(xpath="//textarea[@id='menuDesc']")
	public WebElement Desc_in;
	@FindBy(xpath="//button[@id='saveButton']")
	public WebElement Save;
	@FindBy(xpath="//button[@id='closeModal']")
	public WebElement Cancel;

	public void Add_menu_items(String s1) throws InterruptedException {
		driver.navigate().refresh();
		Clickelement(Add);
		validatetext(Menu_Item, "Menu Item");
		//		validatetext(Menu_Item_name, "Menu Item Name*");
		validateattribute(Cat_name, "placeholder", "Menu Item Name");
		sendkeyweb(Cat_name, s1);
		validatetext(Path, "Menu Item Path*");
		validateattribute(Path_in, "placeholder", "Menu Item Path");
		sendkeyweb(Path_in, "/"+s1);
		validatetext(Desc, "Menu Item Description*");
		validateattribute(Desc_in, "placeholder", "Menu Item Description");
		sendkeyweb(Desc_in, s1+" path");
		validatetext(Save, "Save");
		validatetext(Cancel, "Cancel");
		Clickelement(Save);
		//		String s="Meetings,Tasks,Employees,Users,Departments,Designations,Task Categories,Organization,Batch Details,Action Items,Reports,Meeting Reports,Help Center,Action Item Reports,Task Category Report,Task Reports,Assign Menu Items & Permissions";
		//		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		//		for (int i = 0; i < list.size(); i++) {


	}
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Search;
	@FindBy(xpath="//td")
	public List<WebElement> Table_data;
	@FindBy(xpath="//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Edit_icon;
	@FindBy(xpath="//button[@id='trashmenuIcon']//*[name()='svg']")
	public WebElement Delete_icon;

	public void validate_the_added_menu_items(String s1) throws InterruptedException {
		sendkeyweb(Search, s1);
		dispalyedattribute(Table_data.get(1), "Menu Item ID");
		validatetext(Table_data.get(2), s1);
		validatetext(Table_data.get(3), "/"+s1);
		validatetext(Table_data.get(4), s1+" path");
		validatetext(Table_data.get(5), "UMS TEST");	
		validatetext(Table_data.get(6), ",");
		dispalyedattribute(Edit_icon, "Edit Icon");
		dispalyedattribute(Delete_icon, "Delete Icon");

	}



	public void Update_the_menu_item(String s1) throws InterruptedException {
		driver.navigate().refresh();
		try {
			Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='editMenuIcon']"))
					);
		} catch (Exception e) {
			sendkeyweb(Search, s1);
			Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='editMenuIcon']"))
					);
		}
		validatetext(Menu_Item_name, "");
		validateattribute(Cat_name, "placeholder", "Menu Item Name");
		sendkeyweb(Cat_name, s1);
		validatetext(Path, "Menu Item Path");
		validateattribute(Path_in, "placeholder", "Menu Item Path");
		sendkeyweb(Path_in, "/"+s1);
		validatetext(Desc, "Menu Item Description");
		validateattribute(Desc_in, "placeholder", "Menu Item Description");
		sendkeyweb(Desc_in, s1+" path");
		validatetext(Save, "Save");
		validatetext(Cancel, "Cancel");
		Clickelement(Save);
	}

	public void validate_the_updated_menu_items(String s1) throws InterruptedException {

		driver.navigate().refresh();
		sendkeyweb(Search, s1);
		dispalyedattribute(Table_data.get(0), "Menu Item ID");
		//		validatetext(Table_data.get(1), s1);
		validatetext(Table_data.get(2), s1);
		validatetext(Table_data.get(3), "/"+s1);
		validatetext(Table_data.get(4), s1+" path");
		validatetext(Table_data.get(5), "UMS TEST");	
		validatetext(Table_data.get(6), ",");
		validatetext(Table_data.get(7), "UMS TEST");
		validatetext(Table_data.get(8), ",");
		dispalyedattribute(Edit_icon, "Edit Icon");
		dispalyedattribute(Delete_icon, "Delete Icon");

	}

	public void Delete_the_Menu_item(String s1) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Search, s1);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='trashmenuIcon']")));
		//		validatealert("Are you sure, you really want to delete the menu item ?");
		//		driver.switchTo().alert().dismiss();
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/preceding-sibling::td//input[@type='checkbox']"))
		//				);
		//		Clickelement(Delete_button);
		//		validatealert("Are you sure, you really want to delete selected menu items ?");
		//		driver.switchTo().alert().accept();

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		Thread.sleep(3000);

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='trashmenuIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept(); // or alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");

		}
	}
}


