Feature: Instagram Signup validation

In order to verify search
as a user 
I want to Instagram Sign Up 

Scenario Outline: Instagram Signup validation

Given User visit Instagram homepage
When User type valid "<Email>" and "<Full Name>" and "<User Name>" and "<New Password>"
Then User will be able to Sign Up

Examples: 
|Email| |Full Name| |User Name| |New Password|
|abc@gmail.com| |Anjum Nabila| |Eshy| |abc123|