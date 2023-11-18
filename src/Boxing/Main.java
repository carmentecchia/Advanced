package Boxing;

public class Main {
    public static void stampaSomma(int a, int b) {
            int somma = a + b;
            System.out.println("Somma di " + a + " e " + b + ": " + somma);
        }
        public static void stampaCarattere(char carattere) {
            System.out.println("Carattere: " + carattere);
        }
        public static void stampaSommaInteger(Integer a, Integer b) {
            int somma = a + b;
            System.out.println("Somma di " + a + " e " + b + ": " + somma);
        }
        public static void stampaCarattere(Character carattere) {
            System.out.println("Carattere: " + carattere);
        }
        public static void main(String[] args) {
            int valoreInt = 7;
            double valoreDouble = 4.56;
            char valoreChar = 'o';

            Integer valoreInteger = valoreInt;
            Double valoreDoubleWrapper = valoreDouble;
            Character valoreCharWrapper = valoreChar;

            stampaSomma(valoreInt, 11);
            stampaCarattere(valoreChar);
            stampaSommaInteger(valoreInteger, 44);
            stampaCarattere(valoreCharWrapper);

            int valoreIntUnboxed = valoreInteger;
            double valoreDoubleUnboxed = valoreDoubleWrapper;
            char valoreCharUnboxed = valoreCharWrapper;

            System.out.println("Unboxing: " + valoreIntUnboxed + ", " + valoreDoubleUnboxed + ", " + valoreCharUnboxed);
        }
}


