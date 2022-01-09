import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFactorialTest {
    @Test
    void shouldNotAllowNegativeNumber() {
        FindFactorial findFactorial = new FindFactorial(-5);
        BigInteger actual = findFactorial.calculateValue();
        BigInteger expected = BigInteger.valueOf(-1);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnOneForNumberZero() {
        FindFactorial findFactorial = new FindFactorial(0);
        BigInteger actual = findFactorial.calculateValue();
        BigInteger expected = BigInteger.ONE;
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnFactorialOfSmallNumber() {
        FindFactorial findFactorial = new FindFactorial(5);
        BigInteger actual = findFactorial.calculateValue();
        BigInteger expected = BigInteger.valueOf(120);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnFactorialOfLargeNumber() {
        FindFactorial findFactorial = new FindFactorial(100);
        BigInteger actual = findFactorial.calculateValue();
        BigInteger expected = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
        assertEquals(actual, expected);
    }
}
