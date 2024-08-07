Feature: Tools QA Dashboard Verification Feature

  Scenario: Verify the title of Tools QA Dashboard Page
    Given user is on the Dashboard Page
    When user gets the title of the page
    Then the title of page should be "DEMOQA"

    Scenario: Verify user clicks on Element Card
      Given user is on the Dashboard Page
      When user clicks on the "Elements" Card
      Then user should be navigated to "Elements" Dashboard Page
