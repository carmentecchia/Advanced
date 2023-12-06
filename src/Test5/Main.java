package Test5;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(changeDateItaly(date));
    }

    public static String changeDateItaly(OffsetDateTime date) {
        OffsetDateTime newDate;

        newDate = date
                .plusYears(1)
                .minusMonths(1)
                .plusDays(7);

        return newDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ITALY));
    }
}
