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
//public class Assignmenuitems_object extends Baseclass {
//	WebDriver driver = Driver.getDriver();
//	public Assignmenuitems_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//
//
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//
//	@FindBy(xpath = "//a[normalize-space()='Assign Menu Items & Permisisons']")
//	public WebElement Assignemenuitemsselect;
//
//	@FindBy(xpath = "//span[@class='ng-arrow-wrapper']")
//	public WebElement Assignemenuitemsdrpdwn;
//
//	@FindBy(xpath = "//span[normalize-space()='ANURADHA GUPTA']")
//	public WebElement Userselect;
//
//	public void user_checks_Assignmenuitems_page() throws InterruptedException {
//
//		Clickelement(Settingssidemenu);
//		Thread.sleep(20000);
//
//		Clickelement(Assignemenuitemsselect);
//		Thread.sleep(2000);
//
//		Clickelement(Assignemenuitemsdrpdwn);
//		Thread.sleep(2000);
//
//		Clickelement(Userselect);
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//
//	}
//}

package Objectclasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class Assignmenuitems_object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Assignmenuitems_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Assign Menu Items & Permisisons']")
	public WebElement Assignmenuitemspermissions;


	@FindBy(xpath="//h3[@class='title']")
	public WebElement title;
	@FindBy(xpath="//div[@class='col-sm-1']")
	public List<WebElement> Fields;
	@FindBy(xpath="//div[@class='col-sm-3']")
	public List<WebElement> Assign;

	public void Validate_the_Assign_MenuItems_Permisisons_page() throws InterruptedException {

		Clickelement(Setup);
		Clickelement(Assignmenuitemspermissions);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		validatetext(title, "Assign Menu Items & Permissions");
		String[] s={"User :","User ID :","ROLE :"};

		for(int i=0;i<2;i++) {
		validatetext(Fields.get(i), s[i]);
		}
		dispalyedattribute(Assign.get(0), "Assign Menu Items Reportee dropdown");
		validatetext(Assign.get(1), "ums-support@ikcontech.com");
		validatetext(Assign.get(2), "CEO");		
	}

	//	@FindBy(xpath="//p[normalize-space()='Add']")
	//	public WebElement Add;

	@FindBy(xpath="//div[@class='edit-column']")
	public WebElement Add;

	@FindBy(xpath="//h5[text()='Add Menu Item Access For User']")
	public WebElement Add_Menu;
	@FindBy(xpath="//label[normalize-space()='User ID']")
	public WebElement User_ID;
	@FindBy(xpath="//label[normalize-space()='Role']")
	public WebElement Role;
	@FindBy(xpath="//label[normalize-space()='Menu Item']")
	public WebElement Menu_item;
	@FindBy(xpath="//button[@id='saveBtn']")
	public WebElement Button_save;
	@FindBy(xpath="//button[@id='closeUpdateModal']")
	public WebElement Button_cancel;
	@FindBy(xpath="//input[contains(@name,'permission')]")
	public List<WebElement> permi;
	@FindBy(xpath="//label[normalize-space()='Select permissions for menu item']")
	public WebElement drop_down;
	@FindBy(xpath="//div[@class='ng-select-container']//input[@type='text']")
	public WebElement drop_opt;
	//	@FindBy(xpath="//span[contains(.,'Help Center')]")
	//	public WebElement Helpcent;

	public void add_the_Assign_MenuItems_Permisisons() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		validatetext(Add, "Add");
		Clickelement(Add);
		validatetext(Add_Menu, "Add Menu Item Access For User");
		validatetext(User_ID, "User ID");
		validatetext(Role, "Role");
		validatetext(Menu_item, "Menu Item");
		validatetext(Button_save, "Save");
		validatetext(Button_cancel, "Cancel");
		try {
			Clickelement(drop_down);
			Clickelement(drop_opt);
			WebElement Importhistory=driver.findElement(By.xpath("//span[contains(.,'Import History')]"));
			Clickelement(Importhistory);
			for (int i = 0; i < 4; i++) {
				Clickelement(permi.get(i));
			}}catch (Exception e) {
			}
		Clickelement(Button_cancel);

		//		for(int i=0;i<3;i++) {
		//		if(vc.findElements(By.xpath("//div[@class='modal-body']//input[@type='text']")).get(i).isEnabled()) {
		//			
		//			if(i==0) {
		//			System.out.println("user ID Input is enabled");
		//			}else if(i==1) {
		//				System.out.println("Role Input is enabled");
		//			}else if(i==2) {
		//				System.out.println("Menu item Input is enabled");
		//			}
		//		}else {
		//			if(i==0) {
		//				System.out.println("user ID Input is disabled");
		//				}else if(i==1) {
		//					System.out.println("Role Input is diabled");
		//				}else if(i==2) {
		//					System.out.println("Menu item Input is disabled");
		////				}
		//		}

	}
	@FindBy(xpath="//input[@aria-autocomplete='list']")
	public WebElement User_drop;
	@FindBy(xpath="//span[contains(.,'Prabhakaran A')]")
	public WebElement User_opt;
	@FindBy(xpath="(//span[contains(.,'Prabhakaran A')])[2]")
	public WebElement User_opt1;
	@FindBy(xpath="//div[@role='alert']")
	public WebElement alert;

	public void Update_the_Assign_MenuItems_Permisisons() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Clickelement(User_drop);
		try {
			Clickelement(User_opt);
		} catch (Exception e) {
			Clickelement(User_opt1);
		}
		driver.navigate().refresh();
		String s = "My Dashboard,Risks,Meetings,Action items,Tasks,Help Center,My Dashboard, My ActionItems,My Meetings,My Tasks, My Risks";
		String v = "1,2,3,4,4,3,2,1,4,2,1";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		List<String> Jist = new ArrayList<String>(Arrays.asList(v.split(",")));

		for (int i = 0, j = 0; i < list.size() & j < Jist.size(); i++, j++) {
			try {
				WebElement webp=driver.findElement(By.xpath("//table//td[normalize-space()='" + list.get(i)
				+ "']"));
				validatetext(webp, list.get(i));			
			}catch (Exception e) {

			}
			WebElement per1 = driver.findElement(By.xpath("(//table//td[normalize-space()='" + list.get(i)
			+ "']/following-sibling::td//span[@class='checkmark'])[" + Jist.get(j) + "]"));
			if(per1.isSelected()) {
				System.out.println("Check box is selected");
			}else {
				System.out.println("Check box is not selected");
			}
			per1.click();
			validatealert("Are you sure, you want to update the permission ?");
			driver.switchTo().alert().accept();
			dispalyedattribute(alert, "Toaster");

		}

	}
}


