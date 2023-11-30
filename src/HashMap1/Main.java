package HashMap1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {

        Phones phone1 = new Phones("iPhone", 2023);
        Phones phone2 = new Phones("Samsung", 2022);
        Phones phone3 = new Phones("Huawei", 2021);

        Map<String, Phones> Phone = new HashMap<>();
        Phone.put("iPhone", phone1);
        Phone.put("Samsung", phone2);
        Phone.put("Huawei", phone3);
        System.out.println("Phones:" + Phone);

        Map<String, Phones> Phones2 = Map.of("iPhone", phone1, "Samsung", phone2, "Huawei", phone3);
        System.out.println("Phones2" + Phones2);

        Map<String, Phones> Phones3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("iPhone", phone1),
                new AbstractMap.SimpleEntry<>("Samsung", phone2),
                new AbstractMap.SimpleEntry<>("Huawei", phone3)
        );
        System.out.println("Phones3:" + Phones3);

    }
}