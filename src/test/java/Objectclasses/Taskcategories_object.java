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
//public class Taskcategories_object extends Baseclass {
//
//	WebDriver driver = Driver.getDriver();
//	public Taskcategories_object(WebDriver RC) {
//		driver = RC;
//		PageFactory.initElements(RC, this);
//	}
//
//	@FindBy(xpath = "//div[normalize-space()='Settings']")
//	public WebElement Settingssidemenu;
//
//	@FindBy(xpath = "//a[normalize-space()='Task Categories']")
//	public WebElement Taskcategoriesselect;
//
//	@FindBy(xpath = "//div[contains(text(),'Add')]")
//	public WebElement Taskcategoriesadd;
//
//	@FindBy(xpath = "//div[@class='ng-select-container ng-has-value']//span[@class='ng-arrow-wrapper']")
//	public WebElement choosedeptdrpdwn;
//
//	@FindBy(xpath = "//span[normalize-space()='Department 1']")
//	public WebElement deptselect;
//
//	@FindBy(xpath = "//input[@id='categoryName']")
//	public WebElement Taskcategoryname;
//
//	@FindBy(xpath = "//textarea[@id='categoryDesc']")
//	public WebElement Taskcategorydescription;
//
//	@FindBy(xpath = "//button[normalize-space()='Save']")
//	public WebElement Taskcategorysavebtn;
//
//	public void user_check_Taskcategory_page(String str1, String str2) throws InterruptedException {
//		Clickelement(Settingssidemenu);
//		Thread.sleep(3000);
//
//		Clickelement(Taskcategoriesselect);
//		Thread.sleep(3000);
//
//		Clickelement(Taskcategoriesadd);
//		Thread.sleep(3000);
//
//		Clickelement(choosedeptdrpdwn);
//		Thread.sleep(3000);
//
//		Clickelement(deptselect);
//		Thread.sleep(3000);
//
//		sendkeyweb(Taskcategoryname, str1);
//		Thread.sleep(3000);
//
//
//		sendkeyweb(Taskcategorydescription, str2);
//		Thread.sleep(3000);
//
//		Clickelement(Taskcategorysavebtn);
//		Thread.sleep(3000);
//	}
//
//	@FindBy(xpath = "//input[@placeholder='Search']")
//	public WebElement Taskcategorysearch;
//
//	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
//	public WebElement Taskcategoriesdelete;
//
//	public void user_delete_Taskcategory_page(String str) throws InterruptedException {
//
//		sendkeyweb(Taskcategorysearch, str);
//		Thread.sleep(3000);
//
//		Clickelement(Taskcategoriesdelete);
//		Thread.sleep(3000);
//
//		driver.switchTo().alert().dismiss();
//	}
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

public class Taskcategories_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Taskcategories_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Task Categories']")
	public WebElement Taskcategories;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Header;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Add;
	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement Delete;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Table;

	public void validate_the_task_category_page() {
		Clickelement(Setup);
		Clickelement(Taskcategories);

		validatetext(Header, "Task Categories");
		validatetext(Add, "Add");
		validatetext(Delete, "Delete");

		String s = ",ID,Title,Description,Department,Created By,Created Date & Time,Modified By,Modified Date & Time,Edit,Delete";
		//		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		//		for (int i = 2; i <= 11; i++) {
		//			validatetext(driver.findElement(By.xpath("(//thead[@id='TaskCategoryThead']//tr//th)[" + i + "]")),list.get(i));
		//			
		//		}

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i <= 10; i++) {
			validatetext(Table.get(i), list.get(i));
		}


	}
	//	@FindBy(xpath = "//div[contains(text(),'Add')]")
	//	public WebElement Add;
	@FindBy(xpath = "//h5[@id='xlModalLabel']")
	public WebElement Task_cat;
	//	@FindBy(xpath = "//b[normalize-space()='Choose Department']")
	//	public WebElement Task_Dept;

	@FindBy(xpath = "//label[text()='Choose Department']")
	public WebElement Task_Dept;
	@FindBy(xpath = "//span[@title='Clear all']")
	public WebElement Clear;
	@FindBy(xpath = "//ng-select[@id='categoryDept']//span[@class='ng-arrow-wrapper']")
	public WebElement Task_drop;
	//	@FindBy(xpath = "//b[normalize-space()='Task Category Name']")
	//	public WebElement TaskCat_name;

	@FindBy(xpath = "//label[text()='Task Category Name']")
	public WebElement TaskCat_name;
	@FindBy(xpath = "//input[@id='categoryName']")
	public WebElement TaskCat_name_in;
	//	@FindBy(xpath = "//b[normalize-space()='Task Category Description']")
	//	public WebElement Task_desc;

	@FindBy(xpath = "//label[text()='Task Category Description']")
	public WebElement Task_desc;
	@FindBy(xpath = "//textarea[@id='categoryDesc']")
	public WebElement Task_desc_in;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Task_save;
	@FindBy(xpath = "//button[@id='closeModal']")
	public WebElement Task_cancel;


	public void add_the_category(String CN) throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(3000);
		Clickelement(Add);
		Thread.sleep(3000);

		validatetext(Task_cat, "Task Category");
		validatetext(Task_Dept, "Choose Department");
		Clickelement(Clear);
		Clickelement(Task_drop);	
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Information Technology']")));
		validatetext(TaskCat_name, "Task Category Name");
		validateattribute(TaskCat_name_in, "placeholder", "Category Name");
		sendkeyweb(TaskCat_name_in, CN);
		validatetext(Task_desc, "Task Category Description");
		validateattribute(Task_desc_in, "placeholder", "Category Description");
		sendkeyweb(Task_desc_in, CN+ " Task");
		validatetext(Task_save, "Save");
		validatetext(Task_cancel, "Cancel");
		Clickelement(Task_save);

	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	//	@FindBy(xpath = "//td[contains(@class,'thTaskCategory1 sorting_')]")
	//	public List<WebElement> Table_data;

	@FindBy(xpath = "//td")
	public List<WebElement> Table_data;
	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement Editicon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Deleteicon;

	public void validate_the_added_task_category(String CN) throws InterruptedException {
		sendkeyweb(Search, CN);
		dispalyedattribute(Table_data.get(0), "ID");
		validatetext(Table_data.get(1), CN);
		validatetext(Table_data.get(2), CN + " Task");		
		validatetext(Table_data.get(4), "UMS SUPPORT");
		//		validatetext(Table_data.get(5), "May 20, 2024, 4:14 PM");
		dispalyedattribute(Editicon, "Edit icon");
		dispalyedattribute(Deleteicon, "Delete icon");

	}



	public void update_the_category(String CN) throws InterruptedException {
		sendkeyweb(Search, CN);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + CN + "']/following-sibling::td//button[@id='editIcon']")));
		Thread.sleep(4000);
		Clickelement(Clear);
		Clickelement(Task_drop);
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Information Technology']")));
		validatetext(TaskCat_name, "Task Category Name");
		validateattribute(TaskCat_name_in, "placeholder", "Category Name");
		sendkeyweb(TaskCat_name_in, CN);
		validatetext(Task_desc, "Task Category Description");
		validateattribute(Task_desc_in, "placeholder", "Category Description");
		sendkeyweb(Task_desc_in, CN+ " Task");
		validatetext(Task_save, "Save");
		validatetext(Task_cancel, "Close");
		Clickelement(Task_save);

	}


	public void validate_the_updated_task_category(String CN) throws InterruptedException {
		sendkeyweb(Search, CN);
		dispalyedattribute(Table_data.get(0), "ID");
		validatetext(Table_data.get(1), CN);
		validatetext(Table_data.get(2), CN + " Task");
		validatetext(Table_data.get(3), " ");

		validatetext(Table_data.get(4), "UMS SUPPORT");
		//		validatetext(Table_data.get(5), "May 20, 2024, 4:14 PM");
		validatetext(Table_data.get(6), " ");
		validatetext(Table_data.get(7), " ");

		dispalyedattribute(Editicon, "Edit icon");
		dispalyedattribute(Deleteicon, "Delete icon");
	}
	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement del;

	public void Delete_the_category(String CN) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Search, CN);
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + CN + "']/following-sibling::td//button[@id='trashIcon']")));
		//		validatealert("Are you sure, you really want to delete selected task categories ?");
		//		driver.switchTo().alert().dismiss();
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + CN + "']/preceding-sibling::td//input[@type='checkbox']")));
		//		Clickelement(del);
		//		validatealert("Are you sure, you really want to delete selected task categories ?");
		//		driver.switchTo().alert().dismiss();

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + CN + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + CN + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


	}
}

