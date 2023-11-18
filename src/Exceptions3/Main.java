package Exceptions3;

public class Main {
        public static void main(String[] args) {
            try {
                int risultato = divisione(10, 0);
                System.out.println("Il risultato della divisione è: " + risultato);
            } catch (ArithmeticException e) {
                System.out.println("Errore");
            }
        }

        public static int divisione(int numeratore, int denominatore) {
            return numeratore / denominatore;
        }


}