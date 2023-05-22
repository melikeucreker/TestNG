package Practice;

import org.testng.annotations.Test;
import Utilities.ConfigReader;
import Utilities.Driver;

public class P01 {
    /*
     - Birbirine bağımlı testler oluşturun.
        - beforeClass oluşturup setUp ayarlarini yapin.
        - Birbirine bağımlı testler oluşturarak
        - ilk once wisequarte'a gidin
        - sonra wisequarte'a bağımlı olarak youtube'a gidin
        - daha sonra youtube'a bağımlı olarak amazon' a gidin
        - driver'i kapatın.
     */

// iver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   // }

    @Test(priority =1)
   public void wiseQuarterTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));

    }


    @Test(dependsOnMethods ="wiseQuarterTesti")
    public void youtubetesti(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

    }
    @Test(dependsOnMethods ="youtubetesti" )
    public void amazontesti(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        Driver.closeDriver();

    }




}
