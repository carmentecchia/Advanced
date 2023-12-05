package Test4;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        getYear(date);
        getMonth(date);
        getDay(date);
        getDayOfWeek(date);
    }
    public static int getYear(OffsetDateTime date){
        int dataYear = date.getYear();
        System.out.println("Anno: " + dataYear);
        return dataYear;
    }
    public static Month getMonth(OffsetDateTime date){
        Month dataMonth = date.getMonth();
        System.out.println("Mese: " + dataMonth);
        return dataMonth;
    }
    public static int getDay(OffsetDateTime date){
        int dataDay = date.getDayOfMonth();
        System.out.println("Giorno: " + dataDay);
        return dataDay;
    }
    public static DayOfWeek getDayOfWeek(OffsetDateTime date){
        DayOfWeek dataDayOfWeek = date.getDayOfWeek();
        System.out.println("Giorno della settimana: " + dataDayOfWeek);
        return dataDayOfWeek;
    }
}