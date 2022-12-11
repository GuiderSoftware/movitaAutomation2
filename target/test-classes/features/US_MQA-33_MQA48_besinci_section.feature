@parametre
Feature: Movita Test

  Scenario: MQA-33 Movita Anasayfa Besinci Section
    Given kullanici movita sayfasına gider
    Then kullanici ekranda verilen stringi verify eder
    When kullanici sayfayi asagi indirir ve besinci sectionda durur
    Then kullanici cozumler kisminda bulunan sekiz bolume hover over yapar ve strigleri verify eder
    And kullanici "7'den fazla sektöre hizmet eden çözümlerimizi görmek için" uzerine hover over yapar arkaplan renk degisimini verify eder
    And kullanici "7'den fazla sektöre hizmet eden çözümlerimizi görmek için " yazini click eder "Çözümler" stringini verify eder
    And  kullanici arrow sign üzerinde hoverover yapar
    Then kullanici arrow sign üzerinde renk degisikligini dogrular
    And  kullanici arrow sign tiklar
    Then kullanici arrow sign tiklayinca verilen stringi dogrular




