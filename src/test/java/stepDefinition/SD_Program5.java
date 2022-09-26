package stepDefinition;

import io.cucumber.java.en.*;
import utilities.ReadConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

public class SD_Program5 
{
	
	Logger log = LogManager.getLogger("SD_Program5.java");
	Batch_PageObject bpo = new Batch_PageObject(driver);
	BatchEdit_PageObject bepo = new BatchEdit_PageObject(driver);
	SoftAssert as = new SoftAssert();
	static ReadConfig config = new ReadConfig();
	public String searchBatch = config.getSearchBatch();
	String tittle;
	String URL;
	String result;
	private String SelectedBatchName = null;


	@Given("User is on the Program page")
	public void user_is_on_the_program_page() {
		
	}

	@When("User enters  name phrase into search box")
	public void user_enters_name_phrase_into_search_box() {
	}

	@Then("Entries for name phrase are shown")
	public void entries_for_name_phrase_are_shown() {
	}

	@When("User enters  description phrase into search box")
	public void user_enters_description_phrase_into_search_box() {
	}

	@Then("Entries for description phrase are shown")
	public void entries_for_description_phrase_are_shown() {
	}

	@When("User enters  status  into search box")
	public void user_enters_status_into_search_box() {
	}

	@Then("Entries for status are shown")
	public void entries_for_status_are_shown() {
	}

	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() {
	}

	@Then("Program gets selected")
	public void program_gets_selected() {
	}

	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
	}

	@Then("User lands on Program Details form")
	public void user_lands_on_program_details_form() {

}
}
