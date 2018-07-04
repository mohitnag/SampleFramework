package base;

import config.LoadConfiguration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageFactory.GoogleSearchPage;
import pageFactory.QAWikiPage;

import java.util.concurrent.TimeUnit;

public class BaseDriver {
    private WebDriver driver;

    public WebDriver setDriver(String browserType) {
        if(driver == null) {
            String driverLocation = System.getProperty("user.dir") + "/resources/";
            if (browserType.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", driverLocation + "/geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browserType.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", driverLocation + "/chromedriver");
                driver = new ChromeDriver();

            } else {
                System.out.println("Invalid driver type" + browserType);

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public void quitDriver()
    {
        driver.quit();
    }

}
