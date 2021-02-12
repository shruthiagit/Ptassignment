Feature: Navigating to About us for Playtechpage and checking on the parameters like number of employees, global offices,jurisdictions

Background: Search in Google for Playtech 

Given I am in Google page
And I select Playtechpage

Scenario: Tests to validate the valid age and to navigate into the AboutUs page

When I enter the valid age
And I can go into the website
Then I navigate to About Us Page

Scenario: Tests to validate the invalid age and should not go into the website

When I enter the invalid age
And I cannot go into the website


#Scenario: Tests to validate the parameters like number of employees,countries,global licenses and jurisdictions

#When I am in about us page
#And I get the number of employees
#And I get the number of countries
#And I get the number of global licenses
#And I get the Regulated Jurisdictions
#Then I validate with the number of my choice







