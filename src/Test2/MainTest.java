package Test2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
private final Main testing = new Main();
    OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
    @Test
    void testFull() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String outputFull = testing.format(formatter,date);
        assertEquals("venerdì 1 marzo 2002", outputFull);
    }

    @Test
    void testMedium() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String outputMedium = testing.format(formatter,date);
        assertEquals("1 mar 2002", outputMedium);
    }

    @Test
    void testShort() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String outputShort = testing.format(formatter,date);
        assertEquals("01/03/02", outputShort);
    }
}