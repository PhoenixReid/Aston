import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static Data.TestData.*;
import static Utils.operation.*;

public class mtsByTest {
    WebDriver driver;

    @BeforeEach
    public void singUp(){
        driver = createDriver();
        setupDriver(driver);
    }

    @AfterEach
    public void close(){
        driver.quit();
    }

    @Test
    public void linkTest(){
        clickTextLink(driver,linkText);
        comparisonURL(driver, linkUrl);
    }

    @Test
    public void replenishmentTest(){
        sendTextClassName(driver, classNamePhone, testPhone);
        sendTextId(driver, classNameSum, sumReplenishment);
        clickXPath(driver, buttonReplenishment);
        waitSec(driver,10);
        switchToFrame(driver, iframe);
        textIsDisplay(driver, xPathSumTrue);
    }

    @Test
    public void bankIconTest(){
        comparisonListAlt(driver, resultLogos, logosCssSelection);
    }

    @Test
    public void nameFormTest(){
        comparisonName(driver, nameForm, nameCssSelection);
    }
}
