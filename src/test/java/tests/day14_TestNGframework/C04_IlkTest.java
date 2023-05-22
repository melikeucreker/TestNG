package tests.day14_TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.Driver;
import Utilities.ReusableMethods;

public class C04_IlkTest {
    /*
    POM'de(page object model) driver olusturmak icin
    inheritance ile kullandigimiz test base class'ı yerine
    static yollarla ulasabilecegimiz bir method kullanılması tercich edilmistir.

    driver bizim icin cok önemli oldugundan driver icin bagımsiz bir class olusturacagiz.




     */
    @Test
    public void test01(){
        //amazon ana sayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");



        // nutella icin arama yapın
        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // arama sonuclarının nutella kelimesi icerdigini test edin.

       WebElement sonucElementi=Driver.getDriver().findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedSonuc="Nutella";
        String actualSonuc=sonucElementi.getText();
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));
        ReusableMethods.bekle(5);


        Driver.closeDriver(); // driver classından closedriver methodunu kullandım




    }
}
