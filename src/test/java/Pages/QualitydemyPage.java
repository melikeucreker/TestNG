package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[@class='btn btn-sign-in-simple']")
   public WebElement ilkLoginLinki ;

    @FindBy(xpath="//input[@id='login-email']")
    public WebElement emailKutusu ;

    @FindBy(xpath ="//input[@id='login-password']")
  public WebElement passwordKutusu;

    @FindBy(xpath="(//button[@type='submit'])[2]")
    public WebElement loginButonu;

    @FindBy(xpath ="//div[@class='toast toast-success']")
    public WebElement basariliGirisElementi;



}
