@parametre
Feature: Movita Test

  Scenario: MQA-32 Movita Anasayfa Dördüncü Section

    Given kullanici movita sayfasına gider
    Then kullanici ekranda verilen stringi verify eder
    When kullanici sayfayi asagi indirir ve dorduncu sectionda durur
    Then kullanici verilen String ve sayisal verileri dogrular
    And  kullanici arrow sign üzerinde hoverover yapar
    Then kullanici arrow sign üzerinde renk degisikligini dogrular
    And  kullanici arrow sign tiklar
    Then kullanici arrow sign tiklayinca verilen stringi dogrular
