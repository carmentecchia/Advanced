package Exceptions1;

public class Main {
    public static void main(String[] args) {
        int min = 15;
        int max = 10;
        int value = 20;

        try {
            boolean isInRange = checkInRange(min, max, value);
            System.out.println("Is in range: " + isInRange);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkInRange(int number, int min, int max) {
        if (number >= min && number <= max) {
            return true;
        } else {
            throw new IllegalArgumentException("Il numero non è nel range specificato.");
        }
    }
}



