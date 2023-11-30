package Record;

public class Main {
        public static void main(String[] args) {
            Punto punto = new Punto(3, 5);

            System.out.println("Coordinate: x = " + punto.x() + ", y = " + punto.y());
            System.out.println("Rappresentazione: " + punto);
        }


    public record Punto(int x, int y) {
}

}
