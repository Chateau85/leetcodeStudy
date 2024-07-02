package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        MoveZeroes t = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        t.moveZeroes2(nums);
    }
}