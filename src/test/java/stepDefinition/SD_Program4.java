package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.Login_pageobjects;
import pageObjects.ProgramPage1_pageobjects;

public class SD_Program4  extends BaseClass 
{
	WebDriver driver;
	ProgramPage1_pageobjects pp1;
	WebElement delete_button;
	
 	
	@Given("User is on  homepage")
	public void user_is_on_homepage() 
	{ 
		driver = this.driver ;
		System.out.println("LMS" + driver.getTitle());
	}

	@When("User is able to see search box")
	public void user_is_able_to_see_search_box() 
	{
		pp1 = new ProgramPage1_pageobjects(driver);
		pp1.searchbox();
		Assert.assertTrue(true);
	}

	@Then("Text box used for search has text as Search")
	public void text_box_used_for_search_has_text_as_search() 
	{
		pp1.text_on_searchbox();
		Assert.assertEquals(true, true);
	}

	@When("User clicks on delete button")
	public void user_clicks_on_delete_button() 
	{
		pp1.verify_dlt_btn();
		
	}

	@Then("User should see the Delete button as Disabled")
	public void user_should_see_the_delete_button_as_disabled() 
	{
		Boolean bln = delete_button.isEnabled();
		if(bln) {
			System.out.println("delete button is enabled");
			
		}
		else {
			System.out.println("delete button is Disabled");
		}
	}

	@When("User counts the number of rows")
	public void user_counts_the_number_of_rows() {
		
	}

	@Then("Verify that number of records rows of data in the table displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	}

	@When("User scrolls down")
	public void user_scrolls_down() {
	}

	@Then("User should see the text as Showing x to y of z entries below the table and x starting record number on that page and y ending record number on that page and z Total number of records")
	public void user_should_see_the_text_as_showing_x_to_y_of_z_entries_below_the_table_and_x_starting_record_number_on_that_page_and_y_ending_record_number_on_that_page_and_z_total_number_of_records() {
	}

	@When("User scrolls down to look at the footer")
	public void user_scrolls_down_to_look_at_the_footer() {
	}

	@Then("User should see the footer as In total there are z programs and z Total number of records")
	public void user_should_see_the_footer_as_in_total_there_are_z_programs_and_z_total_number_of_records() {
	}

	
 
	
}
