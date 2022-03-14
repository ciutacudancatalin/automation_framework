package firefoxWebSurfer;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxWebSurfer extends FirefoxDriver {

    public static FirefoxDriver getFirefoxDriver(String surferName) {
        if (surferName == null) {
            System.out.println("YOU NEED TO CHOSE A WEB SURFER: CHROME, FIREFOX OR IE");
            return null;
        } else {
            if (surferName == "FIREFOX") {
                FirefoxDriver driver = new FirefoxDriver();
                return driver;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        firefoxWebSurfer obj = new firefoxWebSurfer();
    }

}