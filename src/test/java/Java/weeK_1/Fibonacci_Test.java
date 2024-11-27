package Java.weeK_1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static Java.week_1.Fibonacci.fibonacci;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class Fibonacci_Test {
    @Test
    @DisplayName("Fibonacci Test")
    public void Fibonacci(){
        assertAll(
                () -> assertEquals(55, fibonacci(10)),
                () -> assertEquals(1,fibonacci(2)),
                () -> assertEquals(2, fibonacci(3))
        );
    }
}
