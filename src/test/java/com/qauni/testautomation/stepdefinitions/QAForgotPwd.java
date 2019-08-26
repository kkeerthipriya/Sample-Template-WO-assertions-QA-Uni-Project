package com.qauni.testautomation.stepdefinitions;

import com.qauni.testautomation.steps.QAUniLaunchSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QAForgotPwd {

        QAUniLaunchSteps QAUniLaunchSteps =new QAUniLaunchSteps();

    @Given("^I am a registred user and I click on Login$")
    public void i_am_a_registred_user_and_I_click_on_Login() throws Exception {
        QAUniLaunchSteps.openBrowser();
        QAUniLaunchSteps.clickLogin();

        // Write code here that turns the phrase above into concrete actions

    }


    @When("^I try to input '(.*)' and incorrect '(.*)' for login$")
    public void i_try_to_input_keerthi_and_incorrect_hello_for_login(String username,String password) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        QAUniLaunchSteps.enterLoginDetails(username,password);

    }

    @Then("^I should see the errormessage$")
    public void i_should_see_the_Password_or_username_is_incorrect() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Incorrect login details");
    }


    @Given("^I click on login and try input '(.*)' and incorrect '(.*)'$")
    public void i_click_on_login_and_try_input_keerthi_and_incorrect_hello(String username,String password) throws Exception {
        QAUniLaunchSteps.openBrowser();
        QAUniLaunchSteps.clickLogin();
        QAUniLaunchSteps.enterLoginDetails(username,password);

        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I see the errormessage that details is incorrect$")
    public void i_see_the_Password_or_username_is_incorrect_that_details_is_incorrect() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should be able to click on Forgot password enter the '(.*)' and click reset password$")
    public void i_should_be_able_to_click_on_Forgot_password_enter_the_trainingkeerthi_gmail_com_and_click_reset_password(String email) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        QAUniLaunchSteps.resetPwd(email);

    }


}
