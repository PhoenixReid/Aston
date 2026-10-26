package Data;
import java.util.Arrays;
import java.util.List;
public class IframeData {
    public static final String iframe = ".payment-widget-iframe";
    public static final String xPathSumTrue = "//*[contains(text(), '100.00 BYN')]";

    public static final String classNamePayDescriptionSum = "pay-description__cost";
    public static final String classNamePayDescription = "pay-description__text";
    public static final String classNameButtonPay = ".colored.disabled";
    public static final String classNameLogos = "img[src*='card-types'], img[src*='payment']";

    public static final List<String> resultLogosIframe = Arrays.asList("visa", "mastercard", "belkart", "maestro", "mir");

    public static final String idNumberCard = "cc-number";
    public static final String idTerm = "cc-exp";
    public static final String idCVC = "cc-csc";
    public static final String idName = "cc-name";

    public static final String textNumberCard = "Номер карты";
    public static final String textTerm = "Срок действия";
    public static final String textCVC = "CVC";
    public static final String textNameCard = "Имя и фамилия на карте";
    public static final String textSumCost = "100.00 BYN";
    public static final String textPayDescription = "Оплата: Услуги связи Номер:375297777777";
    public static final String textButtonPay = "Оплатить 100.00 BYN";
}
