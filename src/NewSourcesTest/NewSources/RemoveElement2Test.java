package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElement2Test {

    @Test
    public void removeElement() {
        RemoveElement2 t = new RemoveElement2();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        assertEquals(5, t.removeElement2(nums, val));
    }
}