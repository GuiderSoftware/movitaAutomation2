Feature: US_MQA-49 Login sayfasi gorunumu

  Scenario: TC_MQA-59 Kullanici login sayfasini goruntuler

   Given  Kullanici "movita" anasayfasina gider
   When  anasayfada "Giris Yap" butonuna tiklar
   Then  kullanici adi ve sifre  alanlarini gorur
   Then  Movita Vasita Izleme Takip Sistemi yazisini ve onun uzerinde  Movita logosunu gorur
   Then  Mavi renk uzerinde Giris Yap butonu oldugunu gorur
   Then  Giris Yap butonunun uzerinde Sifrenizi mi Unuttunuz? linkini gorur
   And  "Sifrenizi mi unuttunuz? " kismina hover over yapinca yazinin renginin maviden yesile dondugunu gorur
   And "Sifrenizi mi unuttunuz? " kisminin clickable oldugunu gorur
