package HashSet1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("The size of the hashSet is: " + hashSetFunc().size() + " The elements are:");
        Iterator<String> it = hashSetFunc().iterator();
        while(it.hasNext()){
            String element = it.next();
            System.out.println("Elements:" + element);
        }
    }
    public static Set hashSetFunc(){
        Set <String> colors = new HashSet<String>(Arrays.asList("Green","Blue","Yellow"));
        return colors;
    }
}
