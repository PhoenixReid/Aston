package Task2;

public class main {
    public static void main(String[] args){
        PhoneList phoneList = new PhoneList();
        phoneList.add("Иванов", "653464536345");
        phoneList.add("Иванов", "532452345243");
        phoneList.add("Иванов", "435345345435");
        System.out.println(phoneList.get("Иванов"));
        phoneList.add("Бобров", "7487685768567");
        System.out.println(phoneList.get("Бобров"));
    }
}
