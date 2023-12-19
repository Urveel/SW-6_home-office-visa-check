package gov.uk.check.visa.pages;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectJobType() {
        log.info("Select job type");
        clickOnElement(selectJobTypeList);
    }

    public void clickNextStepButton() {
        log.info("Click next step Button");
        clickOnElement(nextStepButton);

    }
}
