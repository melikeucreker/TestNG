package tests.day14_TestNGframework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {
    /*
    @Ignore notasyonu basina yazdigin testin ignore edilmesini saglar ne passed olur ne failed olur ne de calistirilir
    ignore öncelik sırasına da karışmaz

     */

    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");

    }
    @Test(priority = 3) @Ignore
    public void wiseTesti(){
        System.out.println("Wise quarter");
    }
    @Test
    public void amazonTesti(){// priority yazılmazsa o degeri olur
        //priority sırası aynı ise bu sefer harf sırasına bakar
        System.out.println("Amazon");

    }
}
