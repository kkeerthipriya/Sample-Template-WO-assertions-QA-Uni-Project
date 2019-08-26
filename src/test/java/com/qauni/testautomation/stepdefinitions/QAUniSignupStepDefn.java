package com.qauni.testautomation.stepdefinitions;

import com.qauni.testautomation.steps.QAUniLaunchSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import static com.qauni.testautomation.hooks.BrowserHooks.driver;

public class QAUniSignupStepDefn {

    QAUniLaunchSteps QAUniLaunchSteps =new QAUniLaunchSteps();

    @Given("^I am on the home page of QA Uni website$")
    public void i_am_on_the_home_page_of_QA_Uni_website() throws Exception {
        QAUniLaunchSteps.openBrowser();
    }

    @When("^I click on the Sign up button$")
    public void i_click__on_sign_up() throws Exception{
        QAUniLaunchSteps.clickSignup();
    }

    @Then("^I should see the sign up page to input the details '(.*)' and '(.*)' and '(.*)'$")
    public void i_should_see_the_sign_up_page_to_input_the_details_Keerthi_and_test_and_trainingkeerthi_gmail_com(String UName,String Password,String Email) throws Exception {
        QAUniLaunchSteps.enterSignupDetails(UName,Password,Email);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

    }
}
