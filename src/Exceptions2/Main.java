package Exceptions2;
class NonNumeroException extends Exception {
    public NonNumeroException(String message) {
        super(message);
    }
}
public class Main {

    public static void main(String[] args) {
        char carattere = 'a';

        try {
            verificaNumero(carattere);
            System.out.println("Il carattere è un numero.");
        } catch (NonNumeroException e) {
            System.out.println(e.getMessage());
        }
    }

    static void verificaNumero(char c) throws NonNumeroException {
        if (!Character.isDigit(c)) {
            throw new NonNumeroException("Il carattere non è un numero.");
        }
    }
}




