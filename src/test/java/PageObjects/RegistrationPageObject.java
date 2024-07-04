package PageObjects;

import ClassFiles.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static PageObjects.HomePageObject.driver;

public class RegistrationPageObject {
    public static HomePageObject homepage= new HomePageObject();

    public void CheckTitle(String title){
              homepage.CheckTitle(title);
    }

    public void EnterBook(String name){
        try {
            WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(200));
            mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/form/div[1]/input")));
            driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).sendKeys(name);
        }
        catch(Exception e){
            System.out.println("Page Not Loaded  Exception");
            driver.quit();
        }
    }

    public void EnterAuthorName(String author){
        driver.findElement(By.xpath("/html/body/div[1]/form/div[2]/input")).sendKeys(author);
    }
    public void EnterPrice(String price){
        driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/input")).sendKeys(price);
    }
    public void PressSubmitButton(){
        driver.findElement(By.xpath("/html/body/div[1]/form/center/button")).click();
    }


}
