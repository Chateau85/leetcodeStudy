package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        MergeSortedArray t = new MergeSortedArray();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0}, nums2 = new int[]{2, 5, 6};
        int m = 3, n = 3;
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, t.merge(nums1, m, nums2, n));
    }
}