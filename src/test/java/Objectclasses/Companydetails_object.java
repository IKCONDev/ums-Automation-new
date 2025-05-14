package Objectclasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;

public class Companydetails_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Companydetails_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath="//div[normalize-space()='Setup']")
	public WebElement Setup;
	
	@FindBy(xpath="//a[normalize-space()='Company Details']")
	public WebElement Companydetails;

	@FindBy(xpath="//h3[@class='title']")
	public WebElement Organization;
	@FindBy(xpath="//h5[normalize-space()='Super Admin']")
	public WebElement Super_Admin;
	@FindBy(xpath="//h5[normalize-space()='Locality Details']")
	public WebElement Locality_Details;
	@FindBy(xpath="//h5[normalize-space()='Contact Details']")
	public WebElement Contact_Details;
	@FindBy(xpath="//div[@class='col-sm-3']//h5[1]")
	public WebElement Address_Details;
	@FindBy(xpath="//button[@class='fa fa-pencil']")
	public WebElement Edit_icon;
	@FindBy(xpath="//div[@id='orgNameId']//*[name()='svg']//*[name()='path' and contains(@d,'M21.5 21H2')]")
	public WebElement org_name;
	@FindBy(xpath="//*[name()='path' and contains(@d,'M46 0C20.6')]")
	public WebElement org_url;
	@FindBy(xpath="//*[name()='path' and contains(@d,'M9 5.75V4.')]")
	public WebElement org_type;
	@FindBy(xpath="//*[name()='path' and contains(@d,'M9 9.5C10.')]")
	public WebElement org_person;
	@FindBy(xpath="//div[@class='col-sm-3']//div[5]//*[name()='svg']")
	public WebElement org_contact;
	@FindBy(xpath="//*[name()='path' and contains(@d,'M15 3.5H3C')]")
	public WebElement org_email;
//	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//label[1]")
//	public WebElement org_super_email;
	@FindBy(xpath="//label[normalize-space()='Country']")
	public WebElement org_country;
	@FindBy(xpath="//label[normalize-space()='Timezone']")
	public WebElement org_Timezone;
//	@FindBy(xpath="//body[1]/app-root[1]/app-organization[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/label[1]")
//	public WebElement Company_Email_ID;
	@FindBy(xpath="//label[normalize-space()='Phone']")
	public WebElement Company_phone;
	public void validate_the_company_details_page() {
		Clickelement(Setup);
		Clickelement(Companydetails);

		validatetext(Organization, "Organization");
		validatetext(Super_Admin,"Super Admin");
		validatetext(Locality_Details,"Locality Details");	
		validatetext(Contact_Details,"Contact Details");
		validatetext(Address_Details,"Address Details");
		dispalyedattribute(Edit_icon, "Edit icon");
		dispalyedattribute(org_name, "Company Name icon");
		dispalyedattribute(org_url, "Company Website URL");
		dispalyedattribute(org_type, "Company type");
		dispalyedattribute(org_person, "Contact Person icon");
		dispalyedattribute(org_contact, "Contact number icon");
		dispalyedattribute(org_email, "Company Email ID");
//		dispalyedattribute(org_super_email, "Super admin Email ID");
		validatetext(org_country,"Country");
		validatetext(org_Timezone,"Timezone");
//		validatetext(Company_Email_ID,"Company Email ID");
		validatetext(Company_phone,"Phone");
	}



	@FindBy(xpath="//button[@class='fa fa-pencil']")
	public WebElement Edit;
	@FindBy(xpath="//input[@placeholder='Enter Company Name']")
	public WebElement CN;
	@FindBy(xpath="//input[@placeholder='Enter Company Website URL']")
	public WebElement CURL;
	@FindBy(xpath="//input[@placeholder='Enter Company Type']")
	public WebElement CNT;
	@FindBy(xpath="//input[@placeholder='Enter Company Contact Person']")
	public WebElement CCP;
	@FindBy(xpath="//select[@id='selectAdjust']")
	public WebElement Country;
	@FindBy(xpath="//input[@placeholder='Enter Contact Number']")
	public WebElement CCPN;
	@FindBy(xpath="//input[@placeholder='Enter Contact Person Email']")
	public WebElement CPE;
	@FindBy(xpath="//textarea[contains(@class,'form-control')]")
	public WebElement ADDR;
	@FindBy(xpath="//input[@placeholder='Enter Super Admin Email ID']")
	public WebElement SAE;
	@FindBy(xpath="//select[@id='country-dropdown']")
	public WebElement Country1;
	@FindBy(xpath="//select[@placeholder='Choose Time Zone']")
	public WebElement Timezone;
	@FindBy(xpath="//input[@placeholder='Enter Company Email ID']")
	public WebElement CDE;
	@FindBy(xpath="//input[@placeholder='Enter Company Contact Number']")
	public WebElement CDP;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Save;
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public WebElement Cancel;
	@FindBy(xpath="(//button[normalize-space()='Save'])[1]")
	public WebElement Save1;
	public void add_the_company_details() throws InterruptedException {
		Clickelement(Edit);
		sendkeyweb(CN, "IKCON Digital IT Services");
		sendkeyweb(CURL, "www.ikcontech.com");
		sendkeyweb(CNT, "IT Services");
		sendkeyweb(CCP, "Mahesh Swal");
		Thread.sleep(3000);
//		Selectdropdown(Country, "IND");
//		Thread.sleep(3000);

		sendkeyweb(CCPN, "7032116373");
		sendkeyweb(CPE,"vivekseetharaman@ikcontech.com");
		sendkeyweb(ADDR,"Second Floor,ISR Towers,Madhapur,Hyderabad - 500081");
		sendkeyweb(SAE,"tdivakar@ikcontech.com");
		Thread.sleep(3000);

//		Selectdropdown(Country1, "India");
//		Thread.sleep(3000);
//
//		Selectdropdown(Timezone, "Indian Standard Time");
//		Thread.sleep(3000);

		sendkeyweb(CDE,"sales@ikcontech.com");
		sendkeyweb(CDP, "7324055077");
		validatetext(Save, "Save");
		validatetext(Cancel, "Cancel");
		try {
			Clickelement(Save);
		} catch (Exception e) {
			Clickelement(Save1);
		}

	}

	public void update_the_company_details() throws InterruptedException {
		add_the_company_details();
	}
}




