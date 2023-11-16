package Exceptions3;

public class Main {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Il risultato della divisione è: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione per zero: " + e.getMessage());
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Impossibile dividere per zero.");
        } else {
            return numerator / denominator;
        }
    }
}
