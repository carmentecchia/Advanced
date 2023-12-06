package Test5;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void changeDateItalyTest() {
        String result = testing.changeDateItaly(date);
        assertEquals("08-02-2024", result);
    }

}