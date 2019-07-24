package WebdriverUniversityFramework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebdriverUniversityFramework.utils.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends DriverFactory {
	
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() throws Throwable {
	    contactUsPage.getContactUsPage();
	}

	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name() throws Throwable {
	    contactUsPage.enterFirstName("Tom");
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name(DataTable dataTable) throws Throwable {
	    contactUsPage.enterLasttName(dataTable, 0, 1);
	}

	@When("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
	    contactUsPage.enterEmailAddress("tester@test.com");
	}
	
	@When("^I enter comments$")
	public void i_enter_comments(DataTable dataTable) throws Throwable {
		contactUsPage.enterComments(dataTable, 0, 0);
		contactUsPage.enterComments(dataTable, 0, 1);
	}
	
	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		contactUsPage.clickOnSubmiButton();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
		contactUsPage.confirmContactUsFormSubmissionWasSuccessful();
	}
	
	@When("^I click on the reset button$")
	public void i_click_on_the_reset_button() throws Throwable {
		getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/div/input[1]")).click();
	}

	@Then("^the information should be removed from the contact us form$")
	public void the_information_should_be_removed_from_the_contact_us_form() throws Throwable {
	    WebElement firstNameText = getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]"));
	    WebElement lastNameText = getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]"));
	    WebElement emailText = getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]"));
	    WebElement messageText = getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea"));
	    Assert.assertEquals("", firstNameText.getText());
	    Assert.assertEquals("", lastNameText.getText());
	    Assert.assertEquals("", emailText.getText());
	    Assert.assertEquals("", messageText.getText());
	    
	}
	
	@When("^I enter a non-valid last name$")
	public void i_enter_a_non_valid_last_name() throws Throwable {
		getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]")).sendKeys("N0t VaL1D");
	}

	@When("^I enter a non-valid email address$")
	public void i_enter_a_non_valid_email_address() throws Throwable {
		getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]")).sendKeys("N0t VaL1D");
	}

	@When("^I enter no comments$")
	public void i_enter_no_comments() throws Throwable {
		getDriver().findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea")).clear();
	}

	@Then("^the information should not be successfully submitted via the contact us form$")
	public void the_information_should_not_be_successfully_submitted_via_the_contact_us_form() throws Throwable {
		Assert.assertEquals(true, getDriver().getPageSource().contains("Error: all fields are required"));
	}

	@Then("^the user should also be notified of the problem$")
	public void the_user_sjould_also_be_notified_of_the_problem() throws Throwable {
		Assert.assertEquals(true, getDriver().getPageSource().contains("Error: Invalid email address"));
	}

}
