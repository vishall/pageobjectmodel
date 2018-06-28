Feature: Google website

  Scenario: Checking google home page

    Given I am on google home page
    When I entered a text Hello in the search box
    And I hit the enter key to begin the search
    Then I can see respective search results