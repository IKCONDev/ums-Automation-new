
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

public class Riskcategories_object extends Baseclass  {


	WebDriver driver = Driver.getDriver();
	public Riskcategories_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath = "//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath = "//a[normalize-space()='Risk Categories']")
	public WebElement Riskcategories;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Header;
	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Add;
	@FindBy(xpath = "//div[@class='edit-column'][normalize-space()='Delete']")
	public WebElement Delete;

	@FindBy(xpath = "//thead//tr//th")
	public List<WebElement> table;

	public void validate_the_risk_category_page() throws InterruptedException {
		Clickelement(Setup);
		Clickelement(Riskcategories);

		validatetext(Header, "Risk Categories");

		validatetext(Add, "Add");

		validatetext(Delete, "Delete");
		//		String s = "null,checkbox,ID,Risk Category Title,Category Description,Created By,Created Date,Status,Modified By,Modified Date,Edit,Delete";
		//		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		//		for (int i = 2; i <= 11; i++) {
		//			validatetext(driver.findElement(By.xpath("(//thead[@id='RiskCategoryThead']//tr//th)[" + i + "]")),list.get(i));
		String s = ",ID,Risk Category Title,Category Description,Department,Created By,Created Date & Time,Status,Modified By,Modified Date & Time,Edit,Delete";

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i <= 11; i++) {
			validatetext(table.get(i), list.get(i));
		}
	}

	@FindBy(xpath = "//div[@id='addRiskModal']//h5[@id='xlModalLabel']")
	public WebElement Risk_cat;

	@FindBy(xpath = "//div[@id='addRiskModal']//label[1]")
	public WebElement Choose_dept;

	@FindBy(xpath = "//div[@id='addRiskModal']//span[@class='ng-arrow-wrapper']")
	public WebElement Choose_dept_drpdwn;

//	@FindBy(xpath = "//span[normalize-space()='Information Technology']")
//	public WebElement dept_select;

	@FindBy(xpath = "//div[@id='addRiskModal']//label[contains(text(),'Risk Category Name')]")
	public WebElement Risk_catname;
	@FindBy(xpath = "//div[@id='addRiskModal']//input[@id='categoryName']")
	public WebElement Risk_catname_in;
	@FindBy(xpath = "//div[@id='addRiskModal']//label[contains(text(),'Risk Category Description')]")
	public WebElement Risk_catdesc;
	@FindBy(xpath = "//div[@id='addRiskModal']//textarea[@id='categoryDesc']")
	public WebElement Risk_catdesc_in;
	@FindBy(xpath = "//div[@id='addRiskModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement Risk_catsave;
	@FindBy(xpath = "//button[@id='closeModal']")
	public WebElement Risk_catcancel;
	public void add_the_riskcategory(String s1, String Dept) throws InterruptedException {
		driver.navigate().refresh();
		Clickelement(Add);
		validatetext(Risk_cat, "Risk Category");
		validatetext(Choose_dept, "Choose Department");
		Clickelement(Choose_dept_drpdwn);
		
		WebElement bg=driver.findElement(By.xpath("//span[normalize-space()='"+Dept+"']"));
		Clickelement(bg);

//		Clickelement(dept_select);

		validatetext(Risk_catname, "Risk Category Name");
		validateattribute(Risk_catname_in, "placeholder", "Category Title");
		sendkeyweb(Risk_catname_in, s1);
		validatetext(Risk_catdesc, "Risk Category Description");
		validateattribute(Risk_catdesc_in, "placeholder", "Category Description");
		sendkeyweb(Risk_catdesc_in, "Access permissions to "+s1);
		validatetext(Risk_catsave, "Save");
		validatetext(Risk_catcancel, "Cancel");
		Clickelement(Risk_catsave);
		try {
			validatealert("alert");
		} catch (Exception e) {
		}
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	@FindBy(xpath = "//tbody//td")
	public List<WebElement> Table_data;
	@FindBy(xpath = "//*[name()='g' and @id='edit']//*[name()='path' and @id='Vector']")
	public WebElement Edit_icon;
	@FindBy(xpath = "//button[@id='trashIcon']//*[name()='svg']")
	public WebElement Trash_icon;
	public void validate_the_added_risk_category(String s1, String Dept, String CB) throws InterruptedException {
		sendkeyweb(Search, s1);
		dispalyedattribute(Table_data.get(1), "Risk category ID");
		validatetext(Table_data.get(2), s1);
		validatetext(Table_data.get(3), "Access permissions to " +s1);
		validatetext(Table_data.get(4), Dept);
		validatetext(Table_data.get(5), CB);
		validatetext(Table_data.get(6), "");

		validatetext(Table_data.get(7), "Active");
		dispalyedattribute(Edit_icon, "Edit Icon");
		dispalyedattribute(Trash_icon, "Delete Icon");

	}

	@FindBy(xpath = "//div[@id='updateRiskModal']//h5[@id='xlModalLabel']")
	public WebElement URisk_cat;
	@FindBy(xpath = "//div[@id='updateRiskModal']//label[contains(text(),'Risk Category Name')]")
	public WebElement URisk_catname;
	@FindBy(xpath = "(//input[@id='categoryName'])[2]")
	public WebElement URisk_catname_in;
	@FindBy(xpath = "//div[@id='addRiskModal']//label[contains(text(),'Risk Category Description')]")
	public WebElement URisk_catdesc;
	@FindBy(xpath = "//div[@id='updateRiskModal']//textarea[@id='categoryDesc']")
	public WebElement URisk_catdesc_in;
	@FindBy(xpath = "//div[@id='updateRiskModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement URisk_catsave;
	@FindBy(xpath = "//button[@id='updateModal']")
	public WebElement URisk_catcancel;
	public void update_the_risk_cateory(String s1) throws InterruptedException {
		sendkeyweb(Search, s1);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='editIcon']")));
		validatetext(URisk_cat, "Update Risk Category");
		validatetext(URisk_catname, "Risk Category Name");
		validateattribute(URisk_catname_in, "placeholder", "Category Title");
		sendkeyweb(URisk_catname_in, s1);
		validatetext(Risk_catdesc, "Risk Category Description");
		validateattribute(Risk_catdesc_in, "placeholder", "Category Description");
		sendkeyweb(URisk_catdesc_in, "Access permissions to "+s1);
		validatetext(URisk_catsave, "Save");
		validatetext(URisk_catcancel, "Cancel");
		Clickelement(URisk_catsave);
		try {
			validatealert("alert");
		} catch (Exception e) {
		}

	}

	public void validate_the_updated_risk_category(String s1, String Dept, String CB) throws InterruptedException {
		sendkeyweb(Search, s1); 
		dispalyedattribute(Table_data.get(1), "Risk category ID");
		validatetext(Table_data.get(2), s1);
		validatetext(Table_data.get(3), "Access permissions to " +s1);
		validatetext(Table_data.get(4), Dept);
		validatetext(Table_data.get(5), CB);
		validatetext(Table_data.get(6), "");

		validatetext(Table_data.get(7), "Active");
		validatetext(Table_data.get(8), CB);
		validatetext(Table_data.get(9), "");

		dispalyedattribute(Edit_icon, "Edit Icon");
		dispalyedattribute(Trash_icon, "Delete Icon");

	}


	public void delete_the_risk_categories( String s1) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Search, s1); 
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='trashIcon']")));
		//		validatealert("alert");
		//		Thread.sleep(3000);
		//		driver.switchTo().alert().dismiss();
		//		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='\" + s1 + \"']/following-sibling::td//button[@id='trashIcon']")));
		//		validatealert("alert");
		//		Thread.sleep(3000);
		//
		//		driver.switchTo().alert().accept();
		//	}

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + s1 + "']/following-sibling::td//button[@id='trashIcon']")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}


	}

}

