package tests.day16_POM_Assertions;

import org.testng.annotations.Test;

public class C02_SingletonPattern {
    @Test
    public void test01(){
     /*
     biz otomasyon icin elimiz ve kolumuz olarak driver clasindaki webdriver objesini kullanıyoruz
     ANCAK driveriın bizim istedgmiz işlemleri yapabilmesi için öncelikle
     getdriver() methodu içinde yaptığımız atama işlemlerine ihtiyacı var

     Bir framework de calisan kisilerin getDriver()methodunu kullanmadan direk driver objesine erisimini engellemek icin
     singleton pattern kullanımı tercih edilmiştir.

     singleton pattern bir class dan obje olusuturulmasını ve o obje ile class'daki class üylerine erisimi
     engellemek icin kullanilir.

     oop konsept cercevesibde driver classini farklı farklı yöntemlerle kullanabilirsiniz
     bunun icin ekip calismasinin tek düzen üzerinden gitmesi önemli oldugundan
     farklı yöntemlerle webdriver driver kullanımını engllemek istiyoruz.

      */


        //Driver.driver.get(ConfigReader.getProperty("amazonurl"));
        // getdriver() calismadigindan driver null olarak isaretlendiginden
        //NullPonterException firlatir.

        //Driver driver=new Driver();
        //driver.get()

        //driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Driver classindaki constructor'ı private yapınca kimse driver classindan obje olusturamaz.







    }




}
