package Page;
import org.openqa.selenium.WebDriver;

import static Utils.operation.clickTextLink;
import static Utils.operation.comparisonURL;
import static Data.LinkData.*;
public class LinkPage {
    private final WebDriver driver;
    public LinkPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickingTheLink(){
        clickTextLink(driver,linkText);
    }

     public String urlLink(){
         return comparisonURL(driver, linkUrl);
     }
}
