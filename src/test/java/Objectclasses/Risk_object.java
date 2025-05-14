package Objectclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;


public class Risk_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Risk_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath = "//div[normalize-space()='Risks']")
	public WebElement Risksidemenu;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	public WebElement Riskdropdwnarrow;

	@FindBy(xpath = "(//span[normalize-space()='Created By'])[1]")
	public WebElement Riskcreatedby;
	
	@FindBy(xpath = "//tr//th")
	public List<WebElement> risktable;

	public void user_validates_risk_page() throws InterruptedException {

		Clickelement(Risksidemenu);
		Thread.sleep(2000);
		
		Clickelement(Risksidemenu);
		Thread.sleep(2000);

		Clickelement(Riskdropdwnarrow);
		Thread.sleep(2000);

		Clickelement(Riskcreatedby);
		Thread.sleep(2000);
		
		String s = "checkbox,Risk ID,Meeting ID,Risk Title,Assigned To,Planned Start Date & Time,Planned End Date & Time,Probability,Severity,Status,Priority,Over Due Days,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i < 14; i++) {
			validatetext(risktable.get(i), list.get(i));
		}

	}
	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Add']")
	public WebElement RiskAddbtn;

	@FindBy(xpath = "//div[@id='createRiskModal']//h5[@id='xlModalLabel']")
	public WebElement valaddrisk;

	@FindBy(xpath = "//input[@id='riskTitle']")
	public WebElement valrisktitleplaceholder;

	@FindBy(xpath = "(//label[@for='Description'])[1]")
	public WebElement valdescription;

	@FindBy(xpath = "//textarea[@id='riskDescription']")
	public WebElement valdescriptionplaceholder;


	@FindBy(xpath = "//button[normalize-space()='Create']")
	public WebElement valcreatebtn;

	@FindBy(xpath = "//button[@id='closeAddModal']")
	public WebElement valcancelbtn;

	@FindBy(xpath = "//input[@id='riskTitle']")
	public WebElement Risktitle;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	public WebElement RiskAssignedtodrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Adam Smith']")
	public WebElement RiskAssignedtoselect;


	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	public WebElement Riskcategorydrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Compliance Failure']")
	public WebElement Riskcategoryselect;

	@FindBy(xpath = "(//img[@alt='Dropdown icon'])[2]")
	public WebElement Riskprobabilitydrpdwn;

	@FindBy(xpath = "(//div[@class='option ng-star-inserted'][normalize-space()='Likely'])[1]")
	public WebElement Riskprobabilityselect;

	@FindBy(xpath = "(//img[@alt='Dropdown icon'])[3]")
	public WebElement Riskprioritydrpdwn;

	@FindBy(xpath = "(//div[@class='option ng-star-inserted'][normalize-space()='Very High'])[1]")
	public WebElement Riskpriorityselect;

	@FindBy(xpath = "(//img[@alt='Dropdown icon'])[4]")
	public WebElement Riskseveritydrpdwn;


	@FindBy(xpath = "(//div[@class='option ng-star-inserted'][normalize-space()='Minor'])[1]")
	public WebElement Riskseverityselect;

	@FindBy(xpath = "//input[@id='dateIdentified']")
	public WebElement Riskidentifiedateandtime;

	@FindBy(xpath = "(//input[@id='addRiskStartDate'])[1]")
	public WebElement Riskplannedstartdate;

	@FindBy(xpath = "(//input[@id='addPlannedEndDate'])[1]")
	public WebElement Riskplannedenddate;

	@FindBy(xpath = "//textarea[@id='riskDescription']")
	public WebElement Riskdescription;

	@FindBy(xpath = "//button[normalize-space()='Create']")
	public WebElement Riskcreatebtn;
	Dateformatter da=new Dateformatter();

	public void user_check_risk_page(String str1, String str2) throws InterruptedException {

		
		Clickelement(RiskAddbtn);
		Thread.sleep(2000);

		validatetext(valaddrisk, "Add Risk");
		Thread.sleep(2000);

		validateattribute(valrisktitleplaceholder, "placeholder", "Enter risk title");
		Thread.sleep(2000);

		validatetext(valdescription, "Description*");
		Thread.sleep(2000);

		validateattribute(valdescriptionplaceholder, "placeholder", "Enter description");
		Thread.sleep(2000);

		validatetext(valcreatebtn, "Create");
		Thread.sleep(2000);

		validatetext(valcancelbtn, "Cancel");
		Thread.sleep(2000);

		sendkeyweb(Risktitle, str1);
		Thread.sleep(2000);

		Clickelement(RiskAssignedtodrpdwn);
		Thread.sleep(2000);


		Clickelement(RiskAssignedtoselect);
		Thread.sleep(2000);


		Clickelement(Riskcategorydrpdwn);
		Thread.sleep(2000);

		Clickelement(Riskcategoryselect);
		Thread.sleep(2000);


		Clickelement(Riskprobabilitydrpdwn);
		Thread.sleep(3000);
		Clickelement(Riskprobabilityselect);
		Thread.sleep(2000);

		Clickelement(Riskprioritydrpdwn);
		Thread.sleep(2000);

		Clickelement(Riskpriorityselect);
		Thread.sleep(2000);

		Clickelement(Riskseveritydrpdwn);
		Thread.sleep(2000);

		Clickelement(Riskseverityselect);
		Thread.sleep(2000);


		sendkeyweb(Riskidentifiedateandtime, da.Datefun(0,-1,0) );
		Thread.sleep(2000);

		sendkeyweb(Riskplannedstartdate, da.Datefun(0,0,0) );
		Thread.sleep(2000);

		sendkeyweb(Riskplannedenddate, da.Datefun(0,1,0) );
		Thread.sleep(2000);

		sendkeyweb(Riskdescription, str2);
		Thread.sleep(2000);

		Clickelement(Riskcreatebtn);
		Thread.sleep(2000);


	}
}