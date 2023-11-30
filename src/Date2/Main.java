package Date2;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
       // Formatta la data ottenendo 01 marzo 2023
       // Stampa sulla console
    public class Main {
    public static void main(String[] args) {
        String dateString = "2002-03-01T13:00:00Z";
        java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = offsetDateTime.format(formatter);


        System.out.println(formattedDate);
    }
}
