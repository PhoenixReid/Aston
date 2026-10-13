package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneList {
    HashMap<String, List<String>> phoneList = new HashMap<>();

    public PhoneList(){

    }

    public void add(String surname, String phone){
        if(phoneList.containsKey(surname) == true){
            phoneList.get(surname).add(phone);
        }else {
            List<String> nubmerList = new ArrayList<>();
            phoneList.put(surname, nubmerList);
            phoneList.get(surname).add(phone);
        }

    }

    public List<String> get(String surname){
       return phoneList.get(surname);
    }
}
