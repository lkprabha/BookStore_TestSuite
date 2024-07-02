package ClassFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class WebDriverFactory {

    public static WebDriver createFirefoxDriver() {
        // Set the path to the geckodriver executable
        System.setProperty("webdriver.geko.driver",
                "src/test/resources/GekoDriver/gekodriver.exe");
        // Set Firefox options if needed
        FirefoxOptions options = new FirefoxOptions();
        // Example: options.addArguments("--headless"); // Run in headless mode
        // Initialize the Firefox WebDriver with options
        WebDriver driver = new FirefoxDriver(options);
        System.out.println("Web driver object created");

        // Configure the WebDriver (optional)
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}

