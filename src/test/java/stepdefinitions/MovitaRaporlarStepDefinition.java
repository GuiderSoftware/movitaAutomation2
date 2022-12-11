package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.*;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class MovitaRaporlarStepDefinition extends ReusableMethods {

    MovitaPage movita = new MovitaPage();
//MQA-98-99

    @Then("kullanici kullanici adi ve sifre girecegi textboxlari görmeli")
    public void kullanici_kullanici_adi_ve_sifre_girecegi_textboxlari_görmeli() {
        movita.username_texbox_giris.isDisplayed();
        movita.password_texbox_giris.isDisplayed();
    }
    @Then("kullanici movita kullanici adini ve  gecerli sifresini girmeli")
    public void kullanici_movita_kullanici_adini_ve_gecerli_sifresini_girmeli() {
        movita.username_texbox_giris.sendKeys("demomovita");
        movita.password_texbox_giris.sendKeys("movita1192");
        movita.ilk_giris_yap.click();
    }
    @Then("kullanici acilan ekranda raporlar sekmesini görmeli")
    public void kullanici_acilan_ekranda_raporlar_sekmesini_görmeli() {
        movita.raporlar.isDisplayed();
    }
    @Then("kullanici raporlar secenegini tikla alt secenegi olan araca bazli raporlari tikla")
    public void kullanici_raporlar_secenegini_tikla_alt_secenegi_olan_araca_bazli_raporlari_tikla() throws InterruptedException {
        Thread.sleep(2000);
        movita.cizgi.click();
        movita.raporlar.click();
        Thread.sleep(2000);
        movita.arac_bazli_raporlar.click();
        Thread.sleep(2000);

    }
    @Then("ekranda iki ayri blog gormeli")
    public void ekranda_iki_ayri_blog_gormeli() throws IOException {
        movita.blog_1.isDisplayed();
        movita.blog12.isDisplayed();
    }
    @Then("kullanici gordugu iki blogun bottom ve height degerlerini almali")
    public void kullanici_gordugu_iki_blogun_bottom_ve_height_degerlerini_almali() {
        Dimension size=movita.blog11.getSize();
        Dimension size1=movita.blog12.getSize();

    }
    @Then("kullanici aldigi bloglarin degerlerini karsilastirip esitse degerler esittir mesajini almali")
    public void kullanici_aldigi_bloglarin_degerlerini_karsilastirip_esitse_degerler_esittir_mesajini_almali() {
        Dimension size=movita.blog11.getSize();
        Dimension size1=movita.blog12.getSize();
        if (size==size1){
            System.out.println("Boyutlar Eşittir.");
        }else System.out.println("Boyutlar Eşit Değildir.");
    }
    @Then("kullanici tum butonlar uzerinde hover over yapar")
    public void kullanici_tum_butonlar_uzerinde_hover_over_yapar() {
        ReusableMethods.hover(movita.rapor_al);
        ReusableMethods.hover(movita.Excel_);
        ReusableMethods.hover(movita.pdf_);
        ReusableMethods.hover(movita.print);
        ReusableMethods.hover(movita.detayli_filtre);
        ReusableMethods.hover(movita.onceki);
        ReusableMethods.hover(movita.sonraki);

    }
    @Then("tum butonlarin tiklanabilir oldugunu gormeli")
    public void tum_butonlarin_tiklanabilir_oldugunu_gormeli() {
        ReusableMethods.waitForClickablility(movita.rapor_al,5);
        ReusableMethods.waitForClickablility(movita.Excel_,5);
        ReusableMethods.waitForClickablility(movita.pdf_,5);
        ReusableMethods.waitForClickablility(movita.print,5);
        ReusableMethods.waitForClickablility(movita.detayli_filtre,5);
        ReusableMethods.waitForClickablility(movita.onceki,5);
        ReusableMethods.waitForClickablility(movita.sonraki,5);
    }
    @Then("Arac secme dropboxunda gecerli bir arac ve  tarih araligi secilmeli")
    public void arac_secme_dropboxunda_gecerli_bir_arac_ve_tarih_araligi_secilmeli() throws InterruptedException {


        movita.bos.click();
        movita.tarih_1.clear();
        movita.tarih_1.sendKeys("2015-01-15");
        movita.bos.click();
        movita.tarih_2.clear();
        movita.tarih_2.sendKeys("2022-11-15");
        movita.bos.click();
        movita.arac_arrow.click();
        movita.secilen_arac.click();
        movita.rapor_al.click();
        Thread.sleep(5000);
    }
    @Then("acilan tabloda onceki ve sonraki butonlari aktif olmali tablo bos ise pasif olmali")
    public void acilan_tabloda_onceki_ve_sonraki_butonlari_aktif_olmali_tablo_bos_ise_pasif_olmali() {
        ReusableMethods.waitForClickablility(movita.onceki,2);
        ReusableMethods.waitForClickablility(movita.sonraki,2);
    }
////// engin akgül raporlar detaylı filtreleme
@Given("user navigates to login page")
public void userNavigatesToLoginPage() {
    Driver.getDriver().get(ConfigurationReader.getProperty("loginPage"));
}

    @When("user logins the page")
    public void userLoginsThePage() {
        movita.username.sendKeys(ConfigurationReader.getProperty("ValidUserName"), Keys.TAB, ConfigurationReader.getProperty("ValidPassword"), Keys.ENTER);
    }


    @And("click on Raporlar")
    public void clickOnRaporlar() {
        waitForVisibility(movita.menuRaporlar, 5).click();
    }

    @And("click on Araç Bazlı Rapor")
    public void clickOnAraçBazlıRapor() {
        waitForVisibility(movita.menuAracBazliRapor, 5).click();

    }

    @And("click on Araç Sec")
    public void clickOnAraçSec() {
        Select arac=new Select(movita.aracSec);
        arac.selectByIndex(0);

    }
    @Then("clicks on Baslangic Tarihi")
    public void clicksOnBaslangicTarihi() {
        waitForVisibility(movita.baslangicTarihi, 5).click();
    }

    @And("choose {int}{int}{int} from dropdown menu")
    public void chooseFromDropdownMenu(int arg0, int arg1, int arg2) {
        Select option1 = new Select(movita.selectYear1);
        option1.selectByValue("2021");
        Select option2 = new Select(movita.selectMonth1);
        option2.selectByValue("0");
        movita.firstDayOfTheMonth.click();
    }

    @And("click on Detayli Filtre")
    public void clickOnDetayliFiltre() {
        movita.detayliFiltre.click();
    }

    @Then("verify Tarih writing")
    public void verifyTarihWriting() {
        Assert.assertEquals(movita.tarihfilter.getText(),"Tarih");
    }

    @Then("verify Ise Baslama writing")
    public void verifyIseBaslamaWriting() {
        Assert.assertEquals(movita.iseBaslamaFilter.getText(),"İşe Başlama");

    }

    @Then("verify Is Bitis writing")
    public void verifyIsBitisWriting() {
        Assert.assertEquals(movita.isBitisFilter.getText(),"İş Bitiş");

    }

    @And("verify Tarih placeholder")
    public void verifyTarihPlaceholder() {

        String actualTarihPlaceHolder=movita.inputTarihFilter.getAttribute("placeholder");
        Assert.assertEquals(actualTarihPlaceHolder,"...");

    }

    @Then("verify Ise Baslama placeholder")
    public void verifyIseBaslamaPlaceholder() {
        String actualTarihPlaceHolder=movita.inputIseBaslamaFilter.getAttribute("placeholder");
        Assert.assertEquals(actualTarihPlaceHolder,"...");

    }

    @And("verify Is Bitis placeholder")
    public void verifyIsBitisPlaceholder() {
        String actualTarihPlaceHolder=movita.inputIsBitisFilter.getAttribute("placeholder");
        Assert.assertEquals(actualTarihPlaceHolder,"...");

    }

    @Given("user sends input as {string}")
    public void userSendsInputAs(String arg0) {
        movita.inputTarihFilter.clear();
        movita.inputTarihFilter.sendKeys(arg0);
    }




    @Then("user verifies {int} filtered result with date {string}")
    public void userVerifiesFilteredResultWithDate(int arg0, String arg1) {

        List<WebElement> element = Driver.getDriver().findElements(By.xpath(".//td[contains(text(),\""+arg1+"\")]/parent::tr"));
        waitForPageToLoad(1);
        assertEquals(arg0,element.size());
    }


    @Then("user verifies filtered result1")
    public void userVerifiesFilteredResult1() {
        assertEquals(1,movita.resultDate2022.size());
    }

    @Then("user verifies filtered result2")
    public void userVerifiesFilteredResult2() {
        assertEquals(7,movita.resultDate2021_11.size());
    }
    @Then("click  on Rapor al")
    public void clickOnRaporAl() {
        String expectedURL = Driver.getDriver().getCurrentUrl();
        waitForVisibility(movita.menuRaporAlButton, 5).click();
        assertNotEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
    }

    @Then("user verifies filtered result3")
    public void userVerifiesFilteredResult3() {
        assertEquals(1,movita.resultDate2021_11_05.size());
    }



    @Then("user verifies filtered result with date and ise baslama {string}")
    public void userVerifiesResultFilteredResultWithIntoIseBaslama(String arg0) {

        // elements.size() -> returns result = how many we have to get from the time search. 10th column
        List<WebElement> result=Driver.getDriver().findElements(By.xpath(".//td[contains(text(),\"2021-11\")]/following-sibling::td[10 and contains(text(),\""+arg0+"\")]"));

        movita.inputIseBaslamaFilter.clear();
        movita.inputIseBaslamaFilter.sendKeys(arg0);

        // TODO: RETEST after fix:  MAT-103 Bug report created
        assertEquals(result.size(), movita.resultDate2021_11.size());

    }

    @Then("user verifies filtered result with date and is bitis {string}")
    public void userVerifiesBitisResultFilteredResultWithIseBaslama(String arg0) {
        // elements.size() -> returns result = how many we have to get from the time search. 11th column
        List<WebElement> result=Driver.getDriver().findElements(By.xpath(".//td[contains(text(),\"2021-11\")]/following-sibling::td[11 and contains(text(),\""+arg0+"\")]"));
        System.out.println(result.size());

        movita.inputIseBaslamaFilter.clear();
        movita.inputIsBitisFilter.clear();
        movita.inputIsBitisFilter.sendKeys(arg0);

        // TODO: RETEST after fix:  MAT-104 Bug report created
        assertEquals(result.size(), movita.resultDate2021_11.size());
    }


}
