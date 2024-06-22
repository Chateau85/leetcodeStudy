package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumbersWithEvenNumberOfDigitsTest {
    static int[] nums = new int[]{12, 345, 2, 6, 7896};
    static FindNumbersWithEvenNumberOfDigits t = new FindNumbersWithEvenNumberOfDigits();

    @Test
    public void findNumbers() {
        assertEquals(2, t.findNumbers(nums));
    }

    @Test
    public void findNumbersOthers() {
        assertEquals(2, t.findNumbersOthers(nums));
    }
}