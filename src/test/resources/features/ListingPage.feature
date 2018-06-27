Feature: Password change functionality

  Scenario: Checking password change functionality

    Given I am an user on login page
    When I click on forget password link
    And I am on password reset page
    Then I entered old password and new password


  Scenario Outline: old password restriction
    Given an user
    When he open forget password screen
    And Enter the '<old password>'
    Then password should be not be accepted
    And Error message should be displayed
    Examples:
      |old password|
      |springernature|
      |Springernature@123|