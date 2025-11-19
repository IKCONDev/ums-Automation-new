package Objectclasses;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivemanager.Driver;
import hooks.Baseclass;


public class batchprocess_object  extends Baseclass{

	WebDriver driver = Driver.getDriver();
	public batchprocess_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath="//div[normalize-space()='Setup']")
	public WebElement Setup;

	@FindBy(xpath="//a[normalize-space()='Batch Process Time']")
	public WebElement Batchprocesstime;

	@FindBy(xpath="//div[@id='modalHeader']/h5[@class='modal-title']")
	public WebElement Batch_Process_Time;
	//	@FindBy(xpath="//b[contains(text(),'Currently scheduled to run after')]")
	//	public WebElement Batch_current_Time;
	@FindBy(xpath="//label")
	public WebElement Choose_Time;

	@FindBy(xpath="//span[contains(text(),'Currently scheduled to run after every 5 hour(s) 0')]")
	public WebElement  Batch_current_Time;

	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Savebtn;
	

	@FindBy(xpath="//button[@id='closeUpdateModal']")
	public WebElement Cancel;
	public void Validate_the_Batch_process_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Clickelement(Setup);
		Clickelement(Batchprocesstime);

		validatetext(Batch_Process_Time,"Batch Process Time");
		validatetext(Batch_current_Time,"Currently scheduled to run after every 5 hour(s) 0 minute(s)");
		validatetext(Choose_Time,"Choose Time*");
		validatetext(Savebtn, "Save");
		validatetext(Cancel, "Cancel");
		Clickelement(Cancel);
	}

}
//System.out.println(vc.findElement(By.xpath("//div[@id='modalHeader']/h5[@class='modal-title']")).getText().equals("Batch Process Time") 
//? "Batch process title is matched" 
//: "Batch process title is not matched");


