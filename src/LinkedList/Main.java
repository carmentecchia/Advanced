package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    LinkedList<Fruit> fruitList = new LinkedList<>();
    fruitList.add(new Fruit("Apple"));
    fruitList.add(new Fruit("Banana"));
    fruitList.add(new Fruit("Orange"));

    System.out.println("Lista iniziale:");
    printFruitList(fruitList);

    fruitList.addFirst(new Fruit("Grapes"));

    fruitList.addLast(new Fruit("Watermelon"));

    System.out.println("\nLista aggiornata:");
    printFruitList(fruitList);
}

    private static void printFruitList(LinkedList<Fruit> fruitList) {
        for (Fruit fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
