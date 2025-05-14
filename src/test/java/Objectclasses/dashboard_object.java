package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

	
	public class dashboard_object extends Baseclass {
		WebDriver driver = Driver.getDriver();
		public dashboard_object(WebDriver RC) {
			driver = RC;
			PageFactory.initElements(RC, this);
		}
		
		@FindBy(xpath = "//div[normalize-space()='Dashboard']")
		public WebElement dashboardsidemenu;
		
		@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
		public WebElement dashboarddrpdwnclick;
		
		@FindBy(xpath = "//span[normalize-space()='Executive Dashboard']")
		public WebElement executivedashboardclick;
		
		@FindBy(xpath = "//ng-select[@placeholder='Choose Department']//span[@class='ng-arrow-wrapper']")
		public WebElement choosedeptdrpdwn;
		
		@FindBy(xpath = "//span[normalize-space()='Information Technology']")
		public WebElement deptselect;
		
		@FindBy(xpath = "//ng-select[@placeholder='Choose Team']//span[@class='ng-arrow-wrapper']")
		public WebElement chooseteamdrpdwn;
		
		@FindBy(xpath = "//span[normalize-space()='UMS TEAM AUTOMATION']")
		public WebElement teamselect;
		
		@FindBy(xpath = "//ng-select[@placeholder='Choose Employee']//span[@class='ng-arrow-wrapper']")
		public WebElement chooseemployeedrpdwn;
		
		@FindBy(xpath = "//span[normalize-space()='Praveen Reddy']")
		public WebElement employeeselect;
		
		@FindBy(xpath = "//p[normalize-space()='Scheduled Meetings']")
		public WebElement valscheduledmeetings;
		
		@FindBy(xpath = "//b[normalize-space()='All Meetings']")
		public WebElement valAllMeetings;
		
		@FindBy(xpath = "//b[normalize-space()='All Open Action Items']")
		public WebElement valAllopenactionitems;
		
		@FindBy(xpath = "//b[normalize-space()='All Open Risks']")
		public WebElement valAllopenrisks;
		
		@FindBy(xpath = "//b[normalize-space()='All Open Tasks']")
		public WebElement valAllopentasks;
		
		@FindBy(xpath = "//button[normalize-space()='Action Items']")
		public WebElement dashboardActionitemsclick;
		
		@FindBy(xpath = "//h5[normalize-space()='Overdue High-Priority Action Items']")
		public WebElement valoverdueactionitems;
		
		
		@FindBy(xpath = "//button[normalize-space()='Risks']")
		public WebElement dashboardRisksclick;
			
		
		@FindBy(xpath = "//button[normalize-space()='Tasks']")
		public WebElement dashboardTasksclick;
		
		@FindBy(xpath = "//p[normalize-space()='Overdue High Priority Tasks']")
		public WebElement valoverduetasks;
		
		
		
		public void user_check_dashboard_page() throws InterruptedException {

			
			Clickelement(dashboardsidemenu);
			Thread.sleep(3000);

			Clickelement(dashboarddrpdwnclick);
			Thread.sleep(3000);
			
			Clickelement(executivedashboardclick);
			Thread.sleep(3000);

			Clickelement(choosedeptdrpdwn);
			Thread.sleep(3000);
			
			Clickelement(deptselect);
			Thread.sleep(3000);
			
			Clickelement(chooseteamdrpdwn);
			Thread.sleep(3000);
			
			Clickelement(teamselect);
			Thread.sleep(3000);
			
			Clickelement(chooseemployeedrpdwn);
			Thread.sleep(3000);
			
			Clickelement(employeeselect);
			Thread.sleep(3000);
			
			validatetext(valscheduledmeetings, "Scheduled Meetings");
			Thread.sleep(3000);
			
			validatetext(valAllMeetings, "All Meetings");
			Thread.sleep(3000);

			validatetext(valAllopenactionitems, "All Open Action Items");
			Thread.sleep(3000);
			
			validatetext(valAllopenrisks, "All Open Risks");
			Thread.sleep(3000);
			
			validatetext(valAllopentasks, "All Open Tasks");
			Thread.sleep(3000);
			
			Clickelement(dashboardActionitemsclick);
			Thread.sleep(3000);
			
			validatetext(valoverdueactionitems, "Overdue High-Priority Action Items");
			Thread.sleep(3000);
			
			Clickelement(dashboardRisksclick);
			Thread.sleep(3000);
			
			Clickelement(dashboardTasksclick);
			Thread.sleep(3000);
			
			validatetext(valoverduetasks, "Overdue High Priority Tasks");
			Thread.sleep(3000);
}
}