import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    // Test the constructor name parameter null value exception case
    @Test
    void testConstructorNameNull() {
        assertThrows(IllegalArgumentException.class, () -> new Horse(null, 10));
    }

    // "Name cannot be null." exception message test
    @Test
    void testConstructorNameNullMessage() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse(null, 10));
        assertEquals("Name cannot be null.", exception.getMessage());
    }

    // IllegalArgumentException("Name cannot be blank.") exception case test parameterized test
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  ", "   "})
    void testConstructorNameBlank(String name) {
        assertThrows(IllegalArgumentException.class, () -> new Horse(name, 10));
    }

    // "Name cannot be blank." exception message parameterized test
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  ", "   "})
    void testConstructorNameBlankMessage(String name) {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse(name, 10));
        assertEquals("Name cannot be blank.", exception.getMessage());
    }

    // Test the constructor speed parameter negative value exception case
    @Test
    void testConstructorSpeedNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Horse("Bucephalus", -10));
    }

    // "Speed cannot be negative." exception message test
    @Test
    void testConstructorSpeedNegativeMessage() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse("Bucephalus", -10));
        assertEquals("Speed cannot be negative.", exception.getMessage());
    }

    // Test the constructor distance parameter negative value exception case
    @Test
    void testConstructorDistanceNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Horse("Bucephalus", 10, -10));
    }

    // "Distance cannot be negative." exception message test
    @Test
    void testConstructorDistanceNegativeMessage() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse("Bucephalus", 10, -10));
        assertEquals("Distance cannot be negative.", exception.getMessage());
    }


    // test getName method
    @Test
    void testGetName() {
        Horse horse = new Horse("Bucephalus", 10);
        assertEquals("Bucephalus", horse.getName());
    }

    // test getSpeed method
    @Test
    void testGetSpeed() {
        Horse horse = new Horse("Bucephalus", 10);
        assertEquals(10, horse.getSpeed());
    }

    // test getDistance method
    @Test
    void testGetDistanceTwoParameters() {
        Horse horse = new Horse("Bucephalus", 10);
        assertEquals(0, horse.getDistance());
    }

    // test getDistance method
    @Test
    void testGetDistanceThreeParameters() {
        Horse horse = new Horse("Bucephalus", 10, 0);
        assertEquals(0, horse.getDistance());
    }


}
