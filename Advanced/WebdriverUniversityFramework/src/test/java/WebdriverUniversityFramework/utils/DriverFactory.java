package WebdriverUniversityFramework.utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import WebdriverUniversityFramework.pageObjects.ContactUs_Page;
import WebdriverUniversityFramework.pageObjects.Products_Page;

public class DriverFactory {

	public static WebDriver driver;
	public static ContactUs_Page contactUsPage;
	public static Products_Page productsPage;

	public WebDriver getDriver() {
		try {
			// Read config
			// ReadConfigFile file = new ReadConfigFile();
			// String browserName = file.getBrowser();
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\WebdriverUniversityFramework\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");
			
			switch(browserName){
			
			case "firefox":
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
					driver = new FirefoxDriver(); 
					// driver.manage().window().maximize();
					// this.driver = new FirefoxDriver();
					// this.driver.manage().window().maximize();
					// this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				}
				break;
				
			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
					driver = new ChromeDriver();
					// driver.manage().window().maximize();
				}
				break;			
				
			case "ie":
				if (null == driver) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver();
					// driver.manage().window().maximize();
				}
				break;
			
			}
		} catch (Exception e) {
			System.out.println("Unable to load brwoser: " + e.getMessage());
		} finally {
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			contactUsPage = PageFactory.initElements(driver, ContactUs_Page.class);
			productsPage = PageFactory.initElements(driver, Products_Page.class);
		}
		return driver;
	}

}
