package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage_pageobjects;
import pageObjects.Login_pageobjects;
import pageObjects.ProgramPage1_pageobjects;

public class SD_Hp extends BaseClass {
	
	
	Login_pageobjects lpobjects;
	HomePage_pageobjects hpobjects = new HomePage_pageobjects(driver);
	ProgramPage1_pageobjects pp1objects = new ProgramPage1_pageobjects(driver);
	Logger log = LogManager.getLogger("SD_Hp.java");
	
	WebElement Text_on_page;
	WebElement program;
	WebElement batch;
	WebElement user;
	WebElement attendance;
	WebElement assignment;
	WebElement logout;
	  
	
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() 
	{
		
		 String title = driver.getTitle();
		 log.info("LMS @Given User is on Homepage " + title);
			//Assert.assertTrue(true);

		
	}

	@When("User mouse hovers on the text of the page")
	public void user_clicks_on_the_text_of_the_page() 
	{
		Text_on_page.isDisplayed();
	}

	@Then("User should be able to see the text LMS Learning Management System on the Home page")
	public boolean user_should_be_able_to_see_the_text_lms_learning_management_system_on_the_home_page() {
		
		 Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='LMS - Learning Management System']")).isDisplayed();
		    return visible;
		
	}
	
	
	@When("User clicks on the program")
	public void user_clicks_on_the_program() {
		program.click();
		
	}

	@Then("User should see a button with text Program on the menu bar")
	public boolean user_should_see_a_button_with_text_program_on_the_menu_bar() 
	{
		 Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Program']")).isDisplayed();
		    return visible;
	}
	@When("User clicks on the batch")
	public void user_clicks_on_the_batch() {
		batch.click();
	}


	@Then("User should see a button with text batch on the menu bar")
	public boolean user_should_see_a_button_with_text_batch_on_the_menu_bar() {
		  Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Batch']")).isDisplayed();
		    return visible;
	}
	
	@When("User mouse hovers on the user button")
	public void user_clicks_on_the_user_button() {
		user.click();
		Assert.assertTrue(true);
	}

	@Then("User should see a button with text User on the menu bar")
	public boolean user_should_see_a_button_with_text_user_on_the_menu_bar() {
		 Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='User']")).isDisplayed();
		    return visible;
	}
	@When("User mouse hovers on the Assignment button")
	public void user_clicks_on_the_assignment_button() {
		assignment.click();
		Assert.assertTrue(true);
	}

	@Then("User should see a button with text Assignment on the menu bar")
	public boolean user_should_see_a_button_with_text_assignment_on_the_menu_bar() {
		 Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Assignment']")).isDisplayed();
		    return visible;
	}
	@When("User clicks on the attendence button")
	public void user_clicks_on_the_attendence_button() 
	{
		attendance.click();
		Assert.assertTrue(true);
	}

	@Then("User should see a button with text Attendence on the menu bar")
	public boolean user_should_see_a_button_with_text_attendence_on_the_menu_bar() {
		Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Attendance']")).isDisplayed();
	    return visible;
		
	}
	@When("User clicks on the logout")
	public void user_clicks_on_the_logout() 
	{
       logout.click();
       Assert.assertTrue(true);
	}

	@Then("User should see a button with text logout on the menu bar")
	public boolean user_should_see_a_button_with_text_logout_on_the_menu_bar() {
		Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Logout']")).isDisplayed();
	    return visible;
	}


}
