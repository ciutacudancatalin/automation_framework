package accountCreation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import usefullMethods.usefullMethods;
import webDriverSessionGenerator.webDriverSessionGenerator;

import static usefullMethods.usefullMethods.getRandomEmail;


class accountCreationSuite {

    @Test
    public static void logInVerification() throws InterruptedException{
        WebDriver driver = null;
        driver = new webDriverSessionGenerator().getSession("CHROME");
        String randomEmail = "aasdf1645@asdf.com";
        String password = "Password123@";
        String plattformUrl = "http://demo-magento2.vuestorefront.io/";

        //instantiate usefullMethods class
        usefullMethods usefullObj = new usefullMethods();

        driver.get(plattformUrl);

        usefullObj.clickSignInButton(driver);

        usefullObj.verifyUserOnCorrectUrl(driver, "http://demo-magento2.vuestorefront.io/customer/account/login/");

        usefullObj.enterEmailSignIn(driver, randomEmail);

        usefullObj.enterPasswordSignIn(driver, password);

        usefullObj.clickSignInButton2(driver);

        //verify User is on the correct page
        usefullObj.verifyUserOnCorrectUrl(driver, "/customer/account/");

        //verify User views the correct Ui element
        usefullObj.verifyUserOnCorrectPageUi(driver, "//span[@data-ui-id=\"page-title-wrapper\"]", "My Dashboard");

        driver.quit();
    }

    @Test
    private static void accountCreation() throws InterruptedException {

        //variable initiation and class instantiation
        WebDriver driver = null;
        driver = new webDriverSessionGenerator().getSession("CHROME");
        String randomEmail = getRandomEmail();
        String firstName = "ciutacu";
        String lastName = "catalin";
        String password = "Password123@";
        String plattformUrl = "http://demo-magento2.vuestorefront.io/";

        //instantiate usefullMethods class
        usefullMethods usefullObj = new usefullMethods();

        //navigate to desired url
        driver.get(plattformUrl);

        //wait for page to load
        usefullMethods.waitTimer(2);

        //click on the sign in button
        usefullObj.clickCreateAccountButton(driver);

        //verify User is on the correct page
        usefullObj.verifyUserOnCorrectUrl(driver, "http://demo-magento2.vuestorefront.io/customer/account/create/");

        //enter firstname
        usefullObj.enterFirstName(driver, firstName);

        //enter lastName
        usefullObj.enterLastName(driver, lastName);

        //enter email
        usefullObj.enterEmail(driver, randomEmail);

        //enter password
        usefullObj.enterPassword(driver, password);

        //enter confirmation password
        usefullObj.enterConfirmationPassword(driver, password);

        //enter firstname
        usefullObj.clickCreateAccount(driver);

        //verify User is on the correct page
        usefullObj.verifyUserOnCorrectUrl(driver, "/customer/account/");

        //verify User views the correct Ui element
        usefullObj.verifyUserOnCorrectPageUi(driver, "//span[@data-ui-id=\"page-title-wrapper\"]", "My Dashboard");

        //close web browser
        driver.quit();
    }
}
