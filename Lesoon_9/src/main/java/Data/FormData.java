package Data;
import java.util.Arrays;
import java.util.List;
public class FormData {
    public static final String classNamePhone = "phone";
    public static final String testPhone = "297777777";
    public static final String sumReplenishment = "100";

    public static final String idSum = "connection-sum";
    public static final String idInternetSum = "internet-sum";
    public static final String idInstalmentSum = "instalment-sum";
    public static final String idArrearsSum = "arrears-sum";

    public static final String idInternetPhone = "internet-phone";

    public static final String idEmail = "connection-email";
    public static final String idHomeInternetEmail = "connection-email";
    public static final String idInstallmentEmail = "connection-email";
    public static final String IdArrearsEmail = "arrears-email";

    public static final String idInstalmentScore = "score-instalment";
    public static final String idArrearsScore = "score-arrears";

    public static final String buttonReplenishment ="//button[text()='Продолжить']";

    public static final  String logosCssSelection = ".pay__partners img";
    public static final List<String> resultLogos = Arrays.asList("visa", "visa-verified", "mastercard", "mastercard-secure", "belkart");

    public static final String nameForm = "ОНЛАЙН ПОПОЛНЕНИЕ\n" +
            "БЕЗ КОМИССИИ";
    public static final String nameCssSelection =".pay__wrapper h2";

    public static final String phoneText = "Номер телефона";
    public static final String internetPhoneText = "Номер абонента";

    public static final String sumText = "Сумма";

    public static final String emailText = "E-mail для отправки чека";

    public static final String scoreInstalmentText = "Номер счета на 44";
    public static final String scoreArrearsText = "Номер счета на 2073";

    public static final String selectHeader = "select__header";
    public static final String homeInternet = "//p[contains(text(), 'Домашний интернет')]";
    public static final String installmentPlan = "//p[contains(text(), 'Рассрочка')]";
    public static final String arrears = "//p[contains(text(), 'Задолженность')]";
}
