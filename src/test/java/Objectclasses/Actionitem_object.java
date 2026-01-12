package Objectclasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


	Dateformatter da=new Dateformatter();

	public void user_navigates_to_Actionitem_page() throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Actionitemssidemenu);
		Thread.sleep(3000);
		Clickelement(Actionitemsdropdwnarrow);
		Thread.sleep(3000);

		Clickelement(Actionitemscreatedbyclick);

	}


	@FindBy(xpath = "//tr//th")
	public List<WebElement> risktable;


	public void user_validates_the_Actionitem_page() throws InterruptedException {
		String s = " ,Action Item ID,Meeting ID,Title,Assigned To,Planned Start Date & Time,Planned End Date & Time,Priority,Status,Over Due Days,Edit,Delete";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i <= 11; i++) {
			validatetext(risktable.get(i), list.get(i));
		}

	}

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

	@FindBy(xpath = "(//button[@id='closeAddModal'])[2]")
	public WebElement Valcancelbutton;

	@FindBy(xpath = "//input[@id='actionItemTitle']")
	public WebElement Actionitemstitle;

	@FindBy(xpath = "//ng-select[@placeholder='Choose Assignee']//span[@class='ng-arrow-wrapper']")
	public WebElement Actionitemassigneedrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS TEST']")
	public List<WebElement> Actionitemassigneeselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[7]")
	public WebElement Actionitemreviewerdrpdwn;


	@FindBy(xpath = "//span[normalize-space()='Anupama Shetty']")
	public List<WebElement> Actionitemreviewerselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[8]")
	public WebElement Actionitemcategorydrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Testing']")
	public WebElement Actionitemcategoryselect;

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



	public void user_adds_actioinitem_in_Actionitem_page(String AT, String AD) throws InterruptedException {
		Thread.sleep(3000);



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

		clickmultipleweb(Actionitemassigneeselect);
		Thread.sleep(4000);

		Clickelement(Actionitemreviewerdrpdwn);
		Thread.sleep(4000);

		clickmultipleweb(Actionitemreviewerselect);
		Thread.sleep(4000);

		Clickelement(Actionitemcategorydrpdwn);
		Thread.sleep(4000);

		Clickelement(Actionitemcategoryselect);
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
	public WebElement Actionitem_search;
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Edit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Delete_icon;

	public void user_validate_the_added_actionitem_in_Actionitems_page(String AT) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		sendkeyweb(Actionitem_search,AT);

		String AID = driver.findElement(By.xpath("(//td[normalize-space()='"+AT+"']/preceding-sibling::td)[2]")).getText();
		String[] S = {"UMS SUPPORT","","","High","Yet to start","NA"};


		List<WebElement> valid=driver.findElements(By.xpath("//td[normalize-space()='" + AT + "']/following-sibling::td"));
		valid.size();

		try {
			int i=0;
			for(WebElement e:valid) {

				validatetext(e, S[i]);
				i++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//input[@id='searchActionFilter']")
	public WebElement Actionitemsearch;

	@FindBy(xpath = "//ng-select[@id='uAcItemOwner']//span[@class='ng-arrow-wrapper']")
	public WebElement Actionitemupdatedrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS TEST']")
	public WebElement Actionitemassigneeupdate;

	@FindBy(xpath = "//button[@id='update']")
	public WebElement updatebtn;

	public void user_Update_Actionitem_page(String AT) throws InterruptedException {
		Thread.sleep(3000);
		sendkeyweb(Actionitemsearch, AT);
		Thread.sleep(3000);

		Clickelement(Edit_icon);
		Thread.sleep(3000);

		Clickelement(Actionitemupdatedrpdwn);
		Thread.sleep(3000);

		Clickelement(Actionitemassigneeupdate);
		Thread.sleep(3000);

		Clickelement(updatebtn);
		Thread.sleep(3000); 
	}


	public void user_validate_the_Updated_actionitem_in_Actionitems_page(String AT) throws InterruptedException {

		user_validate_the_added_actionitem_in_Actionitems_page(AT);

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

	@FindBy(xpath = "//img[@alt='Add ActionItem']")
	public WebElement Actionitemtaskplusbtn;

	@FindBy(xpath = "//div[@class='input-container']//input[@id='taskTitle']")
	public WebElement Actionitemtasktitle;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	public WebElement Taskassignedtodrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS SUPPORT']")
	public List<WebElement> Taskassignedtodrpdwnselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	public WebElement Taskreviewerdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS SUPPORT']")
	public List<WebElement> Taskreviewerdrpdwnselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[4]")
	public WebElement Taskcategorydrpdwn;


	@FindBy(xpath = "//span[normalize-space()='jhxcvkjhgfhj']")
	public WebElement Taskcategorydrpdwnselect ;

	@FindBy(xpath = "//textarea[@id='taskDescription']")
	public WebElement ActionitemTaskdescription ;

	@FindBy(xpath = "//button[@class='btn btn-primary saveButton'][normalize-space()='Create']")
	public WebElement ActionitemTaskcreatebtn ;




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


		clickmultipleweb(Taskassignedtodrpdwnselect);
		Thread.sleep(4000);

		Clickelement(Taskreviewerdrpdwn);
		Thread.sleep(4000);

		clickmultipleweb(Taskreviewerdrpdwnselect);
		Thread.sleep(4000);

		Clickelement(Taskcategorydrpdwn);
		Thread.sleep(4000);

		Clickelement(Taskcategorydrpdwnselect);
		Thread.sleep(4000);

		sendkeyweb(ActionitemTaskdescription, TD);
		Thread.sleep(4000);

		Clickelement(ActionitemTaskcreatebtn);
		Thread.sleep(4000);

		//		driver.navigate().refresh();
		//		Thread.sleep(3000);

	}

	@FindBy(xpath = "//input[@class='search-box']")
	public WebElement tasksearch ;

	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement taskediticon ;

	@FindBy(xpath = "//input[@id='orgTaskTitle']")
	public WebElement updatetasktitle ;

	public void user_update_task_in_Actionitem_page(String AT, String TT, String TD) throws InterruptedException {


		sendkeyweb(tasksearch, TT);
		Thread.sleep(4000);


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

	//@FindBy(xpath = "//div[normalize-space()='Due Today']")
	//	public WebElement ActionitemDuetoday ;
	//
	//	@FindBy(xpath = "//div[normalize-space()='Over Due']")
	//	public WebElement Actionitemoverdue ;
	//
	//	@FindBy(xpath = "//div[normalize-space()='Upcoming']")
	//	public WebElement Actionitemupcoming ;
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

		//		Clickelement(ActionitemDuetoday);
		//		Thread.sleep(3000);
		//		Clickelement(Actionitemoverdue);
		//		Thread.sleep(3000);
		//
		//		Clickelement(Actionitemupcoming);
		//		Thread.sleep(3000);

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

	@FindBy(xpath = "//span[normalize-space()='All Action Items']")
	public WebElement Allactionitems;

	public void user_navigates__to_All_Actionitem_page() throws InterruptedException {

		Clickelement(Actionitemsdropdwnarrow);
		Thread.sleep(3000);

		Clickelement(Allactionitems);
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//span[normalize-space()='My Action Items']")
	public WebElement Myactionitems;

	public void user_navigates__to_My_Actionitem_page() throws InterruptedException {

		Clickelement(Actionitemsdropdwnarrow);
		Thread.sleep(3000);

		Clickelement(Myactionitems);
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//span[contains(text(),'Assigned To')]")
	public WebElement Assignedtoactionitems;

	public void user_navigates__to_Assignedto_Actionitem_page() throws InterruptedException {

		Clickelement(Actionitemsdropdwnarrow);
		Thread.sleep(3000);

		Clickelement(Assignedtoactionitems);
		Thread.sleep(3000);

	}
}
