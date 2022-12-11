Feature:[MQA-68] Kullanici Hesabi Sayfasi

  Scenario: TC_MQA-77 Secili bilesen olmamasi



    Given Kullanıcı "Movita" Anasayfasına gider
    When Anasayfada "Giriş Yap" butonuna tıklar
    Then Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
     And Kullanici hesabında herhangi bir bilesenin secili olmadıgını gorur
