package PageObjects;
import org.openqa.selenium.WebDriver;
import  Utility.WebDriverHelper;
import PageFactory.WebPageFactory;

public class RegistrationPageObject {

    WebDriver driver = WebDriverHelper.getWebDriver();

    public void NavigatePageBookRegister(){
        try {
                WebPageFactory.wpf.RegistrationTabWebElement.click();
         }
        catch (Exception e){
            System.out.println("Page not loaded: Exception");
            throw(e);
        }

    }
    public void CheckTitle(String title_HomePage){
        try{
            WebPageFactory.wpf.HomePageTitle.getText();
        }
        catch(Exception e){
            System.out.println("Page not loaded: Exception");
            throw(e);
        }
    }


    public void EnterBook(String bookName){
        try {
         //   System.out.println("**** Registration Page Object Parameter :"+ bookName);
            WebPageFactory.wpf.RegistrationPage_Name.sendKeys(bookName);
       }
        catch(Exception e){
            System.out.println("Book Name Not Loaded  Exception");
        }
    }

    public void EnterAuthorName(String author){
        WebPageFactory.wpf.RegistrationPage_Author.sendKeys(author);
    }
    public void EnterPrice(String price){
        WebPageFactory.wpf.RegistrationPage_Price.sendKeys(price);
    }
    public void PressSubmitButton()throws InterruptedException{
       WebPageFactory.wpf.RegistrationPage_SubmitButton.click();
       Thread.sleep(3000);
       WebPageFactory.wpf.AvailableBooksPage_Title.getText();
    }
}
