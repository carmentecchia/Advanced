package Test4;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static java.time.DayOfWeek.WEDNESDAY;
import static java.time.Month.MARCH;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    private final Main testing = new Main();
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    @Test
    void getYearTest () {
        int result = testing.getYear(date);
        assertEquals(2023,result);
    }
    @Test
    void getMonthTest() {
        Month result = testing.getMonth(date);
        assertEquals(MARCH,result);
    }

    @Test
    void getDayTest() {
        int result = testing.getDay(date);
        assertEquals(1,result);
    }

    @Test
    void getDayOfWeekTest() {
        DayOfWeek result = testing.getDayOfWeek(date);
        assertEquals(WEDNESDAY,result);
    }
}