package WebdriverUniversityFramework.steps;

import org.openqa.selenium.By;

import WebdriverUniversityFramework.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSteps  extends DriverFactory {

	@Given("^user navigates to \"([^\"]*)\" website$")
	public void user_navigates_to_website(String URL) throws Throwable {
		Thread.sleep(3000);
		getDriver().get(URL);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String button) throws Throwable {
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector(button)).click();
	}

	@Then("^user should be presented with a promo alert$")
	public void user_should_be_presented_with_a_promo_alert() throws Throwable {
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//button[text()='Proceed']")).click();
	}

	
}
