package Page;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
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

    @Step("Переход на появившийся фрэйм с ожидание в 10 секунд")
    public void switchFrame(){
        waitSec(driver,10);
        switchToFrame(driver, iframe);
    }

    @Step("Сравниваем текст суммы пополнения")
    public String textPayDescriptionCost(){
        Allure.step("Проверяем видимость текста");
        textClassNameIsDisplay(driver, classNamePayDescriptionSum);
        Allure.step("Получаем актуальный текст");
        return getSpanClassName(driver, classNamePayDescriptionSum);
    }

    @Step("Сравниваем текст описания пополнения")
    public String textPayDescription(){
        Allure.step("Проверяем видимость текста");
        textClassNameIsDisplay(driver, classNamePayDescription);
        Allure.step("Получаем актуальный текст");
        return  getSpanClassName(driver, classNamePayDescription);
    }

    @Step("Сравниваем текст кнопки пополнения")
    public String textButtonPay(){
        Allure.step("Получаем актуальный текст ");
        return  getSpanCssSelection(driver, classNameButtonPay);
    }

    @Step("Сравниваем текст поля номера карты")
    public String textNumberCard(){
        Allure.step("Проверяем видимость текста");
        textIDIsDisplayParent(driver, idNumberCard);
        Allure.step("Получаем актуальный текст");
        return getIdLabel(driver, idNumberCard);
    }
    @Step("Сравниваем текст поля срока действия карты")
    public String textTerm(){
        Allure.step("Проверяем видимость текста");
        textIDIsDisplayParent(driver, idTerm);
        Allure.step("Получаем актуальный текст");
        return getIdLabel(driver, idTerm);
    }
    @Step("Сравниваем текст поля CVC")
    public String textCVC(){
        Allure.step("Проверяем видимость текста");
        textIDIsDisplayParent(driver, idCVC);
        Allure.step("Получаем актуальный текст");
        return getIdLabel(driver, idCVC);
    }
    @Step("Сравниваем текст поля ФИО владельца карты")
    public String textNameCard(){
        Allure.step("Проверяем видимость текста");
        textIDIsDisplayParent(driver,idName);
        Allure.step("Получаем актуальный текст");
        return  getIdLabel(driver, idName);
    }
    @Step("Сравниваем логотипы платёжных систем")
    public List<String> listLogos(){
        Allure.step("Получаем актуальные логотипы платёжных систем");
        return comparisonListAlt(driver, classNameLogos);
    }

}
