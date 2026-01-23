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

public class Actionitemcategories_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Actionitemcategories_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Action Item Categories']")
	public WebElement Actionitemcategories;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Header;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Add;
	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement Delete;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> Table;

	public void validate_the_actionitem_category_page() {
		Clickelement(Setup);
		Clickelement(Actionitemcategories);

		validatetext(Header, "ActionItem Categories");
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


	@FindBy(xpath = "//h5[@id='xlModalLabel']")
	public WebElement Actionitem_cat;


	@FindBy(xpath = "//label[text()='Choose Department']")
	public WebElement Actionitem_Dept;

	@FindBy(xpath = "//span[@title='Clear all']")
	public WebElement Clear;

	@FindBy(xpath = "//ng-select[@id='categoryDept']//span[@class='ng-arrow-wrapper']")
	public WebElement Actionitem_drop;

	@FindBy(xpath = "//label[text()='ActionItem Category Name']")
	public WebElement ActionitemCat_name;

	@FindBy(xpath = "//input[@id='categoryName']")
	public WebElement ActionitemCat_name_in;

	@FindBy(xpath = "//label[text()='ActionItem Category Description']")
	public WebElement Actionitem_desc;

	@FindBy(xpath = "//textarea[@id='categoryDesc']")
	public WebElement Actionitem_desc_in;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Actionitem_save;

	@FindBy(xpath = "//button[@id='closeModal']")
	public WebElement Actionitem_cancel;


	public void add_the_actionitem_category(String ACN) throws InterruptedException {

		driver.navigate().refresh();
		Clickelement(Add);

		validatetext(Actionitem_cat, "ActionItem Category");
		validatetext(Actionitem_Dept, "Choose Department");
		Clickelement(Clear);
		Clickelement(Actionitem_drop);	
		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Information Technology']")));
		validatetext(ActionitemCat_name, "ActionItem Category Name");
		validateattribute(ActionitemCat_name_in, "placeholder", "Category Title");
		sendkeyweb(ActionitemCat_name_in, ACN);
		validatetext(Actionitem_desc, "ActionItem Category Description");
		validateattribute(Actionitem_desc_in, "placeholder", "Category Description");
		sendkeyweb(Actionitem_desc_in, ACN+ " Task");
		validatetext(Actionitem_save, "Save");
		validatetext(Actionitem_cancel, "Cancel");
		Clickelement(Actionitem_save);

	}




	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;

	@FindBy(xpath = "//td")
	public List<WebElement> Table_data;

	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement Editicon;

	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Deleteicon;

	public void validate_the_added_actionitem_category(String ACN) throws InterruptedException {
		sendkeyweb(Search, ACN);
		dispalyedattribute(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), ACN);
		validatetext(Table_data.get(3), ACN + " Task");	
		validatetext(Table_data.get(4), "Information Technology");	

		validatetext(Table_data.get(5), "UMS TEST");
		//		validatetext(Table_data.get(5), "May 20, 2024, 4:14 PM");
		validatetext(Table_data.get(6), "");
		validatetext(Table_data.get(7), "");
		validatetext(Table_data.get(8), "");
		dispalyedattribute(Editicon, "Edit icon");
		dispalyedattribute(Deleteicon, "Delete icon");


	}



	public void update_the_actionitem_category(String ACN) throws InterruptedException {
		sendkeyweb(Search, ACN);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + ACN + "']/following-sibling::td//button[@id='editIcon']")));
		Clickelement(Clear);

		Clickelement(Actionitem_drop);

		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='Information Technology']")));

		validatetext(ActionitemCat_name, "ActionItem Category Name");

		validateattribute(ActionitemCat_name_in, "placeholder", "Category Title");
		sendkeyweb(ActionitemCat_name_in, ACN);
		validatetext(Actionitem_desc, "ActionItem Category Description");
		validateattribute(Actionitem_desc_in, "placeholder", "Category Description");
		sendkeyweb(Actionitem_desc_in, ACN+ " Task");
		validatetext(Actionitem_save, "Save");
		validatetext(Actionitem_cancel, "Cancel");
		Clickelement(Actionitem_save);

	}

	public void validate_the_updated_actionitem_category(String ACN) throws InterruptedException {
		sendkeyweb(Search, ACN);
		dispalyedattribute(Table_data.get(1), "ID");
		validatetext(Table_data.get(2), ACN);
		validatetext(Table_data.get(3), ACN + " Task");
		validatetext(Table_data.get(4), "Information Technology");
		validatetext(Table_data.get(5), "UMS TEST");
		validatetext(Table_data.get(6), " ");
		validatetext(Table_data.get(7), "UMS TEST");
		validatetext(Table_data.get(8), " ");


		dispalyedattribute(Editicon, "Edit icon");
		dispalyedattribute(Deleteicon, "Delete icon");
	}


	//	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	//	public WebElement del;

	public void Delete_the_actionitem_category(String ACN) throws InterruptedException {
		driver.navigate().refresh();
		sendkeyweb(Search, ACN);
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + CN + "']/following-sibling::td//button[@id='trashIcon']")));
		//		validatealert("Are you sure, you really want to delete selected task categories ?");
		//		driver.switchTo().alert().dismiss();
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + CN + "']/preceding-sibling::td//input[@type='checkbox']")));
		//		Clickelement(del);
		//		validatealert("Are you sure, you really want to delete selected task categories ?");
		//		driver.switchTo().alert().dismiss();

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + ACN + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + ACN + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


	}
}
