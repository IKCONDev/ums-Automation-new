package Objectclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

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

	@FindBy(xpath = "//span[normalize-space()='Created By']")
	public WebElement Riskcreatedby;

	@FindBy(xpath = "//tr//th")
	public List<WebElement> risktable;

	public void user_validates_risk_page() throws InterruptedException {

		Clickelement(Risksidemenu);

		Clickelement(Riskdropdwnarrow);
		
		Thread.sleep(3000);
		
//		 try {
//	            WebElement drpdwn = driver.findElement(By.xpath("//span[normalize-space()='Created By']"));
//	            drpdwn.click();
//	            Thread.sleep(3000);
//	        } catch(Exception e) {
//	        	WebElement drpdwn = driver.findElement(By.xpath("(//span[normalize-space()='Created By'])[1]"));
//	            drpdwn.click();
//	            Thread.sleep(3000);
//
//	        } 
		Clickelement(Riskcreatedby);

         Thread.sleep(3000);

		
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

	@FindBy(xpath = "//ng-select[@id='addRiskOwner']//span[@class='ng-arrow-wrapper']")
	public WebElement RiskAssignedtodrpdwn;

	@FindBy(xpath = "(//span[@class='ng-option-label ng-star-inserted'][contains(text(),'UMS')])[2]")
	public WebElement RiskAssignedtoselect;


	@FindBy(xpath = "//ng-select[@id='addriskCategory']//span[@class='ng-arrow-wrapper']")
	public WebElement Riskcategorydrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Data Loss']")
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

	public void user_add_risk_page(String RT, String RD) throws InterruptedException {


		Clickelement(RiskAddbtn);

		validatetext(valaddrisk, "Add Risk");

		validateattribute(valrisktitleplaceholder, "placeholder", "Enter risk title");

		validatetext(valdescription, "Description*");

		validateattribute(valdescriptionplaceholder, "placeholder", "Enter description");

		validatetext(valcreatebtn, "Create");

		validatetext(valcancelbtn, "Cancel");

		sendkeyweb(Risktitle, RT);

		Clickelement(RiskAssignedtodrpdwn);


		Clickelement(RiskAssignedtoselect);


		Clickelement(Riskcategorydrpdwn);

		Clickelement(Riskcategoryselect);


		Clickelement(Riskprobabilitydrpdwn);
		Clickelement(Riskprobabilityselect);

		Clickelement(Riskprioritydrpdwn);

		Clickelement(Riskpriorityselect);

		Clickelement(Riskseveritydrpdwn);

		Clickelement(Riskseverityselect);


		sendkeyweb(Riskidentifiedateandtime, da.Datefun(0,-1,0) );

		sendkeyweb(Riskplannedstartdate, da.Datefun(0,0,0) );

		sendkeyweb(Riskplannedenddate, da.Datefun(0,1,0) );

		sendkeyweb(Riskdescription, RD);

		Clickelement(Riskcreatebtn);
		Thread.sleep(4000);



	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Risksearch;

	@FindBy(xpath = "//input[@id='targetCompletionDate']")
	public WebElement Risktargetdate;

	@FindBy(xpath = "//textarea[@id='addCommentDescription']")
	public WebElement Addcmntdes;

	@FindBy(xpath = "//div[@class='form-control']//div[2]//*[name()='svg']")
	public WebElement Addcmntbtn;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Updatebtn;


	public void user_update_risk_page(String RT, String RD) throws InterruptedException {
		
		sendkeyweb(Risksearch, RT);
		Thread.sleep(4000);


		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RT + "']/following-sibling::td//button[@id='editIcon']")));
		Thread.sleep(3000);

		sendkeyweb(Risktargetdate, da.Datefun(0,2,0) );
		Thread.sleep(3000);

		sendkeyweb(Addcmntdes, "Comment");
		Thread.sleep(3000);
		Clickelement(Addcmntbtn);
		Thread.sleep(3000);

		Clickelement(Updatebtn);
		Thread.sleep(4000);



	}


	public void user_delete_risk_page(String RT) throws InterruptedException {
		sendkeyweb(Risksearch, RT);
		Thread.sleep(4000);


		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RT + "']/following-sibling::td//button[@id='trashIcon']")));
		Thread.sleep(3000);

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}
		Thread.sleep(3000);

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RT + "']/following-sibling::td//button[@id='trashIcon']")));
		Thread.sleep(3000);
		


		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

	}
}