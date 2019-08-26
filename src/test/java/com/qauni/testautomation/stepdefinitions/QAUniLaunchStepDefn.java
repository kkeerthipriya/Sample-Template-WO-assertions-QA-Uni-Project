package com.qauni.testautomation.stepdefinitions;

import com.qauni.testautomation.steps.QAUniLaunchSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QAUniLaunchStepDefn {

    QAUniLaunchSteps QAUniLaunchSteps =new QAUniLaunchSteps();


    @Given("^I am valid user$")
    public void i_am_Valid_user() throws Throwable {
        QAUniLaunchSteps.openBrowser();
    }

    @When("^When the browser is launched URL$")
    public void when_the_browser_is_launched() throws Throwable {

    }

    @Then("^I should see the homepage of make my qa uni website$")
    public void i_should_see_qa_uni_website_launch_page() throws Throwable {
    }



}
