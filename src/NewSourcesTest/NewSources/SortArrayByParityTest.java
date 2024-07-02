package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayByParityTest {

    @Test
    public void sortArrayByParity() {
        SortArrayByParity t = new SortArrayByParity();
        int[] nums = {3, 1, 2, 4};
        t.sortArrayByParity2(nums);
    }
}