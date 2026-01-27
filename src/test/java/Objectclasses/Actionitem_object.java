package Objectclasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		Clickelement(Actionitemssidemenu);
		Clickelement(Actionitemsdropdwnarrow);
		Clickelement(Actionitemscreatedbyclick);

	}


	@FindBy(xpath = "//tr//th")
	public List<WebElement> risktable;


	public void user_validates_the_Actionitem_page() throws InterruptedException {
		String s = " ,Action Item ID,Meeting ID,Title,Assigned To,Planned Start Date & Time,Planned End Date & Time,Priority,Status,Over Due Days,Edit,Delete,Jira";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i <= 12; i++) {
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


	@FindBy(xpath = "//span[normalize-space()='Kethu Vinod']")
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

		Clickelement(ActionitemsAddbutton);

		validatetext(ValAddActionitems, "Add Action Item");

		validateattribute(ValActionitemtitleplaceholder, "placeholder", "Enter action item title");

		validatetext(ValPlannedstartdateandtime, "Planned Start Date & Time*");

		validatetext(ValPlannedenddateandtime, "Planned End Date & Time*");

		validatetext(ValPriority, "Priority*");

		validatetext(ValStatus, "Status");


		validatetext(Valdescription, "Description*");


		validateattribute(Valdescriptionplaceholder, "placeholder", "Enter description");


		validatetext(Valcreatebutton, "Create");
		validatetext(Valcancelbutton, "Cancel");

		sendkeyweb(Actionitemstitle, AT);

		Clickelement(Actionitemassigneedrpdwn);

		clickmultipleweb(Actionitemassigneeselect);


		Clickelement(Actionitemreviewerdrpdwn);


		clickmultipleweb(Actionitemreviewerselect);


		Clickelement(Actionitemcategorydrpdwn);

		Clickelement(Actionitemcategoryselect);

		sendkeyweb(Actionitemstartdate, da.Datefun(0,0,0) );

		sendkeyweb(Actionitemenddate, da.Datefun(0,1,0) );

		Clickelement(Actionitemprioritydrpdwn);

		Clickelement(Actionitempriorityselect);

		sendkeyweb(Actionitemdescription, AD);

		Clickelement(Actionitemcreate);


	}
	@FindBy(xpath = "//input[@id='searchActionFilter']")
	public WebElement Actionitem_search;
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Edit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Delete_icon;

	public void user_validate_the_added_actionitem_in_Actionitems_page(String AT) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Actionitem_search,AT+Keys.ENTER);

		String AID = driver.findElement(By.xpath("(//td[normalize-space()='"+AT+"']/preceding-sibling::td)[2]")).getText();
		String[] S = {"UMS TEST","","","High","Yet to start","NA"};


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

		attributeselected(Delete_icon, "Delete icon");
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
		sendkeyweb(Actionitemsearch, AT+Keys.ENTER);

		Clickelement(Edit_icon);

		Clickelement(Actionitemupdatedrpdwn);

		Clickelement(Actionitemassigneeupdate);

		Clickelement(updatebtn);
	}


	public void user_validate_the_Updated_actionitem_in_Actionitems_page(String AT) throws InterruptedException {

		user_validate_the_added_actionitem_in_Actionitems_page(AT);

	}

	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement deletebtn;

	public void user_delete_Actionitem_page(String AT) throws InterruptedException {
		sendkeyweb(Actionitemsearch, AT+Keys.ENTER);
		Clickelement(deletebtn);



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

	@FindBy(xpath = "//span[normalize-space()='UMS TEST']")
	public List<WebElement> Taskassignedtodrpdwnselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	public WebElement Taskreviewerdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS TEST']")
	public List<WebElement> Taskreviewerdrpdwnselect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[4]")
	public WebElement Taskcategorydrpdwn;


	@FindBy(xpath = "//span[normalize-space()='Testing']")
	public WebElement Taskcategorydrpdwnselect ;

	@FindBy(xpath = "//textarea[@id='taskDescription']")
	public WebElement ActionitemTaskdescription ;

	@FindBy(xpath = "//button[@class='btn btn-primary saveButton'][normalize-space()='Create']")
	public WebElement ActionitemTaskcreatebtn ;




	public void user_create_task_in_Actionitem_page(String AT, String TT, String TD) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Actionitemsearch, AT+Keys.ENTER);


		Clickelement(Actionitemplusbtn);

		Clickelement(Actionitemtaskplusbtn);

		sendkeyweb(Actionitemtasktitle, TT);

		Clickelement(Taskassignedtodrpdwn);

		clickmultipleweb(Taskassignedtodrpdwnselect);

		Clickelement(Taskreviewerdrpdwn);

		clickmultipleweb(Taskreviewerdrpdwnselect);

		Clickelement(Taskcategorydrpdwn);

		Clickelement(Taskcategorydrpdwnselect);

		sendkeyweb(ActionitemTaskdescription, TD);

		Clickelement(ActionitemTaskcreatebtn);

		//		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//input[@class='search-box']")
	public WebElement tasksearch ;

	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement taskediticon ;

	//	@FindBy(xpath = "//input[@id='orgTaskTitle']")
	//	public WebElement updatetasktitle ;

	@FindBy(xpath = "//button[@class='btn btn-primary saveButton'][normalize-space()='Update']")
	public WebElement taskupdatebtn ;



	public void user_update_task_in_Actionitem_page(String AT, String TT, String TD) throws InterruptedException {


		sendkeyweb(tasksearch, TT+Keys.ENTER);

		Clickelement(taskediticon);

		Clickelement(taskupdatebtn);
		driver.navigate().refresh();

	}

	public void user_delete_task_in_Actionitem_page(String AT, String TT, String TD) throws InterruptedException {


		sendkeyweb(tasksearch, TT+Keys.ENTER);

		Clickelement(driver.findElement(By.xpath("//tr[td[normalize-space()='" + TT + "']]//input[@type='checkbox']")));


	}

	@FindBy(xpath = "//h3[contains(normalize-space(),'Action Item Details')]")
	public WebElement AD_title;
	@FindBy(xpath = "//h6")
	public List<WebElement> AD_head;
	@FindBy(xpath = "//div[contains(@class,'col-sm')]//*[name()='svg']")
	public List<WebElement> AD_edit;

	@FindBy(xpath = "(//h6[normalize-space()='Details']/following::span)[1]")
	public WebElement AD_save;

	@FindBy(xpath = "//textarea[@id='addCommentDescription']")
	public WebElement Actioncomments;

	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	public WebElement Tasktitle;

	@FindBy(xpath = "(//div[@role='option'][normalize-space()='Select'])[1]")
	public WebElement Taskcatdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Testing']")
	public List<WebElement> Taskcatdrpdwnslct;

	@FindBy(xpath = "(//div[@role='option'][normalize-space()='Select'])[3]")
	public WebElement Taskassigneddtodrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS TEST']")
	public List<WebElement> Taskassigneedrpdwnslct;

	@FindBy(xpath = "(//div[@role='option'][normalize-space()='Select'])[5]")
	public WebElement Taskreviewrdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS TEST']")
	public List<WebElement> Taskrwrdrpdwnslct;

	@FindBy(xpath = "//textarea[@placeholder='Add Descrption']")
	public WebElement Taskdescription;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Tasksavebtn;

	public void user_checks_actionitem_details(String AT, String TT1, String TD1) throws InterruptedException {
		sendkeyweb(Actionitem_search,AT+Keys.ENTER);
		WebElement Actionitem_ID=driver.findElement(By.xpath("(//td[normalize-space()='"+AT+"']/preceding-sibling::td)[2]"));
		Clickelement(Actionitem_ID);
		validatetext(AD_title, "Action Item Details");
		String L="Details,Description,Comments,Add Tasks,History";
		List<String> list = new ArrayList<String>(Arrays.asList(L.split(",")));
		int i=0;
		for (WebElement e : AD_head) {
			validatetext(e, list.get(i));
			i++;
		}

		Clickelement(AD_edit.get(0));

		//		sendkeyweb(AD_title, AT);
		//		Clickelement(RD_Assignedtodrpdwn);
		//		Thread.sleep(3000);
		//		clickmultipleweb(RD_Assignedtoselect);
		//		Thread.sleep(4000);

		Clickelement(AD_save);
		Thread.sleep(3000);

		sendkeyweb(Actioncomments, "gjklkjrhjsdfgh");
		Clickelement(AD_edit.get(2));


		Clickelement(AD_edit.get(3));

		sendkeyweb(Tasktitle, TT1);

		Clickelement(Taskcatdrpdwn);
		clickmultipleweb(Taskcatdrpdwnslct);


		Clickelement(Taskassigneddtodrpdwn);
		clickmultipleweb(Taskassigneedrpdwnslct);


		Clickelement(Taskreviewrdrpdwn);
		clickmultipleweb(Taskrwrdrpdwnslct);

		sendkeyweb(Taskdescription, TD1);

		Clickelement(Tasksavebtn);



		//		Clickelement(AD_edit.get(1));

		//		sendkeyweb(RD_riskdes, RD);

		//		Clickelement(RD_description_save);

		driver.navigate().back();

	}
	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	public WebElement Editcolumn ;

	@FindBy(xpath = "//input[@placeholder='0 of 11 selected']")
	public WebElement Editcolumndrpdwn;

	@FindBy(xpath = "//label[normalize-space()='Select All']")
	public WebElement Editcolumnselectall;

	@FindBy(xpath = "//div[@id='editAllActionColumnModel']//button[@aria-label='Close']")
	public WebElement Editcolumnxmark;
	public void user_click_editcolumn_in_Actionitem_page() throws InterruptedException {

		Clickelement(Editcolumn);
		Clickelement(Editcolumndrpdwn);
		Clickelement(Editcolumnselectall);

		Clickelement(Editcolumnxmark);


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
		sendkeyweb(FilterApply, AT);
		Clickelement(Applybtn);

		Clickelement(Clearbtn);
		Thread.sleep(3000);

		Clickelement(Crossmark);
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//span[normalize-space()='All Action Items']")
	public WebElement Allactionitems;

	public void user_navigates__to_All_Actionitem_page() throws InterruptedException {

		Clickelement(Actionitemsdropdwnarrow);

		Clickelement(Allactionitems);

	}

	@FindBy(xpath = "//span[normalize-space()='My Action Items']")
	public WebElement Myactionitems;

	public void user_navigates__to_My_Actionitem_page() throws InterruptedException {

		Clickelement(Actionitemsdropdwnarrow);

		Clickelement(Myactionitems);

	}

	@FindBy(xpath = "//span[contains(text(),'Assigned To')]")
	public WebElement Assignedtoactionitems;

	public void user_navigates__to_Assignedto_Actionitem_page() throws InterruptedException {

		Clickelement(Actionitemsdropdwnarrow);

		Clickelement(Assignedtoactionitems);

	}
}
