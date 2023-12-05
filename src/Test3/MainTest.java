package Test3;


import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private final Main testing = new Main();
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void testFormat() {
        String outputFormatted = testing.mediumFormat(date);
        assertEquals("1 mar 2023", outputFormatted);

    }

}