
	package Objectclasses;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Drivemanager.Driver;
	import hooks.Baseclass;

	public class integration_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
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
			
			driver.navigate().back();

}
}