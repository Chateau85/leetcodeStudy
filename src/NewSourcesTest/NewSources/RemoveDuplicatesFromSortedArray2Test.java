package NewSources;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArray2Test {

    @Test
    public void removeDuplicates() {
        RemoveDuplicatesFromSortedArray2 t = new RemoveDuplicatesFromSortedArray2();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assert.assertEquals(5, t.removeDuplicates(nums));

    }
}