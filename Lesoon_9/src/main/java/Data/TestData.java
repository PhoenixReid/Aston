package Data;

import java.util.Arrays;
import java.util.List;

public class TestData {
    public static final String baseURL = "https://www.mts.by/";

   public static final String classNamePhone = "phone";
   public static final String testPhone = "297777777";
   public static final String classNameSum = "connection-sum";
   public static final String sumReplenishment = "100";

   public static final String buttonReplenishment ="//button[text()='Продолжить']";
   public static final String iframe = ".payment-widget-iframe";
   public static final String xPathSumTrue = "//*[contains(text(), '100.00 BYN')]";
   public static final String buttonCookies = "//button[text()='Принять']";

   public static final String linkText = "Подробнее о сервисе";
   public static final String linkUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

   public static final  String logosCssSelection = ".pay__partners img";
   public static final List<String> resultLogos = Arrays.asList("Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт");

   public static final String nameForm = "ОНЛАЙН ПОПОЛНЕНИЕ\n" +
           "БЕЗ КОМИССИИ";
   public static final String nameCssSelection =".pay__wrapper h2";
}
