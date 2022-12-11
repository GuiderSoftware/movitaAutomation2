@mqa_6_1
Feature: US_Mqa_6


  Scenario: User tests Movita logo and dropdown menu
    Given user navigates to "movita"page
    When clicks on movita logo
    Then User should navigate to homepage
    Then Verify if Mobil Vasıta İzleme Takip Sistemi displayed
    Then some_wait
    And User hover over Dropdown on the right corner to switch language
    And clicks on the language button
    Then clicks on English on the dropdown menu
    Then Verify if Mobile Vehicle Traking System is displayed




