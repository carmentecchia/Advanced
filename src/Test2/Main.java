package Test2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String fullFormat = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("FULL Format: " + fullFormat);

        String mediumFormat = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("MEDIUM Format: " + mediumFormat);

        String shortFormat = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("SHORT Format: " + shortFormat);
    }

    private static String format(DateTimeFormatter dateTimeFormatter, java.time.OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(dateTimeFormatter);
    }
}


