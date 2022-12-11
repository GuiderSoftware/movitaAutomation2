Feature: Movita logo and language dropdown selector functionality.

  Scenario: Click movita logo and change language.

    Given Navigate to URL
    Then  The logo should be clickable.
    When  Click to movita logo
    Then  See the language dropdown selector at the top right of the page"
    When  Click to English language selection
    And   Click to Türkçe language selection
