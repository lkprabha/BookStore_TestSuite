package ClassFiles;

import org.openqa.selenium.WebDriver;

public class AllPageNavigator {
    public static WebDriver driver = WebDriverFactory.createFirefoxDriver();

    public void GotoHomePage(){
        try{
            // Navigate to a web page
            driver.get ("http://localhost:1001/");
        }
        catch(Exception e){
            System.out.println("Page not loaded: Exception");
            driver.quit();
            throw(e);
        }
    }

}
