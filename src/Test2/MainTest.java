package Test2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
private final Main testing = new Main();
    @Test
    void main() {
        String input = "2002-03-01T13:00:00Z";
        OffsetDateTime odt = OffsetDateTime.parse(input);
        DateTimeFormatter dateTimeFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String outputFull = odt.format(dateTimeFull);
        assertEquals("venerdì 1 marzo 2002", outputFull);
    }
}