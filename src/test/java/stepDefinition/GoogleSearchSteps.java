package stepDefinition;

import base.BaseDriver;
import config.LoadConfiguration;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageFactory.GoogleSearchPage;
import pageFactory.QAWikiPage;

import java.io.File;
import java.io.PrintWriter;

public class GoogleSearchSteps extends BaseDriver{
    private WebDriver driver;
    private String googlePageUrl;
    protected GoogleSearchPage googleSearchPage;
    protected QAWikiPage qaWikiPage;

    @Before
    public void startUp() {
        //Create the webdriver
        String browserType = LoadConfiguration.getProperty("browser_type");
        driver = setDriver(browserType);
        //Create objects of pageObject classes
        googleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        qaWikiPage = PageFactory.initElements(driver, QAWikiPage.class);
    }
    @After
    public void cleanUp(Scenario scenario){
        //If test fails, save the screenshot and dom for debug
        if (scenario.isFailed()) {
            try {
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot, new File(scenario.getName() + ".jpg"));
                PrintWriter pagesrc = new PrintWriter(scenario.getName() + ".html", "UTF-8");
                pagesrc.write(driver.getPageSource());
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot:");
                e.printStackTrace();
            }
        }
        quitDriver();
    }

    @Given("^user is on google page$")
    public void userIsOnGooglePage()
    {
        googlePageUrl = LoadConfiguration.getProperty("googlePageUrl");
        driver.get(googlePageUrl);
    }

    @When("^user search for \"([^\"]*)\"$")
    public void userSearchFor(String arg0) {
        googleSearchPage.enterSearchText(arg0);
        googleSearchPage.clickSearchButton();
    }

    @And("^user select the second link$")
    public void userSelectTheSecondLink(){
        googleSearchPage.openQaLink();
    }

    @Then("^user verifies the page has link to quality assurance$")
    public void userVerifiesThePageHasLinkToQualityAssurance() throws Throwable {
        Assert.assertTrue(qaWikiPage.getQALinkCount()>0);
    }

    @Then("^no search results are displayed$")
    public void verifyNoSearchResultsAreDisplayed() throws Throwable {
        Assert.assertTrue(googleSearchPage.getNoResultsCount()>0);
    }
}
