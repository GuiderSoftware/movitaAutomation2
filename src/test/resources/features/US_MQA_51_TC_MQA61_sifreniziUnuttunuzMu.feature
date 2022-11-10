Feature: US_Mqa_51
  Scenario:Login page

    Given Kullanici "movita" anasayfasina gider
    Then giris yap tıkla
    Then sifrenizi mi unuttunuz mu tıkla
    And logo dogrulama
    And sifre yenileme text dogrulama
    And kullanıcı adı giris alanı
    And telefon giris alanı
    Then sifre degistir buttonu
    And giris ekranı  hover over ve tıkla
    Then sifrenizi mi unuttunuz mu tıkla
    And foother dogrulama
    And ana sayfaya dön
