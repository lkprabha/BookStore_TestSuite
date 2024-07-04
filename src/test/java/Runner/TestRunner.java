package Runner;

import ClassFiles.AllPageNavigator;
import ClassFiles.WebDriverFactory;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureFiles"},
        plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        glue = {"StepDef"})
public class TestRunner {
        public static Object WebDriverFactory ;
        public static WebDriverFactory newHelper = new WebDriverFactory();
        public static AllPageNavigator newHomePage= new AllPageNavigator();

        public static void main(String[] args) throws InterruptedIOException, FileNotFoundException, IOException {
                PropertyFileHandler.getPropertyFileHandler();
                PropertyFileHandler.loadPropertyFile("src/test/resources/TestData/data.properties");
                WebDriverHelper.startDriver("browser","url");

                //  Test cases goes here

                //SignIn.TestCase1();


        }


}
