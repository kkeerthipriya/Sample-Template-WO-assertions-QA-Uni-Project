package com.qauni.testautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QAUniSignup {
    @FindBy(how= How.LINK_TEXT, using="Sign up")
    public static WebElement signupLink;

    @FindBy(how= How.XPATH, using="//input[@type='text' and @name='username']")
    public static WebElement username;

    @FindBy(how= How.XPATH, using="//input[@type='password']")
    public static WebElement password;

    @FindBy(how= How.XPATH, using="//input[@type='email']")
    public static WebElement email;

    @FindBy(how= How.XPATH, using="//button[@class='btn btn-lg btn-primary btn-block']")
    public static WebElement signup;




}
