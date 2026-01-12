package Objectclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class Task_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Task_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath = "//div[normalize-space()='Tasks']")
	public WebElement tasksidemenu;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	public WebElement taskdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Created By']")
	public WebElement taskcreatedby;

	@FindBy(xpath = "//input[@id='searchTaskFilter']")
	public WebElement tasksearch;

	@FindBy(xpath = "//tr//th")
	public List<WebElement> tasktable;


	public void user_validate_Task_page(String TT) throws InterruptedException {
		Clickelement(tasksidemenu);
		Thread.sleep(4000);

		//		Clickelement(taskdrpdwn);
		//		Thread.sleep(4000);
		//
		//		Clickelement(taskcreatedby);
		//		Thread.sleep(4000);

		sendkeyweb(tasksearch, TT);
		Thread.sleep(3000);

		String s = "Task ID,Action Item ID,Meeting ID,Title,Assigned To,Planned Start Date & Time,Planned End Date & Time,Priority,Status,Over Due Days,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i <= s.length()-1;i++) {
			validatetext(tasktable.get(i), list.get(i));
		}
	}



	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement taskupdateicon;

	@FindBy(xpath = "//div[@class='modal-content']//h5[@id='xlModalLabel']")
	public WebElement valupdatetask;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement valupdatebtn;

	@FindBy(xpath = "//button[@id='closeUpdateModal']")
	public WebElement valcancelbtn;

	@FindBy(xpath = "//label[normalize-space()='Comments']")
	public WebElement valcomments;

	@FindBy(xpath = "//label[normalize-space()='History']")
	public WebElement valhistory;

	@FindBy(xpath = "//textarea[@id='addCommentDescription']")
	public WebElement valaddcommentplaceholder;

	@FindBy(xpath = "//ng-select[@id='orgTaskOwner']//input[@type='text']")
	public WebElement Assigneedrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Vinod Kethu']")
	public WebElement Assigneedrpdwnselect;


	public void user_updates_Task_page(String TT) throws InterruptedException {

		Clickelement(taskupdateicon);
		Thread.sleep(4000);

		validatetext(valupdatetask, "Update Task");
		Thread.sleep(3000);

		validatetext(valupdatebtn, "Update");
		Thread.sleep(3000);

		validatetext(valcancelbtn, "Cancel");
		Thread.sleep(3000);

		validatetext(valcomments, "Comments");
		Thread.sleep(3000);

		validatetext(valhistory, "History");
		Thread.sleep(3000);

		validateattribute(valaddcommentplaceholder, "placeholder", "Add Comment");
		Thread.sleep(3000);

		Clickelement(Assigneedrpdwn);
		Thread.sleep(3000);

		Clickelement(Assigneedrpdwnselect);
		Thread.sleep(3000);

		Clickelement(valupdatebtn);
		Thread.sleep(3000);


	}
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement deletebtn;

	public void user_deletes_Task_page(String TT) throws InterruptedException {

		sendkeyweb(tasksearch, TT);
		Thread.sleep(3000);

		Clickelement(deletebtn);

		try {
			Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		//		Clickelement(deletebtn);
		//
		//		try {
		//			Alert alert = driver.switchTo().alert();
		//			Thread.sleep(3000);
		//
		//			System.out.println("Alert detected: " + alert.getText());
		//			alert.accept();
		//		} catch (NoAlertPresentException e) {
		//			System.out.println("No alert present.");
		//		}

	}
	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	public WebElement Editcolumn;

	@FindBy(xpath = "//input[@placeholder='0 of 9 selected']")
	public WebElement Editcolumndrpdwn;

	@FindBy(xpath = "//label[normalize-space()='Select All']")
	public WebElement selectall;

	@FindBy(xpath = "//div[@id='editColumnAllTaskModel']//div[@role='document']//div[@class='modal-content']//div//button[@aria-label='Close']")
	public WebElement crossmark;

	public void user_clicks_editcolumns_Task_page() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(Editcolumn);

		Thread.sleep(3000);
		Clickelement(Editcolumndrpdwn);

		Thread.sleep(3000);
		Clickelement(selectall);

		Thread.sleep(3000);
		Clickelement(crossmark);
	}
	@FindBy(xpath = "//div[normalize-space()='Due Today']")
	public WebElement Duetoday;

	@FindBy(xpath = "//div[normalize-space()='Over Due']")
	public WebElement overdue;

	@FindBy(xpath = "//div[normalize-space()='Upcoming']")
	public WebElement upcoming;

	@FindBy(xpath = "//div[contains(text(),'Filter')]")
	public WebElement filter;

	@FindBy(xpath = "//div[@id='editOrganizedTaskFilterModel']//input[@id='task-id-label']")
	public WebElement filterapply;

	@FindBy(xpath = "//div[@id='editOrganizedTaskFilterModel']//button[@type='button'][normalize-space()='Apply']")
	public WebElement Applybtn;

	@FindBy(xpath = "//div[@id='editOrganizedTaskFilterModel']//button[@type='button'][normalize-space()='Clear']")
	public WebElement Clearbtn;

	@FindBy(xpath = "//button[@id='closeModal']")
	public WebElement Crossmark;

	public void user_clicks_filter_in_Task_page(String TT) throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(Duetoday);
		Thread.sleep(3000);
		Clickelement(overdue);
		Thread.sleep(3000);
		Clickelement(upcoming);
		Thread.sleep(3000);
		Clickelement(filter);
		Thread.sleep(3000);
		sendkeyweb(filterapply, TT);
		Thread.sleep(3000);
		Clickelement(Applybtn);
		Thread.sleep(3000);
		Clickelement(filter);
		Thread.sleep(3000);
		Clickelement(Clearbtn);
		Thread.sleep(3000);
		Clickelement(Crossmark);

	}
	@FindBy(xpath = "//div[text()='Due Today ']")
	public WebElement DueToday;

	public void user_clicks_DueToday_Task_page() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(DueToday);

	}	


	@FindBy(xpath = "//div[text()='Over Due ']")
	public WebElement OverDue;

	public void user_clicks_OverDue_Task_page() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(OverDue);

	}	
	@FindBy(xpath = "//div[text()='Upcoming ']")
	public WebElement Upcoming;

	public void user_clicks_Upcoming_Task_page() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(Upcoming);

	}	
	@FindBy(xpath = "//img[@class='dropdown-icon-due']")
	public WebElement Duefilters;
	
	@FindBy(xpath = "//div[text()=' Due Tomorrow ']")
	public WebElement DueTommorrow;
	
	
	@FindBy(xpath = "//div[text()=' Due This Week ']")
	public WebElement Duethisweek;
	
	@FindBy(xpath = "//div[text()=' Due This Month ']")
	public WebElement Duethismonth;
	
	

	public void user_clicks_Duefilters_Task_page() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(Duefilters);
		Thread.sleep(3000);
		
		Clickelement(DueTommorrow);
		Clickelement(Duefilters);
		Thread.sleep(3000);
		Clickelement(Duethisweek);
		Clickelement(Duefilters);
		Thread.sleep(3000);
		Clickelement(Duethismonth);

	}	
	
	@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[1]")
	public WebElement dropdown1;
	
	

	public void user_clicks_dropdwon() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(dropdown1);

	}	
	@FindBy(xpath = "(//span[text()='My Tasks'])[1]")
	public WebElement MyTasks;
	
	

	public void user_clicks_mytasks() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(MyTasks);

	}	
	

	@FindBy(xpath = "//span[normalize-space()='Team Tasks']")
	public WebElement TeamTasks;
	
	

	public void user_clicks_Teamtasks() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(TeamTasks);

	}	
	
	@FindBy(xpath = "//span[contains(text(),'Assigned To')]")
	public WebElement AssignedTo;
	
	

	public void user_clicks_Assignedto() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(AssignedTo);

	}	
	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Created By']")
	public WebElement CreatedBy;
	
	

	public void user_clicks_Createdby() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(CreatedBy);

	}	
	
	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Reviewer']")
	public WebElement Reviewer;
	
	

	public void user_clicks_review() throws InterruptedException {

		Thread.sleep(3000);
		Clickelement(Reviewer);

	}	
}
