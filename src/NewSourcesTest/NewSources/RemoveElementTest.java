package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElement() {
        RemoveElement t = new RemoveElement();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        assertEquals(5, t.removeElement(nums, val));
        assertEquals(5, t.removeElementOthers(nums, val));
    }
}