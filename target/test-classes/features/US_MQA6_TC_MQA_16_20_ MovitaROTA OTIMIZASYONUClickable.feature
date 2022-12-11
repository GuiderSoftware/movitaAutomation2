@mqa_6_2

Feature: US_Mqa_6_2

  Scenario: user clickability color change and strings
    Given user navigates to "movita"page

    Then user hovers over rota_optimizasyon and verifies color change
    And verifies rota_optimizasyon clickable
    Then user verifies rota string
    Then some_wait

    Then user hovers over uygulamalar and verifies color change
    And verifies uygulamalar clickable
    Then verify uygulamalar string
    Then some_wait

    Then user hovers over kilavuz and verifies color change
    Then user verifies kilavuz clickable
    Then verifies kilavuz string
    Then some_wait

    Then user hovers over iletisim and verifies color change
    Then user verifies iletisim clickable
    Then verify iletisim string
    Then some_wait

    Then user hovers over giris and verifies color change
    Then user verifies giris clickable
    Then verify giris string

