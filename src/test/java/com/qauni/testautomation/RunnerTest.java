package com.qauni.testautomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Keerthi Parepalli on 19/08/2019.
 */


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/QAUniPwdMgmt.feature",
        plugin = {"pretty", "html:target/cucumber-html-report"}
        //tags={"@Regression1"}



)
public class RunnerTest {

}

