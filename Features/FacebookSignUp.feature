Feature: Facebook Sign Up 

In order to verify search
as a uger
i want to Facebook sign up

Scenario Outline: 

Given user visit FB homepage
When user type "<first name>" and "<last name>" and valid "<email address>" and "<new password>"
When user select dropdown month and dropdown day and dropdown year
When user click gender option
When user click Sign UP option
Then user will be able to create an account seccefully 

Examples: 
|first name| |last name| |email address| |new password| |month| |day| |year| 
|Nabila| |Anjum| |eshynabila@gmail.com| |abc123abc| |04| |24| |1995|