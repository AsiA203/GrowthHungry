package Java.weeK_1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static Java.week_1.isPrime.isPrime;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class isPrime_Test {
    @Test
    @DisplayName("Is Prime?")
    public void isPrime_Test(){
        assertAll(
                () -> assertTrue(isPrime(3)),
                () -> assertTrue(isPrime(5)),
                () -> assertTrue(isPrime(7)),
                () -> assertTrue(isPrime(11))
        );
    }
}
