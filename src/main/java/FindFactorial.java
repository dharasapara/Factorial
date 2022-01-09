import java.math.BigInteger;

public record FindFactorial(int number) {

    public BigInteger calculateValue() {
        if (number < 0) return BigInteger.valueOf(-1);

        if (number == 0) return BigInteger.ONE;

        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }
}
