package cucumber.test;

import cucumber.annotation.*;
import cucumber.annotation.en.*;
import static org.junit.Assert.assertEquals;

import cucumber.test.config.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class AddContactStepDefs {

    private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        if (Settings.device.toUpperCase().equals("ANDROID")){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
            capabilities.setCapability("app", "/Users/oanarusu/Documents/TestingWithAppium/ContactManager.apk");
            capabilities.setCapability("device", "Android");
            capabilities.setCapability("version", "4.2");
            capabilities.setCapability("app-package", "com.example.android.contactmanager");
            capabilities.setCapability("app-activity", ".ContactManager");

            //Create an instance of RemoteWebDriver and connect to the Appium server.
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } else {
            driver = new FirefoxDriver();
            driver.get(Settings.applicationUrl);
        }
    }

    @Given("^I am on add user page$")
    public void I_am_on_add_user_page() throws Throwable {
        waitUntilElementDisplayed("Add Contact");
    }

    @When("^I click to add a contact$")
    public void I_click_to_add_a_contact() throws Throwable {
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();

        waitUntilElementDisplayed("Save");
    }

    @And("^I complete the details$")
    public void I_complete_the_details() throws Throwable {
        List<WebElement> textFieldsList = driver.findElements(By.tagName("textfield"));
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
    }

    @Then("^I can save a new contact$")
    public void I_can_save_a_new_contact() throws Throwable {
        driver.findElement(By.name("Save")).click();
    }

    public void waitUntilElementDisplayed(String element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(element)));
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}



