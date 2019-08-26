package com.qauni.testautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QAUniForgotPwd {


    @FindBy(how= How.LINK_TEXT, using="Forgot Password")
    public static WebElement forgot;

    @FindBy(how= How.XPATH, using="//input[@name='email']")
    public static WebElement email;

    @FindBy(how= How.XPATH, using="//input[@type='submit' and @value='Reset Password']")
    public static WebElement submit ;

}
