package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class AmazonPage {


    // page class'ları sürekli kullandigimiz locate islemleri ve varsa login gibi kucuk islevleri iceren
    // methodlar barındırır.

    //selenium ile locate islemi veya herhangi bir islev gerceklestirmek istedigimizde webdriver objesine ihtiyac vardır
    //Pom'de Driver classında olusturdugumuz Webdriver driver objesini page classlarına tanımlamak icin
    //pageFactory classından initElements() kullanılır.

   public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        /*
        bu ayarı constructor icine koyma sebebimiz page sayfalarina obje olusturularak ulasildigi icin kim
        page sayfasini kullanmak isterse page sayfasindan obje olusturmak icin,constructor calisacak
        ve bu constructor'in icinde bulununan initElements()  gerekli ayari yapmiş olacak
         */
    }
    @FindBy(id="twotabsearchtextbox")
   public WebElement aramaKutusu;

   @FindBy(xpath="(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;







}
