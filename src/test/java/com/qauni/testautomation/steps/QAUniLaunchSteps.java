package com.qauni.testautomation.steps;

import com.qauni.testautomation.pageobjects.QAUniForgotPwd;
import com.qauni.testautomation.pageobjects.QAUniLogin;
import com.qauni.testautomation.pageobjects.QAUniSignup;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.qauni.testautomation.hooks.BrowserHooks.driver;

public class QAUniLaunchSteps {

    public QAUniLaunchSteps() {
        driver = driver;
    }

    public void openBrowser() {
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        driver.get("https://www.qauni.com/");
    }

    public void clickSignup() {
        QAUniSignup signuppage = PageFactory.initElements(driver, QAUniSignup.class);
        WebElement we=signuppage.signupLink;
        we.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    }


    public void enterSignupDetails(String name,String pass,String eml){
        QAUniSignup signuppage = PageFactory.initElements(driver, QAUniSignup.class);
        WebElement we1=signuppage.username;
        we1.sendKeys(name);
        WebElement we2=signuppage.password;
        we2.sendKeys(pass);
        WebElement we3=signuppage.email;
        we3.sendKeys(eml);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        WebElement we4=signuppage.signup;
        we4.click();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

    }

    public void clickLogin() {
        QAUniLogin loginpage = PageFactory.initElements(driver, QAUniLogin.class);
        WebElement we=loginpage.signin;
        we.click();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    }


    public void enterLoginDetails(String name,String pass) {
        QAUniLogin loginpage = PageFactory.initElements(driver, QAUniLogin.class);
        WebElement we1 = loginpage.username;
        we1.sendKeys(name);
        WebElement we2 = loginpage.password;
        we2.sendKeys(pass);
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
        WebElement we3 = loginpage.login;
        we3.click();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
    }

    public void resetPwd(String email){
        QAUniForgotPwd qaUniForgotPwd=PageFactory.initElements(driver,QAUniForgotPwd.class);
       /*  WebElement we1=loginpage.username;
        we1.sendKeys(name);
        WebElement we2=loginpage.password;
        we2.sendKeys(pwd);
        WebElement we3=loginpage.login;
             we3.click();
        WebElement we4=loginpage.pwdAlert; */

   //This is the package used for asset import org.junit.Assert;
        //Assert.assertEquals(we4,"Password or username is incorrect");
        //System.out.println(we4.getText());
        //System.out.println("Error message captured for incorrect login");
        // Password or username is incorrect
        //QAUniForgotPwd forgotPwd=PageFactory.initElements(driver,QAUniForgotPwd.class);
        WebElement we1=qaUniForgotPwd.forgot;
        we1.click();
        WebElement we2=qaUniForgotPwd.email;
        we2.sendKeys();
        WebElement we3=qaUniForgotPwd.submit;
        we3.click();
        System.out.println("Successfully reset the password");
    }

}
