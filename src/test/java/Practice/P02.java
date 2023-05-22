package Practice;

import Pages.SauceDemoPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Utilities.ConfigReader;
import Utilities.Driver;

public class P02 {

    /*
Navigate to https://www.saucedemo.com/
Enter the username as standard_user
Enter the password as secret_sauce
Click on login button
Test 1: Choose price low to high
Test 2:Verify item prices are sorted from low to high with soft Assert

 */
    @Test
    public void sauceDemoTest01(){
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));
        SauceDemoPage sauceDemoPage=new SauceDemoPage();
        sauceDemoPage.usernameBox.sendKeys(ConfigReader.getProperty("sauceDemoUsername")+ Keys.ENTER);
        sauceDemoPage.passwordBox.sendKeys(ConfigReader.getProperty("sauceDemoPassword")+Keys.ENTER);
        sauceDemoPage.loginBox.click();
        Select select=new Select(sauceDemoPage.dropDownlowToHighBox);
        select.selectByVisibleText("Price (low to high)");


        //ReusableMethods.bekle(3);
        //sauceDemoPage.lowToHighBox.click();
        //ReusableMethods.bekle(3);

       // Assert.assertTrue(sauceDemoPage.lowToHighBox.isEnabled());

    }

    @Test
    public void verifyTest(){

    }

}
