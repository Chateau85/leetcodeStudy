package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidMountainArrayTest {

    @Test
    public void validMountainArray() {
        ValidMountainArray t = new ValidMountainArray();
        int[] arr = new int[]{2, 0, 2};
        assertFalse(t.validMountainArray(arr));
    }
}