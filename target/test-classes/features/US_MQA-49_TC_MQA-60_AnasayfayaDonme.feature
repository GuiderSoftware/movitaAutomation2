Feature: US_MQA-49 LOgin sayfasi gorunumu

  Scenario: TC_MQA-60 Anasayfaya donebilme

     Given Kullanici "movita" anasayfasina gider
     When anasayfada "Giris Yap" butonuna tiklar
     Then Anasayfaya Don yazisini ve ← ikonunu gorur
     And  ikona (←) tikladigi zaman anasayfaya yonlendirilir

