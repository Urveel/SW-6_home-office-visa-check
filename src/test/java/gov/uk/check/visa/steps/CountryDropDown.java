package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.Then;

public class CountryDropDown {


    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown() {new SelectNationalityPage().selectNationality("country");
    }
    }

