package stepDefinition;
 

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import base.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.Login_pageobjects;

public class SD_Login extends BaseClass   {
	Logger log = LogManager.getLogger("SD_Login.java");
	
	Login_pageobjects lpobjects = new Login_pageobjects(driver);
	String title;

	 
	
	
	@Given("user is  on browser")
	public void user_is_on_browser() {
		System.out.println("Test");
		setUpDriver();
		
	}

	@When("user opens LMS Website")
	public void user_opens_lms_website() {
		title = driver.getTitle();
		log.info("The Login Page tittle is :" +title);
		System.out.println("Pre Home Page Title is: " + title);
	  
	   
	}

	@Then("user is on Login Page")
	public void user_is_on_login_page() {
	  System.out.println(title);
	}



	@Given("user is on login page4")
	public void user_is_on_login_page4() {
	   System.out.println(title);
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		lpobjects = new Login_pageobjects(driver);
		lpobjects.UserName();
		lpobjects.Password();
		
	   
	}

	@Then("user click on Login Button")
	
	public void user_click_on_login_button() {
		lpobjects.LogButton();
	   
	}

	@Then("user is at HomePage")
	public void user_is_at_home_page() {
		System.out.println(driver.getTitle());
	  
	}	
}