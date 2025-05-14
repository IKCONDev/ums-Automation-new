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
//public class Team_object extends Baseclass {
//	WebDriver driver = Driver.getDriver();
//	public Team_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//
//
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//	
//	@FindBy(xpath = "//a[normalize-space()='Team']")
//	public WebElement Teamselect;
//
//	@FindBy(xpath = "//div[contains(text(),'Add')]")
//	public WebElement teamsaddbtn;
//
//	@FindBy(xpath = "//input[@id='teamName']")
//	public WebElement Teamname;
//
//	@FindBy(xpath = "//input[@id='teamCode']")
//	public WebElement Teamcode;
//
//	@FindBy(xpath = "//ng-select[@id='teamDept']//span[@class='ng-arrow-wrapper']")
//	public WebElement choosedeptdrpdwn;
//
//	@FindBy(xpath = "//span[normalize-space()='Accounts & Finance']")
//	public WebElement choosedeptselect;
//
//	@FindBy(xpath = "//ng-select[@id='teamLead']//span[@class='ng-arrow-wrapper']")
//	public WebElement teamleaddrpdwn;
//
//	@FindBy(xpath = "//span[normalize-space()='Mounika Errolla']")
//	public WebElement teamleadselect;
//
//	@FindBy(xpath = "//ng-select[@id='teamHead']//span[@class='ng-arrow-wrapper']")
//	public WebElement teamheaddrpdwn;
//
//	@FindBy(xpath = "//span[normalize-space()='Ramasamy Durai']")
//	public WebElement teamheadselect;
//
//	@FindBy(xpath = "//button[@id='saveButton']")
//	public WebElement teamsavebtn;
//
//
//	public void user_check_Team_page(String str1, String str2) throws InterruptedException {
//		Clickelement(Settingssidemenu);
//		Thread.sleep(3000);
//		
//		Clickelement(Teamselect);
//		Thread.sleep(3000);
//
//		
//		Clickelement(teamsaddbtn);
//		Thread.sleep(3000);
//
//		sendkeyweb(Teamname, str1);
//		Thread.sleep(3000);
//
//		sendkeyweb(Teamcode, str2);
//		Thread.sleep(3000);
//		
//		Clickelement(choosedeptdrpdwn);
//		Thread.sleep(3000);
//
//		Clickelement(choosedeptselect);
//		Thread.sleep(3000);
//		
//		Clickelement(teamleaddrpdwn);
//		Thread.sleep(3000);
//		
//		Clickelement(teamleadselect);
//		Thread.sleep(3000);
//		
//		Clickelement(teamheaddrpdwn);
//		Thread.sleep(3000);
//
//		Clickelement(teamheadselect);
//		Thread.sleep(3000);
//		
//		Clickelement(teamsavebtn);
//		Thread.sleep(3000);
//	}
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement Teamssearch;
//	
//	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
//	public WebElement Teamdeletebtn;
//	
//	
//	public void user_delete_Team_page(String str) throws InterruptedException {
//		
//		Thread.sleep(3000);
//		
//		sendkeyweb(Teamssearch, str);
//		
//		Thread.sleep(3000);
//
//		Clickelement(Teamdeletebtn);
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().dismiss();
//		
//}
//}

package Objectclasses;

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

import Drivemanager.Driver;
import hooks.Baseclass;


public class Team_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Team_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
		
	}
	
	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Settings;
	
	@FindBy(xpath = "//a[normalize-space()='Team']")
	public WebElement Team;
	
	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Team_title;
	
	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Team_addbtn;
	
	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement Team_dltbtn;
	
	@FindBy(xpath="//thead//tr//th")
	public List<WebElement> Table;
	
	public void Validate_Teams_page() throws InterruptedException {
		Clickelement(Settings);
		Clickelement(Team);

		validatetext(Team_title, "Teams");
		validatetext(Team_addbtn, "Add");
		validatetext(Team_dltbtn, "Delete");


		
//		String[] s= {"","Team ID","Team Name","Team Code","Team Lead","Team Head","Department Name","Added By","Created Date","Modified By","Modified Date","Edit","Delete"};
//		for(int i=1;i<13;i++) {
//			validatetext(driver.findElements(By.xpath("//th")).get(i),s[i]);
//		}
//	}
//	
		String s= ",ID,Team Name,Team Code,Team Lead,Team Head,Department Name,Created By,Created Date,Modified By,Modified Date,Edit,Delete";

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i < 13; i++) {
			validatetext(Table.get(i), list.get(i));
		}
	}

//	@FindBy(xpath = "//button[@id='addBtnDiv'] /p")
//	public WebElement button;
	@FindBy(xpath = "//h5[@id='xlModalLabel']")
	public WebElement Title;
	
	@FindBy(xpath = "//label[text()='Team Name']")
	public WebElement Teamnametitle;
	
	@FindBy(xpath = "//input[@id='teamName']")
	public WebElement Team_name;
	
	@FindBy(xpath = "//label[text()='Team Code']")
	public WebElement Teamcodetitle;
	
	@FindBy(xpath = "//input[@id='teamCode']")
	public WebElement Team_code;
	
	@FindBy(xpath = "//label[text()='Choose Department']")
	public WebElement choosedepttitle;
	
	@FindBy(xpath = "//ng-select[@id='teamDept']//input[@type='text']")
	public WebElement Team_dept;
	
	@FindBy(xpath = "//label[text()='Team Lead']")
	public WebElement teamleadtitle;
	
	@FindBy(xpath = "//ng-select[@id='teamLead']//input[@type='text']")
	public WebElement Team_lead;
	
	@FindBy(xpath = "//label[text()='Team Head']")
	public WebElement teamheadtitle;
	
	@FindBy(xpath = "//ng-select[@id='teamHead']//input[@type='text']")
	public WebElement Team_head;
	
	@FindBy(xpath = "//button[@id='saveButton']")
	public WebElement Save_button;
	@FindBy(xpath = "//button[@id='closeModal']")
	public WebElement cancel_button;
	
	public void Add_the_Team(String Team) throws InterruptedException {
		Clickelement(Team_addbtn);
//		driver.findElement(By.xpath("//h5[@id='xlModalLabel']")).getText();
//		String[] s= {"Team Name","Team Code","Choose Department","Team Lead","Team Head"};
//		for(int i=0;i<5;i++) {
//			validatetext(driver.findElements(By.xpath("//label/b")).get(i),s[i]);
//		}
		
		validatetext(Title, "Team");
		validatetext(Teamnametitle, "Team Name*");
		
		validateattribute(Team_name, "placeholder", "Team Name");
		sendkeyweb(Team_name, Team);
		validatetext(Teamcodetitle, "Team Code*");
		validateattribute(Team_code, "placeholder", "Team Code");
		sendkeyweb(Team_code, "T12E1");
		validatetext(choosedepttitle, "Choose Department*");

		Clickelement(Team_dept);
		
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Information Technology']")));
		validatetext(teamleadtitle, "Team Lead*");

		Clickelement(Team_lead);
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Praveen Reddy']")));
		validatetext(teamheadtitle, "Team Head*");

		Clickelement(Team_head);
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Venkatesh Udaru']")));
		Thread.sleep(2000);
		
		validatetext(Save_button, "Save");
		validatetext(cancel_button, "Cancel");
		Clickelement(Save_button);
	}
	
//	
//	@FindBy(xpath = "//input[@type='search']")
//	public WebElement Search;
	

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	
	@FindBy(xpath = "//tbody//tr//td")
	public List<WebElement> Table_data;
	
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement edit;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement delete;
	
	public void validate_the_Team(String Team) throws InterruptedException {
		sendkeyweb(Search, Team);
		Thread.sleep(3000);
//		String TID =driver.findElements(By.xpath("//td[normalize-space()='"+Team+"']/preceding-sibling::td")).get(1).getText();
//		String[] s= {Team,"T12E1","Praveen Reddy","Venkatesh Udaru","Information Technology","UMS SUPPORT","","","","",""};
//		//String[] v= {"Team Name","Team Code","Team Lead","Team Head","Department Name","Added by","Created Date","Modified By","Modified Date","Edit","Delete"};
//		for(int i=0;i<11;i++) {
//			validatetext(driver.findElements(By.xpath("//td[normalize-space()='"+TID+"']/following-sibling::td")).get(i),s[i]);
//			
//		}
		dispalyedattribute(Table_data.get(0), "checkbox");
		dispalyedattribute(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), Team);
		validatetext(Table_data.get(3), "T12E1");
		validatetext(Table_data.get(4), "Praveen Reddy");	
		validatetext(Table_data.get(5), "Venkatesh Udaru");
		validatetext(Table_data.get(6), "Information Technology");
		validatetext(Table_data.get(7), "UMS SUPPORT");
		validatetext(Table_data.get(8), "Apr 14, 2025, 7:42 PM");

		dispalyedattribute(edit, "Edit Icon");
		dispalyedattribute(delete, "Delete Icon");
	}
	
	public void Update_the_Team(String Team) throws InterruptedException {
		sendkeyweb(Search, Team);
		Thread.sleep(3000);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='"+Team+"']/following-sibling::td//button[@id='editIcon']")));
//		validatetext(Title, "Team");
//		driver.findElement(By.xpath("//h5[@id='xlModalLabel']")).getText();
//		String[] s= {"Team Name","Team Code","Choose Department","Team Lead","Team Head"};
//		for(int i=0;i<5;i++) {
//			validatetext(driver.findElements(By.xpath("//label/b")).get(i),s[i]);
//			
//		}
		
		validateattribute(Team_name, "placeholder", "Team Name");
		sendkeyweb(Team_name, Team);
		validateattribute(Team_code, "placeholder", "Team Code");
		sendkeyweb(Team_code, "T12E1");
		Clickelement(Team_dept);
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Information Technology']")));
		Clickelement(Team_lead);
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Praveen Reddy']")));
		Clickelement(Team_head);
		try {
			Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Venkatesh Udaru']")));
		} catch (Exception e) {
			Clickelement(driver.findElement(By.xpath("(//span[normalize-space()='Venkatesh Udaru'])[2]")));
		}
		validatetext(Save_button, "Save");
		validatetext(cancel_button, "Cancel");
		Clickelement(Save_button);
		
		
	}
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search1;
	
	@FindBy(xpath = "//tbody//tr//td")
	public List<WebElement> Table_data1;
	
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement edit1;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement delete1;
	
	public void validate_the_Updated_Team(String Team) throws InterruptedException {
		sendkeyweb(Search, Team);
		Thread.sleep(3000);
//		String TID =driver.findElements(By.xpath("//td[normalize-space()='"+Team+"']/preceding-sibling::td")).get(1).getText();
//		String[] s= {Team,"T12E1","Praveen Reddy","Venkatesh Udaru","Information Technology","UMS SUPPORT","","","","",""};
//		//String[] v= {"Team Name","Team Code","Team Lead","Team Head","Department Name","Added by","Created Date","Modified By","Modified Date","Edit","Delete"};
//		for(int i=0;i<11;i++) {
//			validatetext(driver.findElements(By.xpath("//td[normalize-space()='"+TID+"']/following-sibling::td")).get(i),s[i]);
//			
//		}
		dispalyedattribute(Table_data1.get(0), "checkbox");
		dispalyedattribute(Table_data1.get(1), "ID");
		validatetext(Table_data1.get(2), Team);
		validatetext(Table_data1.get(3), "T12E1");
		validatetext(Table_data1.get(4), "Praveen Reddy");	
		validatetext(Table_data1.get(5), "Venkatesh Udaru");
		validatetext(Table_data1.get(6), "Information Technology");
		validatetext(Table_data1.get(7), "UMS SUPPORT");
		validatetext(Table_data1.get(8), "Apr 14, 2025, 7:42 PM");
		validatetext(Table_data1.get(9), "UMS SUPPORT");
		validatetext(Table_data1.get(10), "Apr 14, 2025, 7:42 PM");

		dispalyedattribute(edit1, "Edit Icon");
		dispalyedattribute(delete1, "Delete Icon");
	}
//	@FindBy(xpath = "//button[normalize-space()='Delete']")
//	public WebElement Delete_button;
	
//	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
//	public WebElement Delete_button;
	public void Delete_the_Team(String Team) throws InterruptedException {
		sendkeyweb(Search, Team);
		Thread.sleep(3000);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='"+Team+ "']/following-sibling::td//button[@id='trashIcon']")));
//		validatealert("Are you sure, you really want to delete selected teams ?");
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(4000);
//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" +Team+ "']/preceding-sibling::td//input[@type='checkbox']")));
//		Thread.sleep(4000);
//
//		Clickelement(Delete_button);
//		Thread.sleep(4000);
//		validatealert("Are you sure, you really want to delete selected teams ?");
//		driver.switchTo().alert().accept();
//		Thread.sleep(4000);
//		
		try {
		    Alert alert = driver.switchTo().alert();
		    System.out.println("Alert detected: " + alert.getText());
		    alert.dismiss();
		} catch (NoAlertPresentException e) {
		    System.out.println("No alert present.");
		}

	
	
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='"+Team+ "']/following-sibling::td//button[@id='trashIcon']")));
			
	
	try {
	    Alert alert = driver.switchTo().alert();
	    System.out.println("Alert detected: " + alert.getText());
	    alert.accept(); // or alert.dismiss();
	} catch (NoAlertPresentException e) {
	    System.out.println("No alert present.");
	}
		
	}

	
}

