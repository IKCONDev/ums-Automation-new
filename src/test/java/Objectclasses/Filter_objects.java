package Objectclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;

public class Filter_objects extends Baseclass {

	WebDriver driver = Driver.getDriver();
	Dateformatter D = new Dateformatter();

	public Filter_objects(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Meetings']")
	private WebElement Meetings;

	@FindBy(xpath = "//div[contains(@id,'ilter')]//*[name()='svg']")
	private WebElement filtericon;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//input[@placeholder='Meeting ID']")
	private List<WebElement> Meeting_ID;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//input[@placeholder='Meeting Title']")
	private List<WebElement> Meeting_Title;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Type']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_Type;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Program']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_Program;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Project']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_Project;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Location']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_Location;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Organizer']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_Organizer;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Team']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_team;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Reportees']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_Reportees;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Meeting Department']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_Department;
	@FindBy(xpath = "//div[contains(@class,'date-range') and contains(normalize-space(),'From')]//input[@type='datetime-local']")
	private List<WebElement> Meeting_startdate;
	@FindBy(xpath = "//div[contains(@class,'date-range') and contains(normalize-space(),'To')]//input[@type='datetime-local']")
	private List<WebElement> Meeting_enddate;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//button[normalize-space()='Apply']")
	private List<WebElement> Apply;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//button[normalize-space()='Clear']")
	private List<WebElement> clear;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//button//span[text()='×']")
	private List<WebElement> close;
	@FindBy(xpath = "//div[@role='listbox']//span")
	private List<WebElement> options;

	@FindBy(xpath = "((//div[contains(@id,'Filter')]//div[.='Time Zone'])/following::span[@class='ng-arrow-wrapper'])[1]")
	private List<WebElement> Timezone;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Choose Meeting Scope Selection']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Meeting_scope;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Choose Participation Role']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> participationrole;

	public void Meeting_Filters(String AC, String MT) throws InterruptedException {
		Clickelement(Meetings);
		Clickelement(filtericon);
		Thread.sleep(2000);
		try {
			sendkeysmultipleweb(Meeting_ID, MT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sendkeysmultipleweb(Meeting_Title, MT);
		clickmultipleweb(Meeting_Type);
		Clickelement(options.get(2));
		clickmultipleweb(Meeting_Reportees);
		Clickelement(options.get(2));
		clickmultipleweb(Meeting_Program);
		Clickelement(options.get(2));
		clickmultipleweb(Meeting_Department);
		Clickelement(options.get(45));
		clickmultipleweb(Meeting_Project);
		Clickelement(options.get(2));
		clickmultipleweb(Meeting_team);
		Clickelement(options.get(1));
		clickmultipleweb(Meeting_Location);
		Clickelement(options.get(2));
		clickmultipleweb(Meeting_Organizer);
		Clickelement(options.get(2));
		sendkeysmultipleweb(Meeting_startdate, D.Datefun(0, -3, 0));
		sendkeysmultipleweb(Meeting_enddate, D.Datefun(0, 5, 0));
		try {
			clickmultipleweb(Timezone);
			Clickelement(options.get(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			clickmultipleweb(Meeting_scope);
			Clickelement(options.get(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			clickmultipleweb(participationrole);
			Clickelement(options.get(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		clickmultipleweb(Apply);
		try {
			clickmultipleweb(close);
		} catch (Exception e) {
		}
	}

	@FindBy(xpath = "//div[contains(@id,'ilter')]//input[@placeholder='Action Item ID']")
	private List<WebElement> Act_id;
	@FindBy(xpath = "//div[contains(@id,'ilter')]//input[@placeholder='Meeting ID']")
	private List<WebElement> Act_Mid;
	@FindBy(xpath = "//div[contains(@id,'ilter')]//input[@placeholder='Action Item Title']")
	private List<WebElement> Act_title;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Priority')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_Priority;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Select Status']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_status;// Choose Reviewer Status
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Choose Reviewer Status']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_reviewstatus;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Over Due Days']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_Overdue;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Created by')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_Createdby;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Assignee')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_assignedto;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Reviewer')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_Reviewer;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Category')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_category;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Department')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_Department;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Team')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_Team;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Reportee')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Act_Reportees;//
	@FindBy(xpath = "//div[h6[contains(text(),'Planned Start Date & Time')]]/following-sibling::div[div[text()='From']]//input[@type='datetime-local']")
	private List<WebElement> Act_plann_from;//
	@FindBy(xpath = "//div[h6[contains(text(),'Planned End Date & Time')]]/following-sibling::div[div[text()='From']]//input[@type='datetime-local']")
	private List<WebElement> Act_plann_to;//
	@FindBy(xpath = "//div[h6[contains(text(),'Planned End Date & Time')]]/following-sibling::div[div[text()='From']]//input[@type='datetime-local']")
	private List<WebElement> Act_End_From;//
	@FindBy(xpath = "//div[h6[contains(text(),'Planned End Date & Time')]]/following-sibling::div[div[text()='From']]//input[@type='datetime-local']")
	private List<WebElement> Act_End_To;//

	public void Action_Item_Filters(String AC, String AT) throws InterruptedException {

		Clickelement(Meetings);
		Clickelement(filtericon);
		Thread.sleep(4000);
		sendkeysmultipleweb(Act_id, AT);
		sendkeysmultipleweb(Act_Mid, AT);
		sendkeysmultipleweb(Act_title, AT);
		clickmultipleweb(Act_Priority);
		Clickelement(options.get(2));
		clickmultipleweb(Act_status);// status
		Clickelement(options.get(2));
		clickmultipleweb(Act_reviewstatus);// review status
		Clickelement(options.get(2));
		Filtersendkeysmultipleweb(Act_plann_from,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_plann_to,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_End_From,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_End_To,D.Datefun(0, -3, 0));
		clickmultipleweb(Act_Overdue);// overdue
		Clickelement(options.get(2));
		clickmultipleweb(Act_Createdby);// createdby
		Clickelement(options.get(2));
		clickmultipleweb(Act_assignedto);// asiigned to
		Clickelement(options.get(2));
		clickmultipleweb(Act_Reviewer);// reviewer
		Clickelement(options.get(2));
		clickmultipleweb(Act_category);// category
		Clickelement(options.get(2));
		clickmultipleweb(Act_Department);// department
		Clickelement(options.get(2));
		clickmultipleweb(Act_Team);// team
		Clickelement(options.get(2));
		try {
			clickmultipleweb(Act_Reportees);// Reportees
			Clickelement(options.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		clickmultipleweb(Apply);
		try {
			clickmultipleweb(close);
		} catch (Exception e) {
		}

	}
	@FindBy(xpath = "//div[contains(@id,'ilter')]//input[@placeholder='Task ID']")
	private List<WebElement> Task_id;
	@FindBy(xpath = "//div[contains(@id,'ilter')]//input[@placeholder='Task Title']")
	private List<WebElement> Task_title;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Category')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_category;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Priority')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Priority;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Select Status']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_status;// Choose Reviewer Status
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Over Due Days']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Overdue;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Reviewer Status')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Reviewerstatus;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'//Select Created by')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Createdby;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Assignee')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_assignedto;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Reviewer')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Reviewer;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Department')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Department;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Team')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Team;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Reportee')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Task_Reportees;//
	
	public void Task_Filters(String AC, String TT) throws InterruptedException {
		Clickelement(Meetings);
		Clickelement(filtericon);
		Thread.sleep(4000);
		sendkeysmultipleweb(Task_id, AC);
		sendkeysmultipleweb(Act_id, AC);
		sendkeysmultipleweb(Act_Mid, AC);
		sendkeysmultipleweb(Task_title, TT);
		clickmultipleweb(Task_category);// category
		Clickelement(options.get(2));
		clickmultipleweb(Task_Priority);
		Clickelement(options.get(2));
		clickmultipleweb(Task_status);// status
		Clickelement(options.get(2));
		clickmultipleweb(Task_Reviewerstatus);// review status
		Clickelement(options.get(2));
		Filtersendkeysmultipleweb(Act_plann_from,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_plann_to,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_End_From,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_End_To,D.Datefun(0, -3, 0));
		clickmultipleweb(Risk_Overdue);// overdue
		Clickelement(options.get(2));
		clickmultipleweb(Task_Createdby);// createdby
		Clickelement(options.get(2));
		clickmultipleweb(Task_assignedto);// asiigned to
		Clickelement(options.get(2));
		clickmultipleweb(Task_Reviewer);// reviewer
		Clickelement(options.get(2));
		clickmultipleweb(Task_Department);// department
		Clickelement(options.get(2));
		clickmultipleweb(Task_Team);// team
		Clickelement(options.get(2));
		try {
			clickmultipleweb(Task_Reportees);// Reportees
			Clickelement(options.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Filtersendkeysmultipleweb(driver.findElements(By.xpath(
				"//div[contains(@class,'date-range') and contains(normalize-space(),'From')]//input[@type='datetime-local'] ")),
				D.Datefun(0, -3, 0));
		sendkeysmultipleweb(driver.findElements(By.xpath(
				"//div[contains(@class,'date-range') and contains(normalize-space(),'To')]//input[@type='datetime-local'] ")),
				D.Datefun(0, 5, 0));
		clickmultipleweb(Apply);
		try {
			clickmultipleweb(close);
		} catch (Exception e) {
		}

	}
	
	@FindBy(xpath = "//div[contains(@id,'ilter')]//input[@placeholder='Risk ID']")
	private List<WebElement> Risk_id;
	@FindBy(xpath = "//div[contains(@id,'ilter')]//input[@placeholder='Risk Title']")
	private List<WebElement> Risk_title;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Priority')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_Priority;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Status')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_status;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Probability')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_Probability;
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Severity')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_severity;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Over Due Days']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_Overdue;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//ng-select[@placeholder='Select Created by']//span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_Createdby;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Assignee')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_assignedto;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Category')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_category;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Department')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_Department;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Team')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_Team;//
	@FindBy(xpath = "//div[contains(@id,'Filter')]//div[contains(normalize-space(),'Select Reportee')]/span[@class='ng-arrow-wrapper']")
	private List<WebElement> Risk_Reportees;//
	@FindBy(xpath = "//div[h6[contains(text(),'Identified Date & Time')]]/following-sibling::div[div[text()='From']]//input[@type='datetime-local']")
	private List<WebElement> Risk_identify_From;//
	@FindBy(xpath = "//div[h6[contains(text(),'Identified Date & Time')]]/following-sibling::div[div[text()='From']]//input[@type='datetime-local']")
	private List<WebElement> Risk_identify_To;//
	public void Risk_Filters(String AC,String TT) throws InterruptedException {
		Clickelement(Meetings);
		Clickelement(filtericon);
		Thread.sleep(4000);
		sendkeysmultipleweb(Risk_id, AC);
		sendkeysmultipleweb(Act_Mid, AC);
		sendkeysmultipleweb(Risk_title, TT);
		clickmultipleweb(Risk_Priority);// category
		Clickelement(options.get(2));
		clickmultipleweb(Risk_status);
		Clickelement(options.get(2));
		clickmultipleweb(Risk_Probability);// status
		Clickelement(options.get(2));
		clickmultipleweb(Risk_severity);// review status
		Clickelement(options.get(2));
		Filtersendkeysmultipleweb(Risk_identify_From,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Risk_identify_To,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_plann_from,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_plann_to,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_End_From,D.Datefun(0, -3, 0));
		Filtersendkeysmultipleweb(Act_End_To,D.Datefun(0, -3, 0));
		clickmultipleweb(Risk_Overdue);// overdue
		Clickelement(options.get(2));
		clickmultipleweb(Risk_Createdby);// createdby
		Clickelement(options.get(2));
		clickmultipleweb(Risk_assignedto);// asiigned to
		Clickelement(options.get(2));
		clickmultipleweb(Risk_category);// reviewer
		Clickelement(options.get(2));
		clickmultipleweb(Risk_Department);// department
		Clickelement(options.get(2));
		clickmultipleweb(Risk_Team);// team
		Clickelement(options.get(2));
		try {
			clickmultipleweb(Risk_Reportees);// Reportees
			Clickelement(options.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Filtersendkeysmultipleweb(driver.findElements(By.xpath(
				"//div[contains(@class,'date-range') and contains(normalize-space(),'From')]//input[@type='datetime-local'] ")),
				D.Datefun(0, -3, 0));
		sendkeysmultipleweb(driver.findElements(By.xpath(
				"//div[contains(@class,'date-range') and contains(normalize-space(),'To')]//input[@type='datetime-local'] ")),
				D.Datefun(0, 5, 0));
		clickmultipleweb(Apply);
		try {
			clickmultipleweb(close);
		} catch (Exception e) {
		}

	}

}
