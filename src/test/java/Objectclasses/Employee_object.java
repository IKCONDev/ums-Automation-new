
package Objectclasses;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;


public class Employee_object extends Baseclass  {


	WebDriver driver = Driver.getDriver();
	Dateformatter D=new Dateformatter();

	public Employee_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Employee Profiles']")
	public WebElement Employee_profiles;

	//	@FindBy(xpath = "//h3[normalize-space()='Employees']")
	//	public WebElement Title;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Title;

	//	@FindBy(xpath = "//p[normalize-space()='Add']")
	//	public WebElement Add_button;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Add_button;

	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement delete_button;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Table;

	public void validate_the_employee_profiles_page() throws InterruptedException {

		//		driver.navigate().refresh();

		Clickelement(Setup);
		Thread.sleep(3000);

		Clickelement(Employee_profiles);
		Thread.sleep(3000);

		validatetext(Title, "Employees");
		validatetext(Add_button, "Add");
		validatetext(delete_button, "Delete");
		String s = "checkbox,ID,First Name,Last Name,Gender,Email ID,Reporting Manager,Team,Department,Designation,Status,Batch Process Status,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i <= 13; i++) {
			validatetext(Table.get(i), list.get(i));
		}
	}


	@FindBy(xpath = "//h5[normalize-space()='Add Employee']")
	public WebElement Add_emp;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'First Name')]")
	public WebElement First_name;
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement First_namein;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Last Name')]")
	public WebElement Last_name;
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement Last_namein;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Employee ID')]")
	public WebElement Emp_Id;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//input[@id='employeeId']")
	public WebElement Emp_Id_in;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Gender')]")
	public WebElement Gendertext;
	@FindBy(xpath = "//input[@id='genderMale']")
	public WebElement Gender_Male;
	@FindBy(xpath = "//input[@id='genderFemale']")
	public WebElement Gender_FeMale;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Email')]")
	public WebElement Email1;
	@FindBy(xpath = "//input[@id='employeeEmail']")
	public WebElement Email_in;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Date of Joining')]")
	public WebElement DOJ;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//input[@id='datePicker']")
	public WebElement DOJ_in;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Reporting Manager')]")
	public WebElement RPM;
	@FindBy(xpath = "//ng-select[@id='reportingManager']//input[@type='text']")
	public WebElement RPM_dd;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Department')]")
	public WebElement DEP;
	//	@FindBy(xpath = "//select[@id='employeeDept']")
	//	public WebElement DEP_select;

//	@FindBy(xpath = "//ng-select[@id='employeeDept']//span[@class='ng-arrow-wrapper']")
//	public WebElement DEP_select;

		@FindBy(xpath = "//ng-select[@id='employeeDept']//input[@type='text']")
		public WebElement DEP_select;

	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Choose Team')]")
	public WebElement Team1;
	@FindBy(xpath = "//ng-select[@id='employeeTeam']//span[@class='ng-arrow-wrapper']")
	public WebElement Team_dd;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Designation')]")
	public WebElement Desig;
	//	@FindBy(xpath = "//select[@id='employeeDesgn']")
	//	public WebElement Desig_select;

	@FindBy(xpath = "//ng-select[@id='employeeDesgn']//span[@class='ng-arrow-wrapper']")
	public WebElement Desig_select;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Microsoft Teams ID')]")
	public WebElement Team_ID;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//label[contains(text(),'Enable/Disable Batch Process')]")
	public WebElement Team_checkbox;
	@FindBy(xpath = "//div[@id='addEmployeeModal']//button[normalize-space()='Save']")
	public WebElement Addemp_save;

	@FindBy(xpath = "//button[@id='closeAddModal']")
	public WebElement Addemp_cancel;

	public void add_the_employee_profile(String FN, String LN, String EID, String Email, String DN, String DSN,
			String FNs, String GN) throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(Add_button);
		Thread.sleep(3000);

		validatetext(Add_emp, "Add Employee");
		validatetext(First_name, "First Name");
		validateattribute(First_namein, "placeholder","First Name");
		sendkeyweb(First_namein, FN);
		validatetext(Last_name, "Last Name");
		validateattribute(Last_namein, "placeholder","First Name");
		//		sendkeyweb(Last_namein, LN+" ");
		sendkeyweb(Last_namein, LN);

		validatetext(Emp_Id, "Employee ID");
		validateattribute(Emp_Id_in, "placeholder","Employee ID");
		sendkeyweb(Emp_Id_in, EID);
		validatetext(Gendertext, "Gender");
		Clickelement(driver.findElement(By.xpath("//div[@id='addEmployeeModal']//input[@id='gender" + GN + "']")));
		attributeselected(Gender_Male, "Male");
		attributeselected(Gender_FeMale, "Female");
		validatetext(Email1, "Email");
		validateattribute(Email_in, "placeholder","Email");
		sendkeyweb(Email_in, Email);
		validatetext(DOJ, "Date of Joining");
		sendkeyweb(DOJ_in, D.Datefun(1,1,1));

		validatetext(RPM, "Reporting Manager");
		Clickelement(RPM_dd);
		try {
			Clickelement(driver.findElement(By.xpath("//span[contains(.,'" + FNs + "')]")));
		} catch (Exception e) {
			Clickelement(driver.findElement(By.xpath("//span[@class='ng-option-label'][contains(.,'" + FNs + "')]")));
		}
		validatetext(DEP, "Department");
		Thread.sleep(3000);

		Selectdropdown(DEP_select, DN);
		Thread.sleep(3000);

		validatetext(Team1, "Choose Team");
		Clickelement(Team_dd);
		Clickelement(driver.findElement(By.xpath("//ng-select[@id='employeeTeam']//span[@title='Clear all']")));
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Quality']")));
		validatetext(Desig, "Designation");
		Selectdropdown(Desig_select, DSN);
		validatetext(Team_ID, "Microsoft Teams ID");
		validatetext(Team_checkbox, "Enable/Disable Batch Process");
		validatetext(Addemp_save, "Save");
		validatetext(Addemp_cancel, "Cancel");

		Clickelement(Addemp_save);

	}


	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	//	@FindBy(xpath = "//td[contains(@class='thEmployee1 sorting_')]")
	//	public List<WebElement> Emp_Table;

	@FindBy(xpath = "//td")
	public List<WebElement> Emp_Table;
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Edit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement trash_icon;
	public void validate_the_added_employees(String FN, String LN, String EID, String Email, String DN, String DSN,
			String FNs, String GN) throws InterruptedException {
		Thread.sleep(4000);
		sendkeyweb(Search, FN);
		validatetext(Emp_Table.get(0), EID);
		validatetext(Emp_Table.get(1), FN);
		validatetext(Emp_Table.get(2), LN);
		validatetext(Emp_Table.get(3), GN);
		validatetext(Emp_Table.get(4), Email);
		validatetext(Emp_Table.get(5), FNs);
		validatetext(Emp_Table.get(6), "Quality");
		validatetext(Emp_Table.get(7), DN);
		validatetext(Emp_Table.get(8), DSN);
		validatetext(Emp_Table.get(9), "Active");
		validatetext(Emp_Table.get(10), "Disabled");
		attributeselected(Edit_icon, "Edit Icon");
		attributeselected(trash_icon, "Delete Icon");

	}

	@FindBy(xpath = "//input[@id='updateFirstName']")
	public WebElement Update_FN;
	@FindBy(xpath = "//input[@id='updateLastName']")
	public WebElement Update_LN;
	@FindBy(xpath = "//div[@id='updateEmployeeModal']//input[@id='datePicker']")
	public WebElement Update_DOJ;
	@FindBy(xpath = "//ng-select[@id='updateReportingManager']//input[@type='text']")
	public WebElement Update_Reportee;
	@FindBy(xpath = "//select[@id='updateDept']")
	public WebElement Update_Dept;
	@FindBy(xpath = "//select[@id='updateDesgn']")
	public WebElement Update_Desig;
	@FindBy(xpath = "//select[@placeholder='Status']")
	public WebElement Update_Status;
	@FindBy(xpath = "//div[@id='updateEmployeeModal']//button[normalize-space()='Save']")
	public WebElement Update_Save;
	public void update_the_employee_profile(String FN, String LN, String EID,String Email, String DN, String DSN, String FNs, String GN) throws InterruptedException {
		sendkeyweb(Search, FN);
		try {
			Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + Email + "']/following-sibling::td//button[@id='editIcon']")));
		} catch (Exception e) {
			Thread.sleep(4000);
			Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + Email + "']/following-sibling::td//button[@id='editIcon']")));
		}
		sendkeyweb(Update_FN, FN);
		sendkeyweb(Update_LN, LN+"  ");
		Clickelement(driver.findElement(By.xpath("//input[@id='gender" + GN + "Update']")));
		sendkeyweb(Update_DOJ, D.Datefun(1,7,6));
		Clickelement(Update_Reportee);
		try {
			Clickelement(driver.findElement(By.xpath("//span[@class='ng-option-label'][contains(.,'" + FNs + "')]")));
		} catch (Exception e) {
			Clickelement(driver.findElement(By.xpath("(//span[contains(.,'" + FNs + "')])[2]")));
		}
		Selectdropdown(Update_Dept, DN);
		Selectdropdown(Update_Desig, DSN);
		Selectdropdown(Update_Status, "Active");
		validatetext(Update_Save, "Save");
		Clickelement(Update_Save);

	}

	public void validate_the_updated_employess(String FN, String LN, String EID, String Email, String DN, String DSN,
			String FNs, String GN) throws InterruptedException {
		sendkeyweb(Search, FN);
		validatetext(Emp_Table.get(0), EID);
		validatetext(Emp_Table.get(1), FN);
		validatetext(Emp_Table.get(2), LN);
		validatetext(Emp_Table.get(3), GN);
		validatetext(Emp_Table.get(4), Email);
		validatetext(Emp_Table.get(5), FNs);
		validatetext(Emp_Table.get(6), "Quality");
		validatetext(Emp_Table.get(7), DN);
		validatetext(Emp_Table.get(8), DSN);
		validatetext(Emp_Table.get(9), "Active");
		validatetext(Emp_Table.get(10), "Disabled");
		attributeselected(Edit_icon, "Edit Icon");
		attributeselected(trash_icon, "Delete Icon");

	}
	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement Delete_Button;
	public void delete_the_employee(String Email) throws InterruptedException {


		try {
			Clickelement(driver.findElement(
					By.xpath("//td[normalize-space()='" + Email + "']/following-sibling::td//button[@id='trashIcon']"))
					);
		} catch (Exception e) {
			driver.findElement(By.xpath("//a[normalize-space()='2']"));
			Clickelement(driver.findElement(
					By.xpath("//td[normalize-space()='" + Email + "']/following-sibling::td//button[@id='trashIcon']"))
					);
		}
		driver.switchTo().alert().dismiss();
		try {
			Clickelement(driver.findElement(
					By.xpath("//td[normalize-space()='" + Email + "']/preceding-sibling::td//input[@type='checkbox']"))
					);
		} catch (Exception e) {
			driver.findElement(By.xpath("//a[normalize-space()='2']"));
			Thread.sleep(4000);
			Clickelement(driver.findElement(
					By.xpath("//td[normalize-space()='" + Email + "']/preceding-sibling::td//input[@type='checkbox']"))
					);
		}
		Clickelement(Delete_Button);
		validatealert("");
		driver.switchTo().alert().dismiss();

	}

}

