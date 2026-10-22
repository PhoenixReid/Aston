import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mtsByTest {
    WebDriver driver;


    @BeforeEach
    public void singUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[text()='Принять']")).click();
    }

    @AfterEach
    public void close(){
        driver.quit();
    }

    @Test
    public void linkTest(){
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        Assertions.assertEquals( "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl());
    }

    @Test
    public void replenishmentTest(){
        driver.findElement(By.className("phone")).click();
        driver.findElement(By.className("phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).click();
        driver.findElement(By.id("connection-sum")).sendKeys("100");
        driver.findElement(By.xpath("//button[text()='Продолжить']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(driver.findElement(By.cssSelector(".payment-widget-iframe")));
        WebElement sumText = driver.findElement(By.xpath("//*[contains(text(), '100.00 BYN')]"));
        Assertions.assertTrue(sumText.isDisplayed());
    }

    @Test
    public void bankIconTest(){
        List<String> resultLogos = Arrays.asList("Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт");
        driver.findElement(By.className("pay__partners"));
        List<WebElement> logos = driver.findElements(By.cssSelector(".pay__partners img"));
        List<String> altTexts = new ArrayList<>();
        for (WebElement logo : logos) {
            altTexts.add(logo.getAttribute("alt"));
        }
        Assertions.assertEquals(resultLogos, altTexts);
    }

    @Test
    public void nameFormTest(){
        String expectedName = "ОНЛАЙН ПОПОЛНЕНИЕ\n" +
                "БЕЗ КОМИССИИ";
        WebElement actualName = driver.findElement(By.cssSelector(".pay__wrapper h2"));
        Assertions.assertEquals(expectedName, actualName.getText());

    }

}
