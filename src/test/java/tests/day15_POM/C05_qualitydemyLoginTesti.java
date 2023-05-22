package tests.day15_POM;

import Pages.QualitydemyPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.ConfigReader;
import Utilities.Driver;

public class C05_qualitydemyLoginTesti {
    @Test
    public void test01(){
    //qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));



    //login linkine tıklayın
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();

        qualitydemyPage.ilkLoginLinki.click();


    // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

    //login butonuna basin
        qualitydemyPage.loginButonu.click();


    //basarili olarak giris yapıldigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());


    // ve sayfayı kapatin
        Driver.closeDriver();

    }
}
