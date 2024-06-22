package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresOfASortedArrayTest {

    @Test
    public void sortedSquares() {
        SquaresOfASortedArray t = new SquaresOfASortedArray();
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        int[] expected = new int[]{4, 9, 9, 49, 121};
        assertArrayEquals(expected, t.sortedSquares(nums));

    }
}