Feature: Tools QA Element Verification

  Scenario: Verify user is able to extract header
    Given user is on the Dashboard Page
    When user clicks on the "Elements" Card
    Then user should be navigated to "Elements" Dashboard Page
    And user gets the heading of the page
    And heading of the page should be "Please select an item from left to start practice."
