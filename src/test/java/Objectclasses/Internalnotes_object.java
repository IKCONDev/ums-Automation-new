package Objectclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Internalnotes_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Internalnotes_object (WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath = "//div[normalize-space()='Internal Notes']")
	public WebElement Internalnotes;

	@FindBy(xpath = "//h3[@class='title']")
	public WebElement Internalnotesheader;

	@FindBy(xpath = "//div[contains(text(),'Add')]")
	public WebElement Add_btn;

	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	public WebElement Edit_column;

	@FindBy(xpath = "//tr//th")
	public List<WebElement> Table;

	public void validate_the_Internalnotes_page() throws InterruptedException {

		Clickelement(Internalnotes);

		validatetext(Internalnotesheader,"Internal Notes");
		validatetext(Add_btn, "Add");
		validatetext(Edit_column, "Edit Column");


		String s= "ID,Title,Created By,Status,View Document,Edit,Delete";

		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		for (int i = 1; i < 7; i++) {
			validatetext(Table.get(i), list.get(i));
		}
	}
	@FindBy(xpath = "//h5[normalize-space()='Add Internal Notes']")
	public WebElement Addinternalnotes;

	@FindBy(xpath = "//div[@id='createModal']//label[@for='meetingOrganizerName'][normalize-space()='Created By']")
	public WebElement Createdby;

	@FindBy(xpath = "//div[@id='createModal']//label[@for='meetingOrganizerEmailId'][normalize-space()='Created By Email ID']")
	public WebElement Createdbyemailid;

	@FindBy(xpath = "(//label[@for='subject'])[2]")
	public WebElement Reviewer;

	@FindBy(xpath = "(//label[@for='subject'])[3]")
	public WebElement Approver;

	@FindBy(xpath = "//div[@id='attendeeBlock']//label[@for='internalNoteDocumentName']")
	public WebElement Internalnotedocument;

	@FindBy(xpath = "//div[@id='createModal']//button[@id='createMeeting']")
	public WebElement Create_btn;

	@FindBy(xpath = "//div[@id='createModal']//button[@id='closeCreateMeetingModal']")
	public WebElement Cancel_btn;

	@FindBy(xpath = "//div[@id='createModal']//input[@id='subject']")
	public WebElement Title;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement Reviewerdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='UMS SUPPORT']")
	public WebElement Reviewerselect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	public WebElement Approverdrpdwn;

	@FindBy(xpath = "//span[normalize-space()='Adam Smith']")
	public WebElement Approverselect;

	@FindBy(xpath = "(//div[contains(@class, 'upload')])[1]")
	public WebElement Internaldoc;

	@FindBy(xpath = "//div[@id='createModal']//button[@id='createMeeting']")
	public WebElement Createbtn;


	public void add_the_Internalnotes_page(String IN) throws InterruptedException, AWTException {

		Clickelement(Add_btn);
		validatetext(Addinternalnotes, "Add Internal Notes");

		validatetext(Createdby, "Created By");

		validatetext(Createdbyemailid, "Created By Email ID");

		validatetext(Reviewer, "Reviewer*");
		validatetext(Approver, "Approver*");
		validatetext(Internalnotedocument, "Internal Note Document*");
		validatetext(Create_btn, "Create");
		validatetext(Cancel_btn, "Cancel");
		sendkeyweb(Title, IN);
		Thread.sleep(3000);
		Clickelement(Reviewerdrpdwn);
		Thread.sleep(3000);
		Clickelement(Reviewerselect);
		Thread.sleep(3000);
		Clickelement(Approverdrpdwn);
		Thread.sleep(5000);

		Clickelement(Approverselect);
		Thread.sleep(3000);

		Clickelement(Internaldoc);
		Thread.sleep(3000);

		String path= "C:\\Users\\PraveenReddyGurram\\eclipsenew\\UMS_NEW\\src\\test\\resources\\Documents\\API TESTING.docx";
		StringSelection selection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		// Wait for the file dialog to appear
		robot.delay(2000);
		// Paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		// Press Enter to close the file dialog
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	

		Clickelement(Createbtn);
		Thread.sleep(3000);


	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search;
	@FindBy(xpath = "//tbody//td")
	public List<WebElement> Table_data;
	@FindBy(xpath = "//button[@id='editIcon']//*[name()='svg']")
	public WebElement Edit_icon;
	@FindBy(xpath = "(//button[@id='trashIcon']//*[name()='svg'])[2]")
	public WebElement Delete_icon;

	public void Validate_the_Added_Internalnotes(String IN) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Search, IN);
		Thread.sleep(3000);


		attributeselected(Table_data.get(0), "ID");
		validatetext(Table_data.get(1), IN);
		validatetext(Table_data.get(2), "UMS SUPPORT");
		validatetext(Table_data.get(3), "In Review");
		Thread.sleep(3000);
		attributeselected(Table_data.get(4), "Document");

		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//h5[normalize-space()='Update Internal Notes']")
	public WebElement Updateinternalnotes;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	public WebElement Updatebtn;

	@FindBy(xpath = "(//button[@id='closeCreateMeetingModal'])[2]")
	public WebElement Cancelbtn;

	@FindBy(xpath = "(//input[@id='subject'])[2]")
	public WebElement Updateinternalnotestitle;

	@FindBy(xpath = "//div[@class='select-box-prority']//img[@alt='Dropdown icon']")
	public WebElement reviewerstatusdrpdwn;

	@FindBy(xpath = "//div[normalize-space()='Reviewed - Approved']")
	public WebElement reviewerstatusselect;

	public void update_the_Internalnotes_page(String IN) throws InterruptedException {
		sendkeyweb(Search, IN);
		Clickelement(driver.findElement(By.xpath("//td[normalize-space()='" + IN + "']/following-sibling::td//button[@id='editIcon']")));

		validatetext(Updateinternalnotes, "Update Internal Notes");
		validatetext(Updatebtn, "Update");
		validatetext(Cancelbtn, "Cancel");
		sendkeyweb(Updateinternalnotestitle, IN);
		Clickelement(reviewerstatusdrpdwn);
		Clickelement(reviewerstatusselect);


		Clickelement(Updatebtn);


	}



	public void validate_the_updated_Internalnotes_page(String IN) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Search, IN);
		Thread.sleep(3000);


		attributeselected(Table_data.get(0), "ID");
		validatetext(Table_data.get(1), IN);
		validatetext(Table_data.get(2), "UMS SUPPORT");
		validatetext(Table_data.get(3), "Under Approval");
		Thread.sleep(3000);
		attributeselected(Table_data.get(4), "Document");

		attributeselected(Edit_icon, "Edit icon");
		Thread.sleep(3000);

		attributeselected(Delete_icon, "Delete icon");
		Thread.sleep(3000);

	}


	public void Delete_the_Internalnotes(String IN) throws InterruptedException {
		driver.navigate().refresh();

		sendkeyweb(Search, IN);

		Clickelement(driver.findElement(By.xpath("(//td[normalize-space()='" + IN + "']/following-sibling::td//button[@id='trashIcon'])[2]")));
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}

		Clickelement(driver.findElement(By.xpath("(//td[normalize-space()='" + IN + "']/following-sibling::td//button[@id='trashIcon'])[2]")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert detected: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}
	}


	@FindBy(xpath = "//div[contains(text(),'Edit Column')]")
	public WebElement Editcolumn;

	@FindBy(xpath = "//input[@placeholder='0 of 8 selected']")
	public WebElement Editcolumndrpdwn;

	@FindBy(xpath = "//label[normalize-space()='Select All']")
	public WebElement Editcolumnselectall;

	@FindBy(xpath = "//div[@id='editAllActionColumnModel']//div[@role='document']//div[@class='modal-content']//div//span[@aria-hidden='true'][normalize-space()='×']")
	public WebElement Editcolumnxmark;

	public void Editcolumn_in_Internalnotes() throws InterruptedException {
		Thread.sleep(3000);
		Clickelement(Editcolumn);
		Thread.sleep(3000);
		Clickelement(Editcolumndrpdwn);
		Thread.sleep(3000);

		Clickelement(Editcolumnselectall);
		Thread.sleep(3000);

		Clickelement(Editcolumnxmark);
		Thread.sleep(3000);

	}
}

