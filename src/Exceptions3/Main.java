package Exceptions3;
public class Main {
        public static void main(String[] args) {
           int numerator = 10;
           int denominator = 0;
            System.out.println(division(numerator,denominator));
        }

        public static boolean division(int numerator, int denominator) {
            try {
                int division = numerator/denominator;
            }
            catch (ArithmeticException e) {
                System.out.println("Error" + e.getMessage());
            }
            return false;
        }


}