//package Objectclasses;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import Drivemanager.Driver;
//import hooks.Baseclass;


//public class Rolemenuitems_object extends Baseclass  {
//
//
//	WebDriver driver = Driver.getDriver();
//	public Rolemenuitems_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//
//	@FindBy(xpath = "//a[normalize-space()='Role Menu Items']")
//	public WebElement Rolemenuitemsselect;
//
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement Rolemenuitemsearch;
//
//
//	@FindBy(xpath = "//button[@id='addMenuItem']//*[name()='svg']")
//	public WebElement Rolemenuitemplusbtn;
//	
//
//	@FindBy(xpath = "//h5[normalize-space()='Assign Menu Items For Role']")
//	public WebElement valassignmenuitemsforrole;
//	
//	@FindBy(xpath = "//button[normalize-space()='Save']")
//	public WebElement valsavebtn;
//	
//	@FindBy(xpath = "//button[@id='closeUpdateModal']")
//	public WebElement valcancelbtn;
//	
//	
//
//	@FindBy(xpath = "//button[@id='closeUpdateModal']")
//	public WebElement Rolemenuitemcancelbtn;
//
//	public void user_checks_Rolemenuitems_page(String str) throws InterruptedException {
//		
//		Clickelement(Settingssidemenu);
//		Thread.sleep(20000);
//
//		Clickelement(Rolemenuitemsselect);
//		Thread.sleep(2000);
//
//		sendkeyweb(Rolemenuitemsearch, str);
//		Thread.sleep(3000);
//
//		Clickelement(Rolemenuitemplusbtn);
//		Thread.sleep(2000);
//		
//		validatetext(valassignmenuitemsforrole, "Assign Menu Items For Role");
//		Thread.sleep(2000);
//
//		validatetext(valsavebtn, "Save");
//		Thread.sleep(2000);
//		
//		validatetext(valcancelbtn, "Cancel");
//		Thread.sleep(2000);
//		
//		Clickelement(Rolemenuitemcancelbtn);
//		Thread.sleep(2000);
//
//	}
//}



package Objectclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class Rolemenuitems_object extends Baseclass  {


	WebDriver driver = Driver.getDriver();
	public Rolemenuitems_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Settings;

	@FindBy(xpath = "//a[normalize-space()='Role Menu Items']")
	public WebElement Rolemenuitems;


	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Header;
	@FindBy(xpath = "//table//tr[1]/th")
	public List<WebElement> Table;

	public void Validate_Role_Menu_Items() throws InterruptedException {
		Clickelement(Settings);

		Clickelement(Rolemenuitems);
		validatetext(Header, "Role Menu Items");

		String[] s= {"ID","Role Name","Permissions","Menu Items","Created By","Created Date & Time","Modified By","Modified Date & Time","Edit"};
		for(int i=0;i<9;i++) {
			validatetext(Table.get(i), s[i]);

		}

	}
	@FindBy(xpath = "//input[@type='search']")
	public WebElement Search;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Save;

	public void add_the_Role_Menu_Items(String Role) throws InterruptedException {
		driver.navigate().refresh();
		validatetext(Search, Role);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + Role + "']/following-sibling::td//button[@id='addMenuItem']")));
		String s = "My Dashboard,Settings,Roles,Menu Items,Permissions,Role Menu Items,Assign Menu Items & Permissions,Batch Details,Users,Organization,Employees,Departments,Designations,Task Categories,Meetings,Action Items,Tasks,Reports,Meeting Reports,Action Item Reports,Task Category Report,Task Reports,Help Center,Themes,Import History,Export History,Email Templates,Risks,Risk Reports,Teams";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i < list.size(); i++) {
			WebElement webpc=driver.findElement(By.xpath("(//div[normalize-space()='" + list.get(i) + "']//span[@class='checkmark'])[1]"));
			WebElement Check=driver.findElement(By.xpath("(//div[normalize-space()='" + list.get(i) + "']//input[@type='checkbox'])[1]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(webpc);
			actions.perform();
			validatetext(driver.findElement(By.xpath("(//div[normalize-space()='" + list.get(i) + "'])")),list.get(i));
			Thread.sleep(1200);
			attributeselected(Check, "select box");
			Clickelement(webpc);
			attributeselected(Check, "select box");

		}
		Clickelement(Save);
	}
}






