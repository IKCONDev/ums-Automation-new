package Objectclasses;

import java.time.Duration;
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


		String s = "checkbox,Risk ID,Meeting ID,Title,Assigned To,Planned Start Date & Time,Planned End Date & Time,Probability,Severity,Status,Priority,Over Due Days,Edit,Delete";
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
	
	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement Edit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Delete_icon;
	
	public void Validate_the_addedRisk(String RT) throws InterruptedException  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		sendkeyweb(Risksearch,RT);
		String RID = driver.findElement(By.xpath("(//td[normalize-space()='"+RT+"']/preceding-sibling::td)[2]")).getText();
		String[] S = {"NA",RT,"UMS SUPPORT","","","Likely","Minor","Open","Very High","NA"};
		List<WebElement> valid=driver.findElements(By.xpath("//td[normalize-space()='" + RID + "']/following-sibling::td"));
		valid.size();
		int i=1;
		for(WebElement e:valid) {
			validatetext(e, S[i]);
			i++;
		}
		
		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);
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

		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RT + "']/following-sibling::td//button[@id='trashIcon']")));
		//		Thread.sleep(3000);
		//
		//
		//
		//		try {
		//			Alert alert = driver.switchTo().alert();
		//			System.out.println("Alert detected: " + alert.getText());
		//			alert.accept();
		//		} catch (NoAlertPresentException e) {
		//			System.out.println("No alert present.");
		//		}

	}
	@FindBy(xpath = "//h3[contains(normalize-space(),'Risk Details')]")
	public WebElement RD_title;
	@FindBy(xpath = "//h6")
	public List<WebElement> RD_head;
	@FindBy(xpath = "//div[contains(@class,'col-sm')]//*[name()='svg']")
	public List<WebElement> RD_edit;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement RD_risktitle;

	@FindBy(xpath = "(//img[@alt='Dropdown icon'])[4]")
	public WebElement RD_status;

	@FindBy(xpath = "//div[@class='options-container']//div[1]")
	public WebElement RD_statusslct;

	@FindBy(xpath = "(//*[name()='svg'])[13]")
	public WebElement RD_save;

	@FindBy(xpath = "//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")
	public WebElement RD_des;

	@FindBy(xpath = "(//*[name()='svg'])[15]")
	public WebElement RD_dessave;

	@FindBy(xpath = "//input[@id='addCommentDescription']")
	public WebElement RD_cmments;

	@FindBy(xpath = "(//*[name()='svg'][@class='comment-button'])[1]")
	public WebElement RD_cmmentsave;

	public void user_checks_risk_details(String RT, String RD) throws InterruptedException {
		sendkeyweb(Risksearch, RT);
		Thread.sleep(4000);

		WebElement Risk_ID=driver.findElement(By.xpath("(//td[normalize-space()='"+RT+"']/preceding-sibling::td)[2]"));
		Clickelement(Risk_ID);
		validatetext(RD_title, "Risk Details");
		String L="Details,Description,Comments,History";
		List<String> list = new ArrayList<String>(Arrays.asList(L.split(",")));
		int i=0;
		for (WebElement e : RD_head) {
			validatetext(e, list.get(i));
			i++;
		}

		Clickelement(RD_edit.get(0));

		sendkeyweb(RD_risktitle, RT);
		//		Clickelement(RD_status);
		//		Clickelement(RD_statusslct);
		Thread.sleep(4000);

		//		Clickelement(RD_save);
		//		Thread.sleep(4000);
		//
		//
		//		Clickelement(RD_edit.get(1));
		//		Thread.sleep(4000);
		//
		//		sendkeyweb(RD_des, RD);
		//		Thread.sleep(4000);
		//
		//
		//		Clickelement(RD_dessave);
		//		Thread.sleep(4000);
		//
		//		sendkeyweb(RD_cmments, "commnets");
		//		Thread.sleep(4000);
		//
		//		Clickelement(RD_cmmentsave);
		//		Thread.sleep(4000);


		driver.navigate().back();

	}

	@FindBy(xpath = "//div[normalize-space()='Due Today']")
	public WebElement Duetoday;

	@FindBy(xpath = "//div[normalize-space()='Over Due']")
	public WebElement Overdue;

	@FindBy(xpath = "//div[normalize-space()='Upcoming']")
	public WebElement Upcoming;

	@FindBy(xpath = "//img[@class='dropdown-icon-due']")
	public WebElement Duefiltersdrpdwn;

	@FindBy(xpath = "//div[normalize-space()='Due Tomorrow']")
	public WebElement Duetommorow;

	@FindBy(xpath = "//div[normalize-space()='Due This Week']")
	public WebElement Duethisweek;

	@FindBy(xpath = "//div[normalize-space()='Due This Month']")
	public WebElement Duethismonth;

	@FindBy(xpath = "//div[@class='option']//p//*[name()='svg']")
	public WebElement Customdate;

	@FindBy(xpath = "(//input[@type='datetime-local'])[1]")
	public WebElement Duedatefrom;

	@FindBy(xpath = "(//input[@type='datetime-local'])[2]")
	public WebElement Duedateto;

	@FindBy(xpath = "//button[@class='submit-button-custom']")
	public WebElement Applybtn;

	@FindBy(xpath = "//div[@class='icon-container']//*[name()='svg']")
	public WebElement cancelbtn;

	@FindBy(xpath = "//div[contains(text(),'Filter')]")
	public WebElement Filter;

	@FindBy(xpath = "(//input[@id='meeting-id-label'])[17]")
	public WebElement RiskID;

	@FindBy(xpath = "(//input[@id='meeting-id-label'])[18]")
	public WebElement MeetingID;

	@FindBy(xpath = "(//input[@id='meeting-id-label'])[19]")
	public WebElement Risktitlefltr;

	@FindBy(xpath = "(//span)[423]")
	public WebElement prtydrpdwnfltr;

	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Very High']")
	public WebElement prtyslctfltr;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[47]")
	public WebElement riskstatusdrpdwnfltr;

	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Open']")
	public WebElement riskstatusslctfltr;

	@FindBy(xpath = "(//span)[427]")
	public WebElement riskprobabilitydrpdwnfltr;

	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Unlikely']")
	public WebElement riskprobabilitydrpdwnselect;

	@FindBy(xpath = "(//span)[433]")
	public WebElement riskseveritydrpdwnfltr;

	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Insignificant']")
	public WebElement riskseveritydrpdwnselect;

	@FindBy(xpath = "(//input[@type='datetime-local'])[34]")
	public WebElement riskidentieddatefrom;

	@FindBy(xpath = "(//input[@type='datetime-local'])[35]")
	public WebElement riskidentieddateto;

	@FindBy(xpath = "(//input[@type='datetime-local'])[36]")
	public WebElement plannedstartdatefrom;

	@FindBy(xpath = "(//input[@type='datetime-local'])[37]")
	public WebElement plannedstartdateto;

	@FindBy(xpath = "(//input[@type='datetime-local'])[38]")
	public WebElement plannedenddatefrom;

	@FindBy(xpath = "(//input[@type='datetime-local'])[39]")
	public WebElement plannedenddateto;

	@FindBy(xpath = "(//input[@type='datetime-local'])[40]")
	public WebElement overduedays;

	@FindBy(xpath = "(//span)[444]")
	public WebElement Createdbydrpdwn;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[51]")
	public WebElement Assignedtodrpdwn;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[52]")
	public WebElement riskcategorydrpdwn;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[53]")
	public WebElement riskdeptdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Accounts & Finance']")
	public WebElement riskdeptselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[54]")
	public WebElement riskteamdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Business Analysis']")
	public WebElement riskteamselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[55]")
	public WebElement riskreporteedrpdwn;

	@FindBy(xpath = "//div[@id='editOrganizedFilterModel']//button[@type='button'][normalize-space()='Apply']")
	public WebElement riskfltrApplybtn;

	@FindBy(xpath = "//div[@id='editOrganizedFilterModel']//button[@type='button'][normalize-space()='Clear']")
	public WebElement riskfltrclrbtn;

	@FindBy(xpath = "//div[@id='editOrganizedFilterModel']//div[@class='modal-header']//span[@aria-hidden='true'][normalize-space()='×']")
	public WebElement riskfltrxmark;

	public void user_checks_filters_in_risk_page(String RT) throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(3000);

		Clickelement(Duetoday);
		Clickelement(Overdue);
		Clickelement(Upcoming);
		Clickelement(Duefiltersdrpdwn);
		Clickelement(Duetommorow);
		Clickelement(Duefiltersdrpdwn);

		Clickelement(Duethisweek);
		Clickelement(Duefiltersdrpdwn);

		Clickelement(Duethismonth);
		Clickelement(Duefiltersdrpdwn);

		Clickelement(Customdate);
		Thread.sleep(3000);
		sendkeyweb(Duedatefrom, da.Datefun(0,-1,0) );
		sendkeyweb(Duedateto, da.Datefun(0,-1,0) );
		Clickelement(Applybtn);
		Thread.sleep(3000);

		Clickelement(cancelbtn);

		Clickelement(Filter);

		sendkeyweb(RiskID, "574");
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);

		sendkeyweb(MeetingID, "633");
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		sendkeyweb(Risktitlefltr, RT);
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		sendkeyweb(Risktitlefltr, RT);
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		Clickelement(prtydrpdwnfltr);
		Thread.sleep(3000);

		Clickelement(prtyslctfltr);
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);



		Clickelement(riskstatusdrpdwnfltr);
		Thread.sleep(3000);

		Clickelement(riskstatusslctfltr);
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		Clickelement(riskprobabilitydrpdwnfltr);
		Thread.sleep(3000);

		Clickelement(riskprobabilitydrpdwnselect);
		Thread.sleep(3000);

		
		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		Clickelement(riskseveritydrpdwnfltr);
		Thread.sleep(3000);

		Clickelement(riskseveritydrpdwnselect);
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		sendkeyweb(riskidentieddatefrom, da.Datefun(0,0,0) );
		Thread.sleep(3000);

		sendkeyweb(riskidentieddateto, da.Datefun(0,1,0) );
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		sendkeyweb(plannedstartdatefrom, da.Datefun(0,0,0) );
		Thread.sleep(3000);

		sendkeyweb(plannedstartdateto, da.Datefun(0,1,0) );
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		sendkeyweb(plannedenddatefrom, da.Datefun(0,0,0) );
		Thread.sleep(3000);

		sendkeyweb(plannedenddateto, da.Datefun(0,1,0) );
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		sendkeyweb(overduedays, "18");
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		Clickelement(Createdbydrpdwn);
		Thread.sleep(3000);


		Clickelement(Assignedtodrpdwn);
		Thread.sleep(3000);

		Clickelement(riskcategorydrpdwn);
		Thread.sleep(3000);



		Clickelement(riskdeptdrpdwn);
		Thread.sleep(3000);

		Clickelement(riskdeptselect);
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);


		Clickelement(riskteamdrpdwn);
		Thread.sleep(3000);

		Clickelement(riskteamselect);
		Thread.sleep(3000);

		Clickelement(riskfltrApplybtn);
		Thread.sleep(3000);

		Clickelement(riskfltrclrbtn);
		Thread.sleep(3000);

		Clickelement(riskreporteedrpdwn);

		Thread.sleep(3000);


		Clickelement(riskfltrxmark);


	}

	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	public WebElement Editcolumn;

	@FindBy(xpath = "//img[@class='dropdown-icon']")
	public WebElement Editcolumndrpdwn;

	@FindBy(xpath = "//input[@id='selectAllRiskColumns']")
	public WebElement Editcolumnselectall;

	@FindBy(xpath = "(//button[@aria-label='Close'])[16]")
	public WebElement Editcolumncancel;

	public void user_checks_Editcolumn_in_risk_page() throws InterruptedException {
		Clickelement(Editcolumn);
		Thread.sleep(3000);


		Clickelement(Editcolumndrpdwn);
		Thread.sleep(3000);

		Clickelement(Editcolumnselectall);
		Thread.sleep(3000);

		Clickelement(Editcolumncancel);
		Thread.sleep(3000);
	}
}