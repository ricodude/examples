import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;

class CheckSauceLabsHomePageTest {
    @Test
    public void site_header_is_on_home_page() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        browser = new FirefoxDriver();
        browser.get("http://saucelabs.com");
        WebElement header = browser.findElement(By.id("site-header"));
        assertTrue((header.isDisplayed()));
        browser.close();
    }

    @Test
    public void guardian_element_test() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        browser = new FirefoxDriver();
        browser.get("http://www.guardian.co.uk");
        WebElement header = browser.findElement(By.id("bannerandheader"));
        assertTrue((header.isDisplayed()));
        browser.close();
    }

    @Test
    public void google_element_test() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        browser = new FirefoxDriver();
        browser.get("https://translate.google.co.uk");
        WebElement header = browser.findElement(By.id("gbpbt"));
        assertTrue((header.isDisplayed()));
        browser.close();
    }
}