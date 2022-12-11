
Feature: US_Mqa_34

  Scenario:sixth section
    Given user navigates to "movita"page
    And scroll down to "hakımızda_devamoku" text
    And hover over and verify hakımızda_devamoku color changedD
    Then click on "hakımızda_devamoku"
    Then verify Hakkımızda is displayed
    And some_wait

    Given user navigates to "movita"page
    And scroll down to  "misyonumuz_devamoku" text
    And hover over and verify misyonumuz_devamoku color changedD
    Then clickon "misyonumuz_devamoku"
    Then verify Hakkımızda_misyon is displayed

    Given user navigates to "movita"page
    And scroll down to "ekibimiz_devamoku" text
    And hover over and verify ekibimiz_devamoku color changedD
    Then clickonN "ekibimiz_devamoku"
    Then verify Hakkımızda_ekibimiz is displayed
    And some_wait
    And back page

    And scroll down to  "misyonumuz_devamoku" text
    Then click on arrowD
    Then verify Tüm Sektörlere Hitap Eden Çözümler is displayedD

