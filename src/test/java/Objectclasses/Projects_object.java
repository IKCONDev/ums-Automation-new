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

import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;

public class Projects_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	Dateformatter D = new Dateformatter();

	public Projects_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath = "//div[normalize-space()='Setup']")
	private WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Projects']")
	private WebElement Projects;

	@FindBy(xpath = "//h3[@class='title']")
	private WebElement Projectsheader;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	private WebElement Addbtn;

	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	private WebElement Deletebtn;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Table;

	public void Validate_the_projects_page() {
		Clickelement(Setup);
		Clickelement(Projects);
		validatetext(Projectsheader, "Projects");

		validatetext(Addbtn, "Add");

		validatetext(Deletebtn, "Delete");

		String s = "checkbox,ID,Project Name,Project Code,Program Name,Project Owner,Description,Start Date & Time,End Date & Time,Status,Created By,Created Date & Time,Modified By,Modified Date & Time,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i <=15; i++) {
			validatetext(Table.get(i), list.get(i));
		}

	}

	@FindBy(xpath="//div[@id='addModal']//h5[@id='xlModalLabel']")
	public WebElement Project;

	@FindBy(xpath="//div[@id='addModal']//label[1]")
	public WebElement Projectname;

	@FindBy(xpath="//div[@id='addModal']//input[@id='projectName']")
	public WebElement Projectnameplaceholder;

	@FindBy(xpath="//div[@id='addModal']//label[contains(text(),'Program Name')]")
	public WebElement Programname;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
	public WebElement Programnamedrpdwn;

	@FindBy(xpath="//span[normalize-space()='Whitebox']")
	public WebElement Programnamedrpdwnselect;

	@FindBy(xpath="(//label[contains(text(),'Project Code')])[1]")
	public WebElement Projectcode;

	@FindBy(xpath="(//input[@id='projectCode'])[1]")
	public WebElement Projectcodeplaceholder;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[2]")
	public WebElement Projectownerdrpdwn;

	@FindBy(xpath="//span[normalize-space()='Ananth raj']")
	public WebElement Projectownerselect;

	@FindBy(xpath="(//label[contains(text(),'Start Date & Time')])[1]")
	public WebElement Startdateandtime;

	@FindBy(xpath="(//input[@id='startDate'])[1]")
	public WebElement Startdateandtimeselect;

	@FindBy(xpath="(//label[@for='endDate'][normalize-space()='End Date & Time'])[1]")
	public WebElement Enddateandtime;

	@FindBy(xpath="(//input[@id='endDate'])[1]")
	public WebElement Enddateandtimeselect;

	@FindBy(xpath="(//label[@for='projectDescription'][normalize-space()='Project Description'])[1]")
	public WebElement Projectdescription;

	@FindBy(xpath="(//textarea[@id='projectDescription'])[1]")
	public WebElement Projectdescriptionplaceholder;

	@FindBy(xpath="(//button[@type='submit'][normalize-space()='Save'])[1]")
	public WebElement Savebtn;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='Cancel'])[1]")
	public WebElement Cancelbtn;

	public void Add_Projects_in_projects_page(String PN, String PC, String PD) throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Addbtn);
		Thread.sleep(3000);

		validatetext(Project,"Project");
		validateattribute(Projectnameplaceholder, "placeholder", "Project Name");
		sendkeyweb(Projectnameplaceholder, PN);
		validatetext(Programname, "Program Name");
		Clickelement(Programnamedrpdwn);
		Clickelement(Programnamedrpdwnselect);
		validatetext(Projectcode,"Project Code");
		validateattribute(Projectcodeplaceholder, "placeholder", "Project Code");
		sendkeyweb(Projectcodeplaceholder, PC);
		Clickelement(Projectownerdrpdwn);
		Clickelement(Projectownerselect);
		validatetext(Startdateandtime, "Start Date & Time");
		sendkeyweb(Startdateandtimeselect, D.Datefun(0, 0, 0));
		validatetext(Enddateandtime, "End Date & Time");
		sendkeyweb(Enddateandtimeselect, D.Datefun(0, 1, 0));
		validatetext(Projectdescription, "Project Description");
		validateattribute(Projectdescriptionplaceholder, "placeholder", "Project Description");
		sendkeyweb(Projectdescriptionplaceholder, PD);
		validatetext(Savebtn, "Save");
		validatetext(Cancelbtn, "Cancel");
		Clickelement(Savebtn);

	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	@FindBy(xpath = "//td")
	public List<WebElement> Table_data;
	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement Edit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Delete_icon;

	public void Validate_the_Added_Project_in_projects_page(String PN, String PC, String PD) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Search, PN);
		attributeselected(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), PN);
		validatetext(Table_data.get(3), PC);
		validatetext(Table_data.get(4), "Whitebox");
		validatetext(Table_data.get(5), "Ananth raj");

		validatetext(Table_data.get(6), PD);
		validatetext(Table_data.get(7), "");
		validatetext(Table_data.get(8), "");
		validatetext(Table_data.get(9), "Active");
		validatetext(Table_data.get(10), "UMS TEST");
		validatetext(Table_data.get(11), "");
		validatetext(Table_data.get(12), "");
		validatetext(Table_data.get(13), "");


		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//div[@id='updateModel']//input[@id='projectName']")
	public WebElement Projectnameupdate;

	@FindBy(xpath = "//div[@id='updateModel']//input[@id='projectCode']")
	public WebElement Projectcodeupdate;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	public WebElement Programnamedrpdwnupdate;

	@FindBy(xpath = "//span[normalize-space()='Innovate']")
	public WebElement Programnamedrpdwnupdateclick;

	@FindBy(xpath = "(//input[@id='startDate'])[2]")
	public WebElement startdateupdateclick;

	@FindBy(xpath = "(//input[@id='endDate'])[2]")
	public WebElement enddateupdateclick;

	@FindBy(xpath = "//ng-select[@name='Status']//span[@class='ng-arrow-wrapper']")
	public WebElement statusdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Completed']")
	public WebElement statusdrpdwnclick;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[2]")
	public WebElement updatesavebtn;

	@FindBy(xpath = "//div[@id='updateModel']//textarea[@id='projectDescription']")
	public WebElement Projectdescriptionupdate;

	public void Update_the_Project_in_projects_page(String PN, String PC, String PD) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Search, PN);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + PN + "']/following-sibling::td//button[@id='editIcon']")));
		sendkeyweb(Projectnameupdate, PN);
		sendkeyweb(Projectcodeupdate, PC);
		Clickelement(Programnamedrpdwnupdate);
		Clickelement(Programnamedrpdwnupdateclick);

		sendkeyweb(startdateupdateclick, D.Datefun(0, 1, 0));
		sendkeyweb(enddateupdateclick, D.Datefun(0, 2, 0));
		Clickelement(statusdrpdwn);

		Clickelement(statusdrpdwnclick);

		sendkeyweb(Projectdescriptionupdate, PD);
		Clickelement(updatesavebtn);

	}

	public void Validate_the_Updated_Project_in_projects_page(String PN, String PC, String PD) throws InterruptedException {

		driver.navigate().refresh();

		sendkeyweb(Search, PN);
		attributeselected(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), PN);
		validatetext(Table_data.get(3), PC);
		validatetext(Table_data.get(4), "Whitebox");
		validatetext(Table_data.get(5), "Ananth raj");
		validatetext(Table_data.get(6), PD);
		validatetext(Table_data.get(7), "");
		validatetext(Table_data.get(8), "");

		validatetext(Table_data.get(9), "Completed");
		validatetext(Table_data.get(10), "UMS TEST");
		validatetext(Table_data.get(11), "");
		validatetext(Table_data.get(12), "UMS TEST");
		validatetext(Table_data.get(13), "");

		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);

	}

	public void delete_the_Project_in_projects_page(String PN) throws InterruptedException {

		driver.navigate().refresh();

		sendkeyweb(Search, PN);
		Thread.sleep(3000);


		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + PN + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + PN + "']/preceding-sibling::td//input[@type='checkbox']")));

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + PN + "']/following-sibling::td//button[@id='trashIcon']")));

		Thread.sleep(3000);
		//		Clickelement(Deletebtn);
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


	}
}
