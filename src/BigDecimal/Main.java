package BigDecimal;

import java.math.BigDecimal;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
// crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
// Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

enum Operation {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    MIN,
    MAX;
    }

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("3.5");
        BigDecimal num2 = new BigDecimal("5.5");
        BigDecimal result = calculateOperations(Operation.DIVISION, num1, num2);
        System.out.println(result);
    }

    public static BigDecimal calculateOperations(Operation operation, BigDecimal num1, BigDecimal num2) {
        switch (operation) {
            case ADDITION:
                return num1.add(num2);
            case SUBTRACTION:
                return num1.subtract(num2);
            case MULTIPLICATION:
                return num1.multiply(num2);
            case DIVISION:
                if (num1.compareTo(BigDecimal.ZERO) != 0) {
                    return num1.divide(num2, 2);
                } else {
                    System.out.println("Division by zero");
                    return BigDecimal.ZERO;
                }
            case MIN:
                return num1.min(num2);
            case MAX:
                return num1.max(num2);
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }

    }
}
