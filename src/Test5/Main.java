package Test5;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
    String dateString = "2002-03-01T13:00:00Z";
    java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);

    offsetDateTime = offsetDateTime.plusYears(1);

    offsetDateTime = offsetDateTime.minusMonths(1);

    offsetDateTime = offsetDateTime.plus(7, ChronoUnit.DAYS);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss Z");
    String formattedDate = offsetDateTime.format(formatter.withLocale(java.util.Locale.ITALY));


    System.out.println("Risultato localizzato per l'Italia: " + formattedDate);

}
}
