import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HippodromeTest {

    // Test the constructor name parameter null value exception case
    @Test
    void testConstructorNameNull() {
        assertThrows(IllegalArgumentException.class, () -> new Hippodrome(null));
    }

    // "Name cannot be null." exception message test
    @Test
    void testConstructorNameNullMessage() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Hippodrome(null));
        assertEquals("Horses cannot be null.", exception.getMessage());
    }

    // Test the constructor empty list exception case
    @Test
    void testConstructorEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> new Hippodrome(new ArrayList<>()));
    }

    // "Horses cannot be empty." exception message test
    @Test
    void testConstructorEmptyListMessage() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Hippodrome(new ArrayList<>()));
        assertEquals("Horses cannot be empty.", exception.getMessage());
    }


}