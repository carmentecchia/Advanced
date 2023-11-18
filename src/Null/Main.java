package Null;
public class Main {
    public static void main(String[] args) {
        Double numerator  = 3.0;
        Double denominator = 0.0;

        try {
            System.out.println(checkNull(numerator,denominator));
        }
        catch (ArithmeticException e){
            System.out.println("The denominator is 0");
        }
        catch (Exception e){
            System.out.println("One of the number is null");
        }
    }
    public static Double checkNull(Double numerator, Double denominator) throws Exception {
        if (numerator == null || denominator == null) {
            throw new Exception();
        } else if(denominator == 0){
            throw new ArithmeticException();
        } else {
            return numerator/denominator;
        }
    }

}
