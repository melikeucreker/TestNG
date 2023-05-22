package tests.day15_POM;

import Pages.AmazonPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.Driver;

public class C01_PagesIlkTest {
    @Test
    public void amazonTesti(){
        /*
        POM'de pages sayfasindaki locatelerine erismek icin pages sayfalarindan bir obje olusturulur.

         */


        //Amazon anasayfaya gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // nutella icin arama yapalım (arama kutusunun locate'i pages sayfasında)
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);




        //sonuclarin nutella icerdigini test edelim ve

      String expectedIcerik="Nutella";
      String actualIcerik=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        // sayfayi kapatalim
        Driver.closeDriver();



    }

}
