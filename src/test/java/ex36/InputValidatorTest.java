package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void isNumeric() {
        String a = "a";
        String five = "5";
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt(a);
        });
        assertEquals(Integer.parseInt(five), 5);

    }
}