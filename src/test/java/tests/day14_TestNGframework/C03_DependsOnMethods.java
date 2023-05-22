package tests.day14_TestNGframework;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {
    /*
    DependsOnMethods öncelik sırasına karışmaz(testlerin hangi sırayla calisacagine priority ile karar veririz)
    dependsOnMethods bir test methodunun calismasini baska bir methodun calisip passed olmasına baglar.

    baglanılan method calismaz veya calisir ama failed olursa baglanan method hic calismaz

    Test nostasyonu sayesinde her test bagimsiz olarak calistirilabilir
    ANCAK bir test dependsOnMethods ile baska bir method'a baglanmis ise tek basina calismasi istendiginde önce
    bagli oldugu test methodunu calistirir,o method calisip passed olursa asil calistırmak istedigimiz
    method da calisir.

     Bu baglanti 3 veya daha fazla method arasında olursa yani calistirmak istedigimiz method baska bir methoda
     o da baska bir methoda bagliysa 3 u birden calismaz.
     "No tests were found" yazar ve hiçbir test methodu calismaz.

     2 test icin olabilir sadece bu method.






     */
    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
        Assert.assertTrue(8==8);//Failed

    }
    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise quarter");
    }
    @Test(dependsOnMethods = "youtubeTesti") // yani youtube calisip passed olmadıkca bu calismaz yani derki
    //önce git youtube u calistir ben ona göre calisicam

    public void amazonTesti(){// priority yazılmazsa o degeri olur
        //priority sırası aynı ise bu sefer harf sırasına bakar
        System.out.println("Amazon");

    }
    // eger youtube testini de wisetestine baglarsak bu sefer priorityinin önemi olmaz
}
