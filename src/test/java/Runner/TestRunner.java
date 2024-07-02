package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureFiles"},
        plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        glue = {"StepDef"})
public class TestRunner {

  //  public static WebDriver mydriver= new FirefoxDriver();
   //public static void main(String[] args){

     //  System.setProperty("webdriver.geko.driver","src/test/resources/GekoDriver/gekodriver.exe");
     //  mydriver.get("http://localhost:1001/");

   // }


}
