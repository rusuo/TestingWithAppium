package androidTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.File;
import java.net.URL;
import java.util.List;

public class TestAndroidWithoutCucumber {
        private WebDriver driver;

        @Before
        public void setUp() throws Exception {
            // set up appium: specify the path to the app folder from your computer
            File app = new File("/Users/oanarusu/Documents/TestingWithAppium", "ContactManager.apk");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("device","Android");
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
            capabilities.setCapability(CapabilityType.VERSION, "4.2");
            capabilities.setCapability(CapabilityType.PLATFORM, "MAC");
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("app-package", "com.example.android.contactmanager");
            capabilities.setCapability("app-activity", ".ContactManager");
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
        }

        @Test
        public void addContact(){
            WebElement el = driver.findElement(By.name("Add Contact"));
            el.click();
            List<WebElement> textFieldsList = driver.findElements(By.tagName("textfield"));
            textFieldsList.get(0).sendKeys("Some Name");
            textFieldsList.get(2).sendKeys("Some@example.com");
            driver.findElement(By.name("Save")).click();
        }
}
