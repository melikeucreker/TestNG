package tests.day15_POM;

import Pages.QualitydemyPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.Driver;

public class C02_qualitydemyLoginTest {
    @Test
    public void test01(){
        //qualitydemy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com/login");
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();



        //login linkine tıklayın
        qualitydemyPage.ilkLoginLinki.click();

        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(" anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        //login butonuna basin
        qualitydemyPage.loginButonu.click();

        //basarili olarak giris yapıldigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());

        // ve sayfayı kapatin
        Driver.closeDriver();


    }
}
