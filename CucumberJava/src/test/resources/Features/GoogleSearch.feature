Feature: feature to test google search functionality

  @smoke
  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When User enter a text in search box
    And hit enter
    Then user is navigate to search results

  @regression
  Scenario Outline: Validate google search is working with parameter
    Given browser is open
    And user is on google search page
    When User enter a "<SearchText>" in search box
    And hit enter
    Then user is navigate to search results

    Examples: 
      | SearchText              |
      | Automation Step by Step |
      | Automation Step by Step |
