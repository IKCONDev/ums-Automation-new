package Objectclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;


public class Actionitem_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Actionitem_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Action Items']")
	public WebElement Actionitemssidemenu;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	public WebElement Actionitemsdropdwnarrow;

	@FindBy(xpath = "//span[normalize-space()='Created By']")
	public WebElement Actionitemscreatedbyclick;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement ActionitemsAddbutton;

	//text validations
	@FindBy(xpath = "//h4[normalize-space()='Add Action Item']")
	public WebElement ValAddActionitems;

	@FindBy(xpath = "//input[@id='actionItemTitle']")
	public WebElement ValActionitemtitleplaceholder;

	@FindBy(xpath = "(//label[@for='actionItemEndDate'])[2]")
	public WebElement ValPlannedstartdateandtime;

	@FindBy(xpath = "(//label[@for='actionItemEndDate'])[3]")
	public WebElement ValPlannedenddateandtime;

	@FindBy(xpath = "(//label[@for='priority'])[2]")
	public WebElement ValPriority;

	@FindBy(xpath = "//label[normalize-space()='Status']")
	public WebElement ValStatus;

	@FindBy(xpath = "(//label[@for='Description'])[2]")
	public WebElement Valdescription;

	@FindBy(xpath = "//textarea[@id='actionItemDescription']")
	public WebElement Valdescriptionplaceholder;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Create'])[1]")
	public WebElement Valcreatebutton;

	@FindBy(xpath = "(//button[@id='closeAddModal'])[1]")
	public WebElement Valcancelbutton;

	@FindBy(xpath = "//input[@id='actionItemTitle']")
	public WebElement Actionitemstitle;

	@FindBy(xpath = "//ng-select[@placeholder='Choose Assignee']//span[@class='ng-arrow-wrapper']")
	public WebElement Actionitemassigneedrpdwn;

	@FindBy(xpath = "(//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Adam Smith'])[1]")
	public WebElement Actionitemassigneeselect;

	@FindBy(xpath = "//input[@name='startDate']")
	public WebElement Actionitemstartdate;

	@FindBy(xpath = "//input[@name='endDate']")
	public WebElement Actionitemenddate;

	@FindBy(xpath = "(//img[@alt='Dropdown icon'])[4]")
	public WebElement Actionitemprioritydrpdwn;

	@FindBy(xpath = "(//img[@alt='Priority Icon'])[4]")
	public WebElement Actionitempriorityselect;

	@FindBy(xpath = "//textarea[@id='actionItemDescription']")
	public WebElement Actionitemdescription;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Create'])[1]")
	public WebElement Actionitemcreate;


	Dateformatter da=new Dateformatter();

	public void user_check_Actionitem_page(String AT, String AD) throws InterruptedException {
		Thread.sleep(3000);

		Clickelement(Actionitemssidemenu);
		Thread.sleep(4000);

		Clickelement(Actionitemsdropdwnarrow);
		Thread.sleep(4000);

		Clickelement(Actionitemscreatedbyclick);
		Thread.sleep(4000);

		Clickelement(ActionitemsAddbutton);
		Thread.sleep(4000);

		validatetext(ValAddActionitems, "Add Action Item");
		Thread.sleep(3000);

		validateattribute(ValActionitemtitleplaceholder, "placeholder", "Enter action item title");
		Thread.sleep(3000);

		validatetext(ValPlannedstartdateandtime, "Planned Start Date & Time*");
		Thread.sleep(3000);

		validatetext(ValPlannedenddateandtime, "Planned End Date & Time*");
		Thread.sleep(3000);

		validatetext(ValPriority, "Priority*");
		Thread.sleep(3000);

		validatetext(ValStatus, "Status");
		Thread.sleep(3000);

		validatetext(Valdescription, "Description*");
		Thread.sleep(3000);

		validateattribute(Valdescriptionplaceholder, "placeholder", "Enter description");
		Thread.sleep(3000);

		validatetext(Valcreatebutton, "Create");
		Thread.sleep(3000);

		validatetext(Valcancelbutton, "Cancel");
		Thread.sleep(3000);

		sendkeyweb(Actionitemstitle, AT);
		Thread.sleep(4000);

		Clickelement(Actionitemassigneedrpdwn);
		Thread.sleep(4000);

		Clickelement(Actionitemassigneeselect);
		Thread.sleep(4000);

		sendkeyweb(Actionitemstartdate, da.Datefun(0,0,0) );
		Thread.sleep(4000);

		sendkeyweb(Actionitemenddate, da.Datefun(0,1,0) );
		Thread.sleep(4000);

		Clickelement(Actionitemprioritydrpdwn);
		Thread.sleep(4000);

		Clickelement(Actionitempriorityselect);
		Thread.sleep(4000);

		sendkeyweb(Actionitemdescription, AD);
		Thread.sleep(4000);

		Clickelement(Actionitemcreate);
		Thread.sleep(4000);


	}
	@FindBy(xpath = "//input[@id='searchActionFilter']")
	public WebElement Actionitemsearch;

	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Actionitemedit;

	@FindBy(xpath = "//ng-select[@id='uAcItemOwner']//span[@class='ng-arrow-wrapper']")
	public WebElement Actionitemupdatedrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Mounika Errolla']")
	public WebElement Actionitemassigneeupdate;

	@FindBy(xpath = "//button[@id='update']")
	public WebElement updatebtn;

	public void user_Update_Actionitem_page(String AT) throws InterruptedException {
		Thread.sleep(3000);
		sendkeyweb(Actionitemsearch, AT);
		Thread.sleep(3000);

		Clickelement(Actionitemedit);
		Thread.sleep(3000);

		Clickelement(Actionitemupdatedrpdwn);
		Thread.sleep(3000);

		Clickelement(Actionitemassigneeupdate);
		Thread.sleep(3000);

		Clickelement(updatebtn);
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement deletebtn;

	public void user_delete_Actionitem_page(String AT) throws InterruptedException {
		Thread.sleep(3000);
		sendkeyweb(Actionitemsearch, AT);
		Thread.sleep(3000);
		Clickelement(deletebtn);
		Thread.sleep(3000);



		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();//		    alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

	}


	@FindBy(xpath = "//div[normalize-space()='+']")
	public WebElement Actionitemplusbtn;

	@FindBy(xpath = "//img[@alt='Add Task']")
	public WebElement Actionitemtaskplusbtn;

	@FindBy(xpath = "//div[@class='input-container']//input[@id='taskTitle']")
	public WebElement Actionitemtasktitle;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	public WebElement Taskassignedtodrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Charan U']")
	public WebElement Taskassignedtodrpdwnselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	public WebElement Taskreviewerdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Mounika Errolla']")
	public WebElement Taskreviewerdrpdwnselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[4]")
	public WebElement Taskcategorydrpdwn;


	@FindBy(xpath = "//span[normalize-space()='Branding']")
	public WebElement Taskcategorydrpdwnselect ;

	@FindBy(xpath = "//textarea[@id='taskDescription']")
	public WebElement ActionitemTaskdescription ;

	@FindBy(xpath = "//button[@class='btn btn-primary saveButton'][normalize-space()='Create']")
	public WebElement ActionitemTaskcreatebtn ;

	@FindBy(xpath = "//div[normalize-space()='Due Today']")
	public WebElement ActionitemDuetoday ;

	@FindBy(xpath = "//div[normalize-space()='Over Due']")
	public WebElement Actionitemoverdue ;

	@FindBy(xpath = "//div[normalize-space()='Upcoming']")
	public WebElement Actionitemupcoming ;


	public void user_create_task_in_Actionitem_page(String AT, String TT, String TD) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);

		sendkeyweb(Actionitemsearch, AT);
		Thread.sleep(4000);

		Clickelement(Actionitemplusbtn);
		Thread.sleep(4000);

		Clickelement(Actionitemtaskplusbtn);
		Thread.sleep(4000);

		sendkeyweb(Actionitemtasktitle, TT);
		Thread.sleep(4000);

		Clickelement(Taskassignedtodrpdwn);
		Thread.sleep(4000);


		Clickelement(Taskassignedtodrpdwnselect);
		Thread.sleep(4000);

		Clickelement(Taskreviewerdrpdwn);
		Thread.sleep(4000);

		Clickelement(Taskreviewerdrpdwnselect);
		Thread.sleep(4000);

		Clickelement(Taskcategorydrpdwn);
		Thread.sleep(4000);

		Clickelement(Taskcategorydrpdwnselect);
		Thread.sleep(4000);

		sendkeyweb(ActionitemTaskdescription, TD);
		Thread.sleep(4000);

		Clickelement(ActionitemTaskcreatebtn);
		Thread.sleep(4000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		Clickelement(ActionitemDuetoday);
		Thread.sleep(3000);
		Clickelement(Actionitemoverdue);
		Thread.sleep(3000);

		Clickelement(Actionitemupcoming);
		Thread.sleep(3000);

	}
	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	public WebElement Editcolumn ;

	@FindBy(xpath = "//input[@placeholder='0 of 8 selected']")
	public WebElement Editcolumndrpdwn;

	@FindBy(xpath = "//label[normalize-space()='Select All']")
	public WebElement Editcolumnselectall;

	@FindBy(xpath = "//div[@id='editAllActionColumnModel']//button[@aria-label='Close']")
	public WebElement Editcolumnxmark;
	public void user_click_editcolumn_in_Actionitem_page() throws InterruptedException {

		Clickelement(Editcolumn);
		Thread.sleep(3000);
		Clickelement(Editcolumndrpdwn);
		Thread.sleep(3000);
		Clickelement(Editcolumnselectall);
		Thread.sleep(3000);

		Clickelement(Editcolumnxmark);
		Thread.sleep(3000);


	}
	@FindBy(xpath = "//div[contains(text(),'Filter')]")
	public WebElement Filter;

	@FindBy(xpath = "//div[@id='editFilterModel']//input[@id='title-id-label']")
	public WebElement FilterApply;

	@FindBy(xpath = "//div[@id='editFilterModel']//button[@type='button'][normalize-space()='Apply']")
	public WebElement Applybtn;

	@FindBy(xpath = "//div[@id='editFilterModel']//button[@type='button'][normalize-space()='Clear']")
	public WebElement Clearbtn;

	@FindBy(xpath = "//div[@id='editFilterModel']//button[@aria-label='Close']")
	public WebElement Crossmark;
	public void user_click_filter_in_Actionitem_page(String AT) throws InterruptedException {

		Clickelement(Filter);
		Thread.sleep(3000);
		sendkeyweb(FilterApply, AT);
		Thread.sleep(3000);
		Clickelement(Applybtn);
		Thread.sleep(3000);

		Clickelement(Clearbtn);
		Thread.sleep(3000);

		Clickelement(Crossmark);
		Thread.sleep(3000);

	}
}
