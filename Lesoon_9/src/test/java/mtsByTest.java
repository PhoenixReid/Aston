import Data.FormData;
import Data.IframeData;
import Data.LinkData;
import Page.FormPaymentPage;
import Page.IFramePage;
import Page.LinkPage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.List;

import static Utils.operation.*;

public class mtsByTest {
    WebDriver driver;
    LinkPage link;
    FormPaymentPage form;
    IFramePage iframe;

    @BeforeEach
    public void singUp(){
        driver = createDriver();
        setupDriver(driver);
        link = new LinkPage(driver);
        form = new FormPaymentPage(driver);
        iframe = new IFramePage(driver);
    }

    @AfterEach
    public void close(){
        driver.quit();
    }

    @Test
    public void linkTest(){
        link.clickingTheLink();
        String url = link.urlLink();
        Assertions.assertEquals(url, LinkData.linkUrl);
    }

    @Test
    public void replenishmentTest(){
        form.fillAndSubmit();
        iframe.switchFrame();
        WebElement sumText = iframe.textIdDisplay();
        Assertions.assertTrue(sumText.isDisplayed());
    }

    @Test
    public void bankIconTest(){
        List<String> allScr = form.listLogos();
        for (String keyword : FormData.resultLogos) {
            Assertions.assertTrue(allScr.toString().contains(keyword.toLowerCase()));
        }
    }

    @Test
    public void nameFormTest(){
        String actualName = form.comparisonNameForm();
        Assertions.assertEquals(FormData.nameForm, actualName);
    }

    @Test
    public void communicationServicesTest(){
        Assertions.assertEquals(FormData.phoneText, form.textPhoneCommunicationServices());
        Assertions.assertEquals(FormData.sumText, form.textSumCommunicationServices());
        Assertions.assertEquals(FormData.emailText, form.textEmailCommunicationServices());
    }

    @Test
    public void homeInternetTest(){
        form.switchHomeInternet();
        Assertions.assertEquals(FormData.internetPhoneText, form.textPhoneHomeInternet());
        Assertions.assertEquals(FormData.sumText, form.textSumHomeInternet());
        Assertions.assertEquals(FormData.emailText, form.textEmailHomeInternet());
    }

    @Test
    public void instalmentTest(){
        form.switchInstallmentPlan();
        Assertions.assertEquals(FormData.scoreInstalmentText, form.textInstalmentScore());
        Assertions.assertEquals(FormData.sumText, form.textInstalmentSum());
        Assertions.assertEquals(FormData.emailText, form.textInstalmentEmail());
    }

    @Test
    public void arrearsTest(){
        form.switchArrears();
        Assertions.assertEquals(FormData.scoreArrearsText, form.textArrearsScore());
        Assertions.assertEquals(FormData.sumText, form.textArrearsSum());
        Assertions.assertEquals(FormData.emailText, form.textArrearsEmail());
    }

    @Test
    public void IframeTextTest(){
        form.fillAndSubmit();
        iframe.switchFrame();
        Assertions.assertEquals(IframeData.textSumCost, iframe.textPayDescriptionCost());
        Assertions.assertEquals(IframeData.textPayDescription, iframe.textPayDescription());
        Assertions.assertEquals(IframeData.textButtonPay, iframe.textButtonPay());

        Assertions.assertEquals(IframeData.textNameCard, iframe.textNameCard());
        Assertions.assertEquals(IframeData.textCVC, iframe.textCVC());
        Assertions.assertEquals(IframeData.textTerm, iframe.textTerm());
        Assertions.assertEquals(IframeData.textNumberCard, iframe.textNumberCard());

        List<String> allScr = iframe.listLogos();
        for (String keyword : IframeData.resultLogosIframe) {
            Assertions.assertTrue(allScr.toString().contains(keyword.toLowerCase()));
        }
    }
}
