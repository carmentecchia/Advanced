package Boxing;

public class Main {
    public static Integer somma(int a, int b) {
            Integer somma = a + b;
            System.out.println("Somma di " + a + " e " + b + ": " + somma);
            return somma;
        }
        public static int somma2 (Integer a, Integer b) {
        int somma2 = a + b;
        return somma2;
            }
        public static void stampaCarattere(char carattere) {
            System.out.println("Carattere: " + carattere);
        }
        public static void stampaSommaInteger(Integer a, Integer b) {
            int somma = a + b;
            System.out.println("Somma di " + a + " e " + b + ": " + somma);
        }
        public static char stampaCarattere(Character carattere) {
            System.out.println("Carattere: " + carattere);
            return carattere;
        }
        public static void main(String[] args) {
            int valoreInt = 7;
            double valoreDouble = 4.56;
            char valoreChar = 'o';
            int somma2 = somma2(4,5);

            Integer valoreInteger = valoreInt;
            Double valoreDoubleWrapper = valoreDouble;
            Character valoreCharWrapper = valoreChar;

            somma(valoreInt, 11);
            stampaCarattere(valoreChar);
            stampaSommaInteger(valoreInteger, 44);
            stampaCarattere(valoreCharWrapper);

            int valoreIntUnboxed = valoreInteger;
            double valoreDoubleUnboxed = valoreDoubleWrapper;
            char valoreCharUnboxed = valoreCharWrapper;

            System.out.println("Unboxing: " + valoreIntUnboxed + ", " + valoreDoubleUnboxed + ", " + valoreCharUnboxed);
        }
}


