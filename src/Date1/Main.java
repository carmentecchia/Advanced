import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        //Stampa le varie versioni
public class Main {
    public static void main(String[] args) {
        String dateString = "2002-03-01T13:00:00Z";
        java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);

        String fullFormat = format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL), offsetDateTime);
        System.out.println("FULL Format: " + fullFormat);

        String mediumFormat = format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM), offsetDateTime);
        System.out.println("MEDIUM Format: " + mediumFormat);

        String shortFormat = format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT), offsetDateTime);
        System.out.println("SHORT Format: " + shortFormat);
    }

    private static String format(DateTimeFormatter dateTimeFormatter, java.time.OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(dateTimeFormatter);
    }
}



