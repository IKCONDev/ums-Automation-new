
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

public class Meeting_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	Dateformatter D = new Dateformatter();

	public Meeting_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath = "//div[normalize-space()='Meetings']")
	private WebElement Meetings;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	private WebElement Meetings_drpdwn;

	@FindBy(xpath = "//span[normalize-space()='Organized Meetings']")
	private WebElement organized_select;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	private WebElement Add_Meeting_Button;
	@FindBy(xpath = "//h5[text()='Create Meeting']")
	private WebElement Create_Meeting_Title;
	@FindBy(xpath = "(//label[@for='meetingLocation'])[1]")
	private WebElement Create_Meeting_Type;
	@FindBy(xpath = "//label[@for='subject']")
	private WebElement Meeting_Field_Title;
	@FindBy(xpath = "//label[@for='meetingStartDate']")
	private WebElement Meeting_Field_Startdate;
	@FindBy(xpath = "//label[@for='meetingEndDate']")
	private WebElement Meeting_Field_Enddate;
	@FindBy(xpath = "//label[@for='meetingAttendees']")
	private WebElement Meeting_Field_Attendees;
	@FindBy(xpath = "//label[normalize-space()='Location']")
	private WebElement Meeting_Field_Location;
	@FindBy(xpath = "//label[normalize-space()='Time Zone']")
	private WebElement Meeting_Field_Timezone;
	@FindBy(xpath = "//label[@for='meetingOrganizerName']")
	private WebElement Meeting_Field_ORG_Name;
	@FindBy(xpath = "//label[@for='meetingOrganizerEmailId']")
	private WebElement Meeting_Field_ORG_Email;
	@FindBy(xpath = "//input[@id='subject']")
	private WebElement Meeting_Title_Input;
	@FindBy(xpath = "//input[@name='meetingStartDate']")
	private WebElement Meeting_Startdate_Input;
	@FindBy(xpath = "//input[@id='meetingEndDate']")
	private WebElement Meeting_Enddate_Input;
	@FindBy(xpath = "//ng-select[@id='meetingAttendees']//input[@type='text']")
	private WebElement Meeting_Attendees_Input;
	@FindBy(xpath = "//button[@id='createMeeting']")
	private WebElement Meeting_Create_Button;
	@FindBy(xpath = "(//button[@id='closeCreateMeetingModal'])[1]")
	private WebElement Meeting_Cancel_Button;
	@FindBy(xpath = "//span[@id='errorSpan']")
	private List<WebElement> Error_Messages;

	public void ValidatingcreateMeetingFields() throws InterruptedException {
		Clickelement(Meetings);
		Thread.sleep(4000);
		Clickelement(Meetings_drpdwn);
		Thread.sleep(4000);

		Clickelement(organized_select);
		Thread.sleep(4000);


		Clickelement(Add_Meeting_Button);
		validatetext(Create_Meeting_Title, "Create Meeting");
		validatetext(Meeting_Field_Title, "Meeting Title*");
		validatetext(Create_Meeting_Type, "Meeting Type*");
		validatetext(Meeting_Field_Startdate, "Start Date & Time*");
		validatetext(Meeting_Field_Enddate, "End Date & Time*");
		validatetext(Meeting_Field_Attendees, "Attendees*");
		validatetext(Meeting_Field_Location, "Location");
		validatetext(Meeting_Field_Timezone, "Time Zone");
		validatetext(Meeting_Field_ORG_Name, "Organizer Name");
		validatetext(Meeting_Field_ORG_Email, "Organizer Email ID");
		validatetext(Meeting_Create_Button, "Create");
		Clickelement(Meeting_Create_Button);
		String L="Meeting title is required,Start date & time is required,End date & time is required,Meetings attendees are required";
		List<String> list = new ArrayList<String>(Arrays.asList(L.split(",")));
		Table_properties(Error_Messages, list);
		validatetext(Meeting_Cancel_Button, "Cancel");
	}

	@FindBy(xpath = "//div[@id='locationBlock']//span[@class='ng-arrow-wrapper']")
	private WebElement Meeting_location_select;

	@FindBy(xpath = "//span[normalize-space()='Virtual']")
	private WebElement Choose_location;

	public void Enter_the_details(String MT, String UN) throws InterruptedException {
		sendkeyweb(Meeting_Title_Input, MT);
		//		MST = D.Datefun(8, 0, -1);
		Thread.sleep(6000);
		sendkeyweb(Meeting_Startdate_Input, D.Datefun(8, 0, -1));
		//		MET = D.Datefun(8, 0, -1);
		Thread.sleep(6000);
		sendkeyweb(Meeting_Enddate_Input, D.Datefun(8, 0, -1));
		//		Meeting_Enddate_Input.sendKeys(MET);// end date
		Clickelement(Meeting_Attendees_Input);
		WebElement Choosen_Attendee = driver.findElement(By.xpath("//span[normalize-space()='" + UN + "']"));
		Clickelement(Choosen_Attendee);
		Clickelement(Meeting_location_select);
		Clickelement(Choose_location);

		Clickelement(Meeting_Create_Button);
		//		Clickelement(Meeting_Cancel_Button);
	}

	//			@FindBy(xpath = "//input[@placeholder='Search']")
	//			private WebElement Search;

	//			public void validate_Create_Meeting(String MT,String UN, String MID) {
	//				sendkeyweb(Search, MT);
	//				
	//				WebElement ID = driver.findElement(By.xpath("(//td[normalize-space()='" + MT + "']/preceding-sibling::td)[2]"));
	//				MID = ID.getText();
	//				dispalyedattribute(ID, "Meeting_ID");
	//				String[] s = { MT,"UMS SUPPORT","Information Technology","","","2","","","Help Desk","Asia/Calcutta","sec","Virtual","Regular", "", ""};
	//		//		String[] v = { "Meeting_ID", "Title", "Organizer", "Department", "Start Date & Time", "End Date & Time",
	//		//				"Timezone", "Duration", "Attendees", "Location", "Meeting Type", "Meeting Details", "Transcript",
	//		//				"Send MOM", "View Sent MOM" };
	//				//Automation testing on QA Server1			Nov 14, 2024, 11:48 AM	Nov 14, 2024, 11:48 AM	2
	//				List<WebElement> web = driver.findElements(By.xpath("//td[normalize-space()='" + MID + "']/following-sibling::td"));
	//				 List<String> wordList = Arrays.asList(s);  
	//				Table_properties(web,wordList);
	//				
	//			}

	@FindBy(xpath = "//input[@id='searchForFilter']")
	private WebElement Search;

	@FindBy(xpath = "//div[normalize-space()='+']")
	private WebElement plusbtn;

	//Action item create

	@FindBy(xpath = "//img[@alt='Add ActionItem']")
	private WebElement Actionitemplusbtn;

	@FindBy(xpath = "(//input[@id='actionItemTitle'])[1]")
	private WebElement Acitemtitle;

	@FindBy(xpath = "//ng-select[@placeholder='Choose Assignee']//span[@class='ng-arrow-wrapper']")
	private WebElement Actionitemassignedrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Ananthasivan Subramanian']")
	private WebElement Actitemassigneeselect;

	@FindBy(xpath = "(//input[@name='startDate'])[1]")
	private WebElement Actitemstartdate;

	@FindBy(xpath = "(//input[@name='endDate'])[1]")
	private WebElement Actitemenddate;

	@FindBy(xpath = "//form[@id='momform']//img[@alt='Dropdown icon']")
	private WebElement ActionPrioritydrpdwn;

	@FindBy(xpath = "(//img[@alt='Priority Icon'])[1]")
	private WebElement ActionPriorityselect;

	@FindBy(xpath = "(//textarea[@id='actionItemDescription'])[1]")
	private WebElement Actionitemdescription;

	//	@FindBy(xpath = "(//button[@class='btn btn-primary saveButton ng-tns-c2900108926-12'][normalize-space()='Create'])[1]")
	//	private WebElement Createbtn;

	@FindBy(xpath = "(//button[contains(text(), 'Create')])[1]")
	private WebElement Createbtn;

	//Action item update

	@FindBy(xpath = "//input[@id='searchActionFilter']")
	private WebElement Actionitemsearch;

	@FindBy(xpath = "(//input[@id='mat-mdc-checkbox-69-input'])[1]")
	private WebElement Actioncheckbox;

	//	Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + RN + "']/preceding-sibling::td//input[@type='checkbox']")));


	//Task create
	//	@FindBy(xpath = "//input[@id='searchActionFilter']")
	//	private WebElement Actionitemsearch;

	//	@FindBy(xpath = "(//div[@class='ng-tns-c2900108926-12'][normalize-space()='+'])[1]")
	//	private WebElement Taskplusbtn;

	@FindBy(xpath = "(//div[@class='ng-tns-c3692608855-10'][normalize-space()='+'])[1]")
	private WebElement Taskplusbtn;


	@FindBy(xpath = "//img[@alt='Add Task']")
	private WebElement Taskplusbtn1;

	@FindBy(xpath = "//div[@class='input-container']//input[@id='taskTitle']")
	private WebElement Tasktitle;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	private WebElement Taskassignedtodrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Charan U']")
	private WebElement Taskassigneslect;


	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	private WebElement Taskreviewrdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Mounika Errolla']")
	private WebElement Taskreviewrselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[4]")
	private WebElement Taskcatgrydrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Advertising']")
	private WebElement Taskcatgryselect;

	@FindBy(xpath = "//textarea[@id='taskDescription']")
	private WebElement Taskdescription;

	@FindBy(xpath = "//button[@class='btn btn-primary saveButton'][normalize-space()='Create']")
	private WebElement Createbtn1;

	public void Creating_Actionitems_Tasks_Risks_Undermeeting(String MT, String AT, String AD, String TT, String TD) throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(8000);
		sendkeyweb(Search, MT);
		Thread.sleep(5000);
		try {
			Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + MT + "']/preceding-sibling::td//input[@type='checkbox']")));

		} catch (Exception e) {
			Clickelement(Actioncheckbox);
			
		}

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + MT + "']/preceding-sibling::td//input[@type='checkbox']")));

		//		Clickelement(plusbtn);
		//		Thread.sleep(3000);
		//
		//		//Action item create
		//
		//		Clickelement(Actionitemplusbtn);
		//		Thread.sleep(3000);
		//
		//		sendkeyweb(Acitemtitle, AT);
		//		Thread.sleep(3000);
		//		Clickelement(Actionitemassignedrpdwn);
		//		Clickelement(Actitemassigneeselect);
		//		sendkeyweb(Actitemstartdate, D.Datefun(0, 0, 0));
		//
		//		sendkeyweb(Actitemenddate, D.Datefun(0, 0, 0));
		//		Clickelement(ActionPrioritydrpdwn);
		//
		//		Clickelement(ActionPriorityselect);
		//		sendkeyweb(Actionitemdescription, AD);
		//		Clickelement(Createbtn);
		//		Thread.sleep(3000);
		//		
		//		//Action item update
		//		
		//		sendkeyweb(Actionitemsearch, AT);
		//		Thread.sleep(5000);


		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + AT + "']/preceding-sibling::td//input[@type='checkbox']")));
		//		Thread.sleep(3000);
		//		Clickelement(Actioncheckbox);


		//input[@id='searchActionFilter']
		//Task Create

		//		sendkeyweb(Actionitemsearch, AT);
		//		Thread.sleep(3000);
		//
		//		Clickelement(Taskplusbtn);
		//		Thread.sleep(3000);
		//
		//		Clickelement(Taskplusbtn1);
		//		Thread.sleep(3000);
		//
		//		sendkeyweb(Tasktitle, TT);
		//		Thread.sleep(3000);
		//
		//		Clickelement(Taskassignedtodrpdwn);
		//		Thread.sleep(3000);
		//
		//		Clickelement(Taskassigneslect);
		//		Thread.sleep(4000);
		//
		//		Clickelement(Taskreviewrdrpdwn);
		//		Thread.sleep(3000);
		//
		//
		//		Clickelement(Taskreviewrselect);
		//		Thread.sleep(3000);
		//
		//
		//		Clickelement(Taskcatgrydrpdwn);
		//		Thread.sleep(3000);
		//
		//		Clickelement(Taskcatgryselect);
		//		Thread.sleep(3000);
		//
		//
		//		sendkeyweb(Taskdescription, TD);
		//		Thread.sleep(3000);
		//
		//		Clickelement(Createbtn1);
		//		Thread.sleep(3000);
		//		
		//		driver.navigate().refresh();
		//		
		//		Thread.sleep(3000);
		//		sendkeyweb(Search, MT);
		//		Thread.sleep(3000);





	}
	//
	//	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	//	private WebElement Edit_column;
	//
	//	@FindBy(xpath = "//input[@placeholder='0 of 7 selected']")
	//	private WebElement Editcolumn_drpdwn;
	//	
	//	@FindBy(xpath = "//label[normalize-space()='Select All']")
	//	private WebElement Editcolumn_selectall;
	//	
	//	@FindBy(xpath = "//div[@id='editAllMeetingsColumnModel']//span[normalize-space()='×']")
	//	private WebElement Editcolumn_xmark;
	//	
	//
	//	public void click_on_edit_column() throws InterruptedException {
	//		Thread.sleep(3000);
	//		
	//		Clickelement(Edit_column);
	//		Thread.sleep(3000);
	//
	//		Clickelement(Editcolumn_drpdwn);
	//		Thread.sleep(3000);
	//
	//
	//		Clickelement(Editcolumn_selectall);
	//		Thread.sleep(3000);
	//
	//
	//		Clickelement(Editcolumn_xmark);
	//		Thread.sleep(3000);
	//
	//	}
	//	
	//	@FindBy(xpath = "//div[contains(text(),'Filter')]")
	//	private WebElement Filter;
	//	
	//	@FindBy(xpath = "//div[@id='organizedFilterModal']//input[@id='meeting-id-label']")
	//	private WebElement Apply_filter;
	//	
	//	@FindBy(xpath = "//div[@id='organizedFilterModal']//button[@type='button'][normalize-space()='Apply']")
	//	private WebElement Apply_btn;
	//	
	//	@FindBy(xpath = "//div[@id='organizedFilterModal']//button[@type='button'][normalize-space()='Clear']")
	//	private WebElement Clear_btn;
	//	
	//	@FindBy(xpath = "//div[@id='organizedFilterModal']//button[@aria-label='Close']")
	//	private WebElement Cross_mark;
	//	
	//	
	//	public void click_on_filter_in_meetingspage(String MID) throws InterruptedException {
	//		Thread.sleep(3000);
	//		Clickelement(Filter);
	//		Thread.sleep(3000);
	//
	//		sendkeyweb(Apply_filter, MID);
	//		Thread.sleep(3000);
	//
	//		Clickelement(Apply_btn);
	//		Thread.sleep(3000);
	//
	//		Clickelement(Filter);
	//		Thread.sleep(3000);
	//		Clickelement(Clear_btn);
	//		Thread.sleep(3000);
	//
	//		Clickelement(Cross_mark);
	//		Thread.sleep(3000);
	//
	//}
	////	@FindBy(xpath = "//input[@placeholder='Search']")
	////		private WebElement Search;
	//	
	//	@FindBy(xpath = "//td[normalize-space()='1942']")
	//	private WebElement meetingIDclick;
	//	
	//	@FindBy(xpath = "//button[normalize-space()='Preview MoM']")
	//	private WebElement previewmom;
	//	
	//	@FindBy(xpath = "//div[@id='mommodal']//button[@id='closeSendMoMEmail']")
	//	private WebElement previewcancel;
	//	
	//	public void check_the_meeting_details_page(String MT) throws InterruptedException {
	//		Thread.sleep(3000);
	//		sendkeyweb(Search, MT);
	//		Thread.sleep(3000);
	//		Clickelement(meetingIDclick);
	//		Thread.sleep(3000);
	//
	//		Clickelement(previewmom);
	//		Thread.sleep(3000);
	//
	//		Clickelement(previewcancel);


}
