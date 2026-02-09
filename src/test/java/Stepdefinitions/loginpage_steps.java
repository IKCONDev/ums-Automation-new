package Stepdefinitions;

import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Login_object;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginpage_steps {
	WebDriver driver;
	Login_object LO;


	// Synchronization object to make all threads start together
	private static CountDownLatch latch = new CountDownLatch(1);
	// This runs before every scenario
	public loginpage_steps() {
		// Get ThreadLocal WebDriver for this scenario/thread
		this.driver = Driver.getDriver();
		// Initialize page object for this thread
		this.LO = new Login_object(driver);
	}

	@Given("user is Navigate Login page {string}")
	public void user_is_Navigates_loginpage(String url) throws InterruptedException {
		latch.await();
		//		driver.get("http://132.145.186.188:4200/#/login");	
		driver.get(url);	
		driver.manage().window().maximize();
	}

	@When("user is validate Login page {string} {string}")
	public void user_is_validates_loginpage(String Username,String Password ) throws Exception {
		LO.user_validating_login_page();
		LO.user_clicks_login_page(Username,Password);		
	}

	public static void releaseAllBrowsers() {
		latch.countDown(); // All waiting threads will start at the same time

	}
}
