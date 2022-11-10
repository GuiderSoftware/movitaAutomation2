Feature:[MQA-68] Kullanici Hesabi Sayfasi

  Scenario: TC_MQA-75 Basarili Login Sayfa Gorunumu

    Given Kullanıcı "Movita" Anasayfasına gider
    When Anasayfada "Giriş Yap" butonuna tıklar
    Then Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
    And Kullanıcı, hesabında solda menüler,ortada harita ve sağda arac bilgileri oldugunu gorur
