package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage2_pageobjects 
{
	public ProgramPage2_pageobjects(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//th[normalize-space()='Program Name']")
	WebElement prog_Name; 
	
	@FindBy(xpath="//p-sorticon[@field='description']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	WebElement prog_desc;
	
	@FindBy(xpath="//th[normalize-space()='Program Status']")
	WebElement prog_status; 
	
	@FindBy(xpath="//span[normalize-space()='A New Program']")
	WebElement NewProg_button; 

}
