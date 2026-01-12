package Objectclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;

public class Programs_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	Dateformatter D = new Dateformatter();

	public Programs_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Setup']")
	private WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Programs']")
	private WebElement Programs;

	@FindBy(xpath = "//h3[@class='title']")
	private WebElement Programsheader;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	private WebElement Addbtn;

	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	private WebElement deletebtn;

	@FindBy(xpath="//tr//th")
	public List<WebElement> Table;

	public void Validate_the_programs_page() {
		Clickelement(Setup);

		Clickelement(Programs);
		validatetext(Programsheader, "Programs");
		validatetext(Addbtn, "Add");
		validatetext(deletebtn, "Delete");


		String s = ",ID,Program Name,Program Owner,Program code,Description,Start Date & Time,End Date & Time,Status,Created By,Created Date & Time,Modified By,Modified Date & Time,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i <=14; i++) {
			validatetext(Table.get(i), list.get(i));
		}
	}
	@FindBy(xpath="//div[@id='addModal']//h5[@id='xlModalLabel']")
	public WebElement Headertext;

	@FindBy(xpath="(//label[contains(text(),'Program Name')])[1]")
	public WebElement Programnametxt;

	@FindBy(xpath="//div[@id='addModal']//input[@id='programName']")
	public WebElement Programnameplaceholder;

	@FindBy(xpath="//div[@id='addModal']//label[contains(text(),'Program Code')]")
	public WebElement Programcodetxt;

	@FindBy(xpath="//div[@id='addModal']//input[@id='programCode']")
	public WebElement Programcodeplaceholder;

	@FindBy(xpath="(//label[contains(text(),'Program Owner')])[1]")
	public WebElement Programownertxt;


	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
	public WebElement Programownerdrpdwn;

//	@FindBy(xpath="//span[contains(text(),'Adam Smith')]")
//	public WebElement Programownerselect;


	@FindBy(xpath="(//label[contains(text(),'Start Date & Time')])[1]")
	public WebElement Programstartdatetxt;

	@FindBy(xpath="(//input[@id='programStartDate'])[1]")
	public WebElement Programstartdate;

	@FindBy(xpath="(//label[contains(text(),'End Date & Time')])[1]")
	public WebElement Programenddatetxt;

	@FindBy(xpath="(//input[@id='programEndDate'])[1]")
	public WebElement Programenddate;

	@FindBy(xpath="(//label[@for='programDescription'][normalize-space()='Program Description'])[1]")
	public WebElement Programdescriptiontxt;

	@FindBy(xpath="(//textarea[@id='programDescription'])[1]")
	public WebElement Programdescriptionplaceholder;


	@FindBy(xpath="(//button[@type='submit'][normalize-space()='Save'])[1]")
	public WebElement Savebtn;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='Cancel'])[1]")
	public WebElement Cancelbtn;

	public void AddPrograms_in_programs_page(String PN, String PC, String PD) throws InterruptedException {
		Clickelement(Addbtn);
		validatetext(Headertext,"Program");
		validatetext(Programnametxt,"Program Name");
		validateattribute(Programnameplaceholder, "placeholder", "Program Name");
		sendkeyweb(Programnameplaceholder, PN);
		validatetext(Programcodetxt,"Program Code");
		validateattribute(Programcodeplaceholder, "placeholder", "Program Code");
		sendkeyweb(Programcodeplaceholder, PC);
		validatetext(Programownertxt,"Program Owner");
		Clickelement(Programownerdrpdwn);
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//span[contains(text(),'Adam Smith')]"));
		actions.moveToElement(menu).perform();

//		Clickelement(Programownerselect);
//		Thread.sleep(3000);

		validatetext(Programstartdatetxt,"Start Date & Time");

		sendkeyweb(Programstartdate, D.Datefun(0, 0, 0));
		validatetext(Programenddatetxt,"End Date & Time");
		sendkeyweb(Programenddate, D.Datefun(0, 1, 0));
		validatetext(Programdescriptiontxt,"Program Description");

		validateattribute(Programdescriptionplaceholder, "placeholder", "Program Description");
		sendkeyweb(Programdescriptionplaceholder, PD);

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

	public void Validate_the_AddedPrograms_in_programs_page(String PN, String PC, String PD) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Search, PN);
		attributeselected(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), PN);
		validatetext(Table_data.get(3), "Charan U");
		validatetext(Table_data.get(4), PC);
		validatetext(Table_data.get(5), PD);
		validatetext(Table_data.get(6), "");
		validatetext(Table_data.get(7), "");
		validatetext(Table_data.get(8), "Active");
		validatetext(Table_data.get(9), "UMS SUPPORT");
		validatetext(Table_data.get(10), "");
		validatetext(Table_data.get(11), "");
		validatetext(Table_data.get(12), "");


		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//div[@id='updateModal']//h5[@id='xlModalLabel']")
	public WebElement UpdateProgramtxt;

	@FindBy(xpath = "//div[@id='updateModal']//input[@id='programName']")
	public WebElement UpdateProgramname;

	@FindBy(xpath = "//div[@id='updateModal']//input[@id='programCode']")
	public WebElement UpdateProgramcode;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	public WebElement progrmownerdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Adam Smith']")
	public WebElement progrmownerselect;

	@FindBy(xpath = "(//input[@id='programStartDate'])[2]")
	public WebElement updatestartdateandtime;

	@FindBy(xpath = "(//input[@id='programEndDate'])[2]")
	public WebElement updateenddateandtime;

	@FindBy(xpath = "//ng-select[@name='Status']//span[@class='ng-arrow-wrapper']")
	public WebElement statusdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Completed']")
	public WebElement statusselect;

	@FindBy(xpath = "(//textarea[@id='programDescription'])[2]")
	public WebElement Updateprogramdes;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[2]")
	public WebElement Updatesavebtn;

	public void Update_the_Programs_in_programs_page(String PN, String PC, String PD) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Search, PN);

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + PN + "']/following-sibling::td//button[@id='editIcon']")));
		validatetext(UpdateProgramtxt, "Program");

		sendkeyweb(UpdateProgramname, PN);
		Thread.sleep(3000);
		sendkeyweb(UpdateProgramcode, PC);
		Thread.sleep(3000);

		sendkeyweb(Updateprogramdes, PD);
		Thread.sleep(3000);

		Clickelement(progrmownerdrpdwn);
		Thread.sleep(3000);

		Clickelement(progrmownerselect);
		Thread.sleep(3000);


		sendkeyweb(updatestartdateandtime, D.Datefun(0, 1, 0));
		Thread.sleep(3000);

		sendkeyweb(updateenddateandtime, D.Datefun(0, 2, 0));
		Thread.sleep(3000);

		Clickelement(statusdrpdwn);
		Thread.sleep(3000);

		Clickelement(statusselect);
		Thread.sleep(3000);

		Clickelement(Updatesavebtn);
		Thread.sleep(3000);

	}



	public void Validate_the_Updated_Program_in_programs_page(String PN, String PC, String PD) throws InterruptedException {

		driver.navigate().refresh();

		sendkeyweb(Search, PN);
		attributeselected(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), PN);
		validatetext(Table_data.get(3), "Adam Smith");
		validatetext(Table_data.get(4), PC);
		validatetext(Table_data.get(5), PD);
		validatetext(Table_data.get(6), "");
		validatetext(Table_data.get(7), "");
		validatetext(Table_data.get(8), "Completed");
		validatetext(Table_data.get(9), "UMS SUPPORT");
		validatetext(Table_data.get(10), "");
		validatetext(Table_data.get(11), "UMS SUPPORT");
		validatetext(Table_data.get(12), "");
	}

	//	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	//	public WebElement Deletebtn;


	public void delete_the_Program_in_programs_page(String PN) throws InterruptedException {

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
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


	}
}
