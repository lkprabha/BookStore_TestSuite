package PageObjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import  Utility.WebDriverHelper;

public class RegistrationPageObject {
    WebDriver driver=WebDriverHelper.getWebDriver();

    public void NavigatePageBookRegister(){
        try {
            System.out.println("InsideRegistration page object!");
            WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(1000));
            mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a")));
            WebElement bookRegiterLink = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a"));
            bookRegiterLink.click();
        }
        catch (Exception e){
            System.out.println("Page not loaded: Exception");
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
