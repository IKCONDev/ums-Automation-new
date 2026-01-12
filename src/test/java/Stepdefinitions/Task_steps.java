package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Drivemanager.Driver;
import Objectclasses.Actionitem_object;
import Objectclasses.Task_object;
import io.cucumber.java.en.Then;

public class Task_steps {
	
		
		WebDriver driver = Driver.getDriver();
		
		Task_object TO = new Task_object(driver);
		
		@Then("user validates the task page {string}")
		public void user__validate_the_task_page(String TT) throws Exception {
		TO.user_validate_Task_page(TT);
		
		}	
		@Then("user updates the task page {string}")
		public void user__updates_the_task_page(String TT) throws Exception {
		TO.user_updates_Task_page(TT);
		
		}
		
		@Then("user deletes the task page {string}")
		public void user__deletes_the_task_page(String TT) throws Exception {
		TO.user_deletes_Task_page(TT);
		
		}
		
		@Then("user clicks editcolumn in the task page")
		public void user__clicks_editcolumns_in_the_task_page() throws Exception {
		TO.user_clicks_editcolumns_Task_page();
		
		}
		
		@Then("user clicks filter in the task page {string}")
		public void user__clicks_filter_in_the_task_page(String TT) throws Exception {
		TO.user_clicks_filter_in_Task_page(TT);
	
		}
		@Then("user clicks DueToday in the task page")
		public void user_clicks_DueToday_Task_page() throws Exception {
		TO.user_clicks_DueToday_Task_page();
	
		}
		@Then("user clicks OverDue in the task page")
		public void user_clicks_overDue_Task_page() throws Exception {
		TO.user_clicks_OverDue_Task_page();
	
		}
		@Then("user clicks Upcoming in the task page")
		public void user_clicks_Upcoming_Task_page() throws Exception {
		TO.user_clicks_Upcoming_Task_page();
	
		}
		@Then("user clicks Duefilters in the task page")
		public void user_clicks_Duefilters_Task_page() throws Exception {
		TO.user_clicks_Duefilters_Task_page();
		}
		@Then("user clicks dropdown in the task page")
		public void user_clicks_dropdwon() throws Exception {
		TO.user_clicks_dropdwon();
		}
		@Then("user clicks Mytasks in the task page")
		public void user_clicks_mytasks() throws Exception {
		TO.user_clicks_mytasks();
		}
		
		@Then("user clicks Teamtasks in the task page")
		public void user_clicks_Teamtasks() throws Exception {
		TO.user_clicks_Teamtasks();
		}
		
		@Then("user clicks Assignedto in the task page")
		public void user_clicks_Assignedto() throws Exception {
		TO.user_clicks_Assignedto();
		}
		
		@Then("user clicks Createdby in the task page")
		public void user_clicks_Createdby() throws Exception {
		TO.user_clicks_Createdby();
		}
		@Then("user clicks Reviewer in the task page")
		public void user_clicks_review() throws Exception {
		TO.user_clicks_review();
		}
				
}


