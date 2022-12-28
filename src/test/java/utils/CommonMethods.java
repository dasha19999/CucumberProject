package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializer;

import java.util.concurrent.TimeUnit;

    public class CommonMethods extends PageInitializer {

        public static WebDriver driver;

        public static void openBrowserAndLaunchApplication() {

            ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);

            switch (ConfigReader.getPropertyValue("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Invalid browser name");
            }

            driver.manage().window().maximize();
            driver.get(ConfigReader.getPropertyValue("url"));
            driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

            initializePageObjects();

        }

        public static void closeBrowser() {

            driver.quit();
        }

        public static void sendText(WebElement element, String textToSend) {

            element.clear();
            element.sendKeys(textToSend);

        }

//to get webdriver wait

        public static WebDriverWait createWait() {

            WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);

            return wait;
        }

        public static void waitToBeClickable(WebElement element){

            createWait().until(ExpectedConditions.elementToBeClickable(element));
        }

        public static void click(WebElement element) {

            waitToBeClickable(element);
            element.click();
        }

        public static void selectDropDown(WebElement element, String text) {

            Select sel = new Select(element);
            sel.selectByVisibleText(text);
        }

}
