package gov.uk.check.visa.pages;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonForAustralia;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement reasonForChile;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement reasonForColombia;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectReasonForAustralia() {
        log.info("select Reason for Australia");
        clickOnElement(reasonForAustralia);
    }

    public void selectReasonForChile() {
        log.info("select reason for chile");
        clickOnElement(reasonForChile);
    }

    public void selectReasonForColombia() {
        log.info("select reason for colombia");
        clickOnElement(reasonForColombia);

    }

    public void clickContinueButton() {
        log.info("select reason for colombia");
        clickOnElement(continueButton);

    }
}
