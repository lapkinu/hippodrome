import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // method main timeout test
    @Test
    @Disabled
    @Timeout(22)
    void testMain() {
        assertTimeoutPreemptively(Duration.ofSeconds(22), () -> Main.main(new String[]{}));
    }

}