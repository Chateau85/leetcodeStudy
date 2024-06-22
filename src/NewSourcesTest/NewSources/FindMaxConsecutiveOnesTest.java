package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() {
        FindMaxConsecutiveOnes t = new FindMaxConsecutiveOnes();
        int[] nums = new int[]{1,1,0,1,1,1};
        t.findMaxConsecutiveOnes(nums);

    }
}