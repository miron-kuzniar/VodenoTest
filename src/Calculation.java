import org.junit.Assert;
import org.junit.Test;

public class Calculation {

    public int[] mathCalculus(int number1, int number2) {
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int remainder = number1 % number2;

        return new int[] {multiplication, division, remainder};
    }

    @Test
    public void calculationTests() {
        int[] actual = mathCalculus(7, 3);
        int[] expected = {21, 2, 1};
        Assert.assertArrayEquals(actual, expected);
    }
}
