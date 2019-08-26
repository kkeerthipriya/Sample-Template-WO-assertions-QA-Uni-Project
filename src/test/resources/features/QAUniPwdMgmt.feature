
Feature: Password Management
When user forgets the password , user should be able to reset it or contact customer support

Scenario Outline: Login Failure
Given I am a registred user and I click on Login
When I try to input '<username>' and incorrect '<password>' for login
Then I should see the errormessage

  Examples:
    | username | password |
    |  keerthi | hello |


Scenario Outline: Reset password
Given I click on login and try input '<username>' and incorrect '<password>'
When I see the errormessage that details is incorrect
Then I should be able to click on Forgot password enter the '<email>' and click reset password

  Examples:
    | username | password | email |
    |  keerthi | hello    | trainingkeerthi@gmail.com |


