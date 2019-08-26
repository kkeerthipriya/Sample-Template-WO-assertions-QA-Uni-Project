package com.qauni.testautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QAUniLogin {


    @FindBy(how= How.LINK_TEXT, using="Log in")
    public static WebElement signin;

    @FindBy(how= How.XPATH, using="//input[@name='username']")
    public static WebElement username;

    @FindBy(how= How.XPATH, using="//input[@type='password']")
    public static WebElement password;

    @FindBy(how= How.XPATH, using="//button[@class='btn btn-lg btn-primary btn-block']")
    public static WebElement login;

    @FindBy(how= How.XPATH, using=" //div[@class='alert alert-danger']")
    public static WebElement pwdAlert;

    @FindBy(how= How.LINK_TEXT, using="Forgot Password")
    public static WebElement forgotPwd;






}
