package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class SauceDemoPage {
   public SauceDemoPage(){
       PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement usernameBox;
   @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
   @FindBy(xpath="//input[@id='login-button']")
    public WebElement loginBox;

   @FindBy(className = "product_sort_container")
    public WebElement dropDownlowToHighBox;

}
