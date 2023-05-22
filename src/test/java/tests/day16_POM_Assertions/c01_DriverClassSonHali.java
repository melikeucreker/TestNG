package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.ConfigReader;
import Utilities.Driver;

public class c01_DriverClassSonHali {
    //3 tane test methodu olusturalim
    //1.methodda amazona gidip,url'in amazon icerdigini test edin
    @Test
    public void amazonTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();

    }

    //2.methodda WiseQuarter anasayfaya gidip,title'in wisequarter icerdigini test edin
    @Test
    public void wiseTest(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik="wisequarter";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik)
        );
        Driver.closeDriver();
    }
    //3.methodda facebook anasayfaya gidip,title'in facebook icerdigini test edin
  @Test
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        String epectedIcerik="facebook ";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(epectedIcerik));
      Driver.closeDriver();


  }
    //her methodda yeni driver olusturup,method sonunda driver'ı kapatin
}
