package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSearchPage extends BasePage {
    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (id = "lst-ib")
    private WebElement searchTextBox;

    @FindBy(css = "input[value='Google Search']")
    private WebElement searchButton;

    @FindBy (linkText = "QA - Wikipedia")
    private WebElement linkQA;

    @FindBy (xpath="//p[contains(text(),\" Your search - \")]")
    private List<WebElement> noResult;

    public void enterSearchText(String text)
    {
        waitAndEnterText(searchTextBox,text);
    }

    public void clickSearchButton()
    {
        waitAndClick(searchButton);
    }

    public void openQaLink(){
        waitAndClick(linkQA);
    }
    public int getNoResultsCount()
    {
        return noResult.size();
    }
}
