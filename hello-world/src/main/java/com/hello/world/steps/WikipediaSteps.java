package com.hello.world.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.google.inject.Inject;
import com.hello.world.pageobjects.wikipedia.DefinitionPage;
import com.hello.world.pageobjects.wikipedia.HomePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WikipediaSteps {

    @Inject
    private HomePage homePage;

    @Inject
    private DefinitionPage definitionPage;

    @Given("^I open wikipedia homepage$")
    public void iOpenWikipediaHomepage() {
        homePage.open();
    }

    @When("^I search for \"([^\"]*)\" query$")
    public void iSearchForQuery(String query) {
        homePage.getSearchComponent().searchForQuery(query);
    }

    @Then("^definition page with header \"(.*)\" is displayed$")
    public void definitionPageWithHeaderHelloWorldIsDisplayed(String headerText) throws Throwable {
        assertThat("Definition page for " + headerText + " is not displayed",
                definitionPage.getHeading(), is(headerText));
    }
}
