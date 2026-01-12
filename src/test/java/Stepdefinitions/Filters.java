package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import Drivemanager.Driver;
import Objectclasses.Filter_objects;
import hooks.Baseclass;
import io.cucumber.java.en.*;

public class Filters extends Baseclass {
	WebDriver driver = Driver.getDriver();
	Filter_objects EO = new Filter_objects(driver);
	
	@And("Group by")
	public void Overdue() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.navigate().forward();
//		Thread.sleep(6000);
//		List<WebElement> web= driver.findElements(By.xpath("//div[@class='d-flex row']//div"));
//		for(WebElement e:web) {
//		Clickelement(e);
//		Thread.sleep(6000);
//		}
//		Thread.sleep(6000);
//		String[] src= {"Due Tomorrow","Due This Week","Due This Month"};
//		for(int i=0;i<3;i++) {
//		Clickelement(driver.findElement(By.xpath("//div[contains(@id,'headerNgSelect')]//span[@class='ng-arrow-wrapper']")));
//		Thread.sleep(6000);
//		Clickelement(driver.findElement(By.xpath("//span[normalize-space()='"+src[i]+"']")));
//		Thread.sleep(6000);
//		}
		
	}
	
	@Then("navigate to Meetings")
	public void Meetings() {
		EO.Meetings();
	}
	@Then("navigate to Actionitems")
	public void Actionitems() {
		EO.Actionitems();
	}
	@Then("navigate to Tasks")
	public void Tasks() {
		EO.Taskss();
	}
	@Then("navigate to Risks")
	public void Risks() {
		EO.Risks();
	}
	
	@And("Meeting Filters {string} {string}")
	public void Meeting_Filters(String AC,String MT) throws InterruptedException {
		EO.Meeting_Filters(AC, MT);
	}

	@And("Action Item Filters {string} {string}")
	public void Action_Item_Filters(String AC,String AT) throws InterruptedException {
		EO.Action_Item_Filters(AC,AT);
		
		
	}
	@And("Task Filters  {string} {string}")
	public void Task_Filters(String AC,String TT) throws InterruptedException {
		EO.Task_Filters(AC, TT);
	}
	
	@And("Risk Filters {string} {string}")
	public void Risk_Filters(String AC,String TT) throws InterruptedException {
		EO.Risk_Filters(AC, TT);
	}
}

