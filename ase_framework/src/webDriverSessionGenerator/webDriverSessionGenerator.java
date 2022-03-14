package webDriverSessionGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverSessionGenerator {

    public static WebDriver main(String browser) {
        return getSession(browser);
    }

    public static WebDriver getSession(String browser){
        //instantiate driver with null by default
        WebDriver driver = null;
        if (browser == "CHROME") {
            driver = new ChromeDriver();
//            System.out.println(System.getProperty("os.name"));
            if (System.getProperty("os.name").toLowerCase().contains("mac") == false)
            {
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            }
        }
//        if (browser == "FIREFOX") {
//            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
//        if (browser == "IEXPLORER") {
//            System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
//            DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
//            cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//            driver = new InternetExplorerDriver();
//        }
        driver.manage().window().maximize();
        return driver;
    }
}
