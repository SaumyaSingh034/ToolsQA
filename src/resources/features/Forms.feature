Feature: Tools QA Form Verification

  Background:
    Given user is on the Dashboard Page
    When user clicks on the "Forms" Card
    Then user should be navigated to "Forms" Dashboard Page

    Scenario: Fill the form with valid data
      Given user is on the "Forms" Dashboard Page
      When user enters first Name as "Saumya" and lastname as "Singh"
      And user enters email as "saumya@gmail.com"
      And select "Female" radio btn
      And enters mobile Number "844798882"
