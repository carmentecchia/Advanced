package Date3;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
       // ottieni l'anno ,ottieni il mese , ottieni il giorno , ottieni il giorno della settimana
       // Stampa i risultati sulla console
public class Main {
    public static void main(String[] args) {
        String dateString = "2002-03-01T13:00:00Z";
        java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);

        int year = offsetDateTime.getYear();
        int month = offsetDateTime.getMonthValue();
        int day = offsetDateTime.getDayOfMonth();

        String dayOfWeek = offsetDateTime.getDayOfWeek().toString();

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}
