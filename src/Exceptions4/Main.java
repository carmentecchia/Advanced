package Exceptions4;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            eseguiOperazione(array);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
        } finally {
            System.out.println("Blocco di codice sempre eseguito.");
        }
    }

    public static void eseguiOperazione(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            try {
                int risultato = array[i] / 0;
                System.out.println("Risultato: " + risultato);
            } catch (ArithmeticException e) {
                System.out.println("Eccezione di divisione per zero: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Eccezione di indice non presente nell'array: " + e.getMessage());
            }
        }
    }
}


