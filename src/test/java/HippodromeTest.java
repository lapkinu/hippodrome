import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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

    // method getHorses
    void testGetHorses() {
        List<Horse> horses = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            horses.add(new Horse("Horse" + i, 10));
        }
        Hippodrome hippodrome = new Hippodrome(horses);
        assertEquals(horses, hippodrome.getHorses());
    }

    // method move
    @Test
    void testMove() {
        List<Horse> horses = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            horses.add(mock(Horse.class));
        }
        Hippodrome hippodrome = new Hippodrome(horses);
        hippodrome.move();
        for (Horse horse : horses) {
            verify(horse).move();
        }
    }

    // method getWinner
    @Test
    void testGetWinner() {
        Horse horse1 = new Horse("Horse1", 10, 100);
        Horse horse2 = new Horse("Horse2", 10, 200);
        Horse horse3 = new Horse("Horse3", 10, 300);
        List<Horse> horses = List.of(horse1, horse2, horse3);
        Hippodrome hippodrome = new Hippodrome(horses);
        assertEquals(horse3, hippodrome.getWinner());
    }


}