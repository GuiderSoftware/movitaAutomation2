Feature:[MQA-68] Kullanici Hesabi Sayfasi


  Scenario: TC_MQA-81 Kullanici hesabi footer

    Given Kullanıcı "Movita" Anasayfasına gider
    When Anasayfada "Giriş Yap" butonuna tıklar
    Then Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
    And Kullanici sayfasinda footer kismi yazisi