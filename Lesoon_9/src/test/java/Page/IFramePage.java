package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static Data.IframeData.*;
import static Utils.operation.*;

public class IFramePage {
    private final WebDriver driver;
    public IFramePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement textIdDisplay(){
        return textIsDisplay(driver, xPathSumTrue);
    }

    public void switchFrame(){
        waitSec(driver,10);
        switchToFrame(driver, iframe);
    }

    public String textPayDescriptionCost(){
        textClassNameIsDisplay(driver, classNamePayDescriptionSum);
        return getSpanClassName(driver, classNamePayDescriptionSum);
    }

    public String textPayDescription(){
        textClassNameIsDisplay(driver, classNamePayDescription);
        return  getSpanClassName(driver, classNamePayDescription);
    }

    public String textButtonPay(){
        return  getSpanCssSelection(driver, classNameButtonPay);
    }

    public String textNumberCard(){
        textIDIsDisplayParent(driver, idNumberCard);
        return getIdLabel(driver, idNumberCard);
    }

    public String textTerm(){
        textIDIsDisplayParent(driver, idTerm);
        return getIdLabel(driver, idTerm);
    }

    public String textCVC(){
        textIDIsDisplayParent(driver, idCVC);
        return getIdLabel(driver, idCVC);
    }

    public String textNameCard(){
        textIDIsDisplayParent(driver,idName);
        return  getIdLabel(driver, idName);
    }

    public List<String> listLogos(){
        return comparisonListAlt(driver, classNameLogos);
    }

}
