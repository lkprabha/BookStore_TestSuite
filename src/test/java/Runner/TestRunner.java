package Runner;
import TestCases.AvailableBooksEditTest;
import Utility.PropertyFileHandler;
import org.openqa.selenium.WebDriver;
import TestCases.BookRegisterTest;
import TestCases.AddToMyBooksTest;
import TestCases.AvailableBookDeleteTest;


public class TestRunner {
    // Project pre requisites
           public static void main(String[] args) throws Throwable {

               PropertyFileHandler.getPropertyFileHandler();
               PropertyFileHandler.loadPropertyFile("src/test/resources/TestData/data.properties");
               Utility.WebDriverHelper.startDriver("browser","url");
               WebDriver driver= Utility.WebDriverHelper.getWebDriver();

              //Run TEst cases
               //BookRegisterTest.TestCaseNumber1();
             //  AddToMyBooksTest.TestCaseNumber2();
             //  AvailableBookDeleteTest.TestCaseNumber3();
               AvailableBooksEditTest.TestCaseNumber4();

        }
        //Tear Down
        public void tearDownDriver() throws InterruptedException {
            System.out.println("Test Suit Complete!");
            Thread.sleep(4000);
        }
}
