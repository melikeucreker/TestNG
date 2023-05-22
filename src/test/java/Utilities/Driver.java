package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
     private static WebDriver driver;
   private Driver(){
       /*
       singleton pattern(tekli kullanım) kullanarak istenmeyen yöntemlerle driver objesine erisilmesini engelledik

       Constructor'ı private yaparak bu classtan obje olusturularak class üyelerinin
       kullanılmasının önüne geçtik

        */

    }



    public static WebDriver getDriver(){ // bana driver döndüren bir method olusturmak istedim.


       String istenenBrowser=ConfigReader.getProperty("browser"); //chrome,firefox,safari,edge
        if(driver==null){
            switch (istenenBrowser){
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "edge":
                        WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                default: WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();

            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        // eger driver null sa bunları calistir ( önceden yeni driver atanmamissa)
        //bunları calistircak ama eger null degilse önceden atanmış ve kullanılmışsa bunlar hiç çalışmayacak.


        return driver;

    }
    public static void closeDriver(){
        if(driver!=null) {
            driver.close();
            driver = null;


        }
    }
    public static void quitDriver(){
        if(driver!=null) {
            driver.quit();
            driver = null;


        }
    }
    /*
    driver'ı degistirmek istedginde browserdaki chrome u silip firefox,edge falan yazabilirsin.
     */
}
