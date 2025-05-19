package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Actionitem_object;
import Objectclasses.Risk_object;
import io.cucumber.java.en.Then;

public class Risk_steps {
			
		WebDriver driver = Driver.getDriver();
		
		Risk_object RO = new Risk_object(driver);
		
		@Then("user checks risks page {string} {string}")
		public void user__check_the_riskpage(String str1, String str2) throws Exception {
		RO.user_check_risk_page(str1, str2);	
		
		
}

}
