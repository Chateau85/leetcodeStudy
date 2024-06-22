package NewSources;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunningSum_1480Test {

    @Test
    public void runningSum() {
        RunningSum_1480 t = new RunningSum_1480();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};
        int[] output = t.runningSum(nums);

        Assert.assertArrayEquals(expected, output);
    }
}