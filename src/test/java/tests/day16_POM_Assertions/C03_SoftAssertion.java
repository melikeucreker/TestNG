package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {
    @Test
    public void cokluAssertion(){
        int sayi=23;

        Assert.assertTrue(sayi%2==0,"sayi cift olmali"); //sayi cift mi

        Assert.assertTrue(sayi>100);//sayi 100 den büyük mü?

        Assert.assertTrue(sayi<1000);//sayi 1000 den kücük mü
        Assert.assertFalse(sayi%3==0);//sayinin 3 ile bolunemedigini test edin

     /*
     Assert islemi ilk failed oldugunda Selenium calismayi durdurur.
     ve java.lang.assertionerror: verir
     eger bir test methodu icinde birden fazla assertion varsa ilk failed olanda calisma durur
     sonraki assertionlar calismamis olur
     eger TestNG bu konuda da bize daha fazla kontol yetkisi vermiştir.
     istersek TestNG assertion failed olsa bile bizim istedigimiz ssatira kadar
     kodlarin calismaya devam etmesini saglar

     artik rapor ver dedigimizde failed olan tüm assertionları raporlar
     ve failed olan varsa calismayi durdurur.

      */




    }
    @Test
    public void softAssertiontesti(){
        /*
        Softassert classı sayesinde assertAll() methodunun calisacagi satira kadar
       failed olan olsa bile tüm assertion'lar calismaya devam eder.

       assertAll() calistiginda
       failed olan assertion'lara air raporu verir.
       ANCAK hangi satirda olduklarını vermez

       selenium hata mesajı da assertAll()'un bulundugu satiri isaret eder.

       Failed olan asssertion'ları kolaylıkla bulabilmemiz icin

         */

        int sayi=23;

        SoftAssert softAssert=new SoftAssert(); // soft assertte virgülden sonra string de yazabilirsin

        softAssert.assertTrue(sayi%2==0); //sayi cift mi

        softAssert.assertTrue(sayi>100);//sayi 100 den büyük mü?

        softAssert.assertTrue(sayi<1000);//sayi 1000 den kücük mü

        softAssert.assertFalse(sayi%3==0);//sayinin 3 ile bolunemedigini test edin


        softAssert.assertAll(); //hepsini raporla // hatanın kac assertte oldugunu söylüyor ama yerini söylemiyor



         // softAssert objesi ile assertion'lari yaptiktan sonra
        // assertAll() kullanmazsaniz, test direk PASSED olur,
       // failed olan assertion'lar raporlanmaz


    }


}
