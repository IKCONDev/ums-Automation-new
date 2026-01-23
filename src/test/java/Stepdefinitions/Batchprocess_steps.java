package Stepdefinitions;


import java.time.Duration;


import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.batchprocess_object;
import io.cucumber.java.en.And;

public class Batchprocess_steps {
	WebDriver driver = Driver.getDriver();
	batchprocess_object BO=new batchprocess_object(driver);

	@And("Validate the Batch process page")
	public void Validate_the_Batch_process_page() throws InterruptedException {
		BO.Validate_the_Batch_process_page();

	}
}


