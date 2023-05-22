package tests.day14_TestNGframework;

import org.testng.annotations.Test;

public class C01_Priority {
    /*
    JUNİT framework de testlerin calisma sırası öngörülemez ve düzenlenemez.
    TestNG testleri harf sırasına göre calistirir.
    ayrıca priority degeri girerek testleri istedigimix dıra ile calistirabiliriz.
    priortiy sayısal olarak kucukten büyüğe doğru testleri calistirir.

    ger priority degeri aynı olan birden fazla test varsa, yine harf sırasına bakar.

*/


    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");

    }
    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise quarter");
    }
    @Test
    public void amazonTesti(){// priority yazılmazsa o degeri olur
        //priority sırası aynı ise bu sefer harf sırasına bakar
        System.out.println("Amazon");

    }
}
