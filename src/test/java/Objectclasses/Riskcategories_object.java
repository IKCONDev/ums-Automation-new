
package Objectclasses;

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
		Thread.sleep(3000);
		Clickelement(Riskcategories);
		Thread.sleep(3000);

		validatetext(Header, "Risk Categories");
		Thread.sleep(3000);

		validatetext(Add, "Add");
		Thread.sleep(3000);

		validatetext(Delete, "Delete");
		//		String s = "null,checkbox,ID,Risk Category Title,Category Description,Created By,Created Date,Status,Modified By,Modified Date,Edit,Delete";
		//		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		//		for (int i = 2; i <= 11; i++) {
		//			validatetext(driver.findElement(By.xpath("(//thead[@id='RiskCategoryThead']//tr//th)[" + i + "]")),list.get(i));
		String s = ",ID,Risk Category Title,Category Description,Created By,Created Date,Status,Modified By,Modified Date,Edit,Delete";

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 0; i <= 10; i++) {
			validatetext(table.get(i), list.get(i));
		}
	}

	@FindBy(xpath = "//div[@id='addRiskModal']//h5[@id='xlModalLabel']")
	public WebElement Risk_cat;
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
	public void add_the_riskcategory(String s1) throws InterruptedException {
		driver.navigate().refresh();
		Clickelement(Add);
		validatetext(Risk_cat, "Risk Category");
		validatetext(Risk_catname, "Risk Category Name");
		validateattribute(Risk_catname_in, "placeholder", "Category Name");
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
	public void validate_the_added_risk_category(String s1) throws InterruptedException {
		sendkeyweb(Search, s1);
		dispalyedattribute(Table_data.get(0), "Risk category ID");
		validatetext(Table_data.get(1), s1);
		validatetext(Table_data.get(2), "Access permissions to " +s1);
		validatetext(Table_data.get(3), "UMS SUPPORT");
		validatetext(Table_data.get(4), "2024-05-20T12:39:49.202723");
		validatetext(Table_data.get(5), "Active");
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
	@FindBy(xpath = "//div[@id='addRiskModal']//textarea[@id='categoryDesc']")
	public WebElement URisk_catdesc_in;
	@FindBy(xpath = "//div[@id='updateRiskModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement URisk_catsave;
	@FindBy(xpath = "//button[@id='updateModal']")
	public WebElement URisk_catcancel;
	public void update_the_risk_cateory(String s1) throws InterruptedException {
		sendkeyweb(Search, s1);
		Clickelement(driver.findElement(By.xpath("//td[text()='" + s1 + "']/following-sibling::td//button[@id='editIcon']")));
		validatetext(URisk_cat, "Update Risk Category");
		validatetext(URisk_catname, "Risk Category Name");
		validateattribute(URisk_catname_in, "placeholder", "Category Name");
		sendkeyweb(URisk_catname_in, s1);
		validatetext(Risk_catdesc, "Risk Category Description");
		validateattribute(Risk_catdesc_in, "placeholder", "Category Description");
		sendkeyweb(Risk_catdesc_in, "Access permissions to "+s1);
		validatetext(URisk_catsave, "Save");
		validatetext(URisk_catcancel, "Cancel");
		Clickelement(URisk_catsave);
		try {
			validatealert("alert");
		} catch (Exception e) {
		}

	}



	public void validate_the_updated_risk_category(String s1) throws InterruptedException {
		sendkeyweb(Search, s1); 
		dispalyedattribute(Table_data.get(0), "Risk category ID");
		validatetext(Table_data.get(1), s1);
		validatetext(Table_data.get(2), "Access permissions to " +s1);
		validatetext(Table_data.get(3), "UMS SUPPORT");
		validatetext(Table_data.get(4), "2024-05-20T12:39:49.202723");
		validatetext(Table_data.get(5), "Active");
		validatetext(Table_data.get(6), "UMS SUPPORT");
		validatetext(Table_data.get(7), "");

		dispalyedattribute(Edit_icon, "Edit Icon");
		dispalyedattribute(Trash_icon, "Delete Icon");

	}


	public void delete_the_risk_categories( String s1) throws InterruptedException {
		sendkeyweb(Search, s1); 
		Clickelement(driver.findElement(By.xpath("//td[text()='" + s1 + "']/following-sibling::td//button[@id='trashIcon']")));
		validatealert("alert");
		driver.switchTo().alert().dismiss();
		Clickelement(driver.findElement(By.xpath("//td[text()='" + s1 + "']/following-sibling::td//button[@id='trashIcon']")));
		validatealert("alert");
		driver.switchTo().alert().accept();
	}

}

