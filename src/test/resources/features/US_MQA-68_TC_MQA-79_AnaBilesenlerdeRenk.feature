Feature:[MQA-68] Kullanici Hesabi Sayfasi


  Scenario: TC_MQA-79 Ana bilesenlerde renk degisimi

    Given Kullanıcı "Movita" Anasayfasına gider
    When Anasayfada "Giriş Yap" butonuna tıklar
    Then Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
    And Acilir menu olan bilesenlere tiklar
    And Acilir menu olan bilesenlerde  zemin ve text renginin degismedigini gorur
    And Acilir menu olmayan bilesenlere tiklar
    And Acilir menu olmayan bilesenlerde zemin renginin gri  ve text renginin mavi oldugunu gorur
