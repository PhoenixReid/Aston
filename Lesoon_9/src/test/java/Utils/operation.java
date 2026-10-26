package Utils;
import Data.SingUpData;
import io.github.bonigarcia.wdm.WebDriverManager;
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
        driver.get(SingUpData.baseURL);
        driver.findElement(By.xpath(SingUpData.buttonCookies)).click();
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

    public static void switchSelectForm(WebDriver driver, String select, String textSelect){
        driver.findElement(By.className(select)).click();
        waitSec(driver, 2);
        driver.findElement(By.xpath(textSelect)).click();
    }

    public static WebElement textIsDisplay(WebDriver driver, String xPath){
        WebElement sumText = driver.findElement(By.xpath(xPath));
        return sumText;
    }

    public static void textIDIsDisplay(WebDriver driver, String id){
        driver.findElement(By.id(id)).isDisplayed();
    }

    public static void textIDIsDisplayParent(WebDriver driver, String id){
        WebElement input = driver.findElement(By.cssSelector("input[autocomplete='" + id + "']"));
        input.findElement(By.xpath("./parent::*//label")).isDisplayed();
    }

    public static void textClassNameIsDisplay(WebDriver driver, String className){
        driver.findElement(By.className(className)).isDisplayed();
    }

    public static List<String> comparisonListAlt(WebDriver driver, String cssSelection){
        List<WebElement> logos = driver.findElements(By.cssSelector(cssSelection));
        List<String> allScr = new ArrayList<>();
        for (WebElement logo : logos) {
            allScr.add(logo.getAttribute("src"));
        }
        return allScr;
    }

    public static String comparisonURL(WebDriver driver, String url){
        return driver.getCurrentUrl();
    }

    public static String comparisonName(WebDriver driver, String cssSelector){
        String actualName = driver.findElement(By.cssSelector(cssSelector)).getText();
        return actualName;
    }

    public static String  getPlaceHolderClassName(WebDriver driver, String className){
        String text = driver.findElement(By.className(className)).getAttribute("placeholder");
        return text;
    }

    public static String getPlaceHolderId(WebDriver driver, String id){
        String text = driver.findElement(By.id(id)).getAttribute("placeholder");
        return text;
    }

    public static String getIdLabel(WebDriver driver, String id){
        WebElement input = driver.findElement(By.cssSelector("input[autocomplete='" + id + "']"));
        WebElement label = input.findElement(By.xpath("./parent::*//label"));
        return label.getText();
    }

    public static String getSpanClassName(WebDriver driver, String className){
        String text = driver.findElement(By.className(className)).findElement(By.tagName("span")).getText();
        return text;
    }

    public static String getSpanCssSelection(WebDriver driver, String cssSelection){
        String text = driver.findElement(By.cssSelector(cssSelection + " span")).getText();
        return text;
    }
}
