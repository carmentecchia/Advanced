package Test3;

import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime odt = OffsetDateTime.parse(input);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String dataFormattata = format.format(odt);
        assertEquals("01 marzo 2023", dataFormattata);

    }

}