Feature:[MQA-68] Kullanici Hesabi Sayfasi

  Scenario: TC_MQA-78 Ana bilesenlerde hover

    Given Kullanıcı "Movita" Anasayfasına gider
    When Anasayfada "Giriş Yap" butonuna tıklar
    Then Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
    And  Kullanici hesabında ana bilesenler uzerinde hover over yapar
    And  Hover over sonrasi secili zemin renginin  beyazdan griye degistigini gorur
