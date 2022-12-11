package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;
import java.util.*;

public class MovitaLoginStepDefinition extends ReusableMethods {


    MovitaPage movita = new MovitaPage();

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

    @And("{string} kisminina tiklar")
    public void kismininaTiklar(String sifre) {
        movita.sifreUnut.click();

    }

    @And("Açılan sayfada username ve telefon numarası girer")
    public void açılanSayfadaUsernameVeTelefonNumarasıGirer() {
        ReusableMethods.waitFor(3);
        movita.kullaniciAdi.click();
        movita.kullaniciAdi.sendKeys(ConfigurationReader.getProperty("ValidUserName"));
        movita.telefonNo.click();
        movita.telefonNo.sendKeys("05001234567");

    }

    @And("Sifre Degistir butonuna tıklar")
    public void sifreDegistirButonunaTıklar() {
        ReusableMethods.clickWithTimeOut(movita.sifreDegistir,30000);
        //  movita.sifreDegistir.click();
        ReusableMethods.waitFor(10);
    }

}
