package WebdriverUniversityFramework.steps;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

WebDriver driver;
	
	@Before("@firefox")
	public void setupFirefox() {
		System.setProperty("webdriver.gecko.driver","E:\\CodeArea\\EclipseWorkspace\\CucumberFramework\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Before("@chrome")
	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver","E:\\CodeArea\\EclipseWorkspace\\CucumberFramework\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Given("^I access webdriveruniversity$")
	public void i_access_webdriveruniversity() throws Throwable {
		driver.get("https://webdriveruniversity.com");
	}

	@When("^I click on the contact us button$")
	public void i_click_on_the_contact_us_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/a/div/div[1]/h1")).click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	}

	@When("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]")).sendKeys("John");
	}

	@When("^I enter last name$")
	public void i_enter_last_name() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]")).sendKeys("Doh");
	}

	@When("^I enter an email address$")
	public void i_enter_an_email_address() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]")).sendKeys("tester@email.com");
	}

	@When("^I enter comments$")
	public void i_enter_comments(DataTable comments) throws Throwable {
		List<List<String>> data = comments.raw();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea")).sendKeys(data.get(0).get(0) + "\n");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea")).sendKeys(data.get(0).get(1));
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/div/input[2]")).click();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
		WebElement contactReply = driver.findElement(By.xpath(".//*[@id='contact_reply']"));
		Assert.assertEquals(true, contactReply.isDisplayed());
	}

	@When("^I click on the reset button$")
	public void i_click_on_the_reset_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/div/input[1]")).click();
	}

	@Then("^the information should be removed from the contact us form$")
	public void the_information_should_be_removed_from_the_contact_us_form() throws Throwable {
	    WebElement firstNameText = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]"));
	    WebElement lastNameText = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]"));
	    WebElement emailText = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]"));
	    WebElement messageText = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea"));
	    Assert.assertEquals("", firstNameText.getText());
	    Assert.assertEquals("", lastNameText.getText());
	    Assert.assertEquals("", emailText.getText());
	    Assert.assertEquals("", messageText.getText());
	    
	}
	
	@When("^I enter a non-valid first name$")
	public void i_enter_a_non_valid_first_name() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]")).sendKeys("N0t VaL1D");
	}

	@When("^I enter a non-valid last name$")
	public void i_enter_a_non_valid_last_name() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]")).sendKeys("N0t VaL1D");
	}

	@When("^I enter a non-valid email address$")
	public void i_enter_a_non_valid_email_address() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]")).sendKeys("N0t VaL1D");
	}

	@When("^I enter no comments$")
	public void i_enter_no_comments() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea")).clear();
	}

	@Then("^the information should not be successfully submitted via the contact us form$")
	public void the_information_should_not_be_successfully_submitted_via_the_contact_us_form() throws Throwable {
		Assert.assertEquals(true, driver.getPageSource().contains("Error: all fields are required"));
	}

	@Then("^the user should also be notified of the problem$")
	public void the_user_sjould_also_be_notified_of_the_problem() throws Throwable {
		Assert.assertEquals(true, driver.getPageSource().contains("Error: Invalid email address"));
	}

	@When("^I click on the login portal button$")
	public void i_click_on_the_login_portal_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/a/div/div[1]/h1")).click();
	}

	@When("^I enter a username$")
	public void i_enter_a_username() throws Throwable {
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		driver.findElement(By.xpath("//*[@id='text']")).sendKeys("tom");
	}

	@When("^I enter a \"([^\"]*)\" password$")
	public void i_enter_a_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("^I should be presented with a successful validation alert$")
	public void i_should_be_presented_with_a_successful_validation_alert() throws Throwable {
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    Assert.assertEquals("validation failed", alert.getText());
	}

	@Then("^I should be presented with an unsuccessful validation alert$")
	public void i_should_be_presented_with_an_unsuccessful_validation_alert() throws Throwable {
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    Assert.assertEquals("validation failed", alert.getText());
	}

	
	
	
	
	
	@After
	public void tearDown()
	{
	    driver.quit();
	}
	
}
