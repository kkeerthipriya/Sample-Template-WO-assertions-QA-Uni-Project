package com.qauni.testautomation.stepdefinitions;

import com.qauni.testautomation.steps.QAUniLaunchSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import static com.qauni.testautomation.hooks.BrowserHooks.driver;

public class QAUniLoginStepDefn {

    QAUniLaunchSteps QAUniLaunchSteps =new QAUniLaunchSteps();

    @Given("^I am a registered user$")
    public void i_am_on_the_home_page_of_QA_Uni_website() throws Exception {
        QAUniLaunchSteps.openBrowser();
    }

    @When("^I click on the Login button$")
    public void i_click__on_sign_up() throws Exception{
        QAUniLaunchSteps.clickLogin();

    }

    @Then("^I should be prompted to enter login details '(.*)' and '(.*)'$")
    public void i_should_be_prompted_to_enter_login_Details(String UName,String Password) throws Exception {
        QAUniLaunchSteps.enterLoginDetails(UName,Password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        }

}
