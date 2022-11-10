package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Objects;


public class MovitaHomepageStepDefinitions {

    MovitaPage movita = new MovitaPage();
    WebElement dropdownMenubutton;
    Select select;




    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
        movita.movitaLogo.click();
    }

    @Then("User should navigate to homepage")
    public void user_should_navigate_to_homepage() {
        String expectedUrl = "https://movita.com.tr:9045/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage", expectedUrl, actualUrl);
    }

    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasita_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());

    }

    //

    @And("User hover over Dropdown on the right corner to switch language")
    public void user_clicks_forEnglish() {
        ReusableMethods.hover(movita.dropdownMenubutton);


    }



    @And("clicks on the language button")
    public void user_clicks_on_the_Language_Button() {
        movita.dropdownMenubutton.click();

    }

    @Then("clicks on English on the dropdown menu")
    public void user_clicks_on_english_button() {
        ReusableMethods.waitForVisibility(movita.logo_eng, 3000);
        movita.logo_eng.click();

    }
    @And("Verify if Mobile Vehicle Traking System is displayed")
    public void verify_if_mobile_vehivle_traking_system_displayed(){

        ReusableMethods.waitForVisibility(movita.tum_sector_eng, 10000);
        Assert.assertTrue(movita.tum_sector_eng.isDisplayed());
        System.out.println("movita.tum_sector_eng = " + movita.tum_sector_eng);
    }

    @Then("clicks on Turkish on the dropdown menu")
    public void clicksOnTurkishOnButton() {
        ReusableMethods.waitForVisibility(movita.logo_turk,5);
        movita.logo_turk.click();
    }
    @Then("user hovers over rota_optimizasyon and verifies color change")
    public void hover_over_rota_optimizasyon(){
        String color_before= movita.rota_optimizasyon.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.rota_optimizasyon);

        String color_after=movita.rota_optimizasyon.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();

        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));


    }
    @And("verifies rota_optimizasyon clickable")
    public void clickable(){
        ExpectedConditions.elementToBeClickable(movita.rota_optimizasyon);

    }
    @Then("user verifies rota string")
    public void verify_string(){
        String expected_rota_text="ROTA OPTIMIZASYONU";
        String s=movita.rota_optimizasyon.getText();
        Assert.assertEquals(expected_rota_text,s);

    }
    @Then("user hovers over uygulamalar and verifies color change")
    public void verify_color(){
        String color_before= movita.uygulamalar.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.uygulamalar);
        String color_after=movita.uygulamalar.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));
    }
    @And("verifies uygulamalar clickable")
    public void clickable_uygulamalar(){
        ExpectedConditions.elementToBeClickable(movita.uygulamalar);


    }
    @Then("verify uygulamalar string")
    public void verify_uygulamalar_string(){
        String expected="UYGULAMALAR";
        String actual=movita.uygulamalar.getText();
        Assert.assertEquals(expected,actual);

    }

    @Then("user hovers over kilavuz and verifies color change")
    public void user_hovers_over_kilavuz_and_verifies_color_change() {
        String color_before= movita.kilavuz.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.kilavuz);
        String color_after=movita.kilavuz.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies kilavuz clickable")
    public void user_verifies_kilavuz_clickable() {
        ExpectedConditions.elementToBeClickable(movita.kilavuz);
    }
    @Then("verifies kilavuz string")
    public void verify_kilavuz_string() {
        String expected="KILAVUZ";
        String actual=movita.kilavuz.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over iletisim and verifies color change")
    public void user_hovers_over_iletisim_and_verifies_color_change() {
        String color_before= movita.iletisim.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.iletisim);
        String color_after=movita.iletisim.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies iletisim clickable")
    public void user_verifies_iletisim_clickable() {
        ExpectedConditions.elementToBeClickable(movita.iletisim);

    }
    @Then("verify iletisim string")
    public void verify_iletisim_string() {
        String expected="İLETİŞİM";
        String actual=movita.iletisim.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over giris and verifies color change")
    public void user_hovers_over_giris_and_verifies_color_change() {
        String color_before= movita.giris.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.giris);
        String color_after=movita.giris.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies giris clickable")
    public void user_verifies_giris_clickable() {
        ExpectedConditions.elementToBeClickable(movita.giris);

    }
    @Then("verify giris string")
    public void verify_giris_string() {
        String expected="GİRİŞ YAP";
        String actual=movita.giris.getText();
        Assert.assertEquals(expected,actual);

    }


    @Then("some_wait")
    public void some_wait() {
        ReusableMethods.waitFor(3);
    }


    @And("User hover over Dropdown on the right corner to switch languagetr")
        public void user_clicks_forTurkish() {
        ReusableMethods.hover(movita.logo_turk);


    }

    @Given("user navigates to {string}page")

    public void user_navigates_to_page(String movita) {
        Driver.getDriver().get(ConfigurationReader.getProperty(movita));


    }


    @And("scroll down to {string}")
    // First step
    public void scroll_down_to(String element) throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(10000);

    }

    @Given("verify neden takip sistemi is displayed")
    public void verify_neden_takip_sistemi_is_displayed()  {
        String arananKelime = "NEDEN TAKİP SİSTEMİ";
        String sonucKelime = movita.takip.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        //  Thread.sleep(3000);

    }

    @Given("verify tse belgeli cihazlar is displayed")
    public void verify_tse_belgeli_cihazlar_is_displayed()  {
        String arananKelime = "TSE BELGELİ CİHAZLAR";
        String sonucKelime = movita.tse_belgeli_cihaz.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        //   Thread.sleep(3000);


    }
    @Given("verify ücretsiz inceleyin is  displayed")
    public void verify_ucretsiz_inceleyin_is_displayed() {
        String arananKelime = "ÜCRETSİZ İNCELEYİN";
        String sonucKelime = movita.ucretsiz_incele.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);

    }

    @Given("verify yazilim ve teknolo gelistirme displayed")
    public void verifyYazilimVeTeknoloGelistirmeDisplayed() {
        String arananKelime = "Yazılım ve Teknoloji Geliştirme";
        String sonucKelime = movita.yazilim_gelistime.getText().toUpperCase();

        System.out.println("sonucKelime = " + arananKelime);


    }
    @Given("verify araç takip sistemi displayed")
    public void verify_arac_takip_sistemi_displayed() {

        String arananKelime = "ARAÇ TAKİP SİSTEMİ";
        String sonucKelime = movita.arac_takip.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);

    }
    @Given("verify öne çıkan özelliklerimiz is displayed")
    public void verify_one_cikan_ozelliklerimiz_is_displayed() {

        String arananKelime = "ÖNE ÇIKAN ÖZELLİKLERİMİZ";
        String sonucKelime = movita.one_cikan_ozellikler.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);

    }
    @Given("verify kolay erisim is displayed")
    public void verify_kolay_erisim_is_displayed() {

        String arananKelime = "KOLAY ERİŞİM";
        String sonucKelime = movita.kolay_erisim.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }

    @And("verify teknik_destek is displayed")
    public void verifyTeknik_destekIsDisplayed() throws InterruptedException {
        String arananKelime = "TEKNİK DESTEK";
        String sonucKelime = movita.teknik.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        Thread.sleep(3000);

    }
    @Given("verify sektore yönelik cözümler is displayed")
    public void verify_sektore_yonelik_cozumler_is_displayed() {


        String arananKelime = "SEKTÖRLERE YÖNELİK ÇÖZÜMLER";
        String sonucKelime = movita.sektore_yonelik_cozumler.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }


    @And("hover over and verify arrow's color changed")
    public void hoverOverAndVerifyArrowSColorChanged() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);



    }

    @Then("click on arrow")
    public void clickOnArrow() {
        ReusableMethods.clickWithTimeOut(movita.arrow,3000);

    }

    @Then("verify Tüm Sektörlere Hitap Eden Çözümler is displayed")
    public void verifyTümSektörlereHitapEdenÇözümlerIsDisplayed() {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }


    @And("scroll down to {string} text")
    public void scrollDownToText(String element) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(6000);
    }

    @Then("click on {string}")
    public void clickOn(String element) {
        ReusableMethods.clickWithTimeOut(movita.hakımızda_devamoku,6000);

    }

    @Then("verify Hakkımızda is displayed")
    public void verifyHakkımızdaIsDisplayed() {
        String arananKelime = "HAKKIMIZDA HAKKINDA";
        String sonucKelime = movita.hakkımızda_bilgi.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }


    @And("scroll down to  {string} text")
    public void scrollDownToText1(String element) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(6000);
    }

    @Then("clickon {string}")
    public void clickon(String element) {
        ReusableMethods.clickWithTimeOut(movita.misyonumuz_devamoku,10000);

    }

    @Then("verify Hakkımızda_misyon is displayed")
    public void verifyHakkımızda_misyonIsDisplayed() throws InterruptedException {
        String arananKelime = "MİSYONUMUZ HAKKIMIZDA";
        String sonucKelime = movita.hakkımızda_bilgi.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        Thread.sleep(6000);

    }


    @Then("verify Hakkımızda_ekibimiz is displayed")
    public void verifyHakkımızda_ekibimizIsDisplayed() {
        String arananKelime = "EKİBİMİZ HAKKIMIZDA";
        String sonucKelime = movita.hakkımızda_bilgi.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }


    @Then("clickonN {string}")
    public void clickonn(String element) {
        ReusableMethods.clickWithTimeOut(movita.ekibimiz_devamoku,6000);
    }
    //button renkler değişimi bölümü
    @And("hover over and verify hakımızda_devamoku color changedD")
    public void hoverOverAndVerifyHakımızda_devamokuColorChangedD() {

        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);

    }

    @And("hover over and verify misyonumuz_devamoku color changedD")
    public void hoverOverAndVerifyMisyonumuz_devamokuColorChangedD() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);

    }

    @And("hover over and verify ekibimiz_devamoku color changedD")
    public void hoverOverAndVerifyEkibimiz_devamokuColorChangedD() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);
    }

    @And("go Tüm Sektörlere Hitap Eden Çözümler")
    public void goTümSektörlereHitapEdenÇözümler() throws InterruptedException {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }



    @And("hover over and verify arrowD's color changedD")
    public void hoverOverAndVerifyArrowSColorChangedD() {

        String color_before = movita.arrowD.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrowD);
        ReusableMethods.waitForVisibility(movita.arrowD, 5000);

        String color_after = movita.arrowD.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);



    }

    @Then("click on arrowD")
    public void clickOnArrowD() {
        ReusableMethods.clickWithTimeOut(movita.arrow,3000);

    }

    @Then("verify Tüm Sektörlere Hitap Eden Çözümler is displayedD")
    public void verifyTümSektörlereHitapEdenÇözümlerIsDisplayedD() {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,3000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }

    @And("back page")
    public void navigate_back_to() {
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

}

    @Given("Kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String movita) {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));

    }

    @When("anasayfada {string} butonuna tiklar")
    public void anasayfadaButonunaTiklar(String girisYap) {
        movita.girisYap.click();
    }

    @And("kullanici adi ve sifre  alanlarini gorur")
    public void kullanıcıAdiVeSifreAlanlariniGorur() {
        Assert.assertTrue(movita.username.isDisplayed());
        Assert.assertTrue(movita.password.isDisplayed());
    }

    @And("Movita Vasita Izleme Takip Sistemi yazisini ve onun uzerinde  Movita logosunu gorur")
    public void movitaVasitaIzlemeTakipSistemiYazisiniVeOnunUzerindeMovitaLogosunuGorur() {
        Assert.assertTrue(movita.logo.isDisplayed());
        Assert.assertTrue(movita.logoAltiYazi.isDisplayed());
    }

    @And("Mavi renk uzerinde Giris Yap butonu oldugunu gorur")
    public void maviRenkUzerindeGirisYapButonuOldugunuGorur() {
        Assert.assertTrue(movita.girisyapYazisi.isDisplayed());

    }

    @And("Giris Yap butonunun uzerinde Sifrenizi mi Unuttunuz? linkini gorur")
    public void girisYapButonununUzerindeSifreniziMiUnuttunuzLinkiniGorur() {
        Assert.assertTrue(movita.forgetPassword.isDisplayed());

    }



    @Then("Anasayfaya Don yazisini ve ← ikonunu gorur")
    public void anasayfayaDonYazisiniVeIkonunuGorur() {
        ReusableMethods.waitForVisibility(movita.anasayfayaDon, 5);
        Assert.assertTrue(movita.anasayfayaDon.isDisplayed());


    }

    @And("ikona \\(←) tikladigi zaman anasayfaya yonlendirilir")
    public void ikonaTikladigiZamanAnasayfayaYonlendirilir() {
        movita.anasayfayaDon.click();

    }

    @And("footer kismindaki yaziyi gorur")
    public void footerKismindakiYaziyiGorur() {
        Assert.assertTrue(movita.footer.isDisplayed());

    }

    @And("{string} kismina hover over yapinca yazinin renginin maviden yesile dondugunu gorur")
    public void kisminaHoverOverYapincaYazininRengininMavidenYesileDondugunuGorur(String renkDegisimi)  {
        String color_before= movita.forgetPassword.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.forgetPassword);
        ReusableMethods.waitForVisibility(movita.forgetPassword,3);

        String color_after=movita.forgetPassword.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();

        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));


    }

    @And("{string} kisminin clickable oldugunu gorur")
    public void kismininClickableOldugunuGorur(String clickable) throws InterruptedException {

        ExpectedConditions.elementToBeClickable(movita.forgetPassword);
    }


//////// Login sayfasındaki ‘Şifrenizi mi Unuttunuz?’ sayfasının görünümü ve işlevselliği//////
    //////ENGİN AKGÜL////
@Then("giris yap tıkla")
public void giris_yap_tıkla() {
    ReusableMethods.clickWithTimeOut(movita.giris,10000);
}

    @Then("sifrenizi mi unuttunuz mu tıkla")
    public void sifreniziMiUnuttunuzMuTıkla() {

        ReusableMethods.clickWithTimeOut(movita.sifrenizi_unuttunuzmu,30000);

    }

    @Then("logo dogrulama")
    public void logo_dogrulama() {
        Assert.assertTrue(movita.movita_logo.isDisplayed());

    }

    @Then("sifre yenileme text dogrulama")
    public void sifre_yenileme_text_dogrulama() {
        String aranan = "Movita Şifre Yenileme";
        String sonuc = movita.SifreYenileme.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("Yenileme başlığı = " + aranan);
    }

    @Then("kullanıcı adı giris alanı")
    public void kullanıcı_adı_giris_alanı() {
        String aranan = "Kullanıcı Adı Girişi Alanı";
        String sonuc = movita.kullanıcıAdı.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("Kullanıcı Alanı = " + aranan);

    }

    @Then("telefon giris alanı")
    public void telefon_giris_alanı() throws InterruptedException {
        String aranan = "Telefon Girişi Alanı";
        String sonuc = movita.telefon.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("Telefon Alanı = " + aranan);
        Thread.sleep(3000);

    }

    @Then("sifre degistir buttonu")
    public void sifre_degistir_buttonu() throws InterruptedException {
        String aranan = "Şifre Değiştir butonu";
        String sonuc = movita.sifre_degistir.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("şifre değiştir buttonu = " + aranan);
        Thread.sleep(3000);
    }

    @Then("foother dogrulama")
    public void foother_dogrulama() throws InterruptedException {
        String aranan = "Copyright © 2017 Movita , Bütün Hakları Saklıdır.";
        String sonuc = movita.foother.getText();
        Assert.assertTrue(aranan.contains(sonuc));
        System.out.println("foother sonucu = " + aranan);
        Thread.sleep(5000);


    }

    @And("giris ekranı  hover over ve tıkla")
    public void girisEkranıHoverOverVeTıkla() {
        String color_before= movita.giris_ekranı.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.giris_ekranı);
        String color_after=movita.giris_ekranı.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));
        ReusableMethods.clickWithTimeOut(movita.giris_ekranı,10000);

    }

    @Then("ana sayfaya dön")
    public void ana_sayfaya_dön() {
        ReusableMethods.clickWithTimeOut(movita.ana_sayfaya_dön,30000);

    }

    @Given("Kullanıcı {string} Anasayfasına gider")
    public void kullanıcıAnasayfasınaGider(String movita) {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));
    }

    @When("Anasayfada {string} butonuna tıklar")
    public void anasayfadaButonunaTıklar(String girisYap) {
        movita.girisYap.click();

    }

    @Then("Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar")
    public void kullanıcıHesabınaGeçerliKullaniciAdıVeŞifreIleGirişYapar() {
        movita.username.sendKeys(ConfigurationReader.getProperty("ValidUserName"));
        movita.password.sendKeys(ConfigurationReader.getProperty("ValidPassword"));
        ReusableMethods.clickWithTimeOut(movita.kullaniciGiris,10000);
    }

    @And("Kullanıcı, hesabında solda menüler,ortada harita ve sağda arac bilgileri oldugunu gorur")
    public void kullanıcıHesabındaSoldaMenülerOrtadaHaritaVeSağdaAracBilgileriOldugunuGorur() {
        Assert.assertTrue( movita.menuler.isDisplayed());
        Assert.assertTrue( movita.harita.isDisplayed());
        Assert.assertTrue( movita.aracBilgileri.isDisplayed());

    }

    @And("Kullanıcı hesabının solundaki bilesenleri belirlenen sirayla gorur")
    public void kullanıcıHesabınınSolundakiBilesenleriBelirlenenSiraylaGorur() {
        Assert.assertTrue(movita.anasayfaBileseni.isDisplayed());
        Assert.assertTrue(movita.raporlarBileseni.isDisplayed());
        Assert.assertTrue(movita.aracRotaBileseni.isDisplayed());
        Assert.assertTrue(movita.videoFotoBileseni.isDisplayed());
        Assert.assertTrue(movita.guzergahBileseni.isDisplayed());
        Assert.assertTrue(movita.alarmBileseni.isDisplayed());
        Assert.assertTrue(movita.rotaBileseni.isDisplayed());
        Assert.assertTrue(movita.personelBileseni.isDisplayed());
        Assert.assertTrue(movita.yonetimBileseni.isDisplayed());
    }

    @And("Kullanıcı hesabındaki bileşenlerin bazılarında alt menuler acılır")
    public void kullanıcıHesabındakiBileşenlerinBazılarındaAltMenulerAcılır() {
        movita.personelIslemleri.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.hover(movita.musteriIslemleri);
        movita.musteriIslemleri.click();
    }

    @And("Kullanici hesabında herhangi bir bilesenin secili olmadıgını gorur")
    public void kullaniciHesabındaHerhangiBirBileseninSeciliOlmadıgınıGorur() {
        Assert.assertFalse(movita.tumBilesenler.isSelected());
        Assert.assertFalse(movita.alarmBileseni.isSelected());
        Assert.assertFalse(movita.raporlarBileseni.isSelected());
    }

    @And("Kullanici hesabında ana bilesenler uzerinde hover over yapar")
    public void kullaniciHesabındaAnaBilesenlerUzerindeHoverOverYapar() {
        ReusableMethods.hover(movita.anasayfaBileseni);
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(movita.raporlarBileseni);
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(movita.aracRotaBileseni);
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(movita.videoFotoBileseni);
        ReusableMethods.hover(movita.guzergahBileseni);
        ReusableMethods.hover(movita.alarmBileseni);
        ReusableMethods.hover(movita.rotaBileseni);
        ReusableMethods.hover(movita.personelBileseni);
    }

    @And("Hover over sonrasi secili zemin renginin  beyazdan griye degistigini gorur")
    public void hoverOverSonrasiSeciliZeminRengininBeyazdanGriyeDegistiginiGorur() {
        String color_before= movita.rotaBileseni.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.rotaBileseni);
        String color_after=movita.rotaBileseni.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertTrue(Objects.equals(color_a_hex, color_b_hex));
        ReusableMethods.clickWithTimeOut(movita.rotaBileseni,10000);
    }

    @And("Acilir menu olan bilesenlere tiklar")
    public void acilirMenuOlanBilesenlereTiklar() {
        movita.raporlarBileseni.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.hover(movita.guzergahBileseni);
        movita.guzergahBileseni.click();
        ReusableMethods.hover(movita.rotaBileseni);
        movita.rotaBileseni.click();
    }

    @And("Acilir menu olan bilesenlerde  zemin ve text renginin degismedigini gorur")
    public void acilirMenuOlanBilesenlerdeZeminVeTextRengininDegismediginiGorur() {
        String color_before= movita.raporlarBileseni.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.raporlarBileseni);
        String color_after=movita.raporlarBileseni.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertTrue(Objects.equals(color_a_hex, color_b_hex));
        ReusableMethods.clickWithTimeOut(movita.raporlarBileseni,10000);
        ReusableMethods.waitFor(3);
    }

    @And("Acilir menu olmayan bilesenlere tiklar")
    public void acilirMenuOlmayanBilesenlereTiklar() {
        movita.aracRotaBileseni.click();
        movita.alarmBileseni.click();
        movita.videoFotoBileseni.click();
        ReusableMethods.waitFor(3);
    }

    @And("Acilir menu olmayan bilesenlerde zemin renginin gri  ve text renginin mavi oldugunu gorur")
    public void acilirMenuOlmayanBilesenlerdeZeminRengininGriVeTextRengininMaviOldugunuGorur() {
        //zemin rengi gri degişmedi
        String color_before= movita.aracRotaBileseni.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.aracRotaBileseni);
        String color_after=movita.aracRotaBileseni.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertTrue(Objects.equals(color_a_hex, color_b_hex));
        ReusableMethods.clickWithTimeOut(movita.aracRotaBileseni,10000);

        //text rengi değişti mavi oldu
        String color_before1= movita.aracRotatextRengi.getCssValue("color");
        String color_b_hex1=Color.fromString(color_before1).asHex();
        ReusableMethods.hover(movita.aracRotatextRengi);
        String color_after1=movita.aracRotatextRengi.getCssValue("color");
        String color_a_hex1=Color.fromString(color_after1).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex1, color_b_hex1));
        ReusableMethods.clickWithTimeOut(movita.aracRotatextRengi,10000);
    }

    @And("‘Anasayfa \\(filo_admin)’ componentinin uzerinde Movita logosu bulundugunu gorur")
    public void anasayfaFilo_adminComponentininUzerindeMovitaLogosuBulundugunuGorur() {
        Assert.assertTrue(movita.kullaniciSayfaLogo.isDisplayed());
    }

    @And("Kullanici logoya tiklar")
    public void kullaniciLogoyaTiklar() {
        movita.kullaniciSayfaLogo.click();
    }

    @And("Kullanici hesabina girdikten sonraki layouta ulasır")
    public void kullaniciHesabinaGirdiktenSonrakiLayoutaUlasır() {
        Assert.assertTrue(movita.layout.isDisplayed());
    }

    @And("Kullanici sayfasinda footer kismi yazisi")
    public void kullaniciSayfasindaFooterKismiYazisi() {
        Assert.assertTrue(movita.kullaniciSayfaFooter.isDisplayed());

    }
}