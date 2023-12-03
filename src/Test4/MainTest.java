package Test4;

import Test2.Main;
import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private OffsetDateTime dateTime;
    private final Main testing = new Main();
    @Test
    public void main() {
        int expected = 2023;
        int actual = 2022;
        assertEquals (expected, actual);
    }

}