Feature: Validate Dell About Us 

Scenario: Validate Dell About Us

Given User visit Dell homepage
When user go to About us dropdown menu 
And able to Newsroom dropdown menu
And able to blog 
Then user able to see the expected portfolio 
