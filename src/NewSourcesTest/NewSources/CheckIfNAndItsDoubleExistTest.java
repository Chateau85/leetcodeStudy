package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfNAndItsDoubleExistTest {

    @Test
    public void checkIfExist() {
        CheckIfNAndItsDoubleExist t = new CheckIfNAndItsDoubleExist();
        int[] arr = new int[]{3, 1, 7, 11};
        assertTrue(t.checkIfExist(arr));
    }
}