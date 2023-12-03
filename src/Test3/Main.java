package Test3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataStringMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

            System.out.println("Medium:" + dataStringMedium);
        }
}
