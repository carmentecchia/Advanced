package Date2;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
       // Formatta la data ottenendo 01 marzo 2023
       // Stampa sulla console
    public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dataStringMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        System.out.println("Medium:" + dataStringMedium);
    }
}
