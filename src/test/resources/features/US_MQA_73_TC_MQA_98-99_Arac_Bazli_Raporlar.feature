Feature: Movita Test

  Scenario: MQA-98-99 Arac Bazli Raporlar
    Given kullanici movita sayfasına gider
    Then kullanici movita anasayfada oldugunu dogrular
    And kullanici giris yap butonunu tikla
    Then kullanici kullanici adi ve sifre girecegi textboxlari görmeli
    And kullanici movita kullanici adini ve  gecerli sifresini girmeli
    Then kullanici acilan ekranda raporlar sekmesini görmeli
    And kullanici raporlar secenegini tikla alt secenegi olan araca bazli raporlari tikla
    Then ekranda iki ayri blog gormeli
    And kullanici gordugu iki blogun bottom ve height degerlerini almali
    Then kullanici aldigi bloglarin degerlerini karsilastirip esitse degerler esittir mesajini almali
    And kullanici tum butonlar uzerinde hover over yapar
    Then tum butonlarin tiklanabilir oldugunu gormeli
    And Arac secme dropboxunda gecerli bir arac ve  tarih araligi secilmeli
    Then acilan tabloda onceki ve sonraki butonlari aktif olmali tablo bos ise pasif olmali
