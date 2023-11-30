package Date5;
import java.time.OffsetDateTime;
public class Main {
    public static void main(String[] args) {
        String stringaData1 = "2023-03-01T13:00:00Z";
        String stringaData2 = "2024-03-01T13:00:00Z";

        OffsetDateTime data1 = OffsetDateTime.parse(stringaData1);
        OffsetDateTime data2 = OffsetDateTime.parse(stringaData2);

        boolean precedente = data1.isBefore(data2);
        boolean successiva = data2.isAfter(data1);
        boolean uguali = data1.isEqual(data2);

        System.out.println("La prima data è precedente alla seconda: " + precedente);
        System.out.println("La seconda data è successiva alla prima: " + successiva);
        System.out.println("Le due date sono uguali ad ora: " + uguali);
    }
}
