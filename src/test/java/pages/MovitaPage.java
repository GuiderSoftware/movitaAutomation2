package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MovitaPage {

    public MovitaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[text()=\"Kurumsal\"]")
    public WebElement kurumsalMenu;

    @FindBy(xpath = "(//ul[@class=\"sub-menu-container\"])[1]")
    public WebElement subKurumsalMenu;

    @FindBy(id = "logo")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

    @FindBy(xpath = "//*[@id=\"dropdownMenuButton\"]")
    public WebElement dropdownMenubutton;

    @FindBy(xpath = "//a[@class=\"dropdown-item\"]")
    public WebElement logo_eng;

    @FindBy(xpath = "//a[@src=\"/app-assets/images/lang/turkFlag.png\"]")
    public WebElement logo_turk;

    @FindBy(xpath = "//div[@id=\"layer-126085703\"]")
    public WebElement mainTextEnglish;



    @FindBy(xpath = "//*[@href=\"/rota_optimizasyonu\"][1]")
    public WebElement rota_optimizasyon;

    @FindBy(xpath = "//*[@href=\"/uygulamalar\"]")
    public WebElement uygulamalar;

    @FindBy(xpath = "//*[@href=\"/guide\"]")
    public WebElement kilavuz;

    @FindBy(xpath = "//*[@href=\"/iletisim\"]")
    public WebElement iletisim;

    @FindBy(xpath = "//*[@href=\"/login\"]")
    public WebElement giris;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[5]/div/div[2]/h3")
    public WebElement arac_takip;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[6]/div/div[2]/h3")
    public WebElement one_cikan_ozellikler;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[7]/div/div[2]/h3")
    public WebElement kolay_erisim;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[8]/div/div[2]/h3")
    public WebElement teknik;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[9]/div/div[2]/h3")
    public WebElement sektore_yonelik_cozumler;




    @FindBy(xpath = "//i[@class=\"icon-wrench1\"]")
    public WebElement teknik_destek_icon;
    @FindBy(xpath = "//div[text()=\"Tüm Sektörlere Hitap Eden Çözümler\"][1]")
    public WebElement tum_sektorler;

    @FindBy(xpath = "//div[text()=Provides Solutions for Different Areas\"]")
            public WebElement tum_sector_eng;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[4]/div/div[2]/h3")
    public WebElement yazilim_gelistime;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[3]/div/div[2]/h3")
    public WebElement ucretsiz_incele;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/div/div[2]/h3")
    public WebElement tse_belgeli_cihaz;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[1]/div/div[2]/h3")
    public WebElement takip;

    @FindBy(xpath = "//*[@id=\"gotoTop\"]")
    public WebElement arrow;
    @FindBy(xpath = "//*[@id=\"gotoTop\"]")
    public WebElement arrowD;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    public WebElement hakkımızda_bilgi;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[1]/div/a")
    public WebElement hakımızda_devamoku;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[2]/div/h3")
    public WebElement misyonumuz;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[2]/div/a")
    public WebElement misyonumuz_devamoku;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[3]/div/h3")
    public WebElement ekibimiz;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[7]/div[3]/div/a")
    public WebElement ekibimiz_devamoku;

    @FindBy (xpath = "//div[text()='GİRİŞ Yap']")
    public WebElement girisYap;

    @FindBy (id = "username")
    public WebElement username;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@alt='branding logo']")
    public WebElement logo;

    @FindBy (xpath = "//h6/span")
    public WebElement logoAltiYazi;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement girisyapYazisi;

    @FindBy (xpath = "//*[@class='card-link']")
    public WebElement forgetPassword;

    @FindBy (linkText = "//*[@class='card-link']")
    public WebElement forgetPasswordClick;

    @FindBy (xpath = "//*[@class='nav-link mr-2 nav-link-label']")
    public WebElement anasayfayaDon;

    @FindBy (xpath = "//*[@class='clearfix blue-grey lighten-2 text-sm-center mb-0 px-1']")
    public WebElement footer;

    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[2]/div/form/fieldset[3]/div/a")
    public org.openqa.selenium.WebElement sifrenizi_unuttunuzmu;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[1]/div/img")
    public org.openqa.selenium.WebElement movita_logo;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[1]/h6/span")
    public org.openqa.selenium.WebElement SifreYenileme;
    @org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"username\"]")
    public org.openqa.selenium.WebElement kullanıcıAdı;
    @org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"telefon\"]")
    public org.openqa.selenium.WebElement telefon;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[2]/div/form/fieldset[3]/div/a")
    public org.openqa.selenium.WebElement giris_ekranı;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/div[2]/div/div[2]/div/form/button")
    public org.openqa.selenium.WebElement sifre_degistir;
    @org.openqa.selenium.support.FindBy(xpath = "/html/body/footer[2]")
    public org.openqa.selenium.WebElement foother;
    @org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"navbar-mobile\"]/ul/li/a")
    public org.openqa.selenium.WebElement ana_sayfaya_dön;




    @FindBy (xpath = "//*[@type='submit']")
    public WebElement kullaniciGiris;

    @FindBy (id = "main-menu-navigation")
    public WebElement menuler;

    @FindBy (xpath = "//*[@id='map']")
    public WebElement harita;

    @FindBy (xpath = "//*[@class='col-lg-2 col-md-2 text-xs-center']")
    public WebElement aracBilgileri;

    @FindBy (xpath = "//*[@id='anasayfa']")
    public WebElement anasayfaBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[1]")
    public WebElement raporlarBileseni;

    @FindBy (xpath = "//*[@id='harita_rota']")
    public WebElement aracRotaBileseni;

    @FindBy (xpath = "//*[@id='arac_video']")
    public WebElement videoFotoBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[2]")
    public WebElement guzergahBileseni;

    @FindBy (xpath = "//*[@id='alarm_listesi']")
    public WebElement alarmBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[3]")
    public WebElement rotaBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[4]")
    public WebElement personelBileseni;

    @FindBy (xpath = "(//*[@class='nav-item has-sub'])[6]")
    public WebElement yonetimBileseni;

    @FindBy (xpath = "//*[text()='Müşteri İşlemleri']")
    public WebElement musteriIslemleri;

    @FindBy (xpath = "//*[text()='Personel İşlemleri']")
    public WebElement personelIslemleri;

    @FindBy (id = "main-menu-navigation")
    public WebElement tumBilesenler;

    @FindBy (xpath = "(//*[@class='menu-title'])[3]")
    public WebElement aracRotatextRengi;

    @FindBy (id = "ic-logo")
    public WebElement kullaniciSayfaLogo;

    @FindBy (xpath = "//*[@data-open='click']")
    public WebElement layout;

    @FindBy (xpath = "//*[@class='clearfix blue-grey lighten-2 text-sm-center mb-0 px-2']")
    public WebElement kullaniciSayfaFooter;


}
