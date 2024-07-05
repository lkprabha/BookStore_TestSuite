package Runner;

import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import TestCases.BookRegisterTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureFiles"},
        plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        glue = {"StepDef"})
public class TestRunner {
        public static Object WebDriverHelper ;
        public static WebDriverHelper newHelper = new WebDriverHelper();
        public static BookRegisterTest testBookReg= new BookRegisterTest();

        // Project pre requisites
        @Before
        public static void main(String[] args) throws Throwable {
                System.out.println("Hi inside the runner!");
                PropertyFileHandler.getPropertyFileHandler();
                PropertyFileHandler.loadPropertyFile("src/test/resources/TestData/data.properties");
                Utility.WebDriverHelper.startDriver("browser","url");

                //  Test cases goes here
                //SignIn.TestCase1();
            testBookReg.TestCaseNumber1();

        }
        //Tear Down
        @After
        public void tearDownDriver(){
                try{
                    if(WebDriverHelper != null) {
                        System.out.println("Test Suit Complete!");
                        Thread.sleep(4000);
                        Utility.WebDriverHelper.closeWebDriver();  //quit the driver
                    }

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();  // Preserve the interrupt status
                    System.err.println("Thread was interrupted, Failed to complete operation");
                } catch (Exception e) {
                    System.err.println("An error occurred: " + e.getMessage());
                    e.printStackTrace();
                }
        }
}
