package Objectclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Reports_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Reports_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	

	//	@FindBy(xpath = "//div[normalize-space()='Reports']")
	//	public WebElement Reports;

	@FindBy(xpath = "(//a[@class='no-wrap'])[1]")
	public WebElement Meetingfrequencytrend;

	@FindBy(xpath = "//tr//th")
	public List<WebElement> Table;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement Search;

	@FindBy(xpath = "//tr//td")
	public List<WebElement> Tabledata;

	@FindBy(xpath = "(//a[@class='no-wrap'])[2]")
	public WebElement Meetingefficiencyreport;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Table1;

	@FindBy(xpath = "//tbody//tr//td")
	public List<WebElement> Tabledata1;

	@FindBy(xpath = "(//a[@class='no-wrap'])[3]")
	public WebElement Departmentmeetingefficiency;

	@FindBy(xpath = "(//a[@class='no-wrap'])[4]")
	public WebElement Meetingsummaryreport;

	@FindBy(xpath = "(//a[@class='no-wrap'])[5]")
	public WebElement Employeeperformancereport;

	public void user_check_Meeting_Reports_page() throws InterruptedException {
		Thread.sleep(3000);

		Clickelement(Reports);
		Clickelement(Meetingfrequencytrend);
		String s= "S.No.,Department,Weekly,Monthly,Yearly";

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i <=4; i++) {
			validatetext(Table.get(i), list.get(i));
		}

		sendkeyweb(Search, "Information Technology");


		attributeselected(Tabledata.get(0), "Sno");
		validatetext(Tabledata.get(1), "Information Technology");
		validatetext(Tabledata.get(2), "");
		validatetext(Tabledata.get(3), "");
		validatetext(Tabledata.get(4), "");

		driver.navigate().back();

		Clickelement(Meetingefficiencyreport);
		Thread.sleep(3000);
		sendkeyweb(Search, "Scrum Meeting");


		String t= "Meeting ID,Title,Organizer,Department,Start Date & Time,End Date & Time,Avg Scheduled Duration,Avg Actual Duration,Avg Efficiency Ratio,Meeting On Time(%)";

		List<String> list1 = new ArrayList<String>(Arrays.asList(t.split(",")));
		for (int i = 0; i <=9; i++) {
			validatetext(Table.get(i), list1.get(i));
		}

		Thread.sleep(3000);		
		attributeselected(Tabledata.get(0), "ID");
		validatetext(Tabledata.get(1), "Scrum Meeting");
		validatetext(Tabledata.get(2), "Sasi Rekha");
		validatetext(Tabledata.get(3), "Information Technology");
		validatetext(Tabledata.get(4), "");
		validatetext(Tabledata.get(5), "");
		validatetext(Tabledata.get(6), "15 min");
		validatetext(Tabledata.get(7), "15 min");
		validatetext(Tabledata.get(8), "1");
		validatetext(Tabledata.get(9), "Yes");

		driver.navigate().back();

		Clickelement(Departmentmeetingefficiency);
		Thread.sleep(3000);

		String a= "Department Name,Avg Scheduled Duration,Avg Actual Duration,Avg Efficiency Ratio,Meeting on Time";

		List<String> list2 = new ArrayList<String>(Arrays.asList(a.split(",")));
		for (int i = 0; i <=4; i++) {
			validatetext(Table1.get(i), list2.get(i));
		}

		sendkeyweb(Search, "Accounts & Finance");

		validatetext(Tabledata.get(0), "Accounts & Finance");
		validatetext(Tabledata.get(1), "");
		validatetext(Tabledata.get(2), "");
		validatetext(Tabledata.get(3), "");
		validatetext(Tabledata.get(4), "");

		driver.navigate().back();
		Clickelement(Meetingsummaryreport);
		Thread.sleep(3000);

		String b= "Meeting ID,Title,Start Date & Time,End Date & Time,Organizer,Department,Team Name,Total Action Items,Completed Action Items,Total Tasks,Completed Tasks,Total Risks,Completed Risks,ActionItems Completion Percentage,Tasks Completion Percentage,Risks Completion Percentage,Attendance Rate,Average Attendance Duration";

		List<String> list3 = new ArrayList<String>(Arrays.asList(b.split(",")));
		for (int i = 0; i <=17; i++) {
			validatetext(Table1.get(i), list3.get(i));
		}
		driver.navigate().back();


		Clickelement(Employeeperformancereport);

		Thread.sleep(3000);
		String c= "Employee Name,Action Items Assigned,Action Items Completed,Action Items Completed(%),Tasks Assigned,Tasks Completed,Tasks Completed(%),Risks Assigned,Risks Mitigated,Risks Mitigated(%)";

		List<String> list4 = new ArrayList<String>(Arrays.asList(c.split(",")));
		for (int i = 0; i <=9; i++) {
			validatetext(Table1.get(i), list4.get(i));
		}

		sendkeyweb(Search, "dwarak chandra jarathi");

		validatetext(Tabledata1.get(0), "dwarak chandra jarathi");
		validatetext(Tabledata1.get(1), "");
		validatetext(Tabledata1.get(2), "");
		validatetext(Tabledata1.get(3), "");
		validatetext(Tabledata1.get(4), "");
		validatetext(Tabledata1.get(5), "");
		validatetext(Tabledata1.get(6), "");
		validatetext(Tabledata1.get(7), "");
		validatetext(Tabledata1.get(8), "");
		validatetext(Tabledata1.get(9), "");
	}


	//	@FindBy(xpath = "//div[normalize-space()='Reports']")
	//	public WebElement Reports;

	@FindBy(xpath = "(//a[@class='no-wrap'])[6]")
	public WebElement Actionitemefficiency;

	@FindBy(xpath = "//tr//th")
	public List<WebElement> Table2;

	@FindBy(xpath = "(//a[@class='no-wrap'])[7]")
	public WebElement Actionitemsbystatus;

	@FindBy(xpath = "//td")
	public List<WebElement> Tabledata2;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement Search2;

	@FindBy(xpath = "(//a[@class='no-wrap'])[8]")
	public WebElement Actionitemsoverdue;

	@FindBy(xpath = "(//a[@class='no-wrap'])[9]")
	public WebElement Actionitemsbypriority;

	@FindBy(xpath = "(//a[@class='no-wrap'])[10]")
	public WebElement Actionitemswithdeviations;

	public void user_check_Actionitem_Reports_page() throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Reports);
		Thread.sleep(3000);

		Clickelement(Actionitemefficiency);


		String a= "S.No.,Department,Avg Planned Duration,Avg Actual Duration,Avg Efficiency Ratio,Action Items On Time";

		List<String> list1 = new ArrayList<String>(Arrays.asList(a.split(",")));
		for (int i = 0; i <=5; i++) {
			validatetext(Table2.get(i), list1.get(i));
		}

		driver.navigate().back();

		Clickelement(Actionitemsbystatus);

		String b= "S.No.,Department,Total Action Items,Open,InProgress,Completed";

		List<String> list2 = new ArrayList<String>(Arrays.asList(b.split(",")));
		for (int i = 0; i <=5; i++) {
			validatetext(Table2.get(i), list2.get(i));
		}
		sendkeyweb(Search2, "Information Technology");

		validatetext(Tabledata2.get(0), "");
		validatetext(Tabledata2.get(1), "Information Technology");
		validatetext(Tabledata2.get(2), "");
		validatetext(Tabledata2.get(3), "");
		validatetext(Tabledata2.get(4), "");
		validatetext(Tabledata2.get(5), "");

		driver.navigate().back();

		Clickelement(Actionitemsoverdue);
		String c= "Action Item ID,Department,Title,Description,Assigned To,Planned Start Date,Planned End Date,Actual Start Date,Actual End Date,Days Overdue";

		List<String> list3 = new ArrayList<String>(Arrays.asList(c.split(",")));
		for (int i = 0; i <=9; i++) {
			validatetext(Table2.get(i), list3.get(i));
		}

		driver.navigate().back();


		Clickelement(Actionitemsbypriority);

		String d= "S.No.,Department,Total Action Items,High,Medium,Low,Action Items On Time";

		List<String> list4 = new ArrayList<String>(Arrays.asList(d.split(",")));
		for (int i = 0; i <=6; i++) {
			validatetext(Table2.get(i), list4.get(i));
		}

		sendkeyweb(Search2, "Information Technology");

		validatetext(Tabledata2.get(0), "");
		validatetext(Tabledata2.get(1), "Information Technology");
		validatetext(Tabledata2.get(2), "");
		validatetext(Tabledata2.get(3), "");
		validatetext(Tabledata2.get(4), "");
		validatetext(Tabledata2.get(5), "");
		validatetext(Tabledata2.get(6), "");

		driver.navigate().back();

		Clickelement(Actionitemswithdeviations);
		String e= "Action Item ID,Department,Title,Description,Assigned To,Planned Start Date,Actual Start Date,Planned End Date,Actual End Date,Deviation,Deviation Percentage";

		List<String> list5 = new ArrayList<String>(Arrays.asList(e.split(",")));
		for (int i = 0; i <=10; i++) {
			validatetext(Table2.get(i), list5.get(i));
		}

	}

	//	@FindBy(xpath = "//div[normalize-space()='Reports']")
	//	public WebElement Reports;

	@FindBy(xpath = "(//a[@class='no-wrap'])[11]")
	public WebElement Taskbystatus;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Table3;

	@FindBy(xpath = "(//a[@class='no-wrap'])[13]")
	public WebElement Taskoverdue;

	@FindBy(xpath = "(//a[@class='no-wrap'])[14]")
	public WebElement Taskbyassignedindividual;


	@FindBy(xpath = "//input[@type='search']")
	public WebElement Search3;

	@FindBy(xpath = "//tbody//td")
	public List<WebElement> Tabledata3;

	@FindBy(xpath = "(//a[@class='no-wrap'])[15]")
	public WebElement Tasktimeline;

	//tbody//td

	public void user_check_Task_Reports_page() throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Reports);
		Thread.sleep(3000);

		Clickelement(Taskbystatus);


		String a= "S.No.,Status,Count,Department,Assigned To";

		List<String> list1 = new ArrayList<String>(Arrays.asList(a.split(",")));
		for (int i = 0; i <=4; i++) {
			validatetext(Table3.get(i), list1.get(i));
		}

		driver.navigate().back();

		Clickelement(Taskoverdue);

		String b= "S.No.,Title,Description,Assigned To,Planned End Date,Actual End Date,Days Overdue";

		List<String> list2 = new ArrayList<String>(Arrays.asList(b.split(",")));
		for (int i = 0; i <=6; i++) {
			validatetext(Table3.get(i), list2.get(i));
		}

		driver.navigate().back();

		Clickelement(Taskbyassignedindividual);

		String c= "S.No.,Assigned To,Total Task,Completed Task,Pending Task,Priority";

		List<String> list3 = new ArrayList<String>(Arrays.asList(c.split(",")));
		for (int i = 0; i <=5; i++) {
			validatetext(Table3.get(i), list3.get(i));
		}

		sendkeyweb(Search3, "rishika.mittameeda@ikcontech.com");

		validatetext(Tabledata3.get(0), "");
		validatetext(Tabledata3.get(1), "rishika.mittameeda@ikcontech.com");
		validatetext(Tabledata3.get(2), "");
		validatetext(Tabledata3.get(3), "");
		validatetext(Tabledata3.get(4), "");
		validatetext(Tabledata3.get(5), "");

		driver.navigate().back();
		Clickelement(Tasktimeline);

		String d= "S.No.,Title,Assigned To,Planned Start Date,Planned End Date,Actual Start Date,Actual End Date,Deviation";

		List<String> list4 = new ArrayList<String>(Arrays.asList(d.split(",")));
		for (int i = 0; i <=7; i++) {
			validatetext(Table3.get(i), list4.get(i));
		}
	}
	@FindBy(xpath = "//div[normalize-space()='Reports']")
	public WebElement Reports;

	@FindBy(xpath = "(//a[@class='no-wrap'])[16]")
	public WebElement RiskSummary;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Table4;

	@FindBy(xpath = "(//a[@class='no-wrap'])[17]")
	public WebElement Risktrend;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement Search4;

	@FindBy(xpath = "//tbody//td")
	public List<WebElement> Tabledata4;

	@FindBy(xpath = "(//a[@class='no-wrap'])[18]")
	public WebElement Riskassessment;

	@FindBy(xpath = "(//a[@class='no-wrap'])[19]")
	public WebElement Riskmitigationplan;

	@FindBy(xpath = "(//a[@class='no-wrap'])[20]")
	public WebElement Riskcommunication;

	public void user_check_Risk_Reports_page() throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Reports);
		Thread.sleep(3000);

		Clickelement(RiskSummary);

		String a= "Risk ID,Title,Description,Category,Department,Status,Priority,Severity,Probability,Target Completion Date & Time";

		List<String> list1 = new ArrayList<String>(Arrays.asList(a.split(",")));
		for (int i = 0; i <=9; i++) {
			validatetext(Table4.get(i), list1.get(i));
		}

		driver.navigate().back();
		Clickelement(Risktrend);

		String b= "Risk ID,Month,New Risks,Resolved Risks,Escalated Risks,Total Risks";

		List<String> list2 = new ArrayList<String>(Arrays.asList(b.split(",")));
		for (int i = 0; i <=5; i++) {
			validatetext(Table4.get(i), list2.get(i));
		}

		sendkeyweb(Search4, "APRIL");

		validatetext(Tabledata4.get(0), "");
		validatetext(Tabledata4.get(1), "APRIL");
		validatetext(Tabledata4.get(2), "");
		validatetext(Tabledata4.get(3), "");
		validatetext(Tabledata4.get(4), "");
		validatetext(Tabledata4.get(5), "");

		driver.navigate().back();

		Clickelement(Riskassessment);

		String c= "Risk ID,Title,Severity,Probability,Impact Level,Risk Score";

		List<String> list3 = new ArrayList<String>(Arrays.asList(c.split(",")));
		for (int i = 0; i <=5; i++) {
			validatetext(Table4.get(i), list3.get(i));
		}

		sendkeyweb(Search4, "Late closure of sprint five");

		validatetext(Tabledata4.get(0), "");
		validatetext(Tabledata4.get(1), "Late closure of sprint five");
		validatetext(Tabledata4.get(2), "Minor");
		validatetext(Tabledata4.get(3), "Likely");
		validatetext(Tabledata4.get(4), "NA");
		validatetext(Tabledata4.get(5), "NA");

		driver.navigate().back();

		Clickelement(Riskmitigationplan);

		String d= "Risk ID,Title,Mitigation Strategy,Assigned To,Due Date,Status";

		List<String> list4 = new ArrayList<String>(Arrays.asList(d.split(",")));
		for (int i = 0; i <=5; i++) {
			validatetext(Table4.get(i), list4.get(i));
		}
		sendkeyweb(Search4, "Vendor Risks");

		validatetext(Tabledata4.get(0), "");
		validatetext(Tabledata4.get(1), "Vendor Risks");
		validatetext(Tabledata4.get(2), "NA");
		validatetext(Tabledata4.get(3), "UMS TEST");
		validatetext(Tabledata4.get(4), "NA");
		validatetext(Tabledata4.get(5), "Inprogress");

		driver.navigate().back();

		Clickelement(Riskcommunication);

		String e= "Risk ID,Title,Communication Method,Frequency,Stakeholders Involved";

		List<String> list5 = new ArrayList<String>(Arrays.asList(e.split(",")));
		for (int i = 0; i <=4; i++) {
			validatetext(Table4.get(i), list5.get(i));
		}

		sendkeyweb(Search4, "Vendor Risks");

		validatetext(Tabledata4.get(0), "");
		validatetext(Tabledata4.get(1), "Vendor Risks");
		validatetext(Tabledata4.get(2), "NA");
		validatetext(Tabledata4.get(3), "NA");
		validatetext(Tabledata4.get(4), "NA");

	}
}

