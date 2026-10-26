package Page;
import org.openqa.selenium.WebDriver;
import java.util.List;
import static Data.FormData.*;
import static Utils.operation.*;
public class FormPaymentPage {
    private final WebDriver driver;

    public FormPaymentPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillAndSubmit(){
        sendTextClassName(driver, classNamePhone, testPhone);
        sendTextId(driver, idSum, sumReplenishment);
        clickXPath(driver, buttonReplenishment);
    }

    public List<String> listLogos(){
       return comparisonListAlt(driver, logosCssSelection);
    }

    public String  comparisonNameForm(){
        return  comparisonName(driver, nameCssSelection);
    }

    public String textPhoneCommunicationServices(){
        return getPlaceHolderClassName(driver, classNamePhone);
    }

    public String textSumCommunicationServices(){
        textIDIsDisplay(driver, idSum);
        return getPlaceHolderId(driver, idSum);
    }

    public String textEmailCommunicationServices(){
        textIDIsDisplay(driver, idEmail);
        return getPlaceHolderId(driver, idEmail);
    }

    public void switchHomeInternet(){
        switchSelectForm(driver, selectHeader, homeInternet);
    }

    public String textPhoneHomeInternet(){
        textIDIsDisplay(driver, idInternetPhone);
        return getPlaceHolderId(driver, idInternetPhone);
    }

    public String textSumHomeInternet(){
        textIDIsDisplay(driver, idInternetSum);
        return getPlaceHolderId(driver, idInternetSum);
    }

    public String textEmailHomeInternet(){
        textIDIsDisplay(driver, idHomeInternetEmail);
        return getPlaceHolderId(driver, idHomeInternetEmail);
    }

    public void switchInstallmentPlan(){
        switchSelectForm(driver, selectHeader, installmentPlan);
    }

    public String textInstalmentScore(){
        textIDIsDisplay(driver, idInternetPhone);
        return getPlaceHolderId(driver, idInstalmentScore);
    }

    public String textInstalmentSum(){
        textIDIsDisplay(driver, idInternetPhone);
        return getPlaceHolderId(driver, idInstalmentSum);
    }

    public String textInstalmentEmail(){
        textIDIsDisplay(driver, idInternetPhone);
        return getPlaceHolderId(driver, idInstallmentEmail);
    }

    public void switchArrears(){
        switchSelectForm(driver, selectHeader, arrears);
    }

    public String textArrearsScore(){
        textIDIsDisplay(driver, idArrearsScore);
        return getPlaceHolderId(driver,idArrearsScore);
    }

    public String textArrearsSum(){
        textIDIsDisplay(driver, idArrearsSum);
        return getPlaceHolderId(driver, idArrearsSum);
    }

    public String textArrearsEmail(){
        textIDIsDisplay(driver, IdArrearsEmail);
        return  getPlaceHolderId(driver, IdArrearsEmail);
    }
}
