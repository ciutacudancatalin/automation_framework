package usefullMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;

import java.util.Random;

public class usefullMethods {

    public static void main(String[] args) {
    }

    public static String getRandomEmail(){
        Random randGen = new Random();
        String randomEmail = "aasdf" + randGen.nextInt(10000) + "@asdf.com";
        return randomEmail;
    }

    public static void waitTimer(int waitTime) throws InterruptedException {
        //Time is in secs
        Thread.sleep(waitTime*1000);
    }

    public static void clickSignInButton(WebDriver driver) throws InterruptedException {
        driver.findElements(By.xpath("//a[text()=\"Create an Account\"]")).get(0).click();
        waitTimer(2);
    }

    public static void enterLastName(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys(name);
        waitTimer(2);
    }

    public static void enterEmail(WebDriver driver, String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"email_address\"]")).sendKeys(email);
        waitTimer(2);
    }

    public static void enterPassword(WebDriver driver, String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
        waitTimer(2);
    }

    public static void enterConfirmationPassword(WebDriver driver, String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]")).sendKeys(password);
        waitTimer(2);
    }

    public static void enterFirstName(WebDriver driver, String firstName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys(firstName);
        waitTimer(2);
    }

    public static void clickCreateAccount(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
        waitTimer(2);
    }

    public static void verifyUserOnCorrectPageUi(WebDriver driver, String xpath, String text){
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), text);
        System.out.println();
    }

    public static void verifyUserOnCorrectUrl(WebDriver driver, String url){
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }
}
