package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import java.util.Objects;
import static org.junit.Assert.assertEquals;


public class MovitaStepDefinitions {

    MovitaPage movita = new MovitaPage();
    Actions actions = new Actions(Driver.getDriver());
    Driver driver;


    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
    }

    @When("click on movita logo")
    public void clicks_on_movita_logo() {
        movita.movitaLogo.click();
    }

    @Then("user should navigate to homepage")
    public void user_should_navigate_to_homepage() {
        String expectedUrl = "https://movita.com.tr/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals("Urls are not matched.User can't navigate to homepage", expectedUrl, actualUrl);
    }

    @Then("verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasita_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 3);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }

    @Then("user hovers over rota_optimizasyon and verifies color change")
    public void hover_over_rota_optimizasyon() {
        String color_before = movita.rota_optimizasyon.getCssValue("color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.rota_optimizasyon);

        String color_after = movita.rota_optimizasyon.getCssValue("color");
        String color_a_hex = Color.fromString(color_after).asHex();

        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }

    @And("verifies rota_optimizasyon clickable")
    public void clickable() {

        ExpectedConditions.elementToBeClickable(movita.rota_optimizasyon);

    }

    @Then("user verifies rota string")
    public void verify_string() {
        String expected_rota_text = "ROTA OPTIMIZASYONU";
        String s = movita.rota_optimizasyon.getText();
        assertEquals(expected_rota_text, s);

    }

    @Then("user hovers over uygulamalar and verifies color change")
    public void verify_color() {
        String color_before = movita.uygulamalar.getCssValue("color");
        String color_b_hex = Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.uygulamalar);
        String color_after = movita.uygulamalar.getCssValue("color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }

    @And("verifies uygulamalar clickable")
    public void clickable_uygulamalar() {
        ExpectedConditions.elementToBeClickable(movita.uygulamalar);


    }

    @Then("verify uygulamalar string")
    public void verify_uygulamalar_string() {
        String expected = "UYGULAMALAR";
        String actual = movita.uygulamalar.getText();
        assertEquals(expected, actual);

    }

    @Then("user hovers over kilavuz and verifies color change")
    public void user_hovers_over_kilavuz_and_verifies_color_change() {
        String color_before = movita.kilavuz.getCssValue("color");
        String color_b_hex = Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.kilavuz);
        String color_after = movita.kilavuz.getCssValue("color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }

    @Then("user verifies kilavuz clickable")
    public void user_verifies_kilavuz_clickable() {
        ExpectedConditions.elementToBeClickable(movita.kilavuz);
    }

    @Then("verifies kilavuz string")
    public void verify_kilavuz_string() {
        String expected = "KILAVUZ";
        String actual = movita.kilavuz.getText();
        assertEquals(expected, actual);


    }

    @Then("user hovers over iletisim and verifies color change")
    public void user_hovers_over_iletisim_and_verifies_color_change() {
        String color_before = movita.iletisim.getCssValue("color");
        String color_b_hex = Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.iletisim);
        String color_after = movita.iletisim.getCssValue("color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }

    @Then("user verifies iletisim clickable")
    public void user_verifies_iletisim_clickable() {
        ExpectedConditions.elementToBeClickable(movita.iletisim);

    }

    @Then("verify iletisim string")
    public void verify_iletisim_string() {
        String expected = "İLETİSİM";
        String actual = movita.iletisim_string.getText();
        System.out.println(actual);
        assertEquals(actual, expected);

    }

    @Then("user hovers over giris and verifies color change")
    public void user_hovers_over_giris_and_verifies_color_change() {
        String color_before = movita.giris.getCssValue("color");
        String color_b_hex = Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.giris);
        String color_after = movita.giris.getCssValue("color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }

    @Then("user verifies giris clickable")
    public void user_verifies_giris_clickable() {
        ExpectedConditions.elementToBeClickable(movita.giris);

    }

    @Then("verify giris string")
    public void verify_giris_string() {
        String expected = "GİRİŞ YAP";
        String actual = movita.giris.getText();
        assertEquals(expected, actual);


    }

    @And("scrolls down to address")
    // First step
    public void scroll_down_to() throws InterruptedException {

       Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(movita.address).perform();
                /* sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(element, Keys.PAGE_DOWN)
                .perform();

        */

        Thread.sleep(3000);

    }

    @And("hover over verify bayilik_basvurusu's color changed to blue")
    // 2th step
    public void hover_over_bayi() throws InterruptedException {
        String color_before = movita.bayi.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.bayi);
        ReusableMethods.waitForVisibility(movita.bayi, 5000);

        String color_after = movita.bayi.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);

    }

    @Then("verify bayilik_basvurusu is clickable")
    //3th step
    public void verify_bayilik_basvurusu_is_clickable() {
        ExpectedConditions.elementToBeClickable(movita.bayi);
    }

    @Then("clicks on bayilik_basvurusu")
    //4th step
    public void clicks_on_bayilik_basvurusu() {
        movita.bayi.click();
    }

    @And("verify bayilik_basvurusu is displayed")
    // 5 th step
    public void verify_bayilik_basvurusu_is_displayed() {
        ReusableMethods.waitForVisibility(movita.bayi_baslik, 3000);
        Assert.assertTrue("no display", movita.bayi_baslik.isDisplayed());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @And("navigate to previous page")
    //6th step
    public void navigate_back() {
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @Then("hover over and verify demo basvurusu's color does not change")
    //8 th step
    public void hover_over_to_demo() {
        String color_before = movita.demo.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.demo);
        ReusableMethods.waitForVisibility(movita.demo, 5000);

        String color_after = movita.demo.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        assertEquals(color_a_hex, color_b_hex);


    }
    @And("clicks on demo basvurusu")
    // 10th step
    public void clicks_on_demo_basvurusu() {

        movita.demo.click();
    }
    @Then("verify demo basvurusu is displayed")
    //11th step
    public void demo_basvurusu_is_displayed() {
        ReusableMethods.waitForVisibility(movita.demo_baslik, 3000);
        Assert.assertTrue("no display", movita.demo_baslik.isDisplayed());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


    }
    @And("hover over and verify arrow's color changed")
    //8 th step
    public void hover_over_to_arrow() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);
    }
    @Then("click on arrow")
    public void click_on_the_element(){
        ReusableMethods.clickWithTimeOut(movita.arrow,3000);

    }


    @Then("verify Tum Sektorlere Hitap Eden Cozumler is displayed")
    public void is_displayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }
    @Then("verifies address information")
    public void verifies_address_information() {
        String actual_address=movita.address.getText();
        System.out.println(actual_address);
        String expected_address="Adres:\n" +
                "Beştepe Mahallesi\n" +
                "Nergiz Sokak No:7/2 Via Flat\n" +
                "Yenimahalle/ANKARA";
        assertEquals(actual_address, expected_address);

    }
    @Then("verifies phone number")
    public void verifies_phone_number() {
        String copyrights=movita.copyritghts.getText();
        String expectedPhone= " + 90 (850) 557 7627 ";
        String coprights_Info="bilgi@movita.com.tr · + 90 (850) 557 7627 ·";
        final int mid = coprights_Info.length() / 2; //String'in ortasını buluyoruz.
        String[] parts = {coprights_Info.substring(0, mid),coprights_Info.substring(mid)};
        String phone=parts[1].replace("·","");
        assertEquals(expectedPhone,phone);



    }
    @Then("verifies email")
    public void verifies_email() {
        String copyrights=movita.copyritghts.getText();
        String expectedEmail="bilgi@movita.com.tr ";
        final int mid = copyrights.length() / 2; //String'in ortasını buluyoruz.
        String[] parts = {copyrights.substring(0, mid),copyrights.substring(mid)};
        String email=parts[0].replace("·","");
        assertEquals(expectedEmail,email);
    }
    @And("scrolls down to end of the page")

    public void scroll_down_to_end() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(movita.address).perform();
        Thread.sleep(3000);

    }
    @Then("print the copy right info")
    public void print_copy_rights(){
        String copyrights=movita.copyritghts.getText();
        String expectedPhone= " + 90 (850) 557 7627 ";
        String expectedEmail="bilgi@movita.com.tr ";
               String coprights_Info="bilgi@movita.com.tr · + 90 (850) 557 7627 ·";
        final int mid = coprights_Info.length() / 2; //String'in ortasını buluyoruz.
        String[] parts = {coprights_Info.substring(0, mid),coprights_Info.substring(mid)};
        //System.out.println(parts[0]); // ilk parça
        String email=parts[0].replace("·","");
       // System.out.println(parts[1]); // ikinci parça
        String phone=parts[1].replace("·","");
        System.out.println(phone);
        System.out.println(email);
        assertEquals(expectedPhone,phone);
        assertEquals(expectedEmail,email);
    }
    @Then("click on Mesafeli Satis Sozlesmesi")
    public void click_on_Mesafeli_satis_sozlesmesi(){
        actions.moveToElement(movita.mesafeli_satis_sozlesmesi).perform();
        movita.mesafeli_satis_sozlesmesi.click();
    }
    @And("verify if Mesafeli Satis Sozlesmesi displayed")
    public void veirfy_if_mesafeli_satis_sozlesmesi_displayed(){
        String expected="MESAFELI SATIŞ SÖZLEŞMESI";
        String actual=movita.getMesafeli_satis_sozlesmesi_text.getText();
        assertEquals(actual,expected);
        //navigate to the previous page
        // geeri dön
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    @Then("click on Gizlilik Politikamız")
    public void click_on_gizlilik_politikamız() {
        actions.moveToElement(movita.gizlilik_politikasi).perform();

        movita.gizlilik_politikasi.click();
    }
    @Then("verify if Gizlilik Politikamız displayed")
    public void verify_if_gizlilik_politikamız_displayed() {
        String expected="GİZLİLİK POLİTİKASI";
        String actual=movita.gizlilik_politikasi_text.getText();
        assertEquals(actual,expected);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    @Then("click on Odeme ve Teslimat")
    public void click_on_odeme_ve_teslimat() {

        actions.moveToElement(movita.odeme_ve_teslimat).perform();
        movita.odeme_ve_teslimat.click();
    }
    @Then("verify if Odeme ve Teslimat displayed")
    public void verify_if_odeme_ve_teslimat_displayed() {
        String expected="ÖDEME VE TESLİMAT";
        String actual=movita.odeme_ve_teslimat_text.getText();
        assertEquals(actual,expected);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    @Then("click on Garanti Sartlari")
    public void click_on_garanti_sartlari() {
        movita.garanti.click();

    }
    @Then("verify if Garanti Sartlari displayed")
    public void verify_if_garanti_sartlari_displayed() throws InterruptedException {

        String expected="GARANTİ ŞARTLARI";
        String actual=movita.garanti_text.getText();
        assertEquals(actual,expected);
        System.out.println(actual);
        System.out.println(expected);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }



    }
    @Then("click on Iade Sartlari")
    public void click_on_iade_sartlari() {
        movita.iade_sartlari.click();

    }
    @Then("verify if Iade Sartlari displayed")
    public void verify_if_iade_sartlari_displayed() throws InterruptedException {
        String expected="İADE ŞARTLARI";
        String actual=movita.iade_sartlari_text.getText();
        System.out.println(actual); // ÜRÜNLER i yazdırıyor.
        assertEquals(actual,expected);
        Thread.sleep(3000);
        Driver.closeDriver();
    }

    @Then("click on Hakkimizda")
    public void click_on_hakkimizda() throws InterruptedException {

        actions.scrollToElement(movita.hakkimizda).perform();
        Thread.sleep(3000);
        movita.hakkimizda.click();

/*
        for (WebElement webElement : bakeries) {
            String name = webElement.getText();
            System.out.println(name);
        }
        actions.scrollToElement(movita.hakkimizda).perform();
        Thread.sleep(3000);
    movita.hakkimizda.click();

      List<WebElement> tbody = driver.findElements(By.xpath("//tbody")); //60?
        for (WebElement tbodylist : tbody) {
            System.out.println("tbodylist.getSize() = " + tbodylist.getSize());

        }

         List<WebElement> listOfUl = Driver.getDriver().findElements(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/div/div[4]/div/ul"));

        for (WebElement webelement: listOfUl
             ) {
            String name=webelement.getText();
            System.out.println(name);

        }
        System.out.println("listOfUl.size() = " + listOfUl.size());

 */
    }
    @Then("verify if Hakkimizda displayed")
    public void verify_if_hakkimizda_displayed() throws InterruptedException {

        String expected="HAKKIMIZDA";
        String actual=movita.hakkimizda_text.getText();
        assertEquals(actual,expected);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
    @Then("click on Belgelerimiz")
    public void click_on_belgelerimiz() {
        movita.belgelerimiz.click();
    }
    @Then("verify if Belgelerimiz displayed")
    public void verify_if_belgelerimiz_displayed() throws InterruptedException {
        String expected="BELGELERİMİZ";
        String actual=movita.notFound.getText();
        assertEquals(actual,expected);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    @Then("click on Bayilik Basvurusu")
    public void click_on_bayilik_basvurusu() {
       movita.bayi_basvuru.click();
    }

    @Then("verify if Bayilik Basvurusu displayed")
    public void verify_if_bayilik_basvurusu_displayed() throws InterruptedException {
        String expected="BAYILIK BAŞVURU";
        String actual=movita.bayilik_basvuru_text.getText();
        assertEquals(actual,expected);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @Then("click on Demo Basvurusu")
    public void click_on_demo_basvurusu() {
        movita.demo_basvuru.click();
    }

    @Then("verify if Demo Basvurusu displayed")
    public void verify_if_demo_basvurusu_displayed() throws InterruptedException {
        String expected="DEMO BAŞVURU";
        String actual=movita.demo_basvuru_text.getText();
        assertEquals(actual,expected);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @Then("click on Urunler")
    public void click_on_urunler() {
        movita.urunler.click();
    }

    @Then("verify if Urunler displayed")
    public void verify_if_urunler_displayed() throws InterruptedException {
        String expected="ÜRÜNLER";
        String actual=movita.urunler_text.getText();
        assertEquals(actual,expected);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @Then("click on Rota Optimizasyonu")
    public void click_on_rota_optimizasyonu() {
        movita.rota_optimizasyon.click();
    }

    @Then("verify if Rota Optımızasyonu displayed")
    public void verify_if_rota_optımızasyonu_displayed() throws InterruptedException {
        String expected="ROTA OPTIMIZASYONU";
        String actual=movita.rota_text.getText();
        assertEquals(actual,expected);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Then("click on Iletisim")
    public void click_on_iletisim() {
       movita.iletisim_alt_kisim.click();
    }

    @Then("verify Iletisim displayed")
    public void verify_iletisim_displayed() throws InterruptedException, IOException {
            String expected="İLETİŞİM";
            String actual=movita.getIade_sartlari_text.getText();
            assertEquals(expected,actual);
            Thread.sleep(3000);
            Driver.getDriver().navigate().back();
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    @Then("click on Okul Servis Araclari Takip Sistemi")
    public void click_on_okul_servis_araclari_takip_sistemi() {
        actions.scrollToElement(movita.okul_servis_araclari).perform();
        movita.okul_servis_araclari.click();
    }
    @Then("verify if Okul Servis Araclari Takip Sistemi displayed")
    public void verify_if_okul_servis_araclari_takip_sistemi_displayed() throws InterruptedException {
        String expected="Okul Servis Araçları Takip Sistemi";
        String actual=movita.okul_servis_araclari_text.getText();
        assertEquals(expected,actual);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    @Then("click on Kameralı Arac Takip Sistemi")
    public void click_on_kameralı_arac_takip_sistemi() {
        movita.kameralı_arac_takip_sistemi.click();
    }
    @Then("verify if Kameralı Araç Takip Sistemi displayed")
    public void verify_if_kameralı_araç_takip_sistemi_displayed() throws InterruptedException {
        String expected="KAMERALI ARAÇ TAKIP SISTEMI";
        String actual=movita.kameralı_arac_takip_sistemi_text.getText();
        assertEquals(expected,actual);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    @Then("click on Kisi Bilgilendirme Sistem")
    public void click_on_kisi_bilgilendirme_sistem() {
        movita.kisi_bilgilendirme_sistemi.click();
    }
    @Then("verify if Kisi Bilgilendirme Sistem displayed")
    public void verify_if_kisi_bilgilendirme_sistem_displayed() throws InterruptedException {
        String expected="KIŞI BILGILENDIRME SISTEMI";
        String actual=movita.kisi_bilgilendirme_sistemi_text.getText();
        assertEquals(expected,actual);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
    @Then("Kisi ve Nesne Hayvan Takip Sistemi")
    public void kisi_ve_nesne_hayvan_takip_sistemi() throws InterruptedException {
        movita.nesne_takip_sistemi.click();
        Thread.sleep(1000);
    }
    @Then("verify if Kisi ve Nesne Hayvan Takip Sistemi displayed")
    public void verify_if_kisi_ve_nesne_hayvan_takip_sistemi_displayed() throws InterruptedException {
        String expected="KIŞI VE NESNE/HAYVAN TAKIP SISTEMI";
        String actual=movita.nesne_takip_sistemi_text.getText();
        assertEquals(expected,actual);
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }


}