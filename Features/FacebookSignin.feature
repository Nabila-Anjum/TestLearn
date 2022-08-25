Feature: Facebook Signin Validation

Scenario Outline: Facebook Signin Validation

Given User Visit Facebook Homepage
When User Type Valid Email "<Email>" and Password "<Password>" and click Login option
Then User will be able to  sign in Succefully 

Examples: 

|Email| |Password|
|anjumnabila20@gmail.com| |Naira$&@2016|
