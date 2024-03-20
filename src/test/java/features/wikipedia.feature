Feature: Wikipedia
  As a user
  I want to navigate a website
  To be able to Download a PDF file
  and be able to display a specific page
  and be able to search in a different language

  Background: Search Albert Einstein
    Given The main page is displayed
    And I input "Albert Einstein" in the search field

  Scenario: Click the Download PDF
    And I click the submit Button
    And I click the Tool Menu Button
    When I click the Download as PDF Button
    Then I click the Download button
    And The file was downloaded

  Scenario: Click the Page Information
    And I click the submit Button
    And I click the Tool Menu Button
    When I click the Page Information
    And The page is displayed

  Scenario: Change search language
    When I click the language button
    And I change the language
    And I click the submit Button
    Then the page is displayed

