Feature: Tools QA Dashboard Verification Feature

  Scenario: Verify the title of Tools QA Dashboard Page
    Given user is on the Dashboard Page
    When user gets the title of the page
    Then the title of page should be "DEMOQA"

  Scenario: Verify user clicks on Element Card
    Given user is on the Dashboard Page
    When user clicks on the "Elements" Card
    Then user should be navigated to "Elements" Dashboard Page

  Scenario: Verify user clicks on Form Card
    Given user is on the Dashboard Page
    When user clicks on the "Form" Card
    Then user should be navigated to "Form" Dashboard Page

  Scenario: Verify user clicks on Alerts Card
    Given user is on the Dashboard Page
    When user clicks on the "Alerts" Card
    Then user should be navigated to "Alerts" Dashboard Page

  Scenario: Verify user clicks on Widgets Card
    Given user is on the Dashboard Page
    When user clicks on the "Widgets" Card
    Then user should be navigated to "Widgets" Dashboard Page

  Scenario: Verify user clicks on Interactions Card
    Given user is on the Dashboard Page
    When user clicks on the "Interactions" Card
    Then user should be navigated to "Interactions" Dashboard Page

  Scenario: Verify user clicks on Book Store Applications Card
    Given user is on the Dashboard Page
    When user clicks on the "Book Store Application" Card
    Then user should be navigated to "Book Store Application" Dashboard Page
