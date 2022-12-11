Feature: MQA-83 Login Page Smoke Test

  Scenario: TC_MQA-100 Login Page

   Given Kullanıcı "Movita" Anasayfasına gider
   Then Anasayfada "Giriş Yap" butonuna tıklar
   And kullanici adi ve sifre  alanlarini gorur
   And Mavi renk uzerinde Giris Yap butonu oldugunu gorur
   And Anasayfaya Don yazisini ve ← ikonunu gorur
   And "Sifrenizi mi unuttunuz? " kisminina tiklar
   And Açılan sayfada username ve telefon numarası girer
   And Sifre Degistir butonuna tıklar
   And ikona (←) tikladigi zaman anasayfaya yonlendirilir
   And Anasayfada "Giriş Yap" butonuna tıklar
   And Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
