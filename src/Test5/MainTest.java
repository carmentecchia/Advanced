package Test5;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    private OffsetDateTime dateTime;

    @Test
    void main() {

        assert dateTime.getYear() == 2023;

        assert dateTime.getMonthValue() == 3;

        assert dateTime.getDayOfMonth() == 1;

        assert dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()).equals("Wednesday");

        System.out.println("Test passati con successo!");
    }

}