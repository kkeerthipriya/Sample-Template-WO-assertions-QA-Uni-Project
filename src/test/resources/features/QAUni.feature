

Feature: QAUni Signup Login
User should be able to launch QAUni website Signup,Login


Scenario: ViewHomePage
Given I am valid user
When When the browser is launched URL
Then I should see the homepage of make my qa uni website



Scenario Outline: Signup
Given I am on the home page of QA Uni website
When I click on the Sign up button
Then I should see the sign up page to input the details '<UName>' and '<Password>' and '<Email>'

  Examples:
    | UName     |  Password | Email                       |
    |  Keerthi  |   test |  trainingkeerthi@gmail.com  |



Scenario Outline: Login
Given I am a registered user
When I click on the Login button
Then I should be prompted to enter login details '<UName>' and '<Password>'

  Examples:
    | UName     |  Password |
    |  Keerthi  |   test |


