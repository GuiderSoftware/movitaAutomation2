@parametre
Feature: Movita Test

  Scenario: MQA-63 Sifrenizi mi unuttunuz linkinin islevselligi
    Given kullanici movita sayfasına gider
    Then kullanici movita anasayfada oldugunu dogrular
    And kullanici giris yap butonunu tikla
    Then  kullanici sifrenizi mi unuttunuz textlinkini görmeli
    And kullanici sifrenizi mi unuttunuz textlinkini tikla
    Then kullanici sifre yenileme için kullanıcı adı ve telefon numarası girilecek textbox görmeli
    And Kullanici veya telefon numarasını hatalı gir
    Then kullanici Lütfen kullanıcı adınızı veya telefon numaranızı doğru girdiğinizden emin olunuz mesajini almaliyim
    And Kullanici ve telefon veya her ikisini boş birak
    Then kullanici Lütfen kullanıcı adınızı girdiğinizden emin olun!,Lütfen Filoya ait telefon numarasını girdiğinizden emin olun! mesajini görmeli
