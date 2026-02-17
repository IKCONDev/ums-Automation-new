
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
//	public class designation_object extends Baseclass {
//		WebDriver driver = Driver.getDriver();
//		public designation_object(WebDriver RC) {
//			driver = RC;
//			PageFactory.initElements(RC, this);
//		}
//		
//		@FindBy(xpath = "//div[normalize-space()='Settings']")
//		public WebElement Settingssidemenu;
//
//		@FindBy(xpath = "//a[normalize-space()='Designations']")
//		public WebElement Designationsclick;
//		
//		@FindBy(xpath = "//div[contains(text(),'Add')]")
//		public WebElement DesignationsAddbtn;
//		
//
//		@FindBy(xpath = "//input[@id='addDesgName']")
//		public WebElement Designationname;
//		
//		@FindBy(xpath = "//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")
//		public WebElement Designationsavebtn;
//		
//		
//		public void user_check_the_designation_page(String str1) throws InterruptedException {
//			Thread.sleep(3000);
//			
//			
//			Clickelement(Settingssidemenu);
//			Thread.sleep(3000);
//
//			Clickelement(Designationsclick);
//			Thread.sleep(3000);
//
//
//			Clickelement(DesignationsAddbtn);
//			Thread.sleep(3000);
//
//			
//			sendkeyweb(Designationname, str1);
//			Thread.sleep(3000);
//
//			
//			Clickelement(Designationsavebtn);
//			Thread.sleep(3000);	
//			
//}
//		
//		@FindBy(xpath = "//input[@placeholder='Search']")
//		public WebElement designationsearch;
//
//		@FindBy(xpath = "//button[@id='trashDesgIcon']//*[name()='svg']")
//		public WebElement Designationdelete;	
//		
//		
//		
//		public void user_delete_the_designation_page(String str2) throws InterruptedException {
//			Thread.sleep(3000);
//
//			
//			sendkeyweb(designationsearch, str2);
//			Thread.sleep(3000);	
//			
//			Clickelement(Designationdelete);
//			Thread.sleep(3000);
//			
//			driver.switchTo().alert().dismiss();
//}
//	}


package Objectclasses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class designation_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public designation_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Settings;

	@FindBy(xpath = "//a[normalize-space()='Designations']")
	public WebElement Designations;

	//	@FindBy(xpath = "//h3[normalize-space()='Designations']")
	//	public WebElement Desig;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Desig;


	//	@FindBy(xpath = "//p[normalize-space()='Add']")
	//	public WebElement Desig_Add;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Desig_Add;

	//	@FindBy(xpath = "//button[@id='deleteDesgBtn']//p[contains(text(),'Delete')]")
	//	public WebElement Desig_Delete;

	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement Desig_Delete;

	//	@FindBy(xpath = "//div[@class='edit-column']")
	//	public WebElement Desig_editcol;

	//	@FindBy(xpath = "//thead[@id='DesignationThead']//tr//th")
	//	public List<WebElement> Desig_table;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Desig_table;
	public void validate_the_designations_page() throws InterruptedException {

		Clickelement(Settings);
		Clickelement(Designations);
		validatetext(Desig, "Designations");
		validatetext(Desig_Add,"Add");
		validatetext(Desig_Delete,"Delete");
		//		validatetext(Desig_editcol,"Edit Column");
		String s = "checkbox,ID,Designation Name,Created By,Created Date & Time,Modified By,Modified Date & Time,Edit,Delete";
		//		Table_prop(Desig_table, s);
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i < 9; i++) {
			validatetext(Desig_table.get(i), list.get(i));
		}

	}

	//	@FindBy(xpath = "//button[normalize-space()='Add']")
	//	public WebElement Desig_add_button;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Desig_add_button;
	@FindBy(xpath = "//div[@id='addModal']//h5[@id='xlModalLabel']")
	public WebElement Desig_desc;
	//	@FindBy(xpath = "//div[@id='addModal']//b[contains(text(),'Designation Name')]")
	//	public WebElement Desig_name;

	@FindBy(xpath = "//div[@id='addModal']//label[1]")
	public WebElement Desig_name;

	@FindBy(xpath = "//input[@id='addDesgName']")
	public WebElement Desig_addname;
	@FindBy(xpath = "//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement Desig_save;
	@FindBy(xpath = "//button[@id='closeAddModal']")
	public WebElement Desig_Cancel;
	public void add_the_designation(String DSN) throws InterruptedException {
		driver.navigate().refresh();
		Clickelement(Desig_add_button);
		validatetext(Desig_desc,"Add Designation");
		validatetext(Desig_name,"Designation Name*");
		validateattribute(Desig_addname, "placeholder", "Designation Name");
		sendkeyweb(Desig_addname, DSN);
		validatetext(Desig_save,"Save");
		validatetext(Desig_Cancel,"Cancel");
		Clickelement(Desig_save);

	}

	//	@FindBy(xpath = "//input[@type='search']")
	//	public WebElement Desig_search;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Desig_search;
	//	@FindBy(xpath = "//td[contains(@class='thDesignation1 sorting_')]")
	//	public List<WebElement> Desig_Table1;

	@FindBy(xpath = "//td")
	public List<WebElement> Desig_Table1;


	public void validate_the_added_designation(String DSN, String CB) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Desig_search, DSN);
		dispalyedattribute(Desig_Table1.get(1), "ID");
		validatetext(Desig_Table1.get(2),DSN);
		validatetext(Desig_Table1.get(3),CB);
		//		validatetext(Desig_Table1.get(4),"May 21, 2024, 2:19 PM");
		dispalyedattribute(Desig_Table1.get(7),"EDIT Icon");
		dispalyedattribute(Desig_Table1.get(8),"Delete ICON");
	}


	@FindBy(xpath = "//div[@id='updateModal']//h5[@id='xlModalLabel']")
	public WebElement Desig_update;

	//	@FindBy(xpath = "//button[@id='editDesgIcon']//*[name()='svg']")
	//	public WebElement Desig_update;
	//	@FindBy(xpath = "//div[@id='updateModal']//b[contains(text(),'Designation Name')]")
	//	public WebElement Desig_uname;

	@FindBy(xpath = "//div[@id='updateModal']//label[1]")
	public WebElement Desig_uname;
	//	@FindBy(xpath = "//div[@id='updateModal']//b[contains(text(),'Designation Name')]")
	//	public WebElement Desig_DN;

	@FindBy(xpath = "//input[@id='updateDesgName']")
	public WebElement Desig_DN;
	@FindBy(xpath = "//div[@id='updateModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement Desig_usave;
	@FindBy(xpath = "//button[@id='closeUpdateModal']")
	public WebElement Desig_ucancel;
	public void update_the_designation(String DSN) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Desig_search, DSN);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DSN + "']/following-sibling::td//button[@id='editDesgIcon']")));
		validatetext(Desig_update, "Update Designation");
		validatetext(Desig_uname, "Designation Name*");
		sendkeyweb(Desig_DN, DSN);
		validatetext(Desig_usave,"Save");
		validatetext(Desig_ucancel,"Cancel");
		Clickelement(Desig_usave);
	}
	//	@FindBy(xpath = "//td[contains(@class,'thDesignation1 sorting_')]")
	//	public List<WebElement> Desig_UTable;

	@FindBy(xpath = "//td")
	public List<WebElement> Desig_UTable;
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Desig_UEdit;
	@FindBy(xpath = "//button[@id='trashDesgIcon']//*[name()='svg']")
	public WebElement Desig_Utrash;
	public void validate_the_updated_designation(String DSN, String CB) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Desig_search, DSN);
		dispalyedattribute(Desig_UTable.get(1), "ID");
		validatetext(Desig_UTable.get(2),DSN);
		validatetext(Desig_UTable.get(3),CB);
		validatetext(Desig_UTable.get(4),"");
		validatetext(Desig_UTable.get(5),CB);
		validatetext(Desig_UTable.get(6),"");

		//		validatetext(Desig_UTable.get(5),"Delete ICON");
		dispalyedattribute(Desig_UEdit,"Edit icon");
		dispalyedattribute(Desig_Utrash,"Delete Icon");

	}
	//	@FindBy(xpath = "//button[normalize-space()='Delete']")
	//	public WebElement Desig_delete;

	//	@FindBy(xpath = "//button[@id='trashDesgIcon']//*[name()='svg']")
	//	public WebElement Desig_delete;

	//	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	//	public WebElement Desig_delete;

	public void delete_the_designation(String DSN) throws InterruptedException {

		driver.navigate().refresh();
		sendkeyweb(Desig_search, DSN);
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DSN + "']/following-sibling::td//button[@id='trashDesgIcon']")));
		//		System.out.println(driver.switchTo().alert().getText());
		//		validatealert("Are you sure, you really want to delete this designation?");
		//		driver.switchTo().alert().dismiss();
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DSN + "']/preceding-sibling::td//input[@type='checkbox']")));
		//		Clickelement(Desig_delete);
		//		driver.switchTo().alert().accept();

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DSN + "']/following-sibling::td//button[@id='trashDesgIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DSN + "']/following-sibling::td//button[@id='trashDesgIcon']")));


		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept(); // or alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}
	}

}

