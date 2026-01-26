package Objectclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Drivemanager.Driver;
import hooks.Baseclass;

import java.util.List;


public class MeetingDetailsPage extends Baseclass {
	WebDriver driver = Driver.getDriver();
	    public MeetingDetailsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // --- Participants Section ---
	    @FindBy(xpath = "//h3[contains(text(),'Meeting Details')]")
	    public WebElement meetingDetailsText;
	    @FindBy(xpath = "//button[contains(text(),'Preview MoM')]")
	    public WebElement PreviewMOM;
	    @FindBy(xpath = "//h6[contains(text(),'Details')]")
 	    public WebElement Details;
	    @FindBy(xpath = "//div[contains(text(),'ID')]")
 	    public WebElement ID;
	    @FindBy(xpath = "//div[contains(text(),'Title')]")
 	    public WebElement Title;
	    @FindBy(xpath = "//div[contains(text(),'Organizer')]")
 	    public WebElement Organizer;
	    @FindBy(xpath = "//div[contains(text(),'Department')]")
 	    public WebElement department;
	    @FindBy(xpath = "//div[contains(text(),'Project')]")
 	    public WebElement project;
	    @FindBy(xpath = "//div[contains(text(),'Program')]")
 	    public WebElement program;
	    @FindBy(xpath = "//div[contains(text(),'Meeting Type')]")
 	    public WebElement meeting_type;
	    @FindBy(xpath = "//div[contains(text(),'Location')]")
 	    public WebElement Location;
	    @FindBy(xpath = "//div[contains(text(),'Planned Schedule')]")
 	    public WebElement Plannedschedule;
	    @FindBy(xpath = "//div[contains(text(),'Actual Duration')]")
 	    public WebElement Act_duration;
	    @FindBy(xpath = "//div[contains(text(),'Actual Start Date & Time')]")
 	    public WebElement Act_start;
	    @FindBy(xpath = "//div[contains(text(),'Actual End Date & Time')]")
 	    public WebElement Act_End;
	    @FindBy(xpath = "//h6[contains(text(),'Agenda')]")
 	    public WebElement Agenda;
	    @FindBy(xpath = "//div[contains(text(),'No Agenda added for this meeting')]")
 	    public WebElement noAgenda;
	    @FindBy(xpath = "//h6[contains(text(),'Transcript Summary')]")
 	    public WebElement Trans;
	    @FindBy(xpath = "//div[contains(text(),'No transcript summary')]")
 	    public WebElement noTrans;
	    @FindBy(xpath = "//h6[contains(text(),'Decisions Made')]")
 	    public WebElement Descis;
	    @FindBy(xpath = "//div[contains(text(),'No Decisions Made')]")
 	    public WebElement noDesci;
	    @FindBy(xpath = "//div[contains(text(),'Discussion Points')]")
 	    public WebElement Discuss;
	    @FindBy(xpath = "//div[contains(text(),'No Discussion Points')]")
 	    public WebElement nodiscuss;
	    @FindBy(xpath = "//h6[contains(text(),'Participants List')]")
 	    public WebElement Participants;
	    @FindBy(xpath = "//h6[contains(text(),'Add Action Items')]")
 	    public WebElement Addaction;
	    @FindBy(xpath = "//h6[contains(text(),'Tasks')]")
 	    public WebElement tasks;
	    @FindBy(xpath = "//h6[contains(text(),'Add Risks'')]")
 	    public WebElement AddRisk;
	    @FindBy(xpath = "//h6[contains(text(),'MoM History')]")
 	    public WebElement MOM_history;
	    @FindBy(xpath = "//div[contains(text(),'No MoM History for this meeting yet')]")
 	    public WebElement noMOM_history;
	    @FindBy(xpath = "//h6[contains(text(),'Past Meetings')]")
 	    public WebElement Pastmeeting;
	    @FindBy(xpath = "//div[contains(text(),'No Past Meetings')]")
 	    public WebElement nopastmeet;
	    @FindBy(xpath = "//h6[contains(text(),'Date & Time')]")
 	    public WebElement Date_Time;
	    @FindBy(xpath = "//button[contains(text(),'Save')]")
 	    public List<WebElement> save;
	    
	    
	    
	    @FindBy(xpath = "//button[text()='Save']")
	    public List<WebElement> saveButtons; // Multiple save buttons exist for different sections
	    
	    public void validate_meeting_details() {
	    	validatetext(meetingDetailsText, "Meeting Details");
	    	validatetext(PreviewMOM, "Preview MOM");
	    	validatetext(Details, "Details");
	    	validatetext(ID, "ID");
	    	validatetext(meetingDetailsText, "Title");
	    	validatetext(Title, "Organizer");
	    	validatetext(department, "Department");
	    	validatetext(project, "Project");
	    	validatetext(program, "Program");
	    	validatetext(meeting_type, "Meeting Type");
	    	validatetext(Location, "Location");
	    	validatetext(Plannedschedule, "Planned Schedule");
	    	validatetext(meetingDetailsText, "Actual Duration");
	    	validatetext(meetingDetailsText, "Actual StartDate");
	    	validatetext(meetingDetailsText, "Actual Enddate");
	    	
	    	validatetext(meetingDetailsText, "Agenda");
	    	validatetext(meetingDetailsText, "No Agenda added for this meeting");
	    	
	    	validatetext(meetingDetailsText, "Transcript summary");
	    	validatetext(meetingDetailsText, "No transcript summary");
	    	
	    	
	    	validatetext(meetingDetailsText, "Descisions made");
	    	validatetext(meetingDetailsText, "No Decisions Made");
	    	
	    	validatetext(meetingDetailsText, "Discussion points");
	    	validatetext(meetingDetailsText, "No Discussion Points");
	    	
	    	validatetext(meetingDetailsText, "Participants List");
	    	
	    	validatetext(meetingDetailsText, "Add Action Items");
	    	
	    	validatetext(meetingDetailsText, "Tasks");
	    	
	    	validatetext(meetingDetailsText, " Add Risk");
	    	
	    	
	    	validatetext(meetingDetailsText, "MOM History");
	    	validatetext(meetingDetailsText, "No MoM History for this meeting yet");
	    	
	    	validatetext(meetingDetailsText, " Past Meetings");
	    	validatetext(meetingDetailsText, "No Past Meetings");
	    	
	    	validatetext(meetingDetailsText, "Date & Time");
	    	
	    	
	    }
	    
	    
	    @FindBy(xpath = "(//h6[contains(text(),'Agenda')]/following::div/span)[1]")
 	    public WebElement Add_agenda;
	    @FindBy(xpath = "(//h6[contains(text(),'Agenda')]/following::div/textarea)[1]")
	     public WebElement body_agenda;
	    @FindBy(xpath = "(//h6[contains(text(),'Decisions Made')]/following::div/span)[1]")
 	    public WebElement Add_Descis;
	    @FindBy(xpath = "(//h6[contains(text(),'Decisions Made')]/following::div/textarea)[1]")
 	    public WebElement body_Desci;
	    @FindBy(xpath = "(//h6[contains(text(),'Discussion Points')]/following::div/span)[1]")
 	    public WebElement add_Discuss;
	    @FindBy(xpath = "(//h6[contains(text(),'No Discussion Points')]/following::div/textarea)[1]")
 	    public WebElement body_discuss;
	    
	    public void add_decionsmade() {
	    	Clickelement(Add_agenda);
	    	sendkeyweb(body_agenda, "example agenda");
	    	Clickelement(Add_agenda);
	    	Clickelement(Add_Descis);
	    	sendkeyweb(body_Desci, "example decision points");
	    	Clickelement(Add_Descis);
	    	Clickelement(add_Discuss);
	    	sendkeyweb(body_discuss, "example discussion points");
	    	Clickelement(add_Discuss);
	    }
	   
	    @FindBy(xpath = " (//h6[contains(text(),'Add Action Items')]/following::div/button)[1]")
	    public WebElement Add_act;		
	  //input[@placeholder='Enter Title']
	    
	    
	    	
	    @FindBy(xpath = "(//h6[contains(text(),'Add Action Items')]/following::div//button[contains(text(),'Save')])[1]")
	     public WebElement Save_act;	
	    public void add_action_items() {
	    	Clickelement(Add_act);
	    	
	    }
	    
	    
	    
	    
	   }


