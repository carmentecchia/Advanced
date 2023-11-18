package HashSet3;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static HashSet<String> makingHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Yellow");
        hashSet.add("Red");
        hashSet.add("White");
        return hashSet;
    }
    public static void main(String[] args) {
        HashSet<String> myHashSet = makingHashSet();
        String newElement = "White";

        Iterator<String> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals(newElement)) {
                iterator.remove();
            }
        }

        myHashSet.clear();

        if (myHashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is full");
        }
    }
}
