package WebdriverUniversityFramework.steps;

import java.util.ArrayList;

import org.openqa.selenium.By;

import WebdriverUniversityFramework.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {

	@Given("^I access webdriveruniversity$")
	public void i_access_webdriveruniversity() throws Throwable {
		getDriver().get("https://webdriveruniversity.com");
	}

	
	@When("^I click on the login portal button$")
	public void i_click_on_the_login_portal_button() throws Throwable {
		getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/a/div/div[1]/h1")).click();
	}

	@When("^I enter a username$")
	public void i_enter_a_username() throws Throwable {
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs2.get(1));
		getDriver().findElement(By.xpath("//*[@id='text']")).sendKeys("tom");
	}

	@When("^I enter a \"([^\"]*)\" password$")
	public void i_enter_a_password(String password) throws Throwable {
		getDriver().findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
		getDriver().findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}

	@Then("^I should be presented with a successful validation alert$")
	public void i_should_be_presented_with_a_successful_validation_alert() throws Throwable {
	    driver.switchTo().alert().accept();
	}

	@Then("^I should be presented with an unsuccessful validation alert$")
	public void i_should_be_presented_with_an_unsuccessful_validation_alert() throws Throwable {
	    driver.switchTo().alert().accept();
	}
	
}
