package PageObjects;

import ClassFiles.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HomePageObject {
    public static WebDriver driver = WebDriverFactory.createFirefoxDriver();
    public void GotoHome(){
        try{
            // Navigate to a web page
            driver.get ("http://localhost:1001/");
            //System.out.println("Page title is: " + driver.getTitle());
         }
        catch(Exception e){
            System.out.println("Page not loaded: Exception");
            driver.quit();
            throw(e);
        }
    }

    public void NavigatePageBookRegister(){
        try {
            WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(1000));
            mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a")));
            WebElement bookRegiterLink = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a"));
            bookRegiterLink.click();
        }
        catch (Exception e){
            System.out.println("Page not loaded: Exception");
            driver.quit();
            throw(e);
        }

    }
    public void CheckTitle(String title){
        try{
            String gotTitle= driver.getTitle();
            Assert.assertEquals(title,driver.getTitle());
        }
        catch(Exception e){
            System.out.println("Page not loaded: Exception");
            driver.quit();
            throw(e);
        }
    }
}
