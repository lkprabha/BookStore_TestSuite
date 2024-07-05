package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverHelper {

    static WebDriver driver;

    public static void startDriver(String browserName, String url) {

        String browser = PropertyFileHandler.readProperty(browserName);
        String targetUrl = PropertyFileHandler.readProperty(url);

        System.out.println("Inside the startup driver Browser: "+ browser);
        System.out.println("Inside the startup driver Browser: "+ targetUrl);

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("geckodriver")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options =new FirefoxOptions();
            options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox"); // Path to Firefox binary
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PropertyFileHandler.readProperty(url));
    }

    public static WebDriver getWebDriver(){
        return driver;
    }

    public static void closeWebDriver(){
        if (driver != null) {
            driver.quit();
        }
    }

    public static String getUrl() throws InterruptedException {
        Thread.sleep(4000);
        return driver.getCurrentUrl();
    }
}