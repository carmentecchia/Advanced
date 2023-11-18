package HashSet2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> colorSet = hashSet();
        String newElement = "Blue ";

        if (colorSet.contains(newElement)) {
            System.out.println("Color " + newElement + " is in the Set");
        }
        else {
            System.out.println("Color " + newElement + "is not in the Set");
        }
    }
    public static HashSet<String> hashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Yellow");
        hashSet.add("Red");
        hashSet.add("White");
        return hashSet;
    }


}

