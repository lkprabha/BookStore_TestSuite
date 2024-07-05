package ClassFiles;

import Utility.WebDriverHelper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckPageProperties {
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
}
