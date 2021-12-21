import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateTest{

    @Test
    public void sumTest () {
        final int a = 4;
        final int b = 5;
        final int c = 6;

        final int k = 15;

        final int result = Main.sum(a,b,c);
        Assertions.assertEquals(result,k);
    }

    @Test
    public void multiplyTest() {
        final int a = 4;
        final int b = 5;
        final int c = 6;

        final long k = 120;

        final long result = Main.multiply(a,b,c);

        Assertions.assertEquals(result, k);
    }

    @Test
    public void subtractionTest() {
        final int a = 14;
        final int b = 5;
        final int c = 6;

        final int k = 3;

        final int result = Main.subtraction(a,b,c);

        Assertions.assertEquals(result, k);
    }
}
