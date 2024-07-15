package PageObjects;

import PageFactory.WebPageFactory;
import Utility.WebDriverHelper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class HomePageObject {
    WebDriver driver=WebDriverHelper.getWebDriver();

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
    public void NavigateTo_AvailableBooksPage(){
        WebPageFactory.wpf.HomePage_AvailableBooksTab.click();
    }
    public void NavigateTo_MyBooksPage(){
        WebPageFactory.wpf.HomePage_MyBooksTab.click();
    }
    public void NavigateTo_NewBookRegisterPage(){
        WebPageFactory.wpf.RegistrationTabWebElement.click();
    }

}
