package Test1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    Main main =  new Main ();
    @Test
    void sum() {
        int risultato = main.sum(4,5);
        assertEquals(9, risultato);
    }
}