Feature: Tables
  I am a user
  I want to count it's columns
  I want to check if string is correct
  To be able to check content

  Scenario: Count Sum of Columns
    Given I go to "Sortable Data Tables" on the Main Page
    And I check that "String" is correct
    Then Sum of the Due columns is 251.0