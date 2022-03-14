package ieWebSurfer;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieWebSurfer extends InternetExplorerDriver {

    public InternetExplorerDriver main(String surferName) {
        InternetExplorerDriver driver = null;
        if (surferName == null) {
            System.out.println("YOU NEED TO CHOSE A WEB SURFER: CHROME, FIREFOX, IE");
        } else {
            if (surferName == "CHROME") {
                driver = new InternetExplorerDriver();
            }
        }
        return driver;
    }
}
