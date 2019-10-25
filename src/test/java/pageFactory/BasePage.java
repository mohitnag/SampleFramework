package pageFactory;

import config.LoadConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    public long defaultTimeOut ;

    public BasePage(WebDriver driver){
        this.driver = driver;
        defaultTimeOut=Long.parseLong(LoadConfiguration.getProperty("defaultTimeOut"));
    }
    public void waitForElementPresent(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitAndEnterText(WebElement element,String text)
    {
        waitForElementPresent(element);
        element.clear();
        element.sendKeys(text);
    }
    public void waitAndClick(WebElement element)
    {
        waitForElementPresent(element);
        element.click();
    }
}