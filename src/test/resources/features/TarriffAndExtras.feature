Feature: Google website

  Scenario: Checking google home page

    Given I am on google home page
    When I click in the search text box
    And I entered a text to search box
    Then I can see respective search results