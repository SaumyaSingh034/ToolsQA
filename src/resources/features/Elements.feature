Feature: Tools QA Element Verification

  Background:
    Given user is on the Dashboard Page
    When user clicks on the "Elements" Card
    Then user should be navigated to "Elements" Dashboard Page

  Scenario: Verify user is able to extract header
    Given user is on the "Elements" Dashboard Page
    And user gets the heading of the page
    And heading of the page should be ""

    Scenario: User clicks on text box and add some data
      Given user is on the "Elements" Dashboard Page
      When user clicks on "Text Box" under Elements List
      And user enters fullName as "Saumya"
      And user enters email as "saumya@gmail.com"
      And user enters current address as "Delhi"
      And user enters permanent address as "New Delhi"
      And user clicks on submit btn
      Then All the user data is shown below


  Scenario: User clicks on check box and add some data
    Given user is on the "Elements" Dashboard Page
    When user clicks on "Check Box" under Elements List
    And user expands "Home"
    And user expands "Desktop"
    And user selects Desktop and Downloads
