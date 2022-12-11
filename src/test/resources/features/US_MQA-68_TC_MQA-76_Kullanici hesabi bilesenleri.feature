Feature: [MQA-68] Kullanici Hesabi Sayfasi


  Scenario: TC_MQA-76 Kullanici hesabi bilesenleri

      And  Kullanıcı "Movita" Anasayfasına gider
      And  Anasayfada "Giriş Yap" butonuna tıklar
      And  Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
      And  Kullanıcı hesabının solundaki bilesenleri belirlenen sirayla gorur
      And  Kullanıcı hesabındaki bileşenlerin bazılarında alt menuler acılır
