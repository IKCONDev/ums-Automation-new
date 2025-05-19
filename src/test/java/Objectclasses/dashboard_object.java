//package Objectclasses;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import Drivemanager.Driver;
//import hooks.Baseclass;
//
//	
//	public class dashboard_object extends Baseclass {
//		WebDriver driver = Driver.getDriver();
//		public dashboard_object(WebDriver RC) {
//			driver = RC;
//			PageFactory.initElements(RC, this);
//		}
//		
//		@FindBy(xpath = "//div[normalize-space()='Dashboard']")
//		public WebElement dashboardsidemenu;
//		
//		@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
//		public WebElement dashboarddrpdwnclick;
//		
//		@FindBy(xpath = "//span[normalize-space()='Executive Dashboard']")
//		public WebElement executivedashboardclick;
//		
//		@FindBy(xpath = "//ng-select[@placeholder='Choose Department']//span[@class='ng-arrow-wrapper']")
//		public WebElement choosedeptdrpdwn;
//		
//		@FindBy(xpath = "//span[normalize-space()='Information Technology']")
//		public WebElement deptselect;
//		
//		@FindBy(xpath = "//ng-select[@placeholder='Choose Team']//span[@class='ng-arrow-wrapper']")
//		public WebElement chooseteamdrpdwn;
//		
//		@FindBy(xpath = "//span[normalize-space()='UMS TEAM AUTOMATION']")
//		public WebElement teamselect;
//		
//		@FindBy(xpath = "//ng-select[@placeholder='Choose Employee']//span[@class='ng-arrow-wrapper']")
//		public WebElement chooseemployeedrpdwn;
//		
//		@FindBy(xpath = "//span[normalize-space()='Praveen Reddy']")
//		public WebElement employeeselect;
//		
//		@FindBy(xpath = "//p[normalize-space()='Scheduled Meetings']")
//		public WebElement valscheduledmeetings;
//		
//		@FindBy(xpath = "//b[normalize-space()='All Meetings']")
//		public WebElement valAllMeetings;
//		
//		@FindBy(xpath = "//b[normalize-space()='All Open Action Items']")
//		public WebElement valAllopenactionitems;
//		
//		@FindBy(xpath = "//b[normalize-space()='All Open Risks']")
//		public WebElement valAllopenrisks;
//		
//		@FindBy(xpath = "//b[normalize-space()='All Open Tasks']")
//		public WebElement valAllopentasks;
//		
//		@FindBy(xpath = "//button[normalize-space()='Action Items']")
//		public WebElement dashboardActionitemsclick;
//		
//		@FindBy(xpath = "//h5[normalize-space()='Overdue High-Priority Action Items']")
//		public WebElement valoverdueactionitems;
//		
//		
//		@FindBy(xpath = "//button[normalize-space()='Risks']")
//		public WebElement dashboardRisksclick;
//			
//		
//		@FindBy(xpath = "//button[normalize-space()='Tasks']")
//		public WebElement dashboardTasksclick;
//		
//		@FindBy(xpath = "//p[normalize-space()='Overdue High Priority Tasks']")
//		public WebElement valoverduetasks;
//		
//		
//		
//		public void user_check_dashboard_page() throws InterruptedException {
//
//			
//			Clickelement(dashboardsidemenu);
//			Thread.sleep(3000);
//
//			Clickelement(dashboarddrpdwnclick);
//			Thread.sleep(3000);
//			
//			Clickelement(executivedashboardclick);
//			Thread.sleep(3000);
//
//			Clickelement(choosedeptdrpdwn);
//			Thread.sleep(3000);
//			
//			Clickelement(deptselect);
//			Thread.sleep(3000);
//			
//			Clickelement(chooseteamdrpdwn);
//			Thread.sleep(3000);
//			
//			Clickelement(teamselect);
//			Thread.sleep(3000);
//			
//			Clickelement(chooseemployeedrpdwn);
//			Thread.sleep(3000);
//			
//			Clickelement(employeeselect);
//			Thread.sleep(3000);
//			
//			validatetext(valscheduledmeetings, "Scheduled Meetings");
//			Thread.sleep(3000);
//			
//			validatetext(valAllMeetings, "All Meetings");
//			Thread.sleep(3000);
//
//			validatetext(valAllopenactionitems, "All Open Action Items");
//			Thread.sleep(3000);
//			
//			validatetext(valAllopenrisks, "All Open Risks");
//			Thread.sleep(3000);
//			
//			validatetext(valAllopentasks, "All Open Tasks");
//			Thread.sleep(3000);
//			
//			Clickelement(dashboardActionitemsclick);
//			Thread.sleep(3000);
//			
//			validatetext(valoverdueactionitems, "Overdue High-Priority Action Items");
//			Thread.sleep(3000);
//			
//			Clickelement(dashboardRisksclick);
//			Thread.sleep(3000);
//			
//			Clickelement(dashboardTasksclick);
//			Thread.sleep(3000);
//			
//			validatetext(valoverduetasks, "Overdue High Priority Tasks");
//			Thread.sleep(3000);
//}
//}

package Objectclasses;

import java.util.List;

import org.openqa.selenium.By;
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

	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	public List<WebElement> dropdown;
	@FindBy(xpath="//h3[@class='title']")
	public WebElement title;
	@FindBy(xpath="//button[contains(@class,'button')]")
	public List<WebElement> buttons;

	@FindBy(xpath="//div[@class='fontSizeClass ng-star-inserted']")
	public List<WebElement> Count0;

	@FindBy(xpath="//div[@class='fontSizeClass']")
	public List<WebElement> Count;
	@FindBy(xpath="//div[@class='col-sm-3']//div[@class='card shadowcard']")
	public List<WebElement> Counts;
	@FindBy(xpath="//tr//th")
	public List<WebElement> Table;
	@FindBy(xpath="//div[@class='card shadowcard']//div[@class='row']//div")
	public List<WebElement> Table1;
	@FindBy(xpath="//span[contains(@class,'option')]")
	public List<WebElement> option;
	
	@FindBy(xpath="//thead//tr//th")
	public List<WebElement> table0;


	public void My_Dashboard() {
		validatetext(title, "Dashboard");
		String L="Meetings,Action Items,Risks,Tasks";
		Table_prop(buttons, L);

		String M0="Total meetings:,Organized:,Attended:";
		Table_prop(Count0, M0);

		String M="Avg % spent on work:,Avg % spent on meetings:";
		Table_prop(Count, M);
		String D="My Meetings,My Open Action Items,My Open Risks,My Open Tasks";
		Table_prop(Counts, D);
		String T="Meeting ID,Title,Organizer,Meeting Type,Start Date & Time,End Date & Time,Timezone,Join";
		Table_prop(Table, T);
		///2nd??????
		Clickelement(buttons.get(1));
		String M1="Total Action Items:,High:,Medium:,Low:,Total Action Items:,Yet To Start:,In Progress:,Completed:";
		Table_prop(Count, M1);
		String T1="ID,Title,Description,Assigned To,Department,Planned End Date & Time,Priority,Status,Over Due Days";
		Table_prop(table0, T1);
		//3rd??????
		Clickelement(buttons.get(2));
		for(WebElement e:Count) {
			System.out.println(e.getText());
		}
		String M2="Total Risks:,Very High:,High:,Medium:,Low:,Total Risks:,Open:,In Progress:,Closed:";
		Table_prop(Count, M2);
		String M12="Risk Matrix,Risk Tolerance,Risk Priority";
		Table_prop(Table1, M12);
//		String T2="Impact/Likelihood,Very Unlikely,Unlikely,Moderate,Major,Critical,Critical,Major,Moderate,Minor,Insignificant";
//		Table_prop(Table, T2);
		Clickelement(Table1.get(1));
//		Table_prop(Table, T2);
		Clickelement(Table1.get(2));
//		Table_prop(Table, T2);
		//4th//
		Clickelement(buttons.get(3));
		String M3="Total Tasks:,High:,Medium:,Low:,Total Tasks:,Yet To Start:,In Progress:,Completed:";
		Table_prop(Count, M3);
		String T3="ID,Department,Title,Description,Assigned To,Planned End Date & Time,Status,Over Due Days";
		Table_prop(table0, T3);
//		Clickelement(dropdown.get(1));
//		Clickelement(option.get(1));
//		Clickelement(dropdown.get(2));
//		Clickelement(option.get(1));

	}

	@FindBy(xpath="//ng-select[@placeholder='Choose Team']//span[@class='ng-arrow-wrapper']")
	public WebElement chooseteamdropdown;
	
	@FindBy(xpath="//span[normalize-space()='Testing']")
	public WebElement Teamselect;
	
	@FindBy(xpath="//ng-select[@placeholder='Choose Employee']//span[@class='ng-arrow-wrapper']")
	public WebElement chooseemployeedropdown;

	@FindBy(xpath="//span[contains(text(),'UMS')]")
	public WebElement employeeselect;
	
	public void Team_Dashboard() throws InterruptedException {
		Clickelement(dropdown.get(0));
		WebElement dd_opt =driver.findElement(By.xpath("//span[text()='Team Dashboard']"));
		Clickelement(dd_opt);
		Thread.sleep(3000);
		Clickelement(chooseteamdropdown);
		Thread.sleep(3000);

		Clickelement(Teamselect);
		Thread.sleep(3000);

		Clickelement(chooseemployeedropdown);
		Thread.sleep(3000);

		Clickelement(employeeselect);
		Thread.sleep(3000);


		validatetext(title, "Dashboard");
		String L="Meetings,Action Items,Risks,Tasks";
		Table_prop(buttons, L);
		String M="Total meetings:,Organized:,Attended:,Avg % spent on work:,Avg % spent on meetings:";
		Table_prop(Count, M);

		String D="Team Meetings,Team Open ActionItems, Team Open Risks, Team Open Tasks";
		Table_prop(Counts, D);
		String T="Meeting ID,Title,Organizer,Meeting Type,Start Date & Time,End Date & Time,Timezone,Join";
		Table_prop(Table, T);
		///2nd??????
		Clickelement(buttons.get(1));
		String M1="Total Action Items:, High:, Medium:,Low:,Total Action Items:,Yet To Start:,InProgress:,Completed:,";
		Table_prop(Count, M1);
		String T1="ID,Title,Description,Assigned To,Department,Planned End Date & Time,Priority,Status,Over Due Days";
		Table_prop(Table, T1);
		///3rd??????
		Clickelement(buttons.get(2));
		for(WebElement e:Count) {
			System.out.println(e.getText());
		}
		String M2="Total Risks:,Very High:,High:,Medium:,Low:,Total Risks:,Open:,In Progress:,Closed:";
		Table_prop(Count, M2);
		String M12="Risk Matrix,Risk Tolerance,Risk Priority";
		Table_prop(Table1, M12);
		String T2="Impact/Likelihood,Very Unlikely,Unlikely,Likely,Very Likely,Possible,Catastrophic,Major,Moderate,Minor,Insignificant";
		Table_prop(Table, T2);
		Clickelement(Table1.get(1));
		Table_prop(Table, T2);
		Clickelement(Table1.get(2));
		Table_prop(Table, T2);
		//4th//
		Clickelement(buttons.get(3));
		String M3="Total Tasks:,High:,Medium:,Low:,Total Tasks:,Yet To Start:,In Progress:,Completed:";
		Table_prop(Count, M3);
		String T3="ID,Department,Title,Description,Assigned To,Planned End Date & Time,Status,Over Due Days";
		Table_prop(Table, T3);
//		Clickelement(dropdown.get(1));
//		Clickelement(option.get(1));
//		Clickelement(dropdown.get(2));
//		Clickelement(option.get(1));
//		Clickelement(dropdown.get(3));
//		Clickelement(option.get(2));
//		Clickelement(dropdown.get(4));
//		Clickelement(option.get(2));

	}
	@FindBy(xpath="//ng-select[@placeholder='Choose Team']//span[@class='ng-arrow-wrapper']")
	public WebElement Dptchooseteamdropdown;
	
	@FindBy(xpath="//span[normalize-space()='Security Testing QA']")
	public WebElement DptTeamselect;
	
	@FindBy(xpath="//ng-select[@placeholder='Choose Employee']//span[@class='ng-arrow-wrapper']")
	public WebElement Dptchooseemployeedropdown;
	
	@FindBy(xpath="//span[contains(text(),'BHARAT KUMAR')]")
	public WebElement Dptemployeeselect;
	
	public void Department_Dashboard() throws InterruptedException {
		Clickelement(dropdown.get(0));
		WebElement dd_opt =driver.findElement(By.xpath("//span[text()='Department Head Dashboard']"));
		Clickelement(dd_opt);
		Thread.sleep(3000);
		Clickelement(Dptchooseteamdropdown);
		Thread.sleep(3000);

		Clickelement(DptTeamselect);
		Thread.sleep(3000);

		Clickelement(Dptchooseemployeedropdown);
		Thread.sleep(3000);


		Clickelement(Dptemployeeselect);
		Thread.sleep(3000);


		validatetext(title, "Dashboard");
		String L="Meetings,Action Items,Risks,Tasks";
		Table_prop(buttons, L);
		String M="Total meetings:,Organized:,Attended:,Avg % spent on work:,Avg % spent on work:";
		Table_prop(Count, M);
		String D="Department Meetings,Department Open ActionItems, Department Open Risks, Department Open Tasks";
		Table_prop(Counts, D);
		String T="Meeting ID,Title,Organizer,Meeting Type,Start Date & Time,End Date & Time,Timezone,Join";
		Table_prop(Table, T);
		///2nd??????
		Clickelement(buttons.get(1));
		String M1="Total Action Items:, High:, Medium:,Low:,Total Action Items:,Yet To Start:,In Progress:,Completed:";
		Table_prop(Count, M1);
		String T1="ID,Title,Description,Assigned To,Department,Planned End Date & Time,Priority,Status,Over Due Days";
		Table_prop(Table, T1);
		///3rd??????
		Clickelement(buttons.get(2));
		for(WebElement e:Count) {
			System.out.println(e.getText());
		}
		String M2="Total Risks:,Very High:,High:,Medium:,Low:,Total Risks:,Open:,In Progress:,Closed:";
		Table_prop(Count, M2);
		String M12="Risk Matrix,Risk Tolerance,Risk Priority";
		Table_prop(Table1, M12);
		String T2="Impact/Likelihood,Very Unlikely,Unlikely,Likely,Very Likely,Possible,Catastrophic,Major,Moderate,Minor,Insignificant";
		Table_prop(Table, T2);
		Clickelement(Table1.get(1));
		Table_prop(Table, T2);
		Clickelement(Table1.get(2));
		Table_prop(Table, T2);
		Clickelement(buttons.get(3));
		String M3="Total Tasks:,High:,Medium:,Low:,Total Tasks:,Yet To Start:,In Progress:,Completed:";
		Table_prop(Count, M3);
		String T3="ID,Department,Title,Description,Assigned To,Planned End Date & Time,Status,Over Due Days";
		Table_prop(Table, T3);
//		Clickelement(dropdown.get(1));
//		Clickelement(option.get(1));
//		Clickelement(dropdown.get(2));
//		Clickelement(option.get(1));
//		Clickelement(dropdown.get(3));
//		Clickelement(option.get(2));
//		Clickelement(dropdown.get(4));
//		Clickelement(option.get(2));
//		Clickelement(dropdown.get(5));
//		Clickelement(option.get(2));
	}
	@FindBy(xpath="//div[@class='ng-select-container']//span[@class='ng-arrow-wrapper']")
	public WebElement choosedptdropdown;
	
	@FindBy(xpath="//span[normalize-space()='Information Technology']")
	public WebElement Dptselect;
	
	@FindBy(xpath="//ng-select[@placeholder='Choose Team']//span[@class='ng-arrow-wrapper']")
	public WebElement chooseteamdrpdwn;
	
	@FindBy(xpath="//span[normalize-space()='Information Technology']")
	public WebElement Teamslct;
	
	@FindBy(xpath="//ng-select[@placeholder='Choose Employee']//span[@class='ng-arrow-wrapper']")
	public WebElement chooseemplyedrpdwn;
	
	@FindBy(xpath="//span[normalize-space()='Prabhakaran A']")
	public WebElement emplyeslct;
	
	public void Executive_Dashboard() throws InterruptedException {
		Clickelement(dropdown.get(0));
		WebElement dd_opt =driver.findElement(By.xpath("//span[text()='Executive Dashboard ']"));
		Clickelement(dd_opt);
		Thread.sleep(3000);
		Clickelement(choosedptdropdown);
		Thread.sleep(3000);

		Clickelement(Dptselect);
		Thread.sleep(3000);
		
		Clickelement(chooseteamdrpdwn);
		Thread.sleep(3000);
		
		Clickelement(Teamslct);
		Thread.sleep(3000);
		
		Clickelement(chooseemplyedrpdwn);
		Thread.sleep(3000);
		
		Clickelement(emplyeslct);
		Thread.sleep(3000);

		validatetext(title, "Dashboard");
		String L="Meetings,Action Items,Risks,Tasks";
		Table_prop(buttons, L);
		String M="Total meetings:,Organized:,Attended:,Avg % spent on work:,Avg % spent on meetings:";
		Table_prop(Count, M);
		String D="All Meetings,All Open ActionItems, All Open Risks, All Open Tasks";
		Table_prop(Counts, D);
		String T="Meeting ID,Title,Organizer,Meeting Type,Start Date & Time,End Date & Time,Timezone,Join";
		Table_prop(Table, T);
		///2nd??????
		Clickelement(buttons.get(1));
		String M1="Total Action Items:, High:, Medium:,Low:,Total Action Items:,Yet To Start:,InProgress:,Completed:";
		Table_prop(Count, M1);
		String T1="ID,Title,Description,Assigned To,Department,Planned End Date & Time,Priority,Status,Over Due Days";
		Table_prop(Table, T1);
		///3rd??????
		Clickelement(buttons.get(2));
		for(WebElement e:Count) {
			System.out.println(e.getText());
		}
		String M2="Total Risks:,Very High:,High:,Medium:,Low:,Total Risks:,Open:,In Progress:,Closed:";
		Table_prop(Count, M2);
		String M12="Risk Matrix,Risk Tolerance,Risk Priority";
		Table_prop(Table1, M12);
		String T2="Impact/Likelihood,Very Unlikely,Unlikely,Likely,Very Likely,Possible,Catastrophic,Major,Moderate,Minor,Insignificant";
		Table_prop(Table, T2);
		Clickelement(Table1.get(1));
		Table_prop(Table, T2);
		Clickelement(Table1.get(2));
		Table_prop(Table, T2);
		Clickelement(buttons.get(3));
		String M3="Total Tasks:,High:,Medium:,Low:,Total Tasks:,Yet To Start:,In Progress:,Completed:";
		Table_prop(Count, M3);
		String T3="ID,Department,Title,Description,Assigned To,Planned End Date & Time,Status,Over Due Days";
		Table_prop(Table, T3);
//		Clickelement(dropdown.get(1));
//		Clickelement(option.get(1));
//		Clickelement(dropdown.get(2));
//		Clickelement(option.get(1));
//		Clickelement(dropdown.get(3));
//		Clickelement(option.get(2));
//		Clickelement(dropdown.get(4));
//		Clickelement(option.get(2));
//		Clickelement(dropdown.get(5));
//		Clickelement(option.get(2));
	}



}
