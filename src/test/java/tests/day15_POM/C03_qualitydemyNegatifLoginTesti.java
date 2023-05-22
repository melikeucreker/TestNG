package tests.day15_POM;

import Pages.QualitydemyPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.Driver;

public class C03_qualitydemyNegatifLoginTesti {
    @Test
    public void test01() throws InterruptedException {

        // qualitydemy anasayfaya gidin

        Driver.getDriver().get("https://www.qualitydemy.com/login");

        // ilk login linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();

        // kullanici adi olarak selenium
        qualitydemyPage.emailKutusu.sendKeys("selenium");

        // password olarak heyecandir yazin
        qualitydemyPage.passwordKutusu.sendKeys("heyecandir");
        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        Thread.sleep(3000);
        qualitydemyPage.loginButonu.click();
        // giris yapilamadigini test edin

        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());


        // sayfayi kapatin
        // Driver.closeDriver();

    }
}
