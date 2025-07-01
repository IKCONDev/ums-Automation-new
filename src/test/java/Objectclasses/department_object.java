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
//public class department_object extends Baseclass {
//	WebDriver driver = Driver.getDriver();
//	public department_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//
//	@FindBy(xpath = "//a[normalize-space()='Departments']")
//	public WebElement Departmentsclick;
//
//	@FindBy(xpath = "//div[contains(text(),'Add')]")
//	public WebElement DepartmentsAddbtn;
//
//	@FindBy(xpath = "//div[@id='addModal']//input[@placeholder='Department Name']")
//	public WebElement Departmentname;
//
//	@FindBy(xpath = "//ng-select[@id='deptHead']//span[@class='ng-arrow-wrapper']")
//	public WebElement Departmentheaddrpdwn;
//
//	@FindBy(xpath = "//span[normalize-space()='ANURADHA GUPTA']")
//	public WebElement Departmentheadselect;
//
//	@FindBy(xpath = "//div[@id='addModal']//input[@id='departmentCode']")
//	public WebElement Departmentcode;
//
//	@FindBy(xpath = "//div[@id='addModal']//input[@placeholder='Department Location']")
//	public WebElement DepartmentLocation;
//	
//	@FindBy(xpath = "//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")
//	public WebElement Departmentsavebtn;
//
//
//	public void user_check_the_departments_page(String str1, String str2, String str3) throws InterruptedException {
//		Thread.sleep(3000);
//
//		Clickelement(Settingssidemenu);
//		Thread.sleep(3000);
//
//		Clickelement(Departmentsclick);
//		Thread.sleep(3000);
//
//		Clickelement(DepartmentsAddbtn);
//		Thread.sleep(3000);
//
//
//		sendkeyweb(Departmentname, str1);
//		Thread.sleep(3000);
//
//		Clickelement(Departmentheaddrpdwn);
//		Thread.sleep(3000);
//
//		Clickelement(Departmentheadselect);
//		Thread.sleep(3000);
//
//
//		sendkeyweb(Departmentcode, str2);
//		Thread.sleep(3000);
//
//		sendkeyweb(DepartmentLocation, str3);
//		Thread.sleep(3000);
//
//		Clickelement(Departmentsavebtn);
//		Thread.sleep(3000);
//
//	}
//	
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement departmentsearch;
//
//	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
//	public WebElement Departmentdeletebtn;
//	
//	
//	public void user_delete_the_departments_page(String str) throws InterruptedException {
//		Thread.sleep(3000);
//		
//		sendkeyweb(departmentsearch, str);
//
//		Thread.sleep(3000);
//
//		Clickelement(Departmentdeletebtn);
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//}
//}


package Objectclasses;

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


public class department_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public department_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Settings;

	@FindBy(xpath = "//a[normalize-space()='Departments']")
	public WebElement Department;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Departmenttitle;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Addbtn;

	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement Deletebtn;

//	@FindBy(xpath = "//thead[@id='DepartmentThead']//tr//th")
//	public List<WebElement> Organization;
	
	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Organization;

	public void validate_the_departments_page() throws InterruptedException {

		Clickelement(Settings);
		Clickelement(Department);
		validatetext(Departmenttitle, "Departments");
		validatetext(Addbtn, "Add");
		validatetext(Deletebtn, "Delete");


		String s = "checkbox,ID,Department Name,Department Code,Department Head,Department Location,Created By,Created Date,Modified By,Modified Date,Edit,Delete";
		Table_prop(Organization, s);

	}


	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Add_button;
	@FindBy(xpath = "//div[@id='addModal']//h5[@id='xlModalLabel']")
	public WebElement Add_depart;
//	@FindBy(xpath = "//div[@id='addModal']//b[contains(text(),'Department Name')]")
//	public WebElement Name_depart;
	
	@FindBy(xpath = "//div[@id='addModal']//label[contains(text(),'Department Name')]")
	public WebElement Name_depart;
	
	@FindBy(xpath = "//div[@id='addModal']//input[@placeholder='Department Name']")
	public WebElement deptname_placeholder;
//	@FindBy(xpath = "//div[@id='addModal']//b[contains(text(),'Department Head')]")
//	public WebElement Head_depart;
	
	@FindBy(xpath = "//div[@id='addModal']//label[contains(text(),'Department Head')]")
	public WebElement Head_depart;
	@FindBy(xpath = "//ng-select[@id='deptHead']//input[@type='text']")
	public WebElement Head_depart1;
//	@FindBy(xpath = "//div[@id='addModal']//b[contains(text(),'Department Code')]")
//	public WebElement Code_depart;
	
	@FindBy(xpath = "//div[@id='addModal']//label[contains(text(),'Department Code')]")
	public WebElement Code_depart;
	@FindBy(xpath = "//div[@id='addModal']//input[@id='departmentCode']")
	public WebElement Code_depart1;
//	@FindBy(xpath = "//div[@id='addModal']//b[contains(text(),'Department Location')]")
//	public WebElement Location_depart;
	
	@FindBy(xpath = "//div[@id='addModal']//label[contains(text(),'Department Location')]")
	public WebElement Location_depart;
	@FindBy(xpath = "//div[@id='addModal']//input[@placeholder='Department Location']")
	public WebElement Location_depart1;
	@FindBy(xpath = "//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement save;
	@FindBy(xpath = "//button[@id='closeAddModal']")
	public WebElement Cancel;
	public void add_the_department(String DN, String FN, String DC, String DL) throws InterruptedException {
		driver.navigate().refresh();
		Clickelement(Add_button);
		validatetext(Add_depart, "Add Department");
		validatetext(Name_depart,"Department Name*");
		validateattribute(deptname_placeholder, "placeholder", "Department Name");
		sendkeyweb(deptname_placeholder, DN);
		validatetext(Head_depart,"Department Head");
		Clickelement(Head_depart1);
//		Clickelement(driver.findElement(By.xpath("//span[contains(.,'" + FN + "')]")));
//		Thread.sleep(3000);
		Clickelement(driver.findElement(By.xpath("//span[contains(text(),'" + FN + "')]")));
		Thread.sleep(3000);

		validatetext(Code_depart,"Department Code");
		validateattribute(Code_depart1, "placeholder", "Department Code");
		sendkeyweb(Code_depart1, DC);
		validatetext(Location_depart,"Department Location");
		validateattribute(Location_depart1, "placeholder", "Department Location");
		sendkeyweb(Location_depart1, DL);
		validatetext(save,"Save");
		validatetext(Cancel,"Cancel");
		Clickelement(save);

	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
//	@FindBy(xpath = "//td[@class='thDepartment1 sorting_1']")
//	public WebElement Deptid;
//	@FindBy(xpath = "//td[@class='thDepartment2']")
//	public WebElement Deptname;
//	@FindBy(xpath = "//td[@class='thDepartment3']")
//	public WebElement Deptcode;
//	@FindBy(xpath = "//td[@class='thDepartment4']")
//	public WebElement Depthead;
//	@FindBy(xpath = "//td[@class='thDepartment5']")
//	public WebElement Deptloc;
//	@FindBy(xpath = "//td[@class='thDepartment6']")
//	public WebElement Deptadd;
//	@FindBy(xpath = "//td[@class='thDepartment7']")
//	public WebElement Deptcreatdate;
	
	@FindBy(xpath="//tbody//tr//td")
	public List<WebElement> Table_data;
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement edit;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement delete;

	public void validate_the_added_department(String DN, String FN, String DC, String DL) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		sendkeyweb(Search, DN);
		Thread.sleep(3000);

		
		dispalyedattribute(Table_data.get(1), "Department ID");
		validatetext(Table_data.get(2), DN);
		validatetext(Table_data.get(3), DC);
		validatetext(Table_data.get(4), FN);
		validatetext(Table_data.get(5), DL);
		validatetext(Table_data.get(6), "Praveen Reddy");
//		validatetext(Table_data.get(7), "May 21, 2024, 5:14 PM");
		dispalyedattribute(edit, "Edit icon");
		dispalyedattribute(delete, "Delete icon");

	}
	@FindBy(xpath = "//div[@id='updateModal']//h5[@id='xlModalLabel']")
	public WebElement update;
//	@FindBy(xpath = "//div[@id='updateModal']//b[contains(text(),'Department Name')]")
//	public WebElement Deptname1;
	
	@FindBy(xpath = "//div[@id='updateModal']//label[contains(text(),'Department Name')]")
	public WebElement Deptname1;
	
	@FindBy(xpath = "//div[@id='updateModal']//input[@placeholder='Department Name']")
	public WebElement updateDeptname1;
	@FindBy(xpath = "//div[@id='updateModal']//label[contains(text(),'Department Head')]")
	public WebElement Depthead1;
	@FindBy(xpath = "//ng-select[@id='updateDeptHead']//input[@type='text']")
	public WebElement updatehead;
	@FindBy(xpath = "//div[@id='updateModal']//label[contains(text(),'Department Code')]")
	public WebElement dept_code;
	@FindBy(xpath = "//div[@id='updateModal']//input[@id='departmentCode']")
	public WebElement UDC;
	@FindBy(xpath = "//div[@id='updateModal']//label[contains(text(),'Department Location')]")
	public WebElement UDL;
	@FindBy(xpath = "//div[@id='updateModal']//input[@placeholder='Department Location']")
	public WebElement UDL1;
	@FindBy(xpath = "//div[@id='updateModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement Usave;
	@FindBy(xpath = "//button[@id='closeUpdateModal']")
	public WebElement Ucancel;

	public void update_the_department(String DN, String FN, String DC, String DL) throws InterruptedException {
		Thread.sleep(3000);

		sendkeyweb(Search, DN);
		Thread.sleep(3000);

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DN + "']/following-sibling::td//button[@id='editIcon']")));
		validatetext(update, "Update Department");
		validatetext(Deptname1, "Department Name");
		sendkeyweb(updateDeptname1, DN);
		validatetext(Depthead1, "Department Head");
		Clickelement(updatehead);
//		try {
//			Clickelement(driver.findElement(By.xpath("//span[@class='ng-option-label'][contains(.,'" + FN + "')]")));
//		} catch (Exception e) {
//			Clickelement(driver.findElement(By.xpath("(//span[@class='ng-option-label'][contains(.,'" + FN + "')])[1]")));
//		}
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Vinod Reddy Kethu']")));
		
		validatetext(dept_code, "Department Code");
		sendkeyweb(UDC, DC);
		validatetext(UDL, "Department Location");
		sendkeyweb(UDL1, DL);
		validatetext(Usave, "Save");
		validatetext(Ucancel, "Cancel");
		Clickelement(Usave);

	}
	

	public void validate_the_updated_department(String DN, String FN, String DC, String DL)
			throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);

		sendkeyweb(Search, DN);
		Thread.sleep(3000);

		dispalyedattribute(Table_data.get(1), "Department ID");
		validatetext(Table_data.get(2), DN);
		validatetext(Table_data.get(3), DC);
		validatetext(Table_data.get(4), FN);
		validatetext(Table_data.get(5), DL);
		validatetext(Table_data.get(6), "Praveen Reddy");
//		validatetext(Table_data.get(7), "May 21, 2024, 5:14 PM");
		validatetext(Table_data.get(8), "Praveen Reddy");
//		validatetext(Table_data.get(9), "May 21, 2024, 6:56 PM");
		dispalyedattribute(edit, "Edit icon");
		dispalyedattribute(delete, "Delete icon");

	}
	@FindBy(xpath = "//button[normalize-space()='Delete']")
	public WebElement Delete_button;

	public void delete_the_department(String DN) throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(3000);

		sendkeyweb(Search, DN);
		Thread.sleep(3000);

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DN + "']/following-sibling::td//button[@id='trashIcon']")));
//		validatealert("Are you sure, you really want to delete this department?");
//		driver.switchTo().alert().dismiss();
//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DN + "']/preceding-sibling::td//input[@type='checkbox']")));
//		Clickelement(Delete_button);
//		driver.switchTo().alert().accept();
		
		try {
		    Alert alert = driver.switchTo().alert();
		    System.out.println("Alert detected: " + alert.getText());
		    alert.dismiss();
		} catch (NoAlertPresentException e) {
		    System.out.println("No alert present.");
		}

	
	
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + DN + "']/following-sibling::td//button[@id='trashIcon']")));
			
	
	try {
	    Alert alert = driver.switchTo().alert();
	    System.out.println("Alert detected: " + alert.getText());
	    alert.accept(); // or alert.dismiss();
	} catch (NoAlertPresentException e) {
	    System.out.println("No alert present.");
	}
		
	}

}

