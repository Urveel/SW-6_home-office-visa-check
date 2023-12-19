package gov.uk.check.visa.pages;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    //create methods  'void selectNationality(String nationality)'

    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);

    }
}
