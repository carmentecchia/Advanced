package HashMap2;

import HashMap1.Phones;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap1.Phones phone1 = new HashMap1.Phones("iPhone", 2023);
        HashMap1.Phones phone2 = new HashMap1.Phones("Samsung", 2022);
        HashMap1.Phones phone3 = new HashMap1.Phones("Huawei", 2021);

        Map<String, Phones> Phone = new HashMap<>();
        Phone.put("iPhone", phone1);
        Phone.put("Samsung", phone2);
        Phone.put("Huawei", phone3);


        List<Phones> values = new ArrayList<>(Phone.values());
        values.sort(Comparator.comparing(Phones::getYear));
        System.out.println("Values of Phone: " + values);
    }
}
