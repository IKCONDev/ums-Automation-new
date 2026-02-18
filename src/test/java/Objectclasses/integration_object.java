
package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datepicker.Dateformatter;
import Drivemanager.Driver;
import hooks.Baseclass;

public class integration_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	Dateformatter D = new Dateformatter();

	public integration_object (WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}


	@FindBy(xpath="//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath="//a[normalize-space()='Integration']")
	public WebElement Integration;

	@FindBy(xpath="//h3[@class='title']")
	public WebElement Headertext;

	@FindBy(xpath="//div[normalize-space()='Microsoft Teams']")
	public WebElement MSTeams;

	@FindBy(xpath="//div[normalize-space()='Google Meet']")
	public WebElement Gmeet;

	@FindBy(xpath="//div[normalize-space()='Zoom']")
	public WebElement Zoom;

	@FindBy(xpath="//div[normalize-space()='Webex']")
	public WebElement Webex;

	public void validate_the_Meeting_tools_integration_page() throws InterruptedException {
		Clickelement(Setup);
		Clickelement(Integration);

		validatetext(Headertext, "Meeting Tool Integrations");
		validatetext(MSTeams, "Microsoft Teams");

		validatetext(Gmeet, "Google Meet");
		validatetext(Zoom, "Zoom");

		validatetext(Webex, "Webex");


	}
	@FindBy(xpath="(//button[@id='button1'])[1]")
	public WebElement Configureteams;

	@FindBy(xpath="//label[normalize-space()='Tenant ID']")
	public WebElement Teamstenantidtxt;

	@FindBy(xpath="//input[@placeholder='Enter Tenant ID']")
	public WebElement Teamstenantidplaceholder;

	@FindBy(xpath="//label[normalize-space()='Client ID']")
	public WebElement Teamsclientidtxt;

	@FindBy(xpath="//input[@placeholder='Enter Client ID']")
	public WebElement Teamsclientidplaceholder;

	@FindBy(xpath="//label[normalize-space()='Client Secret']")
	public WebElement Teamsclientsecrettxt;

	@FindBy(xpath="//input[@placeholder='Enter Client Secret']")
	public WebElement Teamsclientsecretplaceholder;

	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public WebElement Teamstenantcancelbtn;

	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Teamstenantsavebtn;

	public void Configure_the_Microsoft_teams_in_tool_integration_page(String MSTenantID, String MSClientID, String MSClientsecret) throws InterruptedException {
		Clickelement(Configureteams);
		validatetext(Teamstenantidtxt, "Tenant ID");
		validateattribute(Teamstenantidplaceholder, "placeholder", "Enter Tenant ID");
		sendkeyweb(Teamstenantidplaceholder, MSTenantID);
		validatetext(Teamsclientidtxt, "Client ID");
		validateattribute(Teamsclientidplaceholder, "placeholder", "Enter Client ID");
		sendkeyweb(Teamsclientidplaceholder, MSClientID);
		validatetext(Teamsclientsecrettxt, "Client Secret");
		validateattribute(Teamsclientsecretplaceholder, "placeholder", "Enter Client Secret");
		sendkeyweb(Teamsclientsecretplaceholder, MSClientsecret);
		validatetext(Teamstenantcancelbtn, "Cancel");
		validatetext(Teamstenantsavebtn, "Save");
		Clickelement(Teamstenantsavebtn);
		popupvalidate("Teams tenant details saved successfully", MSClientsecret);
		Thread.sleep(3000);
	}

	@FindBy(xpath="(//button[@id='button1'])[2]")
	public WebElement ConfigureGooglemeet;

	@FindBy(xpath="//label[normalize-space()='Client ID']")
	public WebElement GmeetClientIDtxt;

	@FindBy(xpath="//input[@placeholder='Enter Client ID']")
	public WebElement GmeetClientIDplaceholder;

	@FindBy(xpath="//label[normalize-space()='Client Secret']")
	public WebElement GmeetClientsecrettxt;

	@FindBy(xpath="//input[@placeholder='Enter Client Secret']")
	public WebElement GmeetClientsecretplaceholder;

	@FindBy(xpath="//label[normalize-space()='Refresh Token']")
	public WebElement GmeetRefreshtokentxt;

	@FindBy(xpath="//input[@placeholder='Enter Tenant ID']")
	public WebElement GmeetRefreshtokenplaceholder;

	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public WebElement Gmeetcancelbtn;

	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Gmeetsavebtn;


	public void Configure_the_Google_meet_in_tool_integration_page(String GmeetClientID, String GmeetClientsecret, String GmeetRefreshtoken) throws InterruptedException {
		Clickelement(ConfigureGooglemeet);
		validatetext(GmeetClientIDtxt, "Client ID");
		validateattribute(GmeetClientIDplaceholder, "placeholder", "Enter Client ID");
		sendkeyweb(GmeetClientIDplaceholder, GmeetClientID);
		validatetext(GmeetClientsecrettxt, "Client Secret");
		validateattribute(GmeetClientsecretplaceholder, "placeholder", "Enter Client Secret");
		sendkeyweb(GmeetClientsecretplaceholder, GmeetClientsecret);
		validatetext(GmeetRefreshtokentxt, "Refresh Token");
		validateattribute(GmeetRefreshtokenplaceholder, "placeholder", "Enter Tenant ID");
		sendkeyweb(GmeetRefreshtokenplaceholder, GmeetRefreshtoken);
		validatetext(Gmeetcancelbtn, "Cancel");
		validatetext(Gmeetsavebtn, "Save");
		Clickelement(Gmeetsavebtn);		
		popupvalidate("Googlemeet tenant details saved successfully", GmeetClientID);

	}
	@FindBy(xpath="(//button[@id='button1'])[3]")
	public WebElement Configurezoom;

	@FindBy(xpath="//label[normalize-space()='Account ID']")
	public WebElement ZoomAccountIDtxt;

	@FindBy(xpath="//input[@placeholder='Enter Tenant ID']")
	public WebElement ZoomTenantIDplaceholder;

	@FindBy(xpath="//label[normalize-space()='Client ID']")
	public WebElement ZoomClientIDtxt;

	@FindBy(xpath="//input[@placeholder='Enter Client ID']")
	public WebElement ZoomClientIDplaceholder;

	@FindBy(xpath="//label[normalize-space()='Client Secret']")
	public WebElement ZoomClientSecrettxt;

	@FindBy(xpath="//input[@placeholder='Enter Client Secret']")
	public WebElement ZoomClientSecretplaceholder;

	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public WebElement ZoomCancelbtn;

	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement ZoomSavebtn;


	public void Configure_the_zoom_in_tool_integration_page(String ZoomAccountID, String ZoomClientID, String ZoomClientsecret) throws InterruptedException {
		Clickelement(Configurezoom);
		validatetext(ZoomAccountIDtxt, "Account ID");
		validateattribute(ZoomTenantIDplaceholder, "placeholder", "Enter Tenant ID");
		sendkeyweb(ZoomTenantIDplaceholder, ZoomAccountID);

		validatetext(ZoomClientIDtxt, "Client ID");
		validateattribute(ZoomClientIDplaceholder, "placeholder", "Enter Client ID");
		sendkeyweb(ZoomClientIDplaceholder, ZoomClientID);

		validatetext(ZoomClientSecrettxt, "Client Secret");
		validateattribute(ZoomClientSecretplaceholder, "placeholder", "Enter Client Secret");
		sendkeyweb(ZoomClientSecretplaceholder, ZoomClientsecret);
		validatetext(ZoomCancelbtn, "Cancel");
		validatetext(ZoomSavebtn, "Save");
		Clickelement(ZoomSavebtn);
		popupvalidate("Zoom tenant details saved successfully", ZoomAccountID);

	}

	@FindBy(xpath="(//button[contains(text(),'Configure')])[4]")
	public WebElement Configurewebex;

	@FindBy(xpath="//label[normalize-space()='Client ID']")
	public WebElement webexClientIDtxt;

	@FindBy(xpath="//input[@placeholder='Enter Client ID']")
	public WebElement webexClientIDplaceholder;

	@FindBy(xpath="//label[normalize-space()='Client Secret']")
	public WebElement webexClientSecrettxt;

	@FindBy(xpath="//input[@placeholder='Enter Client Secret']")
	public WebElement webexClientSecretplaceholder;

	@FindBy(xpath="//label[normalize-space()='Token']")
	public WebElement webexTokentxt;

	@FindBy(xpath="//input[@placeholder='Enter Token']")
	public WebElement webexTokenplaceholder;

	@FindBy(xpath="//label[normalize-space()='Refresh Token']")
	public WebElement webexRefreshTokentxt;

	@FindBy(xpath="//input[@placeholder='Enter Tenant ID']")
	public WebElement webexRefreshTokenplaceholder;

	@FindBy(xpath="//label[normalize-space()='Refresh Token Expires At Date']")
	public WebElement webexRefreshTokenexpiresatdatetxt;
	
	@FindBy(xpath="//input[@placeholder='Refresh Token Expires At Date']")
	public WebElement webexRefreshTokenexpiresatdateplaceholder;

	@FindBy(xpath="//label[normalize-space()='Refresh Token Expires in Time (seconds)']")
	public WebElement webexRefreshTokenexpiresintimetxt;

	@FindBy(xpath="//input[@inputmode='numeric']")
	public WebElement webexRefreshTokenexpiresintimeplaceholder;

	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public WebElement webexcancelbtn;


	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement webexsavebtn;


	public void Configure_the_webex_in_tool_integration_page(String WebexClientID, String WebexClientSecret, String Webextoken, String WebexRefreshtoken, String webexrefreshtokenexpire) throws InterruptedException {
		Clickelement(Configurezoom);
		validatetext(webexClientIDtxt, "Client ID");
		validateattribute(webexClientIDplaceholder, "placeholder", "Enter Client ID");
		sendkeyweb(webexClientIDplaceholder, WebexClientID);

		validatetext(webexClientSecrettxt, "Client Secret");
		validateattribute(webexClientSecretplaceholder, "placeholder", "Enter Client Secret");
		sendkeyweb(webexClientSecretplaceholder, WebexClientSecret);

		validatetext(webexTokentxt, "Token");
		validateattribute(webexTokenplaceholder, "placeholder", "Enter Token");
		sendkeyweb(webexTokenplaceholder, Webextoken);

		validatetext(webexRefreshTokentxt, "Refresh Token");
		validateattribute(webexRefreshTokenplaceholder, "placeholder", "Enter Tenant ID");
		sendkeyweb(webexRefreshTokenplaceholder, WebexRefreshtoken);

		validatetext(webexRefreshTokenexpiresatdatetxt, "Refresh Token Expires At Date");
		sendkeyweb(webexRefreshTokenexpiresatdateplaceholder, D.Datefun(1, 1, 1));

		validatetext(webexRefreshTokenexpiresintimetxt, "Refresh Token Expires in Time (seconds)");
		sendkeyweb(webexRefreshTokenexpiresintimeplaceholder, webexrefreshtokenexpire);
		validatetext(webexcancelbtn, "Cancel");
		validatetext(webexsavebtn, "Save");
		Clickelement(webexsavebtn);
		popupvalidate("Webex tenant details saved successfully", webexrefreshtokenexpire);

	}
}