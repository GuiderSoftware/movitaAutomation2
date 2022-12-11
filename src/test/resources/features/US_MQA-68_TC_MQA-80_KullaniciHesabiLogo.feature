Feature:[MQA-68] Kullanici Hesabi Sayfasi

  Scenario: TC_MQA-80 Kullanici hesabi logo

    Given Kullanıcı "Movita" Anasayfasına gider
    When Anasayfada "Giriş Yap" butonuna tıklar
    Then Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
    And ‘Anasayfa (filo_admin)’ componentinin uzerinde Movita logosu bulundugunu gorur
    And Kullanici logoya tiklar
    And Kullanici hesabina girdikten sonraki layouta ulasır
