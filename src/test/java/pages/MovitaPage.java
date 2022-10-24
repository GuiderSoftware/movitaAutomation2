package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovitaPage {

    public MovitaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[text()=\"Kurumsal\"]")
    public WebElement kurumsalMenu;

    @FindBy(xpath = "(//ul[@class=\"sub-menu-container\"])[1]")
    public List<WebElement> subKurumsalMenu;

    @FindBy(id = "logo")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

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

    @FindBy(xpath = "//div[@class=\"container clearfix\"]/h1")
    public WebElement iletisim_string;

    @FindBy(xpath = "//*[@class=\"button button-3d button-dark button-large \"]")
    public WebElement bayi;

    @FindBy(tagName = "h1")
    public WebElement bayi_baslik;

    @FindBy(xpath = "//*[@class=\"button button-3d button-large \"]")
    public WebElement demo;

    @FindBy(tagName = "h1")
    public WebElement demo_baslik;

    @FindBy(xpath = "//*[@id=\"gotoTop\"]")
    public WebElement arrow;

    @FindBy(xpath = "//div[text()=\"Tüm Sektörlere Hitap Eden Çözümler\"][1]")
    public WebElement tum_sektorler;

    @FindBy (tagName = "address")
    public WebElement address;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div/div/div[2]/div/")
    public WebElement phone;

    @FindBy(linkText = " + 90 (850) 557 7627")
    public WebElement phone_number;

    @FindBy(xpath = "//div[@class=\"col-md-6 text-center text-md-end\"]")
    public WebElement copyritghts;

    @FindBy (xpath = "//a[@href=\"/mesafeli\"]")
    public WebElement mesafeli_satis_sozlesmesi;

    @FindBy(tagName = "h1")
    public WebElement getMesafeli_satis_sozlesmesi_text;

    @FindBy (xpath = "//a[@href=\"/privacy\"]")
    public WebElement gizlilik_politikasi;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    public WebElement gizlilik_politikasi_text;

    @FindBy (xpath = "//a[@href=\"/odeme\"]")
    public WebElement odeme_ve_teslimat;

    @FindBy(tagName = "h1")
    public WebElement odeme_ve_teslimat_text;

    @FindBy(xpath = "//a[@href=\"/garanti\"]")
    public WebElement garanti;

    @FindBy(tagName = "h3")
    public WebElement garanti_text;

    @FindBy(xpath = "(//a[@href=\"/urunler\"])[3]")
    public WebElement iade_sartlari;

    @FindBy(tagName = "h1")
    public WebElement iade_sartlari_text;

    @FindBy(xpath = "(//div[@class=\"widget widget_links clearfix\"])[2]/ul/li[1]")
    public WebElement hakkimizda;

    @FindBy(tagName = "h1")
    public WebElement hakkimizda_text;

    @FindBy(xpath = "(//div[@class=\"widget widget_links clearfix\"])[2]/ul/li[2]")
    public WebElement belgelerimiz;

    @FindBy(tagName = "h1")
    public WebElement notFound;

    @FindBy(xpath = "(//div[@class=\"widget widget_links clearfix\"])[2]/ul/li[3]")
    public WebElement bayi_basvuru;

    @FindBy(tagName = "h1")
    public WebElement bayilik_basvuru_text;

    @FindBy(xpath = "(//div[@class=\"widget widget_links clearfix\"])[2]/ul/li[4]")
    public WebElement demo_basvuru;

    @FindBy(tagName = "h1")
    public WebElement demo_basvuru_text;

    @FindBy(xpath = "//a[@href=\"/urunler\"]")
    public WebElement urunler;

    @FindBy(tagName = "h1")
    public WebElement urunler_text;

    @FindBy(tagName = "h1")
    public WebElement rota_text;

    @FindBy(xpath = "//a[@href=\"/iade\"]")
    public WebElement iletisim_alt_kisim;


    @FindBy(tagName = "h3")
    public WebElement getIade_sartlari_text;



    @FindBy(xpath = "//section[@id=\"content\"]")
    public WebElement content;


    @FindBy(xpath = "//a[@href=\"/okul_servis_araclari_takip_sistemi\"]")
    public WebElement okul_servis_araclari;


    @FindBy(linkText = "Okul Servis Araçları Takip Sistemi")
    public WebElement okul_servis_araclari_text;

    @FindBy(xpath = "//a[@href=\"/kameralı_arac_takip_sistemi\"]")
    public WebElement kameralı_arac_takip_sistemi;


    @FindBy(tagName = "h1")
    public WebElement kameralı_arac_takip_sistemi_text;


    @FindBy(xpath = "//a[@href=\"/kisi_bilgilendirme_sistemi\"]")
    public WebElement kisi_bilgilendirme_sistemi;

    @FindBy(tagName = "h1")
    public WebElement kisi_bilgilendirme_sistemi_text;

    @FindBy(xpath = "//a[@href=\"/nesne_takip_sistemi\"]")
    public WebElement nesne_takip_sistemi;


    @FindBy(tagName = "h1")
    public WebElement nesne_takip_sistemi_text;
























}
