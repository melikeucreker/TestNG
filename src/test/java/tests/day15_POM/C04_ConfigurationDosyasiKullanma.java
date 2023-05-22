package tests.day15_POM;

import Pages.AmazonPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.ConfigReader;
import Utilities.Driver;

public class C04_ConfigurationDosyasiKullanma {
    /*
    pomde hedef test classinda manuel olarak hic bir test datası girmemektedir.

    test datalar:
    1) kullanacagimiz WebDriver:Driver class'indan dinamik olarak kullanıyoruz
    2)Locate:lcoate'leri pages sayfalarından dinamik olarak kullanıyoruz.
    3)kullanilan url,aranan kelime,expected icerik,dogry kullanici adi,yanlis kullanici adi,yanlis sifre... gibi datalar.
     */
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacaKelime")+ Keys.ENTER);

        String expectedIcerik=ConfigReader.getProperty("amazonExpectedIcerik");
        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));


        Driver.closeDriver();






    }
}
