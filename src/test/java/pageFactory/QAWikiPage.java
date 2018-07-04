package pageFactory;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class QAWikiPage extends BasePage {

    public QAWikiPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href=\"/wiki/Quality_assurance\"]")
    private List<WebElement> QualityAssuranceLink;

    @FindBy(id = "firstHeading")
    private WebElement heading;


    public int getQALinkCount()
    {
        waitForElementPresent(heading);
        return(QualityAssuranceLink.size());
    }
}

