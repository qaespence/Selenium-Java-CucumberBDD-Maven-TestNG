package WebdriverUniversityFramework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/WebdriverUniversityFramework/featureFiles/"},
		glue = {"WebdriverUniversityFramework.steps"},
		monochrome = true,
		tags = {"@chrome"},
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
		)

public class MainRunnerChrome extends AbstractTestNGCucumberTests {

}
