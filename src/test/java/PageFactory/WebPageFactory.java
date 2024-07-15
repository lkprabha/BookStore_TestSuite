package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Utility.WebDriverHelper;
import java.util.List;
import org.openqa.selenium.By;


public class WebPageFactory {
    public static WebPageFactory wpf= PageFactory.initElements(WebDriverHelper.getWebDriver(), WebPageFactory.class);

    public WebPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement AvailableBooksPage_clickAddBookButton(int row){
        WebElement AvailableBooksPage_selectedRow =  WebDriverHelper.getWebDriver().findElement(By.xpath("/html/body/div/table/tbody/tr["+ row+"]/td[5]/a[1]"));
        return AvailableBooksPage_selectedRow;
    }
    public WebElement AvailableBooksPage_clickDeleteButton(int row){
        WebElement AvailableBooksPage_selectedDelRow =  WebDriverHelper.getWebDriver().findElement(By.xpath("/html/body/div/table/tbody/tr["+ row+"]/td[5]/a[3]"));
        //System.out.println("Inside the Page Factory "+AvailableBooksPage_selectedDelRow.getSize());
        return AvailableBooksPage_selectedDelRow;
    }
    public WebElement AvailableBooksPage_clickEditButton(int row) {
        WebElement AvailableBooksPage_editRow= WebDriverHelper.getWebDriver().findElement(By.xpath("/html/body/div/table/tbody/tr["+row+"]/td[5]/a[2]"));
        return AvailableBooksPage_editRow;
    }



    /*
    Home Page Web Elements
    */

    @FindBy(how= How.XPATH,using ="//*[@id=\"navbarSupportedContent\"]/div/a")
    public WebElement RegistrationTabWebElement;
    @FindBy(how= How.XPATH,using ="/html/head/title")
    public WebElement HomePageTitle;
    @FindBy(how= How.XPATH, using="/html/body/nav/div/div/ul/li[2]/a")
    public WebElement HomePage_AvailableBooksTab;
    @FindBy(how= How.XPATH, using= "/html/body/nav/div/div/ul/li[3]/a")
    public WebElement HomePage_MyBooksTab;


    /*
    Registration page
    */
    @FindBy(how= How.XPATH,using ="/html/head/title")
    public WebElement RegistrationPageTitle;

    @FindBy(how= How.XPATH,using ="/html/body/div[1]/form/div[1]/input")
    public WebElement RegistrationPage_Name;

    @FindBy(how= How.XPATH,using ="/html/body/div[1]/form/div[2]/input")
    public WebElement RegistrationPage_Author;

    @FindBy(how= How.XPATH,using ="/html/body/div[1]/form/div[3]/input")
    public WebElement RegistrationPage_Price;

    @FindBy(how= How.XPATH,using ="/html/body/div[1]/form/center/button")
    public WebElement RegistrationPage_SubmitButton;


    /*
    Available Book page
    */
    @FindBy(how= How.XPATH,using ="/html/head/title")
    public WebElement AvailableBooksPage_Title;

    public WebElement AvailableBooksPage_AddToMyBook;

   // @FindBy(how = How.XPATH,using = "/html/body/div/table/tbody/tr[2]/td[5]/a[1]")
    //@FindBy(how = How.XPATH,using = "/html/body/div/table/tbody/tr[1]/td[5]/a[1]")
   @FindBy(how = How.XPATH,using = "/html/body/div/table/tbody/tr")
    public List<WebElement> AvailableBooksPage_AddToMyBook_List;

    @FindBy(how = How.XPATH,using = "/html/body/div/table/tbody/tr[input]/td[5]/a[1]")
    public WebElement AvailableBooksPage_clickAddToMyBookButton;

//    @FindBy(how=How.XPATH,using = "/html/body/div/table/tbody/tr[input]/td[5]/a[2]")
//    public WebElement AvailableBooksPage_EditButton;


    /*
    My Books page
    */
    @FindBy(how= How.XPATH,using ="/html/head/title")
    public WebElement MyBooksPage_Title;


    /*
    Edit Available Books page
     */

}
