package Utils;

import Data.TestData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class operation {

    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static void setupDriver(WebDriver driver) {
        driver.get(TestData.baseURL);
        driver.findElement(By.xpath(TestData.buttonCookies)).click();
    }

    public static void clickXPath(WebDriver driver, String xPath){
        driver.findElement(By.xpath(xPath)).click();
    }

    public static void clickTextLink(WebDriver driver, String textLink){
        driver.findElement(By.linkText(textLink)).click();
    }

    public static void sendTextClassName(WebDriver driver, String className, String sendKeysText){
        driver.findElement(By.className(className)).click();
        driver.findElement(By.className(className)).sendKeys(sendKeysText);
    }
    public static void sendTextId(WebDriver driver, String id, String sendKeysText){
        driver.findElement(By.id(id)).click();
        driver.findElement(By.id(id)).sendKeys(sendKeysText);
    }

    public static void waitSec(WebDriver driver, int time){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static void switchToFrame(WebDriver driver,String iframe ){
        driver.switchTo().frame(driver.findElement(By.cssSelector(iframe)));
    }

    public static void textIsDisplay(WebDriver driver, String xPath){
        WebElement sumText = driver.findElement(By.xpath(xPath));
        Assertions.assertTrue(sumText.isDisplayed());
    }

    public static void comparisonListAlt(WebDriver driver, List<String> result, String cssSelection){
        List<WebElement> logos = driver.findElements(By.cssSelector(cssSelection));
        List<String> altTexts = new ArrayList<>();
        for (WebElement logo : logos) {
            altTexts.add(logo.getAttribute("alt"));
        }
        Assertions.assertEquals(result, altTexts);
    }

    public static void comparisonURL(WebDriver driver, String url){
        Assertions.assertEquals( url, driver.getCurrentUrl());
    }

    public static void comparisonName(WebDriver driver, String expectedName, String cssSelector){
        WebElement actualName = driver.findElement(By.cssSelector(cssSelector));
        Assertions.assertEquals(expectedName, actualName.getText());
    }

}
