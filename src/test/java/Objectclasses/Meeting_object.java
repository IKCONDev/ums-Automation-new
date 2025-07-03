
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

	@FindBy(xpath = "//div[contains(text(),'Add Project & Program')]")
	private WebElement Projectandprogram;

	@FindBy(xpath = "//h5[normalize-space()='Add Project & Program']")
	private WebElement Projectandprogramheader;

	@FindBy(xpath = "//label[normalize-space()='Project']")
	private WebElement Projecttext;

	@FindBy(xpath = "//label[normalize-space()='Program']")
	private WebElement Programtext;

	@FindBy(xpath = "(//button[@id='closeCreateMeetingModal'])[2]")
	private WebElement Canceltext;

	@FindBy(xpath = "//ng-select[@placeholder='Choose Project']//input[@type='text']")
	private WebElement Projectdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS']")
	private WebElement Projectselect;

	@FindBy(xpath = "//div[@id='titleBlock']//span[@class='ng-arrow-wrapper']")
	private WebElement Programdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='IKCONDIGITAL']")
	private WebElement Programselect;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	private WebElement Addbtn;


	public void Add_Project_and_Program_Undermeeting(String MT) throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(8000);
		sendkeyweb(Search, MT);
		Thread.sleep(5000);


		String searchText = MT;
		WebElement checkbox = driver.findElement(By.xpath("//tr[td[normalize-space()='" + searchText + "']]//input[@type='checkbox']"));
		checkbox.click();


		Clickelement(Projectandprogram);
		Thread.sleep(3000);

		validatetext(Projectandprogramheader, "Add Project & Program");

		validatetext(Projecttext, "Project");

		validatetext(Programtext, "Program");

		validatetext(Addbtn, "Add");

		validatetext(Canceltext, "Cancel");

		Clickelement(Projectdrpdwn);
		Thread.sleep(3000);

		Clickelement(Projectselect);
		Thread.sleep(3000);


		Clickelement(Programdrpdwn);
		Thread.sleep(3000);

		Clickelement(Programselect);
		Thread.sleep(3000);

		Clickelement(Addbtn);


	}


	//Action item create

	@FindBy(xpath = "//div[normalize-space()='+']")
	private WebElement plusbtn;

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


	//Task create
	@FindBy(xpath = "//input[@id='searchActionFilter']")
	private WebElement Actionitemsearch;

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

	//Risk create

	@FindBy(xpath = "(//button[contains(text(),'Risks')])[1]")
	private WebElement Risk;

	@FindBy(xpath = "//img[@alt='Add Risk']")
	private WebElement Riskplusbtn;

	@FindBy(xpath = "(//input[@id='riskTitle'])[1]")
	private WebElement Risktitle;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	private WebElement Assignedtodrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Mounika Errolla']")
	private WebElement Assignedtoselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	private WebElement Categorydrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Human Error']")
	private WebElement Categoryselect;

	@FindBy(xpath = "(//span[@class='selected-option'][normalize-space()='Choose Probability'])[1]")
	private WebElement Probabilitydrpdwn;

	@FindBy(xpath = "(//div[@class='option ng-star-inserted'][normalize-space()='Possible'])[1]")
	private WebElement Probabilityselect;

	@FindBy(xpath = "(//span[@class='selected-option'][normalize-space()='Choose Priority'])[1]")
	private WebElement Prioritydrpdwn;

	@FindBy(xpath = "(//div[@class='option ng-star-inserted'][normalize-space()='High'])[1]")
	private WebElement Priorityselect;

	@FindBy(xpath = "(//span[@class='selected-option'][normalize-space()='Choose Severity'])[1]")
	private WebElement Severitydrpdwn;

	@FindBy(xpath = "(//div[@class='option ng-star-inserted'][normalize-space()='Minor'])[1]")
	private WebElement Severityselect;

	@FindBy(xpath = "(//input[@id='dateIdentified'])[1]")
	private WebElement Riskidentifieddate;

	@FindBy(xpath = "(//input[@id='addRiskStartDate'])[1]")
	private WebElement Riskplannedstartdate;

	@FindBy(xpath = "(//input[@id='addPlannedEndDate'])[1]")
	private WebElement Riskplannedenddate;

	@FindBy(xpath = "//div[@class='input-container']//textarea[@id='riskDescription']")
	private WebElement Riskdescription;


	@FindBy(xpath = "//button[@class='btn btn-primary saveButton'][normalize-space()='Create']")
	private WebElement Riskcreatebtn;

	public void Creating_Actionitems_Tasks_Risks_Undermeeting(String MT, String AT, String AD, String TT, String TD, String RT, String RD) throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(8000);
		sendkeyweb(Search, MT);
		Thread.sleep(5000);

		Clickelement(plusbtn);
		Thread.sleep(3000);

		//Action item create

		Clickelement(Actionitemplusbtn);
		Thread.sleep(3000);

		sendkeyweb(Acitemtitle, AT);
		Thread.sleep(3000);
		Clickelement(Actionitemassignedrpdwn);
		Clickelement(Actitemassigneeselect);
		sendkeyweb(Actitemstartdate, D.Datefun(0, 0, 0));

		sendkeyweb(Actitemenddate, D.Datefun(0, 0, 0));
		Clickelement(ActionPrioritydrpdwn);

		Clickelement(ActionPriorityselect);
		sendkeyweb(Actionitemdescription, AD);
		Clickelement(Createbtn);
		Thread.sleep(3000);


		//Task Create

		sendkeyweb(Actionitemsearch, AT);
		Thread.sleep(3000);

		Clickelement(Taskplusbtn);
		Thread.sleep(3000);

		Clickelement(Taskplusbtn1);
		Thread.sleep(3000);

		sendkeyweb(Tasktitle, TT);
		Thread.sleep(3000);

		Clickelement(Taskassignedtodrpdwn);
		Thread.sleep(3000);

		Clickelement(Taskassigneslect);
		Thread.sleep(4000);

		Clickelement(Taskreviewrdrpdwn);
		Thread.sleep(3000);


		Clickelement(Taskreviewrselect);
		Thread.sleep(3000);


		Clickelement(Taskcatgrydrpdwn);
		Thread.sleep(3000);

		Clickelement(Taskcatgryselect);
		Thread.sleep(3000);


		sendkeyweb(Taskdescription, TD);
		Thread.sleep(3000);

		Clickelement(Createbtn1);
		Thread.sleep(3000);

		//Risk create

		//		driver.navigate().refresh();
		//
		//		Thread.sleep(3000);
		//		sendkeyweb(Search, MT);
		//		Thread.sleep(3000);

		Clickelement(Risk);
		Thread.sleep(3000);


		Clickelement(Riskplusbtn);
		Thread.sleep(3000);


		sendkeyweb(Risktitle, RT);
		Thread.sleep(3000);

		Clickelement(Assignedtodrpdwn);
		Thread.sleep(3000);

		Clickelement(Assignedtoselect);
		Thread.sleep(3000);

		Clickelement(Categorydrpdwn);
		Thread.sleep(3000);

		Clickelement(Categoryselect);
		Thread.sleep(3000);

		Clickelement(Probabilitydrpdwn);
		Thread.sleep(3000);

		Clickelement(Probabilityselect);
		Thread.sleep(3000);

		Clickelement(Prioritydrpdwn);
		Thread.sleep(3000);

		Clickelement(Priorityselect);
		Thread.sleep(3000);

		Clickelement(Severitydrpdwn);
		Thread.sleep(3000);

		Clickelement(Severityselect);
		Thread.sleep(3000);

		sendkeyweb(Riskidentifieddate, D.Datefun(0, 0, 0));
		Thread.sleep(3000);


		sendkeyweb(Riskplannedstartdate, D.Datefun(0, 1, 0));
		Thread.sleep(3000);


		sendkeyweb(Riskplannedenddate, D.Datefun(0, 2, 0));
		Thread.sleep(3000);

		sendkeyweb(Riskdescription, RD);
		Thread.sleep(3000);

		Clickelement(Riskcreatebtn);
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	private WebElement Edit_column;

	@FindBy(xpath = "//input[@placeholder='0 of 9 selected']")
	private WebElement Editcolumn_drpdwn;

	@FindBy(xpath = "//label[normalize-space()='Select All']")
	private WebElement Editcolumn_selectall;

	@FindBy(xpath = "//div[@id='editAllMeetingsColumnModel']//span[normalize-space()='×']")
	private WebElement Editcolumn_xmark;


	public void click_on_edit_column() throws InterruptedException {
		Thread.sleep(3000);

		Clickelement(Edit_column);
		Thread.sleep(3000);

		Clickelement(Editcolumn_drpdwn);
		Thread.sleep(3000);


		Clickelement(Editcolumn_selectall);
		Thread.sleep(3000);


		Clickelement(Editcolumn_xmark);
		Thread.sleep(3000);

	}
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



	public void check_the_meeting_details_page(String MT) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		sendkeyweb(Search, MT);
		Thread.sleep(3000);

		WebElement Meeting_ID=driver.findElement(By.xpath("(//td[normalize-space()='" + MT + "']/preceding-sibling::td)[3]"));
		Clickelement(Meeting_ID);


	}
	
	//Scheduled Meetings
	
	@FindBy(xpath = "//div[normalize-space()='Meetings']")
	private WebElement Meetingssidemenu;
	
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	private WebElement Meetingsdrpdwn;
	
	@FindBy(xpath = "//span[normalize-space()='Scheduled Meetings']")
	private WebElement Scheduledmeetings;
	
	@FindBy(xpath = "//div[contains(text(),'Filter')]")
	private WebElement Meetingsfilter;
	
	@FindBy(xpath = "//ng-select[@placeholder='Choose Meeting Scope Selection']//span[@class='ng-arrow-wrapper']")
	private WebElement Meetingscopeselectiondrpdwn;
	
	@FindBy(xpath = "//span[normalize-space()='My Meetings']")
	private WebElement Meetingscopeselectionselect;
	
	@FindBy(xpath = "//ng-select[@placeholder='Choose Participation Role']//span[@class='ng-arrow-wrapper']")
	private WebElement Participationroledrpdwn;
	
	@FindBy(xpath = "//span[normalize-space()='My Organized Meetings']")
	private WebElement Participationroleselect;
	
	
	@FindBy(xpath = "//div[@id='scheduledFilterModal']//button[@type='button'][normalize-space()='Apply']")
	private WebElement Applybtn;
	
	public void check_the_ScheduledMeetings_page() throws InterruptedException {
		Clickelement(Meetingssidemenu);
		Thread.sleep(3000);
		
		Clickelement(Meetingsdrpdwn);
		Thread.sleep(3000);

		Clickelement(Scheduledmeetings);
		Thread.sleep(3000);

		Clickelement(Meetingsfilter);
		Thread.sleep(3000);

		Clickelement(Meetingscopeselectiondrpdwn);
		Thread.sleep(3000);

		Clickelement(Meetingscopeselectionselect);
		Thread.sleep(3000);
		
		Clickelement(Participationroledrpdwn);
		Thread.sleep(3000);
		
		Clickelement(Participationroleselect);
		Thread.sleep(3000);

		Clickelement(Applybtn);
		Thread.sleep(3000);


}
}
